package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.cocktails.AddIngredient
import org.xtext.example.mydsl.cocktails.CocktailsPackage
import org.xtext.example.mydsl.cocktails.Order
import org.xtext.example.mydsl.validation.CocktailsValidator

@ExtendWith(InjectionExtension)
@InjectWith(CocktailsInjectorProvider)
class CocktailsParsingTest {
	@Inject
	ParseHelper<Order> parseHelper

	@Inject
	extension ValidationTestHelper

	@Test
	def void parsesAFullRecipe() {
		val result = parseHelper.parse('''
			var n = 2
			addIc cube : 1 ounce
			addI vodka : 28 ml
			addI sour_mix : 28 ml
			addF sugar : 5 g
			mud lime mint : n * 3 times
			use co2
			shake : 30 seconds
			addD lemon 3 slices
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		Assertions.assertEquals(9, result.instructions.size)
		result.assertNoIssues
	}

	@Test
	def void warnsOnUnknownIngredient() {
		val result = parseHelper.parse('''
			addI milk : 10 ml
		''')
		Assertions.assertNotNull(result)
		Assertions.assertTrue(result.instructions.head instanceof AddIngredient)
		result.assertWarning(CocktailsPackage.Literals.ADD_INGREDIENT, CocktailsValidator.INVALID_INGREDIENT_NAME)
	}

	@Test
	def void warnsOnUpperCaseIngredientName() {
		val result = parseHelper.parse('''
			addI Gin : 10 ml
		''')
		Assertions.assertNotNull(result)
		result.assertWarning(CocktailsPackage.Literals.ADD_INGREDIENT, CocktailsValidator.INVALID_INGREDIENT_NAME_LOWERCASE)
	}
}
