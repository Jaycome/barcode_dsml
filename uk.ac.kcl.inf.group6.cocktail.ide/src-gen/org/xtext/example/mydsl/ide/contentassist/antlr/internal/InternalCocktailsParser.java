package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.CocktailsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCocktailsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'lighter'", "'co2'", "'cube'", "'crush'", "'shave'", "'block'", "'ball'", "'cone'", "'lime'", "'lemon'", "'orange'", "'grapefruit'", "'pineapple'", "'mango'", "'kiwi'", "'strawberry'", "'blueberry'", "'raspberry'", "'blackberry'", "'cherry'", "'peach'", "'plum'", "'watermelon'", "'cucumber'", "'mint'", "'basil'", "'thyme'", "'ginger'", "'olive'", "'rose'", "'cinnamon'", "'stir'", "'shake'", "'blend'", "'filter'", "'addI'", "':'", "'ml'", "'addF'", "'g'", "'use'", "'addIc'", "'ounce'", "'mud'", "'times'", "'addD'", "'slices'", "'seconds'", "'('", "')'", "'var'", "'='"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCocktailsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCocktailsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCocktailsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCocktails.g"; }


    	private CocktailsGrammarAccess grammarAccess;

    	public void setGrammarAccess(CocktailsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleOrder"
    // InternalCocktails.g:53:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalCocktails.g:54:1: ( ruleOrder EOF )
            // InternalCocktails.g:55:1: ruleOrder EOF
            {
             before(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getOrderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalCocktails.g:62:1: ruleOrder : ( ( rule__Order__InstructionsAssignment )* ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:66:2: ( ( ( rule__Order__InstructionsAssignment )* ) )
            // InternalCocktails.g:67:2: ( ( rule__Order__InstructionsAssignment )* )
            {
            // InternalCocktails.g:67:2: ( ( rule__Order__InstructionsAssignment )* )
            // InternalCocktails.g:68:3: ( rule__Order__InstructionsAssignment )*
            {
             before(grammarAccess.getOrderAccess().getInstructionsAssignment()); 
            // InternalCocktails.g:69:3: ( rule__Order__InstructionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=46 && LA1_0<=50)||LA1_0==53||(LA1_0>=55 && LA1_0<=56)||LA1_0==58||LA1_0==60||LA1_0==65) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCocktails.g:69:4: rule__Order__InstructionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Order__InstructionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getOrderAccess().getInstructionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleInstruction"
    // InternalCocktails.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalCocktails.g:79:1: ( ruleInstruction EOF )
            // InternalCocktails.g:80:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalCocktails.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalCocktails.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalCocktails.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalCocktails.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalCocktails.g:94:3: ( rule__Instruction__Alternatives )
            // InternalCocktails.g:94:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleAddIngredient"
    // InternalCocktails.g:103:1: entryRuleAddIngredient : ruleAddIngredient EOF ;
    public final void entryRuleAddIngredient() throws RecognitionException {
        try {
            // InternalCocktails.g:104:1: ( ruleAddIngredient EOF )
            // InternalCocktails.g:105:1: ruleAddIngredient EOF
            {
             before(grammarAccess.getAddIngredientRule()); 
            pushFollow(FOLLOW_1);
            ruleAddIngredient();

            state._fsp--;

             after(grammarAccess.getAddIngredientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddIngredient"


    // $ANTLR start "ruleAddIngredient"
    // InternalCocktails.g:112:1: ruleAddIngredient : ( ( rule__AddIngredient__Group__0 ) ) ;
    public final void ruleAddIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:116:2: ( ( ( rule__AddIngredient__Group__0 ) ) )
            // InternalCocktails.g:117:2: ( ( rule__AddIngredient__Group__0 ) )
            {
            // InternalCocktails.g:117:2: ( ( rule__AddIngredient__Group__0 ) )
            // InternalCocktails.g:118:3: ( rule__AddIngredient__Group__0 )
            {
             before(grammarAccess.getAddIngredientAccess().getGroup()); 
            // InternalCocktails.g:119:3: ( rule__AddIngredient__Group__0 )
            // InternalCocktails.g:119:4: rule__AddIngredient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddIngredient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddIngredientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddIngredient"


    // $ANTLR start "entryRuleAddFixedIngredient"
    // InternalCocktails.g:128:1: entryRuleAddFixedIngredient : ruleAddFixedIngredient EOF ;
    public final void entryRuleAddFixedIngredient() throws RecognitionException {
        try {
            // InternalCocktails.g:129:1: ( ruleAddFixedIngredient EOF )
            // InternalCocktails.g:130:1: ruleAddFixedIngredient EOF
            {
             before(grammarAccess.getAddFixedIngredientRule()); 
            pushFollow(FOLLOW_1);
            ruleAddFixedIngredient();

            state._fsp--;

             after(grammarAccess.getAddFixedIngredientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddFixedIngredient"


    // $ANTLR start "ruleAddFixedIngredient"
    // InternalCocktails.g:137:1: ruleAddFixedIngredient : ( ( rule__AddFixedIngredient__Group__0 ) ) ;
    public final void ruleAddFixedIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:141:2: ( ( ( rule__AddFixedIngredient__Group__0 ) ) )
            // InternalCocktails.g:142:2: ( ( rule__AddFixedIngredient__Group__0 ) )
            {
            // InternalCocktails.g:142:2: ( ( rule__AddFixedIngredient__Group__0 ) )
            // InternalCocktails.g:143:3: ( rule__AddFixedIngredient__Group__0 )
            {
             before(grammarAccess.getAddFixedIngredientAccess().getGroup()); 
            // InternalCocktails.g:144:3: ( rule__AddFixedIngredient__Group__0 )
            // InternalCocktails.g:144:4: rule__AddFixedIngredient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddFixedIngredient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddFixedIngredientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddFixedIngredient"


    // $ANTLR start "entryRuleFancyStatement"
    // InternalCocktails.g:153:1: entryRuleFancyStatement : ruleFancyStatement EOF ;
    public final void entryRuleFancyStatement() throws RecognitionException {
        try {
            // InternalCocktails.g:154:1: ( ruleFancyStatement EOF )
            // InternalCocktails.g:155:1: ruleFancyStatement EOF
            {
             before(grammarAccess.getFancyStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleFancyStatement();

            state._fsp--;

             after(grammarAccess.getFancyStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFancyStatement"


    // $ANTLR start "ruleFancyStatement"
    // InternalCocktails.g:162:1: ruleFancyStatement : ( ( rule__FancyStatement__Group__0 ) ) ;
    public final void ruleFancyStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:166:2: ( ( ( rule__FancyStatement__Group__0 ) ) )
            // InternalCocktails.g:167:2: ( ( rule__FancyStatement__Group__0 ) )
            {
            // InternalCocktails.g:167:2: ( ( rule__FancyStatement__Group__0 ) )
            // InternalCocktails.g:168:3: ( rule__FancyStatement__Group__0 )
            {
             before(grammarAccess.getFancyStatementAccess().getGroup()); 
            // InternalCocktails.g:169:3: ( rule__FancyStatement__Group__0 )
            // InternalCocktails.g:169:4: rule__FancyStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FancyStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFancyStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFancyStatement"


    // $ANTLR start "entryRuleAddIce"
    // InternalCocktails.g:178:1: entryRuleAddIce : ruleAddIce EOF ;
    public final void entryRuleAddIce() throws RecognitionException {
        try {
            // InternalCocktails.g:179:1: ( ruleAddIce EOF )
            // InternalCocktails.g:180:1: ruleAddIce EOF
            {
             before(grammarAccess.getAddIceRule()); 
            pushFollow(FOLLOW_1);
            ruleAddIce();

            state._fsp--;

             after(grammarAccess.getAddIceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddIce"


    // $ANTLR start "ruleAddIce"
    // InternalCocktails.g:187:1: ruleAddIce : ( ( rule__AddIce__Group__0 ) ) ;
    public final void ruleAddIce() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:191:2: ( ( ( rule__AddIce__Group__0 ) ) )
            // InternalCocktails.g:192:2: ( ( rule__AddIce__Group__0 ) )
            {
            // InternalCocktails.g:192:2: ( ( rule__AddIce__Group__0 ) )
            // InternalCocktails.g:193:3: ( rule__AddIce__Group__0 )
            {
             before(grammarAccess.getAddIceAccess().getGroup()); 
            // InternalCocktails.g:194:3: ( rule__AddIce__Group__0 )
            // InternalCocktails.g:194:4: rule__AddIce__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddIce__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddIceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddIce"


    // $ANTLR start "entryRuleMuddleStatement"
    // InternalCocktails.g:203:1: entryRuleMuddleStatement : ruleMuddleStatement EOF ;
    public final void entryRuleMuddleStatement() throws RecognitionException {
        try {
            // InternalCocktails.g:204:1: ( ruleMuddleStatement EOF )
            // InternalCocktails.g:205:1: ruleMuddleStatement EOF
            {
             before(grammarAccess.getMuddleStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMuddleStatement();

            state._fsp--;

             after(grammarAccess.getMuddleStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMuddleStatement"


    // $ANTLR start "ruleMuddleStatement"
    // InternalCocktails.g:212:1: ruleMuddleStatement : ( ( rule__MuddleStatement__Group__0 ) ) ;
    public final void ruleMuddleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:216:2: ( ( ( rule__MuddleStatement__Group__0 ) ) )
            // InternalCocktails.g:217:2: ( ( rule__MuddleStatement__Group__0 ) )
            {
            // InternalCocktails.g:217:2: ( ( rule__MuddleStatement__Group__0 ) )
            // InternalCocktails.g:218:3: ( rule__MuddleStatement__Group__0 )
            {
             before(grammarAccess.getMuddleStatementAccess().getGroup()); 
            // InternalCocktails.g:219:3: ( rule__MuddleStatement__Group__0 )
            // InternalCocktails.g:219:4: rule__MuddleStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MuddleStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMuddleStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMuddleStatement"


    // $ANTLR start "entryRuleAddDecoration"
    // InternalCocktails.g:228:1: entryRuleAddDecoration : ruleAddDecoration EOF ;
    public final void entryRuleAddDecoration() throws RecognitionException {
        try {
            // InternalCocktails.g:229:1: ( ruleAddDecoration EOF )
            // InternalCocktails.g:230:1: ruleAddDecoration EOF
            {
             before(grammarAccess.getAddDecorationRule()); 
            pushFollow(FOLLOW_1);
            ruleAddDecoration();

            state._fsp--;

             after(grammarAccess.getAddDecorationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddDecoration"


    // $ANTLR start "ruleAddDecoration"
    // InternalCocktails.g:237:1: ruleAddDecoration : ( ( rule__AddDecoration__Group__0 ) ) ;
    public final void ruleAddDecoration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:241:2: ( ( ( rule__AddDecoration__Group__0 ) ) )
            // InternalCocktails.g:242:2: ( ( rule__AddDecoration__Group__0 ) )
            {
            // InternalCocktails.g:242:2: ( ( rule__AddDecoration__Group__0 ) )
            // InternalCocktails.g:243:3: ( rule__AddDecoration__Group__0 )
            {
             before(grammarAccess.getAddDecorationAccess().getGroup()); 
            // InternalCocktails.g:244:3: ( rule__AddDecoration__Group__0 )
            // InternalCocktails.g:244:4: rule__AddDecoration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddDecoration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddDecorationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddDecoration"


    // $ANTLR start "entryRuleMakeStatement"
    // InternalCocktails.g:253:1: entryRuleMakeStatement : ruleMakeStatement EOF ;
    public final void entryRuleMakeStatement() throws RecognitionException {
        try {
            // InternalCocktails.g:254:1: ( ruleMakeStatement EOF )
            // InternalCocktails.g:255:1: ruleMakeStatement EOF
            {
             before(grammarAccess.getMakeStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMakeStatement();

            state._fsp--;

             after(grammarAccess.getMakeStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMakeStatement"


    // $ANTLR start "ruleMakeStatement"
    // InternalCocktails.g:262:1: ruleMakeStatement : ( ( rule__MakeStatement__Group__0 ) ) ;
    public final void ruleMakeStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:266:2: ( ( ( rule__MakeStatement__Group__0 ) ) )
            // InternalCocktails.g:267:2: ( ( rule__MakeStatement__Group__0 ) )
            {
            // InternalCocktails.g:267:2: ( ( rule__MakeStatement__Group__0 ) )
            // InternalCocktails.g:268:3: ( rule__MakeStatement__Group__0 )
            {
             before(grammarAccess.getMakeStatementAccess().getGroup()); 
            // InternalCocktails.g:269:3: ( rule__MakeStatement__Group__0 )
            // InternalCocktails.g:269:4: rule__MakeStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMakeStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMakeStatement"


    // $ANTLR start "entryRuleAddition"
    // InternalCocktails.g:278:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalCocktails.g:279:1: ( ruleAddition EOF )
            // InternalCocktails.g:280:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalCocktails.g:287:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:291:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalCocktails.g:292:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalCocktails.g:292:2: ( ( rule__Addition__Group__0 ) )
            // InternalCocktails.g:293:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalCocktails.g:294:3: ( rule__Addition__Group__0 )
            // InternalCocktails.g:294:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalCocktails.g:303:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalCocktails.g:304:1: ( ruleMultiplication EOF )
            // InternalCocktails.g:305:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalCocktails.g:312:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:316:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalCocktails.g:317:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalCocktails.g:317:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalCocktails.g:318:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalCocktails.g:319:3: ( rule__Multiplication__Group__0 )
            // InternalCocktails.g:319:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalCocktails.g:328:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalCocktails.g:329:1: ( rulePrimaryExpression EOF )
            // InternalCocktails.g:330:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalCocktails.g:337:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:341:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalCocktails.g:342:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalCocktails.g:342:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalCocktails.g:343:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalCocktails.g:344:3: ( rule__PrimaryExpression__Alternatives )
            // InternalCocktails.g:344:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalCocktails.g:353:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalCocktails.g:354:1: ( ruleIntLiteral EOF )
            // InternalCocktails.g:355:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalCocktails.g:362:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:366:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalCocktails.g:367:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalCocktails.g:367:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalCocktails.g:368:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalCocktails.g:369:3: ( rule__IntLiteral__ValAssignment )
            // InternalCocktails.g:369:4: rule__IntLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalCocktails.g:378:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalCocktails.g:379:1: ( ruleVariableDeclaration EOF )
            // InternalCocktails.g:380:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalCocktails.g:387:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:391:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalCocktails.g:392:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalCocktails.g:392:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalCocktails.g:393:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalCocktails.g:394:3: ( rule__VariableDeclaration__Group__0 )
            // InternalCocktails.g:394:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalCocktails.g:403:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalCocktails.g:404:1: ( ruleIntVarExpression EOF )
            // InternalCocktails.g:405:1: ruleIntVarExpression EOF
            {
             before(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntVarExpression();

            state._fsp--;

             after(grammarAccess.getIntVarExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalCocktails.g:412:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:416:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalCocktails.g:417:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalCocktails.g:417:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalCocktails.g:418:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalCocktails.g:419:3: ( rule__IntVarExpression__VarAssignment )
            // InternalCocktails.g:419:4: rule__IntVarExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntVarExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "ruleFancyMakeStatement"
    // InternalCocktails.g:428:1: ruleFancyMakeStatement : ( ( rule__FancyMakeStatement__Alternatives ) ) ;
    public final void ruleFancyMakeStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:432:1: ( ( ( rule__FancyMakeStatement__Alternatives ) ) )
            // InternalCocktails.g:433:2: ( ( rule__FancyMakeStatement__Alternatives ) )
            {
            // InternalCocktails.g:433:2: ( ( rule__FancyMakeStatement__Alternatives ) )
            // InternalCocktails.g:434:3: ( rule__FancyMakeStatement__Alternatives )
            {
             before(grammarAccess.getFancyMakeStatementAccess().getAlternatives()); 
            // InternalCocktails.g:435:3: ( rule__FancyMakeStatement__Alternatives )
            // InternalCocktails.g:435:4: rule__FancyMakeStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FancyMakeStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFancyMakeStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFancyMakeStatement"


    // $ANTLR start "ruleIceStatement"
    // InternalCocktails.g:444:1: ruleIceStatement : ( ( rule__IceStatement__Alternatives ) ) ;
    public final void ruleIceStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:448:1: ( ( ( rule__IceStatement__Alternatives ) ) )
            // InternalCocktails.g:449:2: ( ( rule__IceStatement__Alternatives ) )
            {
            // InternalCocktails.g:449:2: ( ( rule__IceStatement__Alternatives ) )
            // InternalCocktails.g:450:3: ( rule__IceStatement__Alternatives )
            {
             before(grammarAccess.getIceStatementAccess().getAlternatives()); 
            // InternalCocktails.g:451:3: ( rule__IceStatement__Alternatives )
            // InternalCocktails.g:451:4: rule__IceStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IceStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIceStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIceStatement"


    // $ANTLR start "ruleFruitStatement"
    // InternalCocktails.g:460:1: ruleFruitStatement : ( ( rule__FruitStatement__Alternatives ) ) ;
    public final void ruleFruitStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:464:1: ( ( ( rule__FruitStatement__Alternatives ) ) )
            // InternalCocktails.g:465:2: ( ( rule__FruitStatement__Alternatives ) )
            {
            // InternalCocktails.g:465:2: ( ( rule__FruitStatement__Alternatives ) )
            // InternalCocktails.g:466:3: ( rule__FruitStatement__Alternatives )
            {
             before(grammarAccess.getFruitStatementAccess().getAlternatives()); 
            // InternalCocktails.g:467:3: ( rule__FruitStatement__Alternatives )
            // InternalCocktails.g:467:4: rule__FruitStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FruitStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFruitStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFruitStatement"


    // $ANTLR start "ruleDecorationStatement"
    // InternalCocktails.g:476:1: ruleDecorationStatement : ( ( rule__DecorationStatement__Alternatives ) ) ;
    public final void ruleDecorationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:480:1: ( ( ( rule__DecorationStatement__Alternatives ) ) )
            // InternalCocktails.g:481:2: ( ( rule__DecorationStatement__Alternatives ) )
            {
            // InternalCocktails.g:481:2: ( ( rule__DecorationStatement__Alternatives ) )
            // InternalCocktails.g:482:3: ( rule__DecorationStatement__Alternatives )
            {
             before(grammarAccess.getDecorationStatementAccess().getAlternatives()); 
            // InternalCocktails.g:483:3: ( rule__DecorationStatement__Alternatives )
            // InternalCocktails.g:483:4: rule__DecorationStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DecorationStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDecorationStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecorationStatement"


    // $ANTLR start "ruleMakeCommand"
    // InternalCocktails.g:492:1: ruleMakeCommand : ( ( rule__MakeCommand__Alternatives ) ) ;
    public final void ruleMakeCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:496:1: ( ( ( rule__MakeCommand__Alternatives ) ) )
            // InternalCocktails.g:497:2: ( ( rule__MakeCommand__Alternatives ) )
            {
            // InternalCocktails.g:497:2: ( ( rule__MakeCommand__Alternatives ) )
            // InternalCocktails.g:498:3: ( rule__MakeCommand__Alternatives )
            {
             before(grammarAccess.getMakeCommandAccess().getAlternatives()); 
            // InternalCocktails.g:499:3: ( rule__MakeCommand__Alternatives )
            // InternalCocktails.g:499:4: rule__MakeCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MakeCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMakeCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMakeCommand"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalCocktails.g:507:1: rule__Instruction__Alternatives : ( ( ruleAddIngredient ) | ( ruleAddFixedIngredient ) | ( ruleFancyStatement ) | ( ruleAddIce ) | ( ruleMuddleStatement ) | ( ruleAddDecoration ) | ( ruleMakeStatement ) | ( ruleVariableDeclaration ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:511:1: ( ( ruleAddIngredient ) | ( ruleAddFixedIngredient ) | ( ruleFancyStatement ) | ( ruleAddIce ) | ( ruleMuddleStatement ) | ( ruleAddDecoration ) | ( ruleMakeStatement ) | ( ruleVariableDeclaration ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt2=1;
                }
                break;
            case 53:
                {
                alt2=2;
                }
                break;
            case 55:
                {
                alt2=3;
                }
                break;
            case 56:
                {
                alt2=4;
                }
                break;
            case 58:
                {
                alt2=5;
                }
                break;
            case 60:
                {
                alt2=6;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt2=7;
                }
                break;
            case 65:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCocktails.g:512:2: ( ruleAddIngredient )
                    {
                    // InternalCocktails.g:512:2: ( ruleAddIngredient )
                    // InternalCocktails.g:513:3: ruleAddIngredient
                    {
                     before(grammarAccess.getInstructionAccess().getAddIngredientParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddIngredient();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAddIngredientParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:518:2: ( ruleAddFixedIngredient )
                    {
                    // InternalCocktails.g:518:2: ( ruleAddFixedIngredient )
                    // InternalCocktails.g:519:3: ruleAddFixedIngredient
                    {
                     before(grammarAccess.getInstructionAccess().getAddFixedIngredientParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAddFixedIngredient();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAddFixedIngredientParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCocktails.g:524:2: ( ruleFancyStatement )
                    {
                    // InternalCocktails.g:524:2: ( ruleFancyStatement )
                    // InternalCocktails.g:525:3: ruleFancyStatement
                    {
                     before(grammarAccess.getInstructionAccess().getFancyStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFancyStatement();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getFancyStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCocktails.g:530:2: ( ruleAddIce )
                    {
                    // InternalCocktails.g:530:2: ( ruleAddIce )
                    // InternalCocktails.g:531:3: ruleAddIce
                    {
                     before(grammarAccess.getInstructionAccess().getAddIceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAddIce();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAddIceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCocktails.g:536:2: ( ruleMuddleStatement )
                    {
                    // InternalCocktails.g:536:2: ( ruleMuddleStatement )
                    // InternalCocktails.g:537:3: ruleMuddleStatement
                    {
                     before(grammarAccess.getInstructionAccess().getMuddleStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMuddleStatement();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getMuddleStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCocktails.g:542:2: ( ruleAddDecoration )
                    {
                    // InternalCocktails.g:542:2: ( ruleAddDecoration )
                    // InternalCocktails.g:543:3: ruleAddDecoration
                    {
                     before(grammarAccess.getInstructionAccess().getAddDecorationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAddDecoration();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAddDecorationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCocktails.g:548:2: ( ruleMakeStatement )
                    {
                    // InternalCocktails.g:548:2: ( ruleMakeStatement )
                    // InternalCocktails.g:549:3: ruleMakeStatement
                    {
                     before(grammarAccess.getInstructionAccess().getMakeStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleMakeStatement();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getMakeStatementParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCocktails.g:554:2: ( ruleVariableDeclaration )
                    {
                    // InternalCocktails.g:554:2: ( ruleVariableDeclaration )
                    // InternalCocktails.g:555:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getInstructionAccess().getVariableDeclarationParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getVariableDeclarationParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalCocktails.g:564:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:568:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCocktails.g:569:2: ( '+' )
                    {
                    // InternalCocktails.g:569:2: ( '+' )
                    // InternalCocktails.g:570:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:575:2: ( '-' )
                    {
                    // InternalCocktails.g:575:2: ( '-' )
                    // InternalCocktails.g:576:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalCocktails.g:585:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:589:1: ( ( '*' ) | ( '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCocktails.g:590:2: ( '*' )
                    {
                    // InternalCocktails.g:590:2: ( '*' )
                    // InternalCocktails.g:591:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:596:2: ( '/' )
                    {
                    // InternalCocktails.g:596:2: ( '/' )
                    // InternalCocktails.g:597:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalCocktails.g:606:1: rule__PrimaryExpression__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:610:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 63:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCocktails.g:611:2: ( ruleIntLiteral )
                    {
                    // InternalCocktails.g:611:2: ( ruleIntLiteral )
                    // InternalCocktails.g:612:3: ruleIntLiteral
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:617:2: ( ruleIntVarExpression )
                    {
                    // InternalCocktails.g:617:2: ( ruleIntVarExpression )
                    // InternalCocktails.g:618:3: ruleIntVarExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getIntVarExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntVarExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getIntVarExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCocktails.g:623:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalCocktails.g:623:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalCocktails.g:624:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalCocktails.g:625:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalCocktails.g:625:4: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__FancyMakeStatement__Alternatives"
    // InternalCocktails.g:633:1: rule__FancyMakeStatement__Alternatives : ( ( ( 'lighter' ) ) | ( ( 'co2' ) ) );
    public final void rule__FancyMakeStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:637:1: ( ( ( 'lighter' ) ) | ( ( 'co2' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCocktails.g:638:2: ( ( 'lighter' ) )
                    {
                    // InternalCocktails.g:638:2: ( ( 'lighter' ) )
                    // InternalCocktails.g:639:3: ( 'lighter' )
                    {
                     before(grammarAccess.getFancyMakeStatementAccess().getLighterEnumLiteralDeclaration_0()); 
                    // InternalCocktails.g:640:3: ( 'lighter' )
                    // InternalCocktails.g:640:4: 'lighter'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFancyMakeStatementAccess().getLighterEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:644:2: ( ( 'co2' ) )
                    {
                    // InternalCocktails.g:644:2: ( ( 'co2' ) )
                    // InternalCocktails.g:645:3: ( 'co2' )
                    {
                     before(grammarAccess.getFancyMakeStatementAccess().getCo2EnumLiteralDeclaration_1()); 
                    // InternalCocktails.g:646:3: ( 'co2' )
                    // InternalCocktails.g:646:4: 'co2'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFancyMakeStatementAccess().getCo2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FancyMakeStatement__Alternatives"


    // $ANTLR start "rule__IceStatement__Alternatives"
    // InternalCocktails.g:654:1: rule__IceStatement__Alternatives : ( ( ( 'cube' ) ) | ( ( 'crush' ) ) | ( ( 'shave' ) ) | ( ( 'block' ) ) | ( ( 'ball' ) ) | ( ( 'cone' ) ) );
    public final void rule__IceStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:658:1: ( ( ( 'cube' ) ) | ( ( 'crush' ) ) | ( ( 'shave' ) ) | ( ( 'block' ) ) | ( ( 'ball' ) ) | ( ( 'cone' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCocktails.g:659:2: ( ( 'cube' ) )
                    {
                    // InternalCocktails.g:659:2: ( ( 'cube' ) )
                    // InternalCocktails.g:660:3: ( 'cube' )
                    {
                     before(grammarAccess.getIceStatementAccess().getCubeEnumLiteralDeclaration_0()); 
                    // InternalCocktails.g:661:3: ( 'cube' )
                    // InternalCocktails.g:661:4: 'cube'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getIceStatementAccess().getCubeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:665:2: ( ( 'crush' ) )
                    {
                    // InternalCocktails.g:665:2: ( ( 'crush' ) )
                    // InternalCocktails.g:666:3: ( 'crush' )
                    {
                     before(grammarAccess.getIceStatementAccess().getCrushEnumLiteralDeclaration_1()); 
                    // InternalCocktails.g:667:3: ( 'crush' )
                    // InternalCocktails.g:667:4: 'crush'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getIceStatementAccess().getCrushEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCocktails.g:671:2: ( ( 'shave' ) )
                    {
                    // InternalCocktails.g:671:2: ( ( 'shave' ) )
                    // InternalCocktails.g:672:3: ( 'shave' )
                    {
                     before(grammarAccess.getIceStatementAccess().getShaveEnumLiteralDeclaration_2()); 
                    // InternalCocktails.g:673:3: ( 'shave' )
                    // InternalCocktails.g:673:4: 'shave'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getIceStatementAccess().getShaveEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCocktails.g:677:2: ( ( 'block' ) )
                    {
                    // InternalCocktails.g:677:2: ( ( 'block' ) )
                    // InternalCocktails.g:678:3: ( 'block' )
                    {
                     before(grammarAccess.getIceStatementAccess().getBlockEnumLiteralDeclaration_3()); 
                    // InternalCocktails.g:679:3: ( 'block' )
                    // InternalCocktails.g:679:4: 'block'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getIceStatementAccess().getBlockEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCocktails.g:683:2: ( ( 'ball' ) )
                    {
                    // InternalCocktails.g:683:2: ( ( 'ball' ) )
                    // InternalCocktails.g:684:3: ( 'ball' )
                    {
                     before(grammarAccess.getIceStatementAccess().getBallEnumLiteralDeclaration_4()); 
                    // InternalCocktails.g:685:3: ( 'ball' )
                    // InternalCocktails.g:685:4: 'ball'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getIceStatementAccess().getBallEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCocktails.g:689:2: ( ( 'cone' ) )
                    {
                    // InternalCocktails.g:689:2: ( ( 'cone' ) )
                    // InternalCocktails.g:690:3: ( 'cone' )
                    {
                     before(grammarAccess.getIceStatementAccess().getConeEnumLiteralDeclaration_5()); 
                    // InternalCocktails.g:691:3: ( 'cone' )
                    // InternalCocktails.g:691:4: 'cone'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getIceStatementAccess().getConeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IceStatement__Alternatives"


    // $ANTLR start "rule__FruitStatement__Alternatives"
    // InternalCocktails.g:699:1: rule__FruitStatement__Alternatives : ( ( ( 'lime' ) ) | ( ( 'lemon' ) ) | ( ( 'orange' ) ) | ( ( 'grapefruit' ) ) | ( ( 'pineapple' ) ) | ( ( 'mango' ) ) | ( ( 'kiwi' ) ) | ( ( 'strawberry' ) ) | ( ( 'blueberry' ) ) | ( ( 'raspberry' ) ) | ( ( 'blackberry' ) ) | ( ( 'cherry' ) ) | ( ( 'peach' ) ) | ( ( 'plum' ) ) | ( ( 'watermelon' ) ) | ( ( 'cucumber' ) ) | ( ( 'mint' ) ) | ( ( 'basil' ) ) | ( ( 'thyme' ) ) | ( ( 'ginger' ) ) );
    public final void rule__FruitStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:703:1: ( ( ( 'lime' ) ) | ( ( 'lemon' ) ) | ( ( 'orange' ) ) | ( ( 'grapefruit' ) ) | ( ( 'pineapple' ) ) | ( ( 'mango' ) ) | ( ( 'kiwi' ) ) | ( ( 'strawberry' ) ) | ( ( 'blueberry' ) ) | ( ( 'raspberry' ) ) | ( ( 'blackberry' ) ) | ( ( 'cherry' ) ) | ( ( 'peach' ) ) | ( ( 'plum' ) ) | ( ( 'watermelon' ) ) | ( ( 'cucumber' ) ) | ( ( 'mint' ) ) | ( ( 'basil' ) ) | ( ( 'thyme' ) ) | ( ( 'ginger' ) ) )
            int alt8=20;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            case 28:
                {
                alt8=6;
                }
                break;
            case 29:
                {
                alt8=7;
                }
                break;
            case 30:
                {
                alt8=8;
                }
                break;
            case 31:
                {
                alt8=9;
                }
                break;
            case 32:
                {
                alt8=10;
                }
                break;
            case 33:
                {
                alt8=11;
                }
                break;
            case 34:
                {
                alt8=12;
                }
                break;
            case 35:
                {
                alt8=13;
                }
                break;
            case 36:
                {
                alt8=14;
                }
                break;
            case 37:
                {
                alt8=15;
                }
                break;
            case 38:
                {
                alt8=16;
                }
                break;
            case 39:
                {
                alt8=17;
                }
                break;
            case 40:
                {
                alt8=18;
                }
                break;
            case 41:
                {
                alt8=19;
                }
                break;
            case 42:
                {
                alt8=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCocktails.g:704:2: ( ( 'lime' ) )
                    {
                    // InternalCocktails.g:704:2: ( ( 'lime' ) )
                    // InternalCocktails.g:705:3: ( 'lime' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getLimeEnumLiteralDeclaration_0()); 
                    // InternalCocktails.g:706:3: ( 'lime' )
                    // InternalCocktails.g:706:4: 'lime'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getLimeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:710:2: ( ( 'lemon' ) )
                    {
                    // InternalCocktails.g:710:2: ( ( 'lemon' ) )
                    // InternalCocktails.g:711:3: ( 'lemon' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getLemonEnumLiteralDeclaration_1()); 
                    // InternalCocktails.g:712:3: ( 'lemon' )
                    // InternalCocktails.g:712:4: 'lemon'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getLemonEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCocktails.g:716:2: ( ( 'orange' ) )
                    {
                    // InternalCocktails.g:716:2: ( ( 'orange' ) )
                    // InternalCocktails.g:717:3: ( 'orange' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getOrangeEnumLiteralDeclaration_2()); 
                    // InternalCocktails.g:718:3: ( 'orange' )
                    // InternalCocktails.g:718:4: 'orange'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getOrangeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCocktails.g:722:2: ( ( 'grapefruit' ) )
                    {
                    // InternalCocktails.g:722:2: ( ( 'grapefruit' ) )
                    // InternalCocktails.g:723:3: ( 'grapefruit' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getGrapefruitEnumLiteralDeclaration_3()); 
                    // InternalCocktails.g:724:3: ( 'grapefruit' )
                    // InternalCocktails.g:724:4: 'grapefruit'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getGrapefruitEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCocktails.g:728:2: ( ( 'pineapple' ) )
                    {
                    // InternalCocktails.g:728:2: ( ( 'pineapple' ) )
                    // InternalCocktails.g:729:3: ( 'pineapple' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getPineappleEnumLiteralDeclaration_4()); 
                    // InternalCocktails.g:730:3: ( 'pineapple' )
                    // InternalCocktails.g:730:4: 'pineapple'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getPineappleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCocktails.g:734:2: ( ( 'mango' ) )
                    {
                    // InternalCocktails.g:734:2: ( ( 'mango' ) )
                    // InternalCocktails.g:735:3: ( 'mango' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getMangoEnumLiteralDeclaration_5()); 
                    // InternalCocktails.g:736:3: ( 'mango' )
                    // InternalCocktails.g:736:4: 'mango'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getMangoEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCocktails.g:740:2: ( ( 'kiwi' ) )
                    {
                    // InternalCocktails.g:740:2: ( ( 'kiwi' ) )
                    // InternalCocktails.g:741:3: ( 'kiwi' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getKiwiEnumLiteralDeclaration_6()); 
                    // InternalCocktails.g:742:3: ( 'kiwi' )
                    // InternalCocktails.g:742:4: 'kiwi'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getKiwiEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCocktails.g:746:2: ( ( 'strawberry' ) )
                    {
                    // InternalCocktails.g:746:2: ( ( 'strawberry' ) )
                    // InternalCocktails.g:747:3: ( 'strawberry' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getStrawberryEnumLiteralDeclaration_7()); 
                    // InternalCocktails.g:748:3: ( 'strawberry' )
                    // InternalCocktails.g:748:4: 'strawberry'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getStrawberryEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCocktails.g:752:2: ( ( 'blueberry' ) )
                    {
                    // InternalCocktails.g:752:2: ( ( 'blueberry' ) )
                    // InternalCocktails.g:753:3: ( 'blueberry' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getBlueberryEnumLiteralDeclaration_8()); 
                    // InternalCocktails.g:754:3: ( 'blueberry' )
                    // InternalCocktails.g:754:4: 'blueberry'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getBlueberryEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCocktails.g:758:2: ( ( 'raspberry' ) )
                    {
                    // InternalCocktails.g:758:2: ( ( 'raspberry' ) )
                    // InternalCocktails.g:759:3: ( 'raspberry' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getRaspberryEnumLiteralDeclaration_9()); 
                    // InternalCocktails.g:760:3: ( 'raspberry' )
                    // InternalCocktails.g:760:4: 'raspberry'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getRaspberryEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCocktails.g:764:2: ( ( 'blackberry' ) )
                    {
                    // InternalCocktails.g:764:2: ( ( 'blackberry' ) )
                    // InternalCocktails.g:765:3: ( 'blackberry' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getBlackberryEnumLiteralDeclaration_10()); 
                    // InternalCocktails.g:766:3: ( 'blackberry' )
                    // InternalCocktails.g:766:4: 'blackberry'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getBlackberryEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCocktails.g:770:2: ( ( 'cherry' ) )
                    {
                    // InternalCocktails.g:770:2: ( ( 'cherry' ) )
                    // InternalCocktails.g:771:3: ( 'cherry' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getCherryEnumLiteralDeclaration_11()); 
                    // InternalCocktails.g:772:3: ( 'cherry' )
                    // InternalCocktails.g:772:4: 'cherry'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getCherryEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalCocktails.g:776:2: ( ( 'peach' ) )
                    {
                    // InternalCocktails.g:776:2: ( ( 'peach' ) )
                    // InternalCocktails.g:777:3: ( 'peach' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getPeachEnumLiteralDeclaration_12()); 
                    // InternalCocktails.g:778:3: ( 'peach' )
                    // InternalCocktails.g:778:4: 'peach'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getPeachEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalCocktails.g:782:2: ( ( 'plum' ) )
                    {
                    // InternalCocktails.g:782:2: ( ( 'plum' ) )
                    // InternalCocktails.g:783:3: ( 'plum' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getPlumEnumLiteralDeclaration_13()); 
                    // InternalCocktails.g:784:3: ( 'plum' )
                    // InternalCocktails.g:784:4: 'plum'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getPlumEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalCocktails.g:788:2: ( ( 'watermelon' ) )
                    {
                    // InternalCocktails.g:788:2: ( ( 'watermelon' ) )
                    // InternalCocktails.g:789:3: ( 'watermelon' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getWatermelonEnumLiteralDeclaration_14()); 
                    // InternalCocktails.g:790:3: ( 'watermelon' )
                    // InternalCocktails.g:790:4: 'watermelon'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getWatermelonEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalCocktails.g:794:2: ( ( 'cucumber' ) )
                    {
                    // InternalCocktails.g:794:2: ( ( 'cucumber' ) )
                    // InternalCocktails.g:795:3: ( 'cucumber' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getCucumberEnumLiteralDeclaration_15()); 
                    // InternalCocktails.g:796:3: ( 'cucumber' )
                    // InternalCocktails.g:796:4: 'cucumber'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getCucumberEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalCocktails.g:800:2: ( ( 'mint' ) )
                    {
                    // InternalCocktails.g:800:2: ( ( 'mint' ) )
                    // InternalCocktails.g:801:3: ( 'mint' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getMintEnumLiteralDeclaration_16()); 
                    // InternalCocktails.g:802:3: ( 'mint' )
                    // InternalCocktails.g:802:4: 'mint'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getMintEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalCocktails.g:806:2: ( ( 'basil' ) )
                    {
                    // InternalCocktails.g:806:2: ( ( 'basil' ) )
                    // InternalCocktails.g:807:3: ( 'basil' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getBasilEnumLiteralDeclaration_17()); 
                    // InternalCocktails.g:808:3: ( 'basil' )
                    // InternalCocktails.g:808:4: 'basil'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getBasilEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalCocktails.g:812:2: ( ( 'thyme' ) )
                    {
                    // InternalCocktails.g:812:2: ( ( 'thyme' ) )
                    // InternalCocktails.g:813:3: ( 'thyme' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getThymeEnumLiteralDeclaration_18()); 
                    // InternalCocktails.g:814:3: ( 'thyme' )
                    // InternalCocktails.g:814:4: 'thyme'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getThymeEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalCocktails.g:818:2: ( ( 'ginger' ) )
                    {
                    // InternalCocktails.g:818:2: ( ( 'ginger' ) )
                    // InternalCocktails.g:819:3: ( 'ginger' )
                    {
                     before(grammarAccess.getFruitStatementAccess().getGingerEnumLiteralDeclaration_19()); 
                    // InternalCocktails.g:820:3: ( 'ginger' )
                    // InternalCocktails.g:820:4: 'ginger'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getFruitStatementAccess().getGingerEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FruitStatement__Alternatives"


    // $ANTLR start "rule__DecorationStatement__Alternatives"
    // InternalCocktails.g:828:1: rule__DecorationStatement__Alternatives : ( ( ( 'orange' ) ) | ( ( 'lemon' ) ) | ( ( 'lime' ) ) | ( ( 'olive' ) ) | ( ( 'cherry' ) ) | ( ( 'mint' ) ) | ( ( 'rose' ) ) | ( ( 'cinnamon' ) ) | ( ( 'mango' ) ) | ( ( 'grapefruit' ) ) );
    public final void rule__DecorationStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:832:1: ( ( ( 'orange' ) ) | ( ( 'lemon' ) ) | ( ( 'lime' ) ) | ( ( 'olive' ) ) | ( ( 'cherry' ) ) | ( ( 'mint' ) ) | ( ( 'rose' ) ) | ( ( 'cinnamon' ) ) | ( ( 'mango' ) ) | ( ( 'grapefruit' ) ) )
            int alt9=10;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            case 34:
                {
                alt9=5;
                }
                break;
            case 39:
                {
                alt9=6;
                }
                break;
            case 44:
                {
                alt9=7;
                }
                break;
            case 45:
                {
                alt9=8;
                }
                break;
            case 28:
                {
                alt9=9;
                }
                break;
            case 26:
                {
                alt9=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCocktails.g:833:2: ( ( 'orange' ) )
                    {
                    // InternalCocktails.g:833:2: ( ( 'orange' ) )
                    // InternalCocktails.g:834:3: ( 'orange' )
                    {
                     before(grammarAccess.getDecorationStatementAccess().getOrangeEnumLiteralDeclaration_0()); 
                    // InternalCocktails.g:835:3: ( 'orange' )
                    // InternalCocktails.g:835:4: 'orange'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecorationStatementAccess().getOrangeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:839:2: ( ( 'lemon' ) )
                    {
                    // InternalCocktails.g:839:2: ( ( 'lemon' ) )
                    // InternalCocktails.g:840:3: ( 'lemon' )
                    {
                     before(grammarAccess.getDecorationStatementAccess().getLemonEnumLiteralDeclaration_1()); 
                    // InternalCocktails.g:841:3: ( 'lemon' )
                    // InternalCocktails.g:841:4: 'lemon'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecorationStatementAccess().getLemonEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCocktails.g:845:2: ( ( 'lime' ) )
                    {
                    // InternalCocktails.g:845:2: ( ( 'lime' ) )
                    // InternalCocktails.g:846:3: ( 'lime' )
                    {
                     before(grammarAccess.getDecorationStatementAccess().getLimeEnumLiteralDeclaration_2()); 
                    // InternalCocktails.g:847:3: ( 'lime' )
                    // InternalCocktails.g:847:4: 'lime'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecorationStatementAccess().getLimeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCocktails.g:851:2: ( ( 'olive' ) )
                    {
                    // InternalCocktails.g:851:2: ( ( 'olive' ) )
                    // InternalCocktails.g:852:3: ( 'olive' )
                    {
                     before(grammarAccess.getDecorationStatementAccess().getOliveEnumLiteralDeclaration_3()); 
                    // InternalCocktails.g:853:3: ( 'olive' )
                    // InternalCocktails.g:853:4: 'olive'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecorationStatementAccess().getOliveEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCocktails.g:857:2: ( ( 'cherry' ) )
                    {
                    // InternalCocktails.g:857:2: ( ( 'cherry' ) )
                    // InternalCocktails.g:858:3: ( 'cherry' )
                    {
                     before(grammarAccess.getDecorationStatementAccess().getCherryEnumLiteralDeclaration_4()); 
                    // InternalCocktails.g:859:3: ( 'cherry' )
                    // InternalCocktails.g:859:4: 'cherry'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecorationStatementAccess().getCherryEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCocktails.g:863:2: ( ( 'mint' ) )
                    {
                    // InternalCocktails.g:863:2: ( ( 'mint' ) )
                    // InternalCocktails.g:864:3: ( 'mint' )
                    {
                     before(grammarAccess.getDecorationStatementAccess().getMintEnumLiteralDeclaration_5()); 
                    // InternalCocktails.g:865:3: ( 'mint' )
                    // InternalCocktails.g:865:4: 'mint'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecorationStatementAccess().getMintEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCocktails.g:869:2: ( ( 'rose' ) )
                    {
                    // InternalCocktails.g:869:2: ( ( 'rose' ) )
                    // InternalCocktails.g:870:3: ( 'rose' )
                    {
                     before(grammarAccess.getDecorationStatementAccess().getRoseEnumLiteralDeclaration_6()); 
                    // InternalCocktails.g:871:3: ( 'rose' )
                    // InternalCocktails.g:871:4: 'rose'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecorationStatementAccess().getRoseEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCocktails.g:875:2: ( ( 'cinnamon' ) )
                    {
                    // InternalCocktails.g:875:2: ( ( 'cinnamon' ) )
                    // InternalCocktails.g:876:3: ( 'cinnamon' )
                    {
                     before(grammarAccess.getDecorationStatementAccess().getCinnamonEnumLiteralDeclaration_7()); 
                    // InternalCocktails.g:877:3: ( 'cinnamon' )
                    // InternalCocktails.g:877:4: 'cinnamon'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecorationStatementAccess().getCinnamonEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCocktails.g:881:2: ( ( 'mango' ) )
                    {
                    // InternalCocktails.g:881:2: ( ( 'mango' ) )
                    // InternalCocktails.g:882:3: ( 'mango' )
                    {
                     before(grammarAccess.getDecorationStatementAccess().getMangoEnumLiteralDeclaration_8()); 
                    // InternalCocktails.g:883:3: ( 'mango' )
                    // InternalCocktails.g:883:4: 'mango'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecorationStatementAccess().getMangoEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCocktails.g:887:2: ( ( 'grapefruit' ) )
                    {
                    // InternalCocktails.g:887:2: ( ( 'grapefruit' ) )
                    // InternalCocktails.g:888:3: ( 'grapefruit' )
                    {
                     before(grammarAccess.getDecorationStatementAccess().getGrapefruitEnumLiteralDeclaration_9()); 
                    // InternalCocktails.g:889:3: ( 'grapefruit' )
                    // InternalCocktails.g:889:4: 'grapefruit'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecorationStatementAccess().getGrapefruitEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationStatement__Alternatives"


    // $ANTLR start "rule__MakeCommand__Alternatives"
    // InternalCocktails.g:897:1: rule__MakeCommand__Alternatives : ( ( ( 'stir' ) ) | ( ( 'shake' ) ) | ( ( 'blend' ) ) | ( ( 'filter' ) ) );
    public final void rule__MakeCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:901:1: ( ( ( 'stir' ) ) | ( ( 'shake' ) ) | ( ( 'blend' ) ) | ( ( 'filter' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt10=1;
                }
                break;
            case 47:
                {
                alt10=2;
                }
                break;
            case 48:
                {
                alt10=3;
                }
                break;
            case 49:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCocktails.g:902:2: ( ( 'stir' ) )
                    {
                    // InternalCocktails.g:902:2: ( ( 'stir' ) )
                    // InternalCocktails.g:903:3: ( 'stir' )
                    {
                     before(grammarAccess.getMakeCommandAccess().getStirEnumLiteralDeclaration_0()); 
                    // InternalCocktails.g:904:3: ( 'stir' )
                    // InternalCocktails.g:904:4: 'stir'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getMakeCommandAccess().getStirEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:908:2: ( ( 'shake' ) )
                    {
                    // InternalCocktails.g:908:2: ( ( 'shake' ) )
                    // InternalCocktails.g:909:3: ( 'shake' )
                    {
                     before(grammarAccess.getMakeCommandAccess().getShakeEnumLiteralDeclaration_1()); 
                    // InternalCocktails.g:910:3: ( 'shake' )
                    // InternalCocktails.g:910:4: 'shake'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getMakeCommandAccess().getShakeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCocktails.g:914:2: ( ( 'blend' ) )
                    {
                    // InternalCocktails.g:914:2: ( ( 'blend' ) )
                    // InternalCocktails.g:915:3: ( 'blend' )
                    {
                     before(grammarAccess.getMakeCommandAccess().getBlendEnumLiteralDeclaration_2()); 
                    // InternalCocktails.g:916:3: ( 'blend' )
                    // InternalCocktails.g:916:4: 'blend'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getMakeCommandAccess().getBlendEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCocktails.g:920:2: ( ( 'filter' ) )
                    {
                    // InternalCocktails.g:920:2: ( ( 'filter' ) )
                    // InternalCocktails.g:921:3: ( 'filter' )
                    {
                     before(grammarAccess.getMakeCommandAccess().getFilterEnumLiteralDeclaration_3()); 
                    // InternalCocktails.g:922:3: ( 'filter' )
                    // InternalCocktails.g:922:4: 'filter'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getMakeCommandAccess().getFilterEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeCommand__Alternatives"


    // $ANTLR start "rule__AddIngredient__Group__0"
    // InternalCocktails.g:930:1: rule__AddIngredient__Group__0 : rule__AddIngredient__Group__0__Impl rule__AddIngredient__Group__1 ;
    public final void rule__AddIngredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:934:1: ( rule__AddIngredient__Group__0__Impl rule__AddIngredient__Group__1 )
            // InternalCocktails.g:935:2: rule__AddIngredient__Group__0__Impl rule__AddIngredient__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AddIngredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddIngredient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__Group__0"


    // $ANTLR start "rule__AddIngredient__Group__0__Impl"
    // InternalCocktails.g:942:1: rule__AddIngredient__Group__0__Impl : ( 'addI' ) ;
    public final void rule__AddIngredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:946:1: ( ( 'addI' ) )
            // InternalCocktails.g:947:1: ( 'addI' )
            {
            // InternalCocktails.g:947:1: ( 'addI' )
            // InternalCocktails.g:948:2: 'addI'
            {
             before(grammarAccess.getAddIngredientAccess().getAddIKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAddIngredientAccess().getAddIKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__Group__0__Impl"


    // $ANTLR start "rule__AddIngredient__Group__1"
    // InternalCocktails.g:957:1: rule__AddIngredient__Group__1 : rule__AddIngredient__Group__1__Impl rule__AddIngredient__Group__2 ;
    public final void rule__AddIngredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:961:1: ( rule__AddIngredient__Group__1__Impl rule__AddIngredient__Group__2 )
            // InternalCocktails.g:962:2: rule__AddIngredient__Group__1__Impl rule__AddIngredient__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AddIngredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddIngredient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__Group__1"


    // $ANTLR start "rule__AddIngredient__Group__1__Impl"
    // InternalCocktails.g:969:1: rule__AddIngredient__Group__1__Impl : ( ( rule__AddIngredient__NameAssignment_1 ) ) ;
    public final void rule__AddIngredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:973:1: ( ( ( rule__AddIngredient__NameAssignment_1 ) ) )
            // InternalCocktails.g:974:1: ( ( rule__AddIngredient__NameAssignment_1 ) )
            {
            // InternalCocktails.g:974:1: ( ( rule__AddIngredient__NameAssignment_1 ) )
            // InternalCocktails.g:975:2: ( rule__AddIngredient__NameAssignment_1 )
            {
             before(grammarAccess.getAddIngredientAccess().getNameAssignment_1()); 
            // InternalCocktails.g:976:2: ( rule__AddIngredient__NameAssignment_1 )
            // InternalCocktails.g:976:3: rule__AddIngredient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddIngredient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddIngredientAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__Group__1__Impl"


    // $ANTLR start "rule__AddIngredient__Group__2"
    // InternalCocktails.g:984:1: rule__AddIngredient__Group__2 : rule__AddIngredient__Group__2__Impl rule__AddIngredient__Group__3 ;
    public final void rule__AddIngredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:988:1: ( rule__AddIngredient__Group__2__Impl rule__AddIngredient__Group__3 )
            // InternalCocktails.g:989:2: rule__AddIngredient__Group__2__Impl rule__AddIngredient__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AddIngredient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddIngredient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__Group__2"


    // $ANTLR start "rule__AddIngredient__Group__2__Impl"
    // InternalCocktails.g:996:1: rule__AddIngredient__Group__2__Impl : ( ':' ) ;
    public final void rule__AddIngredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1000:1: ( ( ':' ) )
            // InternalCocktails.g:1001:1: ( ':' )
            {
            // InternalCocktails.g:1001:1: ( ':' )
            // InternalCocktails.g:1002:2: ':'
            {
             before(grammarAccess.getAddIngredientAccess().getColonKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAddIngredientAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__Group__2__Impl"


    // $ANTLR start "rule__AddIngredient__Group__3"
    // InternalCocktails.g:1011:1: rule__AddIngredient__Group__3 : rule__AddIngredient__Group__3__Impl rule__AddIngredient__Group__4 ;
    public final void rule__AddIngredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1015:1: ( rule__AddIngredient__Group__3__Impl rule__AddIngredient__Group__4 )
            // InternalCocktails.g:1016:2: rule__AddIngredient__Group__3__Impl rule__AddIngredient__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__AddIngredient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddIngredient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__Group__3"


    // $ANTLR start "rule__AddIngredient__Group__3__Impl"
    // InternalCocktails.g:1023:1: rule__AddIngredient__Group__3__Impl : ( ( rule__AddIngredient__AmountAssignment_3 ) ) ;
    public final void rule__AddIngredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1027:1: ( ( ( rule__AddIngredient__AmountAssignment_3 ) ) )
            // InternalCocktails.g:1028:1: ( ( rule__AddIngredient__AmountAssignment_3 ) )
            {
            // InternalCocktails.g:1028:1: ( ( rule__AddIngredient__AmountAssignment_3 ) )
            // InternalCocktails.g:1029:2: ( rule__AddIngredient__AmountAssignment_3 )
            {
             before(grammarAccess.getAddIngredientAccess().getAmountAssignment_3()); 
            // InternalCocktails.g:1030:2: ( rule__AddIngredient__AmountAssignment_3 )
            // InternalCocktails.g:1030:3: rule__AddIngredient__AmountAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddIngredient__AmountAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddIngredientAccess().getAmountAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__Group__3__Impl"


    // $ANTLR start "rule__AddIngredient__Group__4"
    // InternalCocktails.g:1038:1: rule__AddIngredient__Group__4 : rule__AddIngredient__Group__4__Impl ;
    public final void rule__AddIngredient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1042:1: ( rule__AddIngredient__Group__4__Impl )
            // InternalCocktails.g:1043:2: rule__AddIngredient__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddIngredient__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__Group__4"


    // $ANTLR start "rule__AddIngredient__Group__4__Impl"
    // InternalCocktails.g:1049:1: rule__AddIngredient__Group__4__Impl : ( 'ml' ) ;
    public final void rule__AddIngredient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1053:1: ( ( 'ml' ) )
            // InternalCocktails.g:1054:1: ( 'ml' )
            {
            // InternalCocktails.g:1054:1: ( 'ml' )
            // InternalCocktails.g:1055:2: 'ml'
            {
             before(grammarAccess.getAddIngredientAccess().getMlKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAddIngredientAccess().getMlKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__Group__4__Impl"


    // $ANTLR start "rule__AddFixedIngredient__Group__0"
    // InternalCocktails.g:1065:1: rule__AddFixedIngredient__Group__0 : rule__AddFixedIngredient__Group__0__Impl rule__AddFixedIngredient__Group__1 ;
    public final void rule__AddFixedIngredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1069:1: ( rule__AddFixedIngredient__Group__0__Impl rule__AddFixedIngredient__Group__1 )
            // InternalCocktails.g:1070:2: rule__AddFixedIngredient__Group__0__Impl rule__AddFixedIngredient__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AddFixedIngredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddFixedIngredient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__Group__0"


    // $ANTLR start "rule__AddFixedIngredient__Group__0__Impl"
    // InternalCocktails.g:1077:1: rule__AddFixedIngredient__Group__0__Impl : ( 'addF' ) ;
    public final void rule__AddFixedIngredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1081:1: ( ( 'addF' ) )
            // InternalCocktails.g:1082:1: ( 'addF' )
            {
            // InternalCocktails.g:1082:1: ( 'addF' )
            // InternalCocktails.g:1083:2: 'addF'
            {
             before(grammarAccess.getAddFixedIngredientAccess().getAddFKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAddFixedIngredientAccess().getAddFKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__Group__0__Impl"


    // $ANTLR start "rule__AddFixedIngredient__Group__1"
    // InternalCocktails.g:1092:1: rule__AddFixedIngredient__Group__1 : rule__AddFixedIngredient__Group__1__Impl rule__AddFixedIngredient__Group__2 ;
    public final void rule__AddFixedIngredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1096:1: ( rule__AddFixedIngredient__Group__1__Impl rule__AddFixedIngredient__Group__2 )
            // InternalCocktails.g:1097:2: rule__AddFixedIngredient__Group__1__Impl rule__AddFixedIngredient__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AddFixedIngredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddFixedIngredient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__Group__1"


    // $ANTLR start "rule__AddFixedIngredient__Group__1__Impl"
    // InternalCocktails.g:1104:1: rule__AddFixedIngredient__Group__1__Impl : ( ( rule__AddFixedIngredient__NameAssignment_1 ) ) ;
    public final void rule__AddFixedIngredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1108:1: ( ( ( rule__AddFixedIngredient__NameAssignment_1 ) ) )
            // InternalCocktails.g:1109:1: ( ( rule__AddFixedIngredient__NameAssignment_1 ) )
            {
            // InternalCocktails.g:1109:1: ( ( rule__AddFixedIngredient__NameAssignment_1 ) )
            // InternalCocktails.g:1110:2: ( rule__AddFixedIngredient__NameAssignment_1 )
            {
             before(grammarAccess.getAddFixedIngredientAccess().getNameAssignment_1()); 
            // InternalCocktails.g:1111:2: ( rule__AddFixedIngredient__NameAssignment_1 )
            // InternalCocktails.g:1111:3: rule__AddFixedIngredient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddFixedIngredient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddFixedIngredientAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__Group__1__Impl"


    // $ANTLR start "rule__AddFixedIngredient__Group__2"
    // InternalCocktails.g:1119:1: rule__AddFixedIngredient__Group__2 : rule__AddFixedIngredient__Group__2__Impl rule__AddFixedIngredient__Group__3 ;
    public final void rule__AddFixedIngredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1123:1: ( rule__AddFixedIngredient__Group__2__Impl rule__AddFixedIngredient__Group__3 )
            // InternalCocktails.g:1124:2: rule__AddFixedIngredient__Group__2__Impl rule__AddFixedIngredient__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AddFixedIngredient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddFixedIngredient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__Group__2"


    // $ANTLR start "rule__AddFixedIngredient__Group__2__Impl"
    // InternalCocktails.g:1131:1: rule__AddFixedIngredient__Group__2__Impl : ( ':' ) ;
    public final void rule__AddFixedIngredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1135:1: ( ( ':' ) )
            // InternalCocktails.g:1136:1: ( ':' )
            {
            // InternalCocktails.g:1136:1: ( ':' )
            // InternalCocktails.g:1137:2: ':'
            {
             before(grammarAccess.getAddFixedIngredientAccess().getColonKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAddFixedIngredientAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__Group__2__Impl"


    // $ANTLR start "rule__AddFixedIngredient__Group__3"
    // InternalCocktails.g:1146:1: rule__AddFixedIngredient__Group__3 : rule__AddFixedIngredient__Group__3__Impl rule__AddFixedIngredient__Group__4 ;
    public final void rule__AddFixedIngredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1150:1: ( rule__AddFixedIngredient__Group__3__Impl rule__AddFixedIngredient__Group__4 )
            // InternalCocktails.g:1151:2: rule__AddFixedIngredient__Group__3__Impl rule__AddFixedIngredient__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__AddFixedIngredient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddFixedIngredient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__Group__3"


    // $ANTLR start "rule__AddFixedIngredient__Group__3__Impl"
    // InternalCocktails.g:1158:1: rule__AddFixedIngredient__Group__3__Impl : ( ( rule__AddFixedIngredient__AmountAssignment_3 ) ) ;
    public final void rule__AddFixedIngredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1162:1: ( ( ( rule__AddFixedIngredient__AmountAssignment_3 ) ) )
            // InternalCocktails.g:1163:1: ( ( rule__AddFixedIngredient__AmountAssignment_3 ) )
            {
            // InternalCocktails.g:1163:1: ( ( rule__AddFixedIngredient__AmountAssignment_3 ) )
            // InternalCocktails.g:1164:2: ( rule__AddFixedIngredient__AmountAssignment_3 )
            {
             before(grammarAccess.getAddFixedIngredientAccess().getAmountAssignment_3()); 
            // InternalCocktails.g:1165:2: ( rule__AddFixedIngredient__AmountAssignment_3 )
            // InternalCocktails.g:1165:3: rule__AddFixedIngredient__AmountAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddFixedIngredient__AmountAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddFixedIngredientAccess().getAmountAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__Group__3__Impl"


    // $ANTLR start "rule__AddFixedIngredient__Group__4"
    // InternalCocktails.g:1173:1: rule__AddFixedIngredient__Group__4 : rule__AddFixedIngredient__Group__4__Impl ;
    public final void rule__AddFixedIngredient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1177:1: ( rule__AddFixedIngredient__Group__4__Impl )
            // InternalCocktails.g:1178:2: rule__AddFixedIngredient__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddFixedIngredient__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__Group__4"


    // $ANTLR start "rule__AddFixedIngredient__Group__4__Impl"
    // InternalCocktails.g:1184:1: rule__AddFixedIngredient__Group__4__Impl : ( 'g' ) ;
    public final void rule__AddFixedIngredient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1188:1: ( ( 'g' ) )
            // InternalCocktails.g:1189:1: ( 'g' )
            {
            // InternalCocktails.g:1189:1: ( 'g' )
            // InternalCocktails.g:1190:2: 'g'
            {
             before(grammarAccess.getAddFixedIngredientAccess().getGKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAddFixedIngredientAccess().getGKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__Group__4__Impl"


    // $ANTLR start "rule__FancyStatement__Group__0"
    // InternalCocktails.g:1200:1: rule__FancyStatement__Group__0 : rule__FancyStatement__Group__0__Impl rule__FancyStatement__Group__1 ;
    public final void rule__FancyStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1204:1: ( rule__FancyStatement__Group__0__Impl rule__FancyStatement__Group__1 )
            // InternalCocktails.g:1205:2: rule__FancyStatement__Group__0__Impl rule__FancyStatement__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FancyStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FancyStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FancyStatement__Group__0"


    // $ANTLR start "rule__FancyStatement__Group__0__Impl"
    // InternalCocktails.g:1212:1: rule__FancyStatement__Group__0__Impl : ( 'use' ) ;
    public final void rule__FancyStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1216:1: ( ( 'use' ) )
            // InternalCocktails.g:1217:1: ( 'use' )
            {
            // InternalCocktails.g:1217:1: ( 'use' )
            // InternalCocktails.g:1218:2: 'use'
            {
             before(grammarAccess.getFancyStatementAccess().getUseKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getFancyStatementAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FancyStatement__Group__0__Impl"


    // $ANTLR start "rule__FancyStatement__Group__1"
    // InternalCocktails.g:1227:1: rule__FancyStatement__Group__1 : rule__FancyStatement__Group__1__Impl ;
    public final void rule__FancyStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1231:1: ( rule__FancyStatement__Group__1__Impl )
            // InternalCocktails.g:1232:2: rule__FancyStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FancyStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FancyStatement__Group__1"


    // $ANTLR start "rule__FancyStatement__Group__1__Impl"
    // InternalCocktails.g:1238:1: rule__FancyStatement__Group__1__Impl : ( ( rule__FancyStatement__FcommandAssignment_1 ) ) ;
    public final void rule__FancyStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1242:1: ( ( ( rule__FancyStatement__FcommandAssignment_1 ) ) )
            // InternalCocktails.g:1243:1: ( ( rule__FancyStatement__FcommandAssignment_1 ) )
            {
            // InternalCocktails.g:1243:1: ( ( rule__FancyStatement__FcommandAssignment_1 ) )
            // InternalCocktails.g:1244:2: ( rule__FancyStatement__FcommandAssignment_1 )
            {
             before(grammarAccess.getFancyStatementAccess().getFcommandAssignment_1()); 
            // InternalCocktails.g:1245:2: ( rule__FancyStatement__FcommandAssignment_1 )
            // InternalCocktails.g:1245:3: rule__FancyStatement__FcommandAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FancyStatement__FcommandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFancyStatementAccess().getFcommandAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FancyStatement__Group__1__Impl"


    // $ANTLR start "rule__AddIce__Group__0"
    // InternalCocktails.g:1254:1: rule__AddIce__Group__0 : rule__AddIce__Group__0__Impl rule__AddIce__Group__1 ;
    public final void rule__AddIce__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1258:1: ( rule__AddIce__Group__0__Impl rule__AddIce__Group__1 )
            // InternalCocktails.g:1259:2: rule__AddIce__Group__0__Impl rule__AddIce__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AddIce__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddIce__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__Group__0"


    // $ANTLR start "rule__AddIce__Group__0__Impl"
    // InternalCocktails.g:1266:1: rule__AddIce__Group__0__Impl : ( 'addIc' ) ;
    public final void rule__AddIce__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1270:1: ( ( 'addIc' ) )
            // InternalCocktails.g:1271:1: ( 'addIc' )
            {
            // InternalCocktails.g:1271:1: ( 'addIc' )
            // InternalCocktails.g:1272:2: 'addIc'
            {
             before(grammarAccess.getAddIceAccess().getAddIcKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAddIceAccess().getAddIcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__Group__0__Impl"


    // $ANTLR start "rule__AddIce__Group__1"
    // InternalCocktails.g:1281:1: rule__AddIce__Group__1 : rule__AddIce__Group__1__Impl rule__AddIce__Group__2 ;
    public final void rule__AddIce__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1285:1: ( rule__AddIce__Group__1__Impl rule__AddIce__Group__2 )
            // InternalCocktails.g:1286:2: rule__AddIce__Group__1__Impl rule__AddIce__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AddIce__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddIce__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__Group__1"


    // $ANTLR start "rule__AddIce__Group__1__Impl"
    // InternalCocktails.g:1293:1: rule__AddIce__Group__1__Impl : ( ( rule__AddIce__IceAssignment_1 ) ) ;
    public final void rule__AddIce__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1297:1: ( ( ( rule__AddIce__IceAssignment_1 ) ) )
            // InternalCocktails.g:1298:1: ( ( rule__AddIce__IceAssignment_1 ) )
            {
            // InternalCocktails.g:1298:1: ( ( rule__AddIce__IceAssignment_1 ) )
            // InternalCocktails.g:1299:2: ( rule__AddIce__IceAssignment_1 )
            {
             before(grammarAccess.getAddIceAccess().getIceAssignment_1()); 
            // InternalCocktails.g:1300:2: ( rule__AddIce__IceAssignment_1 )
            // InternalCocktails.g:1300:3: rule__AddIce__IceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddIce__IceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddIceAccess().getIceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__Group__1__Impl"


    // $ANTLR start "rule__AddIce__Group__2"
    // InternalCocktails.g:1308:1: rule__AddIce__Group__2 : rule__AddIce__Group__2__Impl rule__AddIce__Group__3 ;
    public final void rule__AddIce__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1312:1: ( rule__AddIce__Group__2__Impl rule__AddIce__Group__3 )
            // InternalCocktails.g:1313:2: rule__AddIce__Group__2__Impl rule__AddIce__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AddIce__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddIce__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__Group__2"


    // $ANTLR start "rule__AddIce__Group__2__Impl"
    // InternalCocktails.g:1320:1: rule__AddIce__Group__2__Impl : ( ':' ) ;
    public final void rule__AddIce__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1324:1: ( ( ':' ) )
            // InternalCocktails.g:1325:1: ( ':' )
            {
            // InternalCocktails.g:1325:1: ( ':' )
            // InternalCocktails.g:1326:2: ':'
            {
             before(grammarAccess.getAddIceAccess().getColonKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAddIceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__Group__2__Impl"


    // $ANTLR start "rule__AddIce__Group__3"
    // InternalCocktails.g:1335:1: rule__AddIce__Group__3 : rule__AddIce__Group__3__Impl rule__AddIce__Group__4 ;
    public final void rule__AddIce__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1339:1: ( rule__AddIce__Group__3__Impl rule__AddIce__Group__4 )
            // InternalCocktails.g:1340:2: rule__AddIce__Group__3__Impl rule__AddIce__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__AddIce__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddIce__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__Group__3"


    // $ANTLR start "rule__AddIce__Group__3__Impl"
    // InternalCocktails.g:1347:1: rule__AddIce__Group__3__Impl : ( ( rule__AddIce__OunceAssignment_3 ) ) ;
    public final void rule__AddIce__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1351:1: ( ( ( rule__AddIce__OunceAssignment_3 ) ) )
            // InternalCocktails.g:1352:1: ( ( rule__AddIce__OunceAssignment_3 ) )
            {
            // InternalCocktails.g:1352:1: ( ( rule__AddIce__OunceAssignment_3 ) )
            // InternalCocktails.g:1353:2: ( rule__AddIce__OunceAssignment_3 )
            {
             before(grammarAccess.getAddIceAccess().getOunceAssignment_3()); 
            // InternalCocktails.g:1354:2: ( rule__AddIce__OunceAssignment_3 )
            // InternalCocktails.g:1354:3: rule__AddIce__OunceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddIce__OunceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddIceAccess().getOunceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__Group__3__Impl"


    // $ANTLR start "rule__AddIce__Group__4"
    // InternalCocktails.g:1362:1: rule__AddIce__Group__4 : rule__AddIce__Group__4__Impl ;
    public final void rule__AddIce__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1366:1: ( rule__AddIce__Group__4__Impl )
            // InternalCocktails.g:1367:2: rule__AddIce__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddIce__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__Group__4"


    // $ANTLR start "rule__AddIce__Group__4__Impl"
    // InternalCocktails.g:1373:1: rule__AddIce__Group__4__Impl : ( 'ounce' ) ;
    public final void rule__AddIce__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1377:1: ( ( 'ounce' ) )
            // InternalCocktails.g:1378:1: ( 'ounce' )
            {
            // InternalCocktails.g:1378:1: ( 'ounce' )
            // InternalCocktails.g:1379:2: 'ounce'
            {
             before(grammarAccess.getAddIceAccess().getOunceKeyword_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAddIceAccess().getOunceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__Group__4__Impl"


    // $ANTLR start "rule__MuddleStatement__Group__0"
    // InternalCocktails.g:1389:1: rule__MuddleStatement__Group__0 : rule__MuddleStatement__Group__0__Impl rule__MuddleStatement__Group__1 ;
    public final void rule__MuddleStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1393:1: ( rule__MuddleStatement__Group__0__Impl rule__MuddleStatement__Group__1 )
            // InternalCocktails.g:1394:2: rule__MuddleStatement__Group__0__Impl rule__MuddleStatement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MuddleStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MuddleStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__Group__0"


    // $ANTLR start "rule__MuddleStatement__Group__0__Impl"
    // InternalCocktails.g:1401:1: rule__MuddleStatement__Group__0__Impl : ( 'mud' ) ;
    public final void rule__MuddleStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1405:1: ( ( 'mud' ) )
            // InternalCocktails.g:1406:1: ( 'mud' )
            {
            // InternalCocktails.g:1406:1: ( 'mud' )
            // InternalCocktails.g:1407:2: 'mud'
            {
             before(grammarAccess.getMuddleStatementAccess().getMudKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMuddleStatementAccess().getMudKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__Group__0__Impl"


    // $ANTLR start "rule__MuddleStatement__Group__1"
    // InternalCocktails.g:1416:1: rule__MuddleStatement__Group__1 : rule__MuddleStatement__Group__1__Impl rule__MuddleStatement__Group__2 ;
    public final void rule__MuddleStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1420:1: ( rule__MuddleStatement__Group__1__Impl rule__MuddleStatement__Group__2 )
            // InternalCocktails.g:1421:2: rule__MuddleStatement__Group__1__Impl rule__MuddleStatement__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MuddleStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MuddleStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__Group__1"


    // $ANTLR start "rule__MuddleStatement__Group__1__Impl"
    // InternalCocktails.g:1428:1: rule__MuddleStatement__Group__1__Impl : ( ( rule__MuddleStatement__MudFruitAssignment_1 )* ) ;
    public final void rule__MuddleStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1432:1: ( ( ( rule__MuddleStatement__MudFruitAssignment_1 )* ) )
            // InternalCocktails.g:1433:1: ( ( rule__MuddleStatement__MudFruitAssignment_1 )* )
            {
            // InternalCocktails.g:1433:1: ( ( rule__MuddleStatement__MudFruitAssignment_1 )* )
            // InternalCocktails.g:1434:2: ( rule__MuddleStatement__MudFruitAssignment_1 )*
            {
             before(grammarAccess.getMuddleStatementAccess().getMudFruitAssignment_1()); 
            // InternalCocktails.g:1435:2: ( rule__MuddleStatement__MudFruitAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=23 && LA11_0<=42)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCocktails.g:1435:3: rule__MuddleStatement__MudFruitAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MuddleStatement__MudFruitAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMuddleStatementAccess().getMudFruitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__Group__1__Impl"


    // $ANTLR start "rule__MuddleStatement__Group__2"
    // InternalCocktails.g:1443:1: rule__MuddleStatement__Group__2 : rule__MuddleStatement__Group__2__Impl rule__MuddleStatement__Group__3 ;
    public final void rule__MuddleStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1447:1: ( rule__MuddleStatement__Group__2__Impl rule__MuddleStatement__Group__3 )
            // InternalCocktails.g:1448:2: rule__MuddleStatement__Group__2__Impl rule__MuddleStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MuddleStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MuddleStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__Group__2"


    // $ANTLR start "rule__MuddleStatement__Group__2__Impl"
    // InternalCocktails.g:1455:1: rule__MuddleStatement__Group__2__Impl : ( ':' ) ;
    public final void rule__MuddleStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1459:1: ( ( ':' ) )
            // InternalCocktails.g:1460:1: ( ':' )
            {
            // InternalCocktails.g:1460:1: ( ':' )
            // InternalCocktails.g:1461:2: ':'
            {
             before(grammarAccess.getMuddleStatementAccess().getColonKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMuddleStatementAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__Group__2__Impl"


    // $ANTLR start "rule__MuddleStatement__Group__3"
    // InternalCocktails.g:1470:1: rule__MuddleStatement__Group__3 : rule__MuddleStatement__Group__3__Impl rule__MuddleStatement__Group__4 ;
    public final void rule__MuddleStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1474:1: ( rule__MuddleStatement__Group__3__Impl rule__MuddleStatement__Group__4 )
            // InternalCocktails.g:1475:2: rule__MuddleStatement__Group__3__Impl rule__MuddleStatement__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__MuddleStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MuddleStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__Group__3"


    // $ANTLR start "rule__MuddleStatement__Group__3__Impl"
    // InternalCocktails.g:1482:1: rule__MuddleStatement__Group__3__Impl : ( ( rule__MuddleStatement__MtimesAssignment_3 ) ) ;
    public final void rule__MuddleStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1486:1: ( ( ( rule__MuddleStatement__MtimesAssignment_3 ) ) )
            // InternalCocktails.g:1487:1: ( ( rule__MuddleStatement__MtimesAssignment_3 ) )
            {
            // InternalCocktails.g:1487:1: ( ( rule__MuddleStatement__MtimesAssignment_3 ) )
            // InternalCocktails.g:1488:2: ( rule__MuddleStatement__MtimesAssignment_3 )
            {
             before(grammarAccess.getMuddleStatementAccess().getMtimesAssignment_3()); 
            // InternalCocktails.g:1489:2: ( rule__MuddleStatement__MtimesAssignment_3 )
            // InternalCocktails.g:1489:3: rule__MuddleStatement__MtimesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MuddleStatement__MtimesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMuddleStatementAccess().getMtimesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__Group__3__Impl"


    // $ANTLR start "rule__MuddleStatement__Group__4"
    // InternalCocktails.g:1497:1: rule__MuddleStatement__Group__4 : rule__MuddleStatement__Group__4__Impl ;
    public final void rule__MuddleStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1501:1: ( rule__MuddleStatement__Group__4__Impl )
            // InternalCocktails.g:1502:2: rule__MuddleStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MuddleStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__Group__4"


    // $ANTLR start "rule__MuddleStatement__Group__4__Impl"
    // InternalCocktails.g:1508:1: rule__MuddleStatement__Group__4__Impl : ( 'times' ) ;
    public final void rule__MuddleStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1512:1: ( ( 'times' ) )
            // InternalCocktails.g:1513:1: ( 'times' )
            {
            // InternalCocktails.g:1513:1: ( 'times' )
            // InternalCocktails.g:1514:2: 'times'
            {
             before(grammarAccess.getMuddleStatementAccess().getTimesKeyword_4()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMuddleStatementAccess().getTimesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__Group__4__Impl"


    // $ANTLR start "rule__AddDecoration__Group__0"
    // InternalCocktails.g:1524:1: rule__AddDecoration__Group__0 : rule__AddDecoration__Group__0__Impl rule__AddDecoration__Group__1 ;
    public final void rule__AddDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1528:1: ( rule__AddDecoration__Group__0__Impl rule__AddDecoration__Group__1 )
            // InternalCocktails.g:1529:2: rule__AddDecoration__Group__0__Impl rule__AddDecoration__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AddDecoration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddDecoration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddDecoration__Group__0"


    // $ANTLR start "rule__AddDecoration__Group__0__Impl"
    // InternalCocktails.g:1536:1: rule__AddDecoration__Group__0__Impl : ( 'addD' ) ;
    public final void rule__AddDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1540:1: ( ( 'addD' ) )
            // InternalCocktails.g:1541:1: ( 'addD' )
            {
            // InternalCocktails.g:1541:1: ( 'addD' )
            // InternalCocktails.g:1542:2: 'addD'
            {
             before(grammarAccess.getAddDecorationAccess().getAddDKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getAddDecorationAccess().getAddDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddDecoration__Group__0__Impl"


    // $ANTLR start "rule__AddDecoration__Group__1"
    // InternalCocktails.g:1551:1: rule__AddDecoration__Group__1 : rule__AddDecoration__Group__1__Impl rule__AddDecoration__Group__2 ;
    public final void rule__AddDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1555:1: ( rule__AddDecoration__Group__1__Impl rule__AddDecoration__Group__2 )
            // InternalCocktails.g:1556:2: rule__AddDecoration__Group__1__Impl rule__AddDecoration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AddDecoration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddDecoration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddDecoration__Group__1"


    // $ANTLR start "rule__AddDecoration__Group__1__Impl"
    // InternalCocktails.g:1563:1: rule__AddDecoration__Group__1__Impl : ( ( rule__AddDecoration__DecorationAssignment_1 ) ) ;
    public final void rule__AddDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1567:1: ( ( ( rule__AddDecoration__DecorationAssignment_1 ) ) )
            // InternalCocktails.g:1568:1: ( ( rule__AddDecoration__DecorationAssignment_1 ) )
            {
            // InternalCocktails.g:1568:1: ( ( rule__AddDecoration__DecorationAssignment_1 ) )
            // InternalCocktails.g:1569:2: ( rule__AddDecoration__DecorationAssignment_1 )
            {
             before(grammarAccess.getAddDecorationAccess().getDecorationAssignment_1()); 
            // InternalCocktails.g:1570:2: ( rule__AddDecoration__DecorationAssignment_1 )
            // InternalCocktails.g:1570:3: rule__AddDecoration__DecorationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddDecoration__DecorationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddDecorationAccess().getDecorationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddDecoration__Group__1__Impl"


    // $ANTLR start "rule__AddDecoration__Group__2"
    // InternalCocktails.g:1578:1: rule__AddDecoration__Group__2 : rule__AddDecoration__Group__2__Impl rule__AddDecoration__Group__3 ;
    public final void rule__AddDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1582:1: ( rule__AddDecoration__Group__2__Impl rule__AddDecoration__Group__3 )
            // InternalCocktails.g:1583:2: rule__AddDecoration__Group__2__Impl rule__AddDecoration__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__AddDecoration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddDecoration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddDecoration__Group__2"


    // $ANTLR start "rule__AddDecoration__Group__2__Impl"
    // InternalCocktails.g:1590:1: rule__AddDecoration__Group__2__Impl : ( ( rule__AddDecoration__SliceAssignment_2 ) ) ;
    public final void rule__AddDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1594:1: ( ( ( rule__AddDecoration__SliceAssignment_2 ) ) )
            // InternalCocktails.g:1595:1: ( ( rule__AddDecoration__SliceAssignment_2 ) )
            {
            // InternalCocktails.g:1595:1: ( ( rule__AddDecoration__SliceAssignment_2 ) )
            // InternalCocktails.g:1596:2: ( rule__AddDecoration__SliceAssignment_2 )
            {
             before(grammarAccess.getAddDecorationAccess().getSliceAssignment_2()); 
            // InternalCocktails.g:1597:2: ( rule__AddDecoration__SliceAssignment_2 )
            // InternalCocktails.g:1597:3: rule__AddDecoration__SliceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddDecoration__SliceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddDecorationAccess().getSliceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddDecoration__Group__2__Impl"


    // $ANTLR start "rule__AddDecoration__Group__3"
    // InternalCocktails.g:1605:1: rule__AddDecoration__Group__3 : rule__AddDecoration__Group__3__Impl ;
    public final void rule__AddDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1609:1: ( rule__AddDecoration__Group__3__Impl )
            // InternalCocktails.g:1610:2: rule__AddDecoration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddDecoration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddDecoration__Group__3"


    // $ANTLR start "rule__AddDecoration__Group__3__Impl"
    // InternalCocktails.g:1616:1: rule__AddDecoration__Group__3__Impl : ( 'slices' ) ;
    public final void rule__AddDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1620:1: ( ( 'slices' ) )
            // InternalCocktails.g:1621:1: ( 'slices' )
            {
            // InternalCocktails.g:1621:1: ( 'slices' )
            // InternalCocktails.g:1622:2: 'slices'
            {
             before(grammarAccess.getAddDecorationAccess().getSlicesKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getAddDecorationAccess().getSlicesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddDecoration__Group__3__Impl"


    // $ANTLR start "rule__MakeStatement__Group__0"
    // InternalCocktails.g:1632:1: rule__MakeStatement__Group__0 : rule__MakeStatement__Group__0__Impl rule__MakeStatement__Group__1 ;
    public final void rule__MakeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1636:1: ( rule__MakeStatement__Group__0__Impl rule__MakeStatement__Group__1 )
            // InternalCocktails.g:1637:2: rule__MakeStatement__Group__0__Impl rule__MakeStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MakeStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeStatement__Group__0"


    // $ANTLR start "rule__MakeStatement__Group__0__Impl"
    // InternalCocktails.g:1644:1: rule__MakeStatement__Group__0__Impl : ( ( rule__MakeStatement__MakeAssignment_0 ) ) ;
    public final void rule__MakeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1648:1: ( ( ( rule__MakeStatement__MakeAssignment_0 ) ) )
            // InternalCocktails.g:1649:1: ( ( rule__MakeStatement__MakeAssignment_0 ) )
            {
            // InternalCocktails.g:1649:1: ( ( rule__MakeStatement__MakeAssignment_0 ) )
            // InternalCocktails.g:1650:2: ( rule__MakeStatement__MakeAssignment_0 )
            {
             before(grammarAccess.getMakeStatementAccess().getMakeAssignment_0()); 
            // InternalCocktails.g:1651:2: ( rule__MakeStatement__MakeAssignment_0 )
            // InternalCocktails.g:1651:3: rule__MakeStatement__MakeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__MakeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMakeStatementAccess().getMakeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeStatement__Group__0__Impl"


    // $ANTLR start "rule__MakeStatement__Group__1"
    // InternalCocktails.g:1659:1: rule__MakeStatement__Group__1 : rule__MakeStatement__Group__1__Impl rule__MakeStatement__Group__2 ;
    public final void rule__MakeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1663:1: ( rule__MakeStatement__Group__1__Impl rule__MakeStatement__Group__2 )
            // InternalCocktails.g:1664:2: rule__MakeStatement__Group__1__Impl rule__MakeStatement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MakeStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeStatement__Group__1"


    // $ANTLR start "rule__MakeStatement__Group__1__Impl"
    // InternalCocktails.g:1671:1: rule__MakeStatement__Group__1__Impl : ( ':' ) ;
    public final void rule__MakeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1675:1: ( ( ':' ) )
            // InternalCocktails.g:1676:1: ( ':' )
            {
            // InternalCocktails.g:1676:1: ( ':' )
            // InternalCocktails.g:1677:2: ':'
            {
             before(grammarAccess.getMakeStatementAccess().getColonKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMakeStatementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeStatement__Group__1__Impl"


    // $ANTLR start "rule__MakeStatement__Group__2"
    // InternalCocktails.g:1686:1: rule__MakeStatement__Group__2 : rule__MakeStatement__Group__2__Impl rule__MakeStatement__Group__3 ;
    public final void rule__MakeStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1690:1: ( rule__MakeStatement__Group__2__Impl rule__MakeStatement__Group__3 )
            // InternalCocktails.g:1691:2: rule__MakeStatement__Group__2__Impl rule__MakeStatement__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__MakeStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeStatement__Group__2"


    // $ANTLR start "rule__MakeStatement__Group__2__Impl"
    // InternalCocktails.g:1698:1: rule__MakeStatement__Group__2__Impl : ( ( rule__MakeStatement__TimeAssignment_2 ) ) ;
    public final void rule__MakeStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1702:1: ( ( ( rule__MakeStatement__TimeAssignment_2 ) ) )
            // InternalCocktails.g:1703:1: ( ( rule__MakeStatement__TimeAssignment_2 ) )
            {
            // InternalCocktails.g:1703:1: ( ( rule__MakeStatement__TimeAssignment_2 ) )
            // InternalCocktails.g:1704:2: ( rule__MakeStatement__TimeAssignment_2 )
            {
             before(grammarAccess.getMakeStatementAccess().getTimeAssignment_2()); 
            // InternalCocktails.g:1705:2: ( rule__MakeStatement__TimeAssignment_2 )
            // InternalCocktails.g:1705:3: rule__MakeStatement__TimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMakeStatementAccess().getTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeStatement__Group__2__Impl"


    // $ANTLR start "rule__MakeStatement__Group__3"
    // InternalCocktails.g:1713:1: rule__MakeStatement__Group__3 : rule__MakeStatement__Group__3__Impl ;
    public final void rule__MakeStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1717:1: ( rule__MakeStatement__Group__3__Impl )
            // InternalCocktails.g:1718:2: rule__MakeStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MakeStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeStatement__Group__3"


    // $ANTLR start "rule__MakeStatement__Group__3__Impl"
    // InternalCocktails.g:1724:1: rule__MakeStatement__Group__3__Impl : ( 'seconds' ) ;
    public final void rule__MakeStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1728:1: ( ( 'seconds' ) )
            // InternalCocktails.g:1729:1: ( 'seconds' )
            {
            // InternalCocktails.g:1729:1: ( 'seconds' )
            // InternalCocktails.g:1730:2: 'seconds'
            {
             before(grammarAccess.getMakeStatementAccess().getSecondsKeyword_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMakeStatementAccess().getSecondsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeStatement__Group__3__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalCocktails.g:1740:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1744:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalCocktails.g:1745:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalCocktails.g:1752:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1756:1: ( ( ruleMultiplication ) )
            // InternalCocktails.g:1757:1: ( ruleMultiplication )
            {
            // InternalCocktails.g:1757:1: ( ruleMultiplication )
            // InternalCocktails.g:1758:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalCocktails.g:1767:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1771:1: ( rule__Addition__Group__1__Impl )
            // InternalCocktails.g:1772:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalCocktails.g:1778:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1782:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalCocktails.g:1783:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalCocktails.g:1783:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalCocktails.g:1784:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalCocktails.g:1785:2: ( rule__Addition__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCocktails.g:1785:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalCocktails.g:1794:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1798:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalCocktails.g:1799:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalCocktails.g:1806:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1810:1: ( ( () ) )
            // InternalCocktails.g:1811:1: ( () )
            {
            // InternalCocktails.g:1811:1: ( () )
            // InternalCocktails.g:1812:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalCocktails.g:1813:2: ()
            // InternalCocktails.g:1813:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalCocktails.g:1821:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1825:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalCocktails.g:1826:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalCocktails.g:1833:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1837:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalCocktails.g:1838:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalCocktails.g:1838:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalCocktails.g:1839:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalCocktails.g:1840:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalCocktails.g:1840:3: rule__Addition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalCocktails.g:1848:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1852:1: ( rule__Addition__Group_1__2__Impl )
            // InternalCocktails.g:1853:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalCocktails.g:1859:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1863:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalCocktails.g:1864:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalCocktails.g:1864:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalCocktails.g:1865:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalCocktails.g:1866:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalCocktails.g:1866:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalCocktails.g:1875:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1879:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalCocktails.g:1880:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalCocktails.g:1887:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1891:1: ( ( rulePrimaryExpression ) )
            // InternalCocktails.g:1892:1: ( rulePrimaryExpression )
            {
            // InternalCocktails.g:1892:1: ( rulePrimaryExpression )
            // InternalCocktails.g:1893:2: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalCocktails.g:1902:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1906:1: ( rule__Multiplication__Group__1__Impl )
            // InternalCocktails.g:1907:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalCocktails.g:1913:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1917:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalCocktails.g:1918:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalCocktails.g:1918:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalCocktails.g:1919:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalCocktails.g:1920:2: ( rule__Multiplication__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=13 && LA13_0<=14)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCocktails.g:1920:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalCocktails.g:1929:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1933:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalCocktails.g:1934:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalCocktails.g:1941:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1945:1: ( ( () ) )
            // InternalCocktails.g:1946:1: ( () )
            {
            // InternalCocktails.g:1946:1: ( () )
            // InternalCocktails.g:1947:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalCocktails.g:1948:2: ()
            // InternalCocktails.g:1948:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalCocktails.g:1956:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1960:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalCocktails.g:1961:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalCocktails.g:1968:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1972:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalCocktails.g:1973:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalCocktails.g:1973:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalCocktails.g:1974:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalCocktails.g:1975:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalCocktails.g:1975:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalCocktails.g:1983:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1987:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalCocktails.g:1988:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalCocktails.g:1994:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:1998:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalCocktails.g:1999:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalCocktails.g:1999:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalCocktails.g:2000:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalCocktails.g:2001:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalCocktails.g:2001:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalCocktails.g:2010:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2014:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalCocktails.g:2015:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalCocktails.g:2022:1: rule__PrimaryExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2026:1: ( ( '(' ) )
            // InternalCocktails.g:2027:1: ( '(' )
            {
            // InternalCocktails.g:2027:1: ( '(' )
            // InternalCocktails.g:2028:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalCocktails.g:2037:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2041:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalCocktails.g:2042:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalCocktails.g:2049:1: rule__PrimaryExpression__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2053:1: ( ( ruleAddition ) )
            // InternalCocktails.g:2054:1: ( ruleAddition )
            {
            // InternalCocktails.g:2054:1: ( ruleAddition )
            // InternalCocktails.g:2055:2: ruleAddition
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAdditionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getAdditionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // InternalCocktails.g:2064:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2068:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalCocktails.g:2069:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // InternalCocktails.g:2075:1: rule__PrimaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2079:1: ( ( ')' ) )
            // InternalCocktails.g:2080:1: ( ')' )
            {
            // InternalCocktails.g:2080:1: ( ')' )
            // InternalCocktails.g:2081:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalCocktails.g:2091:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2095:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalCocktails.g:2096:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalCocktails.g:2103:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2107:1: ( ( 'var' ) )
            // InternalCocktails.g:2108:1: ( 'var' )
            {
            // InternalCocktails.g:2108:1: ( 'var' )
            // InternalCocktails.g:2109:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalCocktails.g:2118:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2122:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalCocktails.g:2123:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalCocktails.g:2130:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2134:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalCocktails.g:2135:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalCocktails.g:2135:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalCocktails.g:2136:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalCocktails.g:2137:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalCocktails.g:2137:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalCocktails.g:2145:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2149:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalCocktails.g:2150:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalCocktails.g:2157:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2161:1: ( ( '=' ) )
            // InternalCocktails.g:2162:1: ( '=' )
            {
            // InternalCocktails.g:2162:1: ( '=' )
            // InternalCocktails.g:2163:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalCocktails.g:2172:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2176:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalCocktails.g:2177:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalCocktails.g:2183:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2187:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalCocktails.g:2188:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalCocktails.g:2188:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalCocktails.g:2189:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalCocktails.g:2190:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalCocktails.g:2190:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Order__InstructionsAssignment"
    // InternalCocktails.g:2199:1: rule__Order__InstructionsAssignment : ( ruleInstruction ) ;
    public final void rule__Order__InstructionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2203:1: ( ( ruleInstruction ) )
            // InternalCocktails.g:2204:2: ( ruleInstruction )
            {
            // InternalCocktails.g:2204:2: ( ruleInstruction )
            // InternalCocktails.g:2205:3: ruleInstruction
            {
             before(grammarAccess.getOrderAccess().getInstructionsInstructionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getInstructionsInstructionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__InstructionsAssignment"


    // $ANTLR start "rule__AddIngredient__NameAssignment_1"
    // InternalCocktails.g:2214:1: rule__AddIngredient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddIngredient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2218:1: ( ( RULE_ID ) )
            // InternalCocktails.g:2219:2: ( RULE_ID )
            {
            // InternalCocktails.g:2219:2: ( RULE_ID )
            // InternalCocktails.g:2220:3: RULE_ID
            {
             before(grammarAccess.getAddIngredientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddIngredientAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__NameAssignment_1"


    // $ANTLR start "rule__AddIngredient__AmountAssignment_3"
    // InternalCocktails.g:2229:1: rule__AddIngredient__AmountAssignment_3 : ( ruleAddition ) ;
    public final void rule__AddIngredient__AmountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2233:1: ( ( ruleAddition ) )
            // InternalCocktails.g:2234:2: ( ruleAddition )
            {
            // InternalCocktails.g:2234:2: ( ruleAddition )
            // InternalCocktails.g:2235:3: ruleAddition
            {
             before(grammarAccess.getAddIngredientAccess().getAmountAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAddIngredientAccess().getAmountAdditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIngredient__AmountAssignment_3"


    // $ANTLR start "rule__AddFixedIngredient__NameAssignment_1"
    // InternalCocktails.g:2244:1: rule__AddFixedIngredient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddFixedIngredient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2248:1: ( ( RULE_ID ) )
            // InternalCocktails.g:2249:2: ( RULE_ID )
            {
            // InternalCocktails.g:2249:2: ( RULE_ID )
            // InternalCocktails.g:2250:3: RULE_ID
            {
             before(grammarAccess.getAddFixedIngredientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddFixedIngredientAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__NameAssignment_1"


    // $ANTLR start "rule__AddFixedIngredient__AmountAssignment_3"
    // InternalCocktails.g:2259:1: rule__AddFixedIngredient__AmountAssignment_3 : ( ruleAddition ) ;
    public final void rule__AddFixedIngredient__AmountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2263:1: ( ( ruleAddition ) )
            // InternalCocktails.g:2264:2: ( ruleAddition )
            {
            // InternalCocktails.g:2264:2: ( ruleAddition )
            // InternalCocktails.g:2265:3: ruleAddition
            {
             before(grammarAccess.getAddFixedIngredientAccess().getAmountAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAddFixedIngredientAccess().getAmountAdditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFixedIngredient__AmountAssignment_3"


    // $ANTLR start "rule__FancyStatement__FcommandAssignment_1"
    // InternalCocktails.g:2274:1: rule__FancyStatement__FcommandAssignment_1 : ( ruleFancyMakeStatement ) ;
    public final void rule__FancyStatement__FcommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2278:1: ( ( ruleFancyMakeStatement ) )
            // InternalCocktails.g:2279:2: ( ruleFancyMakeStatement )
            {
            // InternalCocktails.g:2279:2: ( ruleFancyMakeStatement )
            // InternalCocktails.g:2280:3: ruleFancyMakeStatement
            {
             before(grammarAccess.getFancyStatementAccess().getFcommandFancyMakeStatementEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFancyMakeStatement();

            state._fsp--;

             after(grammarAccess.getFancyStatementAccess().getFcommandFancyMakeStatementEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FancyStatement__FcommandAssignment_1"


    // $ANTLR start "rule__AddIce__IceAssignment_1"
    // InternalCocktails.g:2289:1: rule__AddIce__IceAssignment_1 : ( ruleIceStatement ) ;
    public final void rule__AddIce__IceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2293:1: ( ( ruleIceStatement ) )
            // InternalCocktails.g:2294:2: ( ruleIceStatement )
            {
            // InternalCocktails.g:2294:2: ( ruleIceStatement )
            // InternalCocktails.g:2295:3: ruleIceStatement
            {
             before(grammarAccess.getAddIceAccess().getIceIceStatementEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIceStatement();

            state._fsp--;

             after(grammarAccess.getAddIceAccess().getIceIceStatementEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__IceAssignment_1"


    // $ANTLR start "rule__AddIce__OunceAssignment_3"
    // InternalCocktails.g:2304:1: rule__AddIce__OunceAssignment_3 : ( ruleAddition ) ;
    public final void rule__AddIce__OunceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2308:1: ( ( ruleAddition ) )
            // InternalCocktails.g:2309:2: ( ruleAddition )
            {
            // InternalCocktails.g:2309:2: ( ruleAddition )
            // InternalCocktails.g:2310:3: ruleAddition
            {
             before(grammarAccess.getAddIceAccess().getOunceAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAddIceAccess().getOunceAdditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddIce__OunceAssignment_3"


    // $ANTLR start "rule__MuddleStatement__MudFruitAssignment_1"
    // InternalCocktails.g:2319:1: rule__MuddleStatement__MudFruitAssignment_1 : ( ruleFruitStatement ) ;
    public final void rule__MuddleStatement__MudFruitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2323:1: ( ( ruleFruitStatement ) )
            // InternalCocktails.g:2324:2: ( ruleFruitStatement )
            {
            // InternalCocktails.g:2324:2: ( ruleFruitStatement )
            // InternalCocktails.g:2325:3: ruleFruitStatement
            {
             before(grammarAccess.getMuddleStatementAccess().getMudFruitFruitStatementEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFruitStatement();

            state._fsp--;

             after(grammarAccess.getMuddleStatementAccess().getMudFruitFruitStatementEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__MudFruitAssignment_1"


    // $ANTLR start "rule__MuddleStatement__MtimesAssignment_3"
    // InternalCocktails.g:2334:1: rule__MuddleStatement__MtimesAssignment_3 : ( ruleAddition ) ;
    public final void rule__MuddleStatement__MtimesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2338:1: ( ( ruleAddition ) )
            // InternalCocktails.g:2339:2: ( ruleAddition )
            {
            // InternalCocktails.g:2339:2: ( ruleAddition )
            // InternalCocktails.g:2340:3: ruleAddition
            {
             before(grammarAccess.getMuddleStatementAccess().getMtimesAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getMuddleStatementAccess().getMtimesAdditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MuddleStatement__MtimesAssignment_3"


    // $ANTLR start "rule__AddDecoration__DecorationAssignment_1"
    // InternalCocktails.g:2349:1: rule__AddDecoration__DecorationAssignment_1 : ( ruleDecorationStatement ) ;
    public final void rule__AddDecoration__DecorationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2353:1: ( ( ruleDecorationStatement ) )
            // InternalCocktails.g:2354:2: ( ruleDecorationStatement )
            {
            // InternalCocktails.g:2354:2: ( ruleDecorationStatement )
            // InternalCocktails.g:2355:3: ruleDecorationStatement
            {
             before(grammarAccess.getAddDecorationAccess().getDecorationDecorationStatementEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecorationStatement();

            state._fsp--;

             after(grammarAccess.getAddDecorationAccess().getDecorationDecorationStatementEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddDecoration__DecorationAssignment_1"


    // $ANTLR start "rule__AddDecoration__SliceAssignment_2"
    // InternalCocktails.g:2364:1: rule__AddDecoration__SliceAssignment_2 : ( ruleAddition ) ;
    public final void rule__AddDecoration__SliceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2368:1: ( ( ruleAddition ) )
            // InternalCocktails.g:2369:2: ( ruleAddition )
            {
            // InternalCocktails.g:2369:2: ( ruleAddition )
            // InternalCocktails.g:2370:3: ruleAddition
            {
             before(grammarAccess.getAddDecorationAccess().getSliceAdditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAddDecorationAccess().getSliceAdditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddDecoration__SliceAssignment_2"


    // $ANTLR start "rule__MakeStatement__MakeAssignment_0"
    // InternalCocktails.g:2379:1: rule__MakeStatement__MakeAssignment_0 : ( ruleMakeCommand ) ;
    public final void rule__MakeStatement__MakeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2383:1: ( ( ruleMakeCommand ) )
            // InternalCocktails.g:2384:2: ( ruleMakeCommand )
            {
            // InternalCocktails.g:2384:2: ( ruleMakeCommand )
            // InternalCocktails.g:2385:3: ruleMakeCommand
            {
             before(grammarAccess.getMakeStatementAccess().getMakeMakeCommandEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMakeCommand();

            state._fsp--;

             after(grammarAccess.getMakeStatementAccess().getMakeMakeCommandEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeStatement__MakeAssignment_0"


    // $ANTLR start "rule__MakeStatement__TimeAssignment_2"
    // InternalCocktails.g:2394:1: rule__MakeStatement__TimeAssignment_2 : ( ruleAddition ) ;
    public final void rule__MakeStatement__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2398:1: ( ( ruleAddition ) )
            // InternalCocktails.g:2399:2: ( ruleAddition )
            {
            // InternalCocktails.g:2399:2: ( ruleAddition )
            // InternalCocktails.g:2400:3: ruleAddition
            {
             before(grammarAccess.getMakeStatementAccess().getTimeAdditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getMakeStatementAccess().getTimeAdditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakeStatement__TimeAssignment_2"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalCocktails.g:2409:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2413:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalCocktails.g:2414:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalCocktails.g:2414:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalCocktails.g:2415:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalCocktails.g:2416:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalCocktails.g:2416:4: rule__Addition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalCocktails.g:2424:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2428:1: ( ( ruleMultiplication ) )
            // InternalCocktails.g:2429:2: ( ruleMultiplication )
            {
            // InternalCocktails.g:2429:2: ( ruleMultiplication )
            // InternalCocktails.g:2430:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalCocktails.g:2439:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2443:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalCocktails.g:2444:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalCocktails.g:2444:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalCocktails.g:2445:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalCocktails.g:2446:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalCocktails.g:2446:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalCocktails.g:2454:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2458:1: ( ( rulePrimaryExpression ) )
            // InternalCocktails.g:2459:2: ( rulePrimaryExpression )
            {
            // InternalCocktails.g:2459:2: ( rulePrimaryExpression )
            // InternalCocktails.g:2460:3: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalCocktails.g:2469:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2473:1: ( ( RULE_INT ) )
            // InternalCocktails.g:2474:2: ( RULE_INT )
            {
            // InternalCocktails.g:2474:2: ( RULE_INT )
            // InternalCocktails.g:2475:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValAssignment"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalCocktails.g:2484:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2488:1: ( ( RULE_ID ) )
            // InternalCocktails.g:2489:2: ( RULE_ID )
            {
            // InternalCocktails.g:2489:2: ( RULE_ID )
            // InternalCocktails.g:2490:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalCocktails.g:2499:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2503:1: ( ( RULE_INT ) )
            // InternalCocktails.g:2504:2: ( RULE_INT )
            {
            // InternalCocktails.g:2504:2: ( RULE_INT )
            // InternalCocktails.g:2505:3: RULE_INT
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"


    // $ANTLR start "rule__IntVarExpression__VarAssignment"
    // InternalCocktails.g:2514:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocktails.g:2518:1: ( ( ( RULE_ID ) ) )
            // InternalCocktails.g:2519:2: ( ( RULE_ID ) )
            {
            // InternalCocktails.g:2519:2: ( ( RULE_ID ) )
            // InternalCocktails.g:2520:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalCocktails.g:2521:3: ( RULE_ID )
            // InternalCocktails.g:2522:4: RULE_ID
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVarExpression__VarAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x15A7C00000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x8000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000807FFFF800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000007FFFF800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000388417800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});

}