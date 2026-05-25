package org.xtext.example.mydsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.cocktails.AddFixedIngredient
import org.xtext.example.mydsl.cocktails.AddIngredient
import org.xtext.example.mydsl.cocktails.CocktailsPackage
import org.xtext.example.mydsl.cocktails.Order
import org.xtext.example.mydsl.cocktails.MakeStatement

class CocktailsValidator extends AbstractCocktailsValidator{
	
	public static val INVALID_INGREDIENT_NAME='uk.ac.kcl.inf.group6.cocktail.INVALID_INGREDIENT_NAME'
	public static val INVALID_INGREDIENT_NAME_LOWERCASE='uk.ac.kcl.inf.group6.cocktail.INVALID_INGREDIENT_NAME_LOWERCASE'
	public static val INVALID_INGREDIENT_AMOUNT='uk.ac.kcl.inf.group6.cocktail.INVALID_INGREDIENT_AMOUNT'
	public static val INVALID_FIXED_INGREDIENT_NAME='uk.ac.kcl.inf.group6.cocktail.INVALID_FIXED_INGREDIENT_NAME'
	public static val INVALID_FIXED_INGREDIENT_NAME_LOWERCASE='uk.ac.kcl.inf.group6.cocktail.INVALID_FIXED_INGREDIENT_NAME_LOWERCASE'
	public static val INVALID_MAKESTATEMENT_SEQUENCE='uk.ac.kcl.inf.group6.cocktail.INVALID_MAKESTATEMENT_SEQUENCE'
	@Check
	def checkAlcoholExist(AddIngredient addi){
		if(!Character.isLowerCase(addi.name.charAt(0))){
			warning('Name should start with a lower-case character',addi,
				CocktailsPackage.Literals.ADD_INGREDIENT__NAME,
				INVALID_INGREDIENT_NAME_LOWERCASE
			)
		}else{
			if(!(addi.name=='whiskey'||
				addi.name=='gin'||
				addi.name=='vodka'||
				addi.name=='tequila'||
				addi.name=='brandy'||
				addi.name=='liqueur'||
				addi.name=='rum'||
				addi.name=='sour_mix'||
				addi.name=='coke'||
				addi.name=='sprite')){
			warning('This ingredient does not exist.',addi,
				CocktailsPackage.Literals.ADD_INGREDIENT__NAME,
				INVALID_INGREDIENT_NAME
			)
		}
		}
		
	}
	@Check
	def checkFixedIngredientExist(AddFixedIngredient addf){
		if(!Character.isLowerCase(addf.name.charAt(0))){
			warning('Name should start with a lower-case character',addf,
				CocktailsPackage.Literals.ADD_FIXED_INGREDIENT__NAME,
				INVALID_INGREDIENT_NAME_LOWERCASE
			)
		}else{
			if(!(addf.name=='salt'||
				addf.name=='syrup'||
				addf.name=='sugar'||
				addf.name=='cinnamon'||
				addf.name=='nutmeg'||
				addf.name=='clove'||
				addf.name=='ginger'||
				addf.name=='sichuanpepper'||
				addf.name=='vanillapower'
			)){
			warning('This ingredient does not exist.',addf,
				CocktailsPackage.Literals.ADD_FIXED_INGREDIENT__NAME,
				INVALID_FIXED_INGREDIENT_NAME
			)
			
		}
		}
		
	}
//	@Check
//	def checkStepSequence(Order order,MakeStatement mst){
//		if(order.instructions.findFirst[]==1){
//			warning('MakeStatement cannot be the first step',mst,
//				CocktailsPackage.Literals.MAKE_STATEMENT__MAKE,
//				INVALID_MAKESTATEMENT_SEQUENCE
//			)
//		}
//		
//	}
	
}