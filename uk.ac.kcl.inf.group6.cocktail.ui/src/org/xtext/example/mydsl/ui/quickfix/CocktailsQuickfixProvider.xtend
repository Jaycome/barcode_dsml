package org.xtext.example.mydsl.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.xtext.example.mydsl.validation.CocktailsValidator
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor

class CocktailsQuickfixProvider extends DefaultQuickfixProvider{
	
	@Fix(CocktailsValidator.INVALID_INGREDIENT_NAME_LOWERCASE)
	def lowerCaseVariableName(Issue issue,IssueResolutionAcceptor acceptor){
		acceptor.accept(issue,'Lowercase variable name','Change the variable name to start with a lower-case character.',null)[context|
			val xtextDocument=context.xtextDocument
			val firstLetter=xtextDocument.get(issue.offset,1)
			xtextDocument.replace(issue.offset,1,firstLetter.toLowerCase)
		]
		
		
		
	}

}