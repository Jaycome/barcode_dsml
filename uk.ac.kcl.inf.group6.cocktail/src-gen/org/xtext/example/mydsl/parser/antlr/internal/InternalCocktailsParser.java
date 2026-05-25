package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.CocktailsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCocktailsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'addI'", "':'", "'ml'", "'addF'", "'g'", "'use'", "'addIc'", "'ounce'", "'mud'", "'times'", "'addD'", "'slices'", "'seconds'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'var'", "'='", "'lighter'", "'co2'", "'cube'", "'crush'", "'shave'", "'block'", "'ball'", "'cone'", "'lime'", "'lemon'", "'orange'", "'grapefruit'", "'pineapple'", "'mango'", "'kiwi'", "'strawberry'", "'blueberry'", "'raspberry'", "'blackberry'", "'cherry'", "'peach'", "'plum'", "'watermelon'", "'cucumber'", "'mint'", "'basil'", "'thyme'", "'ginger'", "'olive'", "'rose'", "'cinnamon'", "'stir'", "'shake'", "'blend'", "'filter'"
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

        public InternalCocktailsParser(TokenStream input, CocktailsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Order";
       	}

       	@Override
       	protected CocktailsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOrder"
    // InternalCocktails.g:65:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalCocktails.g:65:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalCocktails.g:66:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalCocktails.g:72:1: ruleOrder returns [EObject current=null] : ( (lv_instructions_0_0= ruleInstruction ) )* ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0_0 = null;



        	enterRule();

        try {
            // InternalCocktails.g:78:2: ( ( (lv_instructions_0_0= ruleInstruction ) )* )
            // InternalCocktails.g:79:2: ( (lv_instructions_0_0= ruleInstruction ) )*
            {
            // InternalCocktails.g:79:2: ( (lv_instructions_0_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14||(LA1_0>=16 && LA1_0<=17)||LA1_0==19||LA1_0==21||LA1_0==30||(LA1_0>=63 && LA1_0<=66)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCocktails.g:80:3: (lv_instructions_0_0= ruleInstruction )
            	    {
            	    // InternalCocktails.g:80:3: (lv_instructions_0_0= ruleInstruction )
            	    // InternalCocktails.g:81:4: lv_instructions_0_0= ruleInstruction
            	    {

            	    				newCompositeNode(grammarAccess.getOrderAccess().getInstructionsInstructionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_instructions_0_0=ruleInstruction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getOrderRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instructions",
            	    					lv_instructions_0_0,
            	    					"org.xtext.example.mydsl.Cocktails.Instruction");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleInstruction"
    // InternalCocktails.g:101:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalCocktails.g:101:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalCocktails.g:102:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalCocktails.g:108:1: ruleInstruction returns [EObject current=null] : (this_AddIngredient_0= ruleAddIngredient | this_AddFixedIngredient_1= ruleAddFixedIngredient | this_FancyStatement_2= ruleFancyStatement | this_AddIce_3= ruleAddIce | this_MuddleStatement_4= ruleMuddleStatement | this_AddDecoration_5= ruleAddDecoration | this_MakeStatement_6= ruleMakeStatement | this_VariableDeclaration_7= ruleVariableDeclaration ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_AddIngredient_0 = null;

        EObject this_AddFixedIngredient_1 = null;

        EObject this_FancyStatement_2 = null;

        EObject this_AddIce_3 = null;

        EObject this_MuddleStatement_4 = null;

        EObject this_AddDecoration_5 = null;

        EObject this_MakeStatement_6 = null;

        EObject this_VariableDeclaration_7 = null;



        	enterRule();

        try {
            // InternalCocktails.g:114:2: ( (this_AddIngredient_0= ruleAddIngredient | this_AddFixedIngredient_1= ruleAddFixedIngredient | this_FancyStatement_2= ruleFancyStatement | this_AddIce_3= ruleAddIce | this_MuddleStatement_4= ruleMuddleStatement | this_AddDecoration_5= ruleAddDecoration | this_MakeStatement_6= ruleMakeStatement | this_VariableDeclaration_7= ruleVariableDeclaration ) )
            // InternalCocktails.g:115:2: (this_AddIngredient_0= ruleAddIngredient | this_AddFixedIngredient_1= ruleAddFixedIngredient | this_FancyStatement_2= ruleFancyStatement | this_AddIce_3= ruleAddIce | this_MuddleStatement_4= ruleMuddleStatement | this_AddDecoration_5= ruleAddDecoration | this_MakeStatement_6= ruleMakeStatement | this_VariableDeclaration_7= ruleVariableDeclaration )
            {
            // InternalCocktails.g:115:2: (this_AddIngredient_0= ruleAddIngredient | this_AddFixedIngredient_1= ruleAddFixedIngredient | this_FancyStatement_2= ruleFancyStatement | this_AddIce_3= ruleAddIce | this_MuddleStatement_4= ruleMuddleStatement | this_AddDecoration_5= ruleAddDecoration | this_MakeStatement_6= ruleMakeStatement | this_VariableDeclaration_7= ruleVariableDeclaration )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt2=7;
                }
                break;
            case 30:
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
                    // InternalCocktails.g:116:3: this_AddIngredient_0= ruleAddIngredient
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAddIngredientParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddIngredient_0=ruleAddIngredient();

                    state._fsp--;


                    			current = this_AddIngredient_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCocktails.g:125:3: this_AddFixedIngredient_1= ruleAddFixedIngredient
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAddFixedIngredientParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddFixedIngredient_1=ruleAddFixedIngredient();

                    state._fsp--;


                    			current = this_AddFixedIngredient_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCocktails.g:134:3: this_FancyStatement_2= ruleFancyStatement
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getFancyStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FancyStatement_2=ruleFancyStatement();

                    state._fsp--;


                    			current = this_FancyStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCocktails.g:143:3: this_AddIce_3= ruleAddIce
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAddIceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddIce_3=ruleAddIce();

                    state._fsp--;


                    			current = this_AddIce_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCocktails.g:152:3: this_MuddleStatement_4= ruleMuddleStatement
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getMuddleStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MuddleStatement_4=ruleMuddleStatement();

                    state._fsp--;


                    			current = this_MuddleStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCocktails.g:161:3: this_AddDecoration_5= ruleAddDecoration
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAddDecorationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddDecoration_5=ruleAddDecoration();

                    state._fsp--;


                    			current = this_AddDecoration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCocktails.g:170:3: this_MakeStatement_6= ruleMakeStatement
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getMakeStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MakeStatement_6=ruleMakeStatement();

                    state._fsp--;


                    			current = this_MakeStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalCocktails.g:179:3: this_VariableDeclaration_7= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getVariableDeclarationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_7=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleAddIngredient"
    // InternalCocktails.g:191:1: entryRuleAddIngredient returns [EObject current=null] : iv_ruleAddIngredient= ruleAddIngredient EOF ;
    public final EObject entryRuleAddIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddIngredient = null;


        try {
            // InternalCocktails.g:191:54: (iv_ruleAddIngredient= ruleAddIngredient EOF )
            // InternalCocktails.g:192:2: iv_ruleAddIngredient= ruleAddIngredient EOF
            {
             newCompositeNode(grammarAccess.getAddIngredientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddIngredient=ruleAddIngredient();

            state._fsp--;

             current =iv_ruleAddIngredient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddIngredient"


    // $ANTLR start "ruleAddIngredient"
    // InternalCocktails.g:198:1: ruleAddIngredient returns [EObject current=null] : (otherlv_0= 'addI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleAddition ) ) otherlv_4= 'ml' ) ;
    public final EObject ruleAddIngredient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_amount_3_0 = null;



        	enterRule();

        try {
            // InternalCocktails.g:204:2: ( (otherlv_0= 'addI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleAddition ) ) otherlv_4= 'ml' ) )
            // InternalCocktails.g:205:2: (otherlv_0= 'addI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleAddition ) ) otherlv_4= 'ml' )
            {
            // InternalCocktails.g:205:2: (otherlv_0= 'addI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleAddition ) ) otherlv_4= 'ml' )
            // InternalCocktails.g:206:3: otherlv_0= 'addI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleAddition ) ) otherlv_4= 'ml'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAddIngredientAccess().getAddIKeyword_0());
            		
            // InternalCocktails.g:210:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCocktails.g:211:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCocktails.g:211:4: (lv_name_1_0= RULE_ID )
            // InternalCocktails.g:212:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAddIngredientAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddIngredientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAddIngredientAccess().getColonKeyword_2());
            		
            // InternalCocktails.g:232:3: ( (lv_amount_3_0= ruleAddition ) )
            // InternalCocktails.g:233:4: (lv_amount_3_0= ruleAddition )
            {
            // InternalCocktails.g:233:4: (lv_amount_3_0= ruleAddition )
            // InternalCocktails.g:234:5: lv_amount_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getAddIngredientAccess().getAmountAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_amount_3_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddIngredientRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_3_0,
            						"org.xtext.example.mydsl.Cocktails.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAddIngredientAccess().getMlKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddIngredient"


    // $ANTLR start "entryRuleAddFixedIngredient"
    // InternalCocktails.g:259:1: entryRuleAddFixedIngredient returns [EObject current=null] : iv_ruleAddFixedIngredient= ruleAddFixedIngredient EOF ;
    public final EObject entryRuleAddFixedIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddFixedIngredient = null;


        try {
            // InternalCocktails.g:259:59: (iv_ruleAddFixedIngredient= ruleAddFixedIngredient EOF )
            // InternalCocktails.g:260:2: iv_ruleAddFixedIngredient= ruleAddFixedIngredient EOF
            {
             newCompositeNode(grammarAccess.getAddFixedIngredientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddFixedIngredient=ruleAddFixedIngredient();

            state._fsp--;

             current =iv_ruleAddFixedIngredient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddFixedIngredient"


    // $ANTLR start "ruleAddFixedIngredient"
    // InternalCocktails.g:266:1: ruleAddFixedIngredient returns [EObject current=null] : (otherlv_0= 'addF' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleAddition ) ) otherlv_4= 'g' ) ;
    public final EObject ruleAddFixedIngredient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_amount_3_0 = null;



        	enterRule();

        try {
            // InternalCocktails.g:272:2: ( (otherlv_0= 'addF' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleAddition ) ) otherlv_4= 'g' ) )
            // InternalCocktails.g:273:2: (otherlv_0= 'addF' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleAddition ) ) otherlv_4= 'g' )
            {
            // InternalCocktails.g:273:2: (otherlv_0= 'addF' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleAddition ) ) otherlv_4= 'g' )
            // InternalCocktails.g:274:3: otherlv_0= 'addF' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleAddition ) ) otherlv_4= 'g'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAddFixedIngredientAccess().getAddFKeyword_0());
            		
            // InternalCocktails.g:278:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCocktails.g:279:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCocktails.g:279:4: (lv_name_1_0= RULE_ID )
            // InternalCocktails.g:280:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAddFixedIngredientAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddFixedIngredientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAddFixedIngredientAccess().getColonKeyword_2());
            		
            // InternalCocktails.g:300:3: ( (lv_amount_3_0= ruleAddition ) )
            // InternalCocktails.g:301:4: (lv_amount_3_0= ruleAddition )
            {
            // InternalCocktails.g:301:4: (lv_amount_3_0= ruleAddition )
            // InternalCocktails.g:302:5: lv_amount_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getAddFixedIngredientAccess().getAmountAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_amount_3_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddFixedIngredientRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_3_0,
            						"org.xtext.example.mydsl.Cocktails.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAddFixedIngredientAccess().getGKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddFixedIngredient"


    // $ANTLR start "entryRuleFancyStatement"
    // InternalCocktails.g:327:1: entryRuleFancyStatement returns [EObject current=null] : iv_ruleFancyStatement= ruleFancyStatement EOF ;
    public final EObject entryRuleFancyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFancyStatement = null;


        try {
            // InternalCocktails.g:327:55: (iv_ruleFancyStatement= ruleFancyStatement EOF )
            // InternalCocktails.g:328:2: iv_ruleFancyStatement= ruleFancyStatement EOF
            {
             newCompositeNode(grammarAccess.getFancyStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFancyStatement=ruleFancyStatement();

            state._fsp--;

             current =iv_ruleFancyStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFancyStatement"


    // $ANTLR start "ruleFancyStatement"
    // InternalCocktails.g:334:1: ruleFancyStatement returns [EObject current=null] : (otherlv_0= 'use' ( (lv_fcommand_1_0= ruleFancyMakeStatement ) ) ) ;
    public final EObject ruleFancyStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_fcommand_1_0 = null;



        	enterRule();

        try {
            // InternalCocktails.g:340:2: ( (otherlv_0= 'use' ( (lv_fcommand_1_0= ruleFancyMakeStatement ) ) ) )
            // InternalCocktails.g:341:2: (otherlv_0= 'use' ( (lv_fcommand_1_0= ruleFancyMakeStatement ) ) )
            {
            // InternalCocktails.g:341:2: (otherlv_0= 'use' ( (lv_fcommand_1_0= ruleFancyMakeStatement ) ) )
            // InternalCocktails.g:342:3: otherlv_0= 'use' ( (lv_fcommand_1_0= ruleFancyMakeStatement ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFancyStatementAccess().getUseKeyword_0());
            		
            // InternalCocktails.g:346:3: ( (lv_fcommand_1_0= ruleFancyMakeStatement ) )
            // InternalCocktails.g:347:4: (lv_fcommand_1_0= ruleFancyMakeStatement )
            {
            // InternalCocktails.g:347:4: (lv_fcommand_1_0= ruleFancyMakeStatement )
            // InternalCocktails.g:348:5: lv_fcommand_1_0= ruleFancyMakeStatement
            {

            					newCompositeNode(grammarAccess.getFancyStatementAccess().getFcommandFancyMakeStatementEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_fcommand_1_0=ruleFancyMakeStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFancyStatementRule());
            					}
            					set(
            						current,
            						"fcommand",
            						lv_fcommand_1_0,
            						"org.xtext.example.mydsl.Cocktails.FancyMakeStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFancyStatement"


    // $ANTLR start "entryRuleAddIce"
    // InternalCocktails.g:369:1: entryRuleAddIce returns [EObject current=null] : iv_ruleAddIce= ruleAddIce EOF ;
    public final EObject entryRuleAddIce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddIce = null;


        try {
            // InternalCocktails.g:369:47: (iv_ruleAddIce= ruleAddIce EOF )
            // InternalCocktails.g:370:2: iv_ruleAddIce= ruleAddIce EOF
            {
             newCompositeNode(grammarAccess.getAddIceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddIce=ruleAddIce();

            state._fsp--;

             current =iv_ruleAddIce; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddIce"


    // $ANTLR start "ruleAddIce"
    // InternalCocktails.g:376:1: ruleAddIce returns [EObject current=null] : (otherlv_0= 'addIc' ( (lv_ice_1_0= ruleIceStatement ) ) otherlv_2= ':' ( (lv_ounce_3_0= ruleAddition ) ) otherlv_4= 'ounce' ) ;
    public final EObject ruleAddIce() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_ice_1_0 = null;

        EObject lv_ounce_3_0 = null;



        	enterRule();

        try {
            // InternalCocktails.g:382:2: ( (otherlv_0= 'addIc' ( (lv_ice_1_0= ruleIceStatement ) ) otherlv_2= ':' ( (lv_ounce_3_0= ruleAddition ) ) otherlv_4= 'ounce' ) )
            // InternalCocktails.g:383:2: (otherlv_0= 'addIc' ( (lv_ice_1_0= ruleIceStatement ) ) otherlv_2= ':' ( (lv_ounce_3_0= ruleAddition ) ) otherlv_4= 'ounce' )
            {
            // InternalCocktails.g:383:2: (otherlv_0= 'addIc' ( (lv_ice_1_0= ruleIceStatement ) ) otherlv_2= ':' ( (lv_ounce_3_0= ruleAddition ) ) otherlv_4= 'ounce' )
            // InternalCocktails.g:384:3: otherlv_0= 'addIc' ( (lv_ice_1_0= ruleIceStatement ) ) otherlv_2= ':' ( (lv_ounce_3_0= ruleAddition ) ) otherlv_4= 'ounce'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAddIceAccess().getAddIcKeyword_0());
            		
            // InternalCocktails.g:388:3: ( (lv_ice_1_0= ruleIceStatement ) )
            // InternalCocktails.g:389:4: (lv_ice_1_0= ruleIceStatement )
            {
            // InternalCocktails.g:389:4: (lv_ice_1_0= ruleIceStatement )
            // InternalCocktails.g:390:5: lv_ice_1_0= ruleIceStatement
            {

            					newCompositeNode(grammarAccess.getAddIceAccess().getIceIceStatementEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_ice_1_0=ruleIceStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddIceRule());
            					}
            					set(
            						current,
            						"ice",
            						lv_ice_1_0,
            						"org.xtext.example.mydsl.Cocktails.IceStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAddIceAccess().getColonKeyword_2());
            		
            // InternalCocktails.g:411:3: ( (lv_ounce_3_0= ruleAddition ) )
            // InternalCocktails.g:412:4: (lv_ounce_3_0= ruleAddition )
            {
            // InternalCocktails.g:412:4: (lv_ounce_3_0= ruleAddition )
            // InternalCocktails.g:413:5: lv_ounce_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getAddIceAccess().getOunceAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_ounce_3_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddIceRule());
            					}
            					set(
            						current,
            						"ounce",
            						lv_ounce_3_0,
            						"org.xtext.example.mydsl.Cocktails.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAddIceAccess().getOunceKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddIce"


    // $ANTLR start "entryRuleMuddleStatement"
    // InternalCocktails.g:438:1: entryRuleMuddleStatement returns [EObject current=null] : iv_ruleMuddleStatement= ruleMuddleStatement EOF ;
    public final EObject entryRuleMuddleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMuddleStatement = null;


        try {
            // InternalCocktails.g:438:56: (iv_ruleMuddleStatement= ruleMuddleStatement EOF )
            // InternalCocktails.g:439:2: iv_ruleMuddleStatement= ruleMuddleStatement EOF
            {
             newCompositeNode(grammarAccess.getMuddleStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMuddleStatement=ruleMuddleStatement();

            state._fsp--;

             current =iv_ruleMuddleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMuddleStatement"


    // $ANTLR start "ruleMuddleStatement"
    // InternalCocktails.g:445:1: ruleMuddleStatement returns [EObject current=null] : (otherlv_0= 'mud' ( (lv_mudFruit_1_0= ruleFruitStatement ) )* otherlv_2= ':' ( (lv_mtimes_3_0= ruleAddition ) ) otherlv_4= 'times' ) ;
    public final EObject ruleMuddleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_mudFruit_1_0 = null;

        EObject lv_mtimes_3_0 = null;



        	enterRule();

        try {
            // InternalCocktails.g:451:2: ( (otherlv_0= 'mud' ( (lv_mudFruit_1_0= ruleFruitStatement ) )* otherlv_2= ':' ( (lv_mtimes_3_0= ruleAddition ) ) otherlv_4= 'times' ) )
            // InternalCocktails.g:452:2: (otherlv_0= 'mud' ( (lv_mudFruit_1_0= ruleFruitStatement ) )* otherlv_2= ':' ( (lv_mtimes_3_0= ruleAddition ) ) otherlv_4= 'times' )
            {
            // InternalCocktails.g:452:2: (otherlv_0= 'mud' ( (lv_mudFruit_1_0= ruleFruitStatement ) )* otherlv_2= ':' ( (lv_mtimes_3_0= ruleAddition ) ) otherlv_4= 'times' )
            // InternalCocktails.g:453:3: otherlv_0= 'mud' ( (lv_mudFruit_1_0= ruleFruitStatement ) )* otherlv_2= ':' ( (lv_mtimes_3_0= ruleAddition ) ) otherlv_4= 'times'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMuddleStatementAccess().getMudKeyword_0());
            		
            // InternalCocktails.g:457:3: ( (lv_mudFruit_1_0= ruleFruitStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=40 && LA3_0<=59)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCocktails.g:458:4: (lv_mudFruit_1_0= ruleFruitStatement )
            	    {
            	    // InternalCocktails.g:458:4: (lv_mudFruit_1_0= ruleFruitStatement )
            	    // InternalCocktails.g:459:5: lv_mudFruit_1_0= ruleFruitStatement
            	    {

            	    					newCompositeNode(grammarAccess.getMuddleStatementAccess().getMudFruitFruitStatementEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_mudFruit_1_0=ruleFruitStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMuddleStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mudFruit",
            	    						lv_mudFruit_1_0,
            	    						"org.xtext.example.mydsl.Cocktails.FruitStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMuddleStatementAccess().getColonKeyword_2());
            		
            // InternalCocktails.g:480:3: ( (lv_mtimes_3_0= ruleAddition ) )
            // InternalCocktails.g:481:4: (lv_mtimes_3_0= ruleAddition )
            {
            // InternalCocktails.g:481:4: (lv_mtimes_3_0= ruleAddition )
            // InternalCocktails.g:482:5: lv_mtimes_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMuddleStatementAccess().getMtimesAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_mtimes_3_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMuddleStatementRule());
            					}
            					set(
            						current,
            						"mtimes",
            						lv_mtimes_3_0,
            						"org.xtext.example.mydsl.Cocktails.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMuddleStatementAccess().getTimesKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMuddleStatement"


    // $ANTLR start "entryRuleAddDecoration"
    // InternalCocktails.g:507:1: entryRuleAddDecoration returns [EObject current=null] : iv_ruleAddDecoration= ruleAddDecoration EOF ;
    public final EObject entryRuleAddDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddDecoration = null;


        try {
            // InternalCocktails.g:507:54: (iv_ruleAddDecoration= ruleAddDecoration EOF )
            // InternalCocktails.g:508:2: iv_ruleAddDecoration= ruleAddDecoration EOF
            {
             newCompositeNode(grammarAccess.getAddDecorationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddDecoration=ruleAddDecoration();

            state._fsp--;

             current =iv_ruleAddDecoration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddDecoration"


    // $ANTLR start "ruleAddDecoration"
    // InternalCocktails.g:514:1: ruleAddDecoration returns [EObject current=null] : (otherlv_0= 'addD' ( (lv_decoration_1_0= ruleDecorationStatement ) ) ( (lv_slice_2_0= ruleAddition ) ) otherlv_3= 'slices' ) ;
    public final EObject ruleAddDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_decoration_1_0 = null;

        EObject lv_slice_2_0 = null;



        	enterRule();

        try {
            // InternalCocktails.g:520:2: ( (otherlv_0= 'addD' ( (lv_decoration_1_0= ruleDecorationStatement ) ) ( (lv_slice_2_0= ruleAddition ) ) otherlv_3= 'slices' ) )
            // InternalCocktails.g:521:2: (otherlv_0= 'addD' ( (lv_decoration_1_0= ruleDecorationStatement ) ) ( (lv_slice_2_0= ruleAddition ) ) otherlv_3= 'slices' )
            {
            // InternalCocktails.g:521:2: (otherlv_0= 'addD' ( (lv_decoration_1_0= ruleDecorationStatement ) ) ( (lv_slice_2_0= ruleAddition ) ) otherlv_3= 'slices' )
            // InternalCocktails.g:522:3: otherlv_0= 'addD' ( (lv_decoration_1_0= ruleDecorationStatement ) ) ( (lv_slice_2_0= ruleAddition ) ) otherlv_3= 'slices'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAddDecorationAccess().getAddDKeyword_0());
            		
            // InternalCocktails.g:526:3: ( (lv_decoration_1_0= ruleDecorationStatement ) )
            // InternalCocktails.g:527:4: (lv_decoration_1_0= ruleDecorationStatement )
            {
            // InternalCocktails.g:527:4: (lv_decoration_1_0= ruleDecorationStatement )
            // InternalCocktails.g:528:5: lv_decoration_1_0= ruleDecorationStatement
            {

            					newCompositeNode(grammarAccess.getAddDecorationAccess().getDecorationDecorationStatementEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_decoration_1_0=ruleDecorationStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddDecorationRule());
            					}
            					set(
            						current,
            						"decoration",
            						lv_decoration_1_0,
            						"org.xtext.example.mydsl.Cocktails.DecorationStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCocktails.g:545:3: ( (lv_slice_2_0= ruleAddition ) )
            // InternalCocktails.g:546:4: (lv_slice_2_0= ruleAddition )
            {
            // InternalCocktails.g:546:4: (lv_slice_2_0= ruleAddition )
            // InternalCocktails.g:547:5: lv_slice_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getAddDecorationAccess().getSliceAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_slice_2_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddDecorationRule());
            					}
            					set(
            						current,
            						"slice",
            						lv_slice_2_0,
            						"org.xtext.example.mydsl.Cocktails.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAddDecorationAccess().getSlicesKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddDecoration"


    // $ANTLR start "entryRuleMakeStatement"
    // InternalCocktails.g:572:1: entryRuleMakeStatement returns [EObject current=null] : iv_ruleMakeStatement= ruleMakeStatement EOF ;
    public final EObject entryRuleMakeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakeStatement = null;


        try {
            // InternalCocktails.g:572:54: (iv_ruleMakeStatement= ruleMakeStatement EOF )
            // InternalCocktails.g:573:2: iv_ruleMakeStatement= ruleMakeStatement EOF
            {
             newCompositeNode(grammarAccess.getMakeStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMakeStatement=ruleMakeStatement();

            state._fsp--;

             current =iv_ruleMakeStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMakeStatement"


    // $ANTLR start "ruleMakeStatement"
    // InternalCocktails.g:579:1: ruleMakeStatement returns [EObject current=null] : ( ( (lv_make_0_0= ruleMakeCommand ) ) otherlv_1= ':' ( (lv_time_2_0= ruleAddition ) ) otherlv_3= 'seconds' ) ;
    public final EObject ruleMakeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_make_0_0 = null;

        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalCocktails.g:585:2: ( ( ( (lv_make_0_0= ruleMakeCommand ) ) otherlv_1= ':' ( (lv_time_2_0= ruleAddition ) ) otherlv_3= 'seconds' ) )
            // InternalCocktails.g:586:2: ( ( (lv_make_0_0= ruleMakeCommand ) ) otherlv_1= ':' ( (lv_time_2_0= ruleAddition ) ) otherlv_3= 'seconds' )
            {
            // InternalCocktails.g:586:2: ( ( (lv_make_0_0= ruleMakeCommand ) ) otherlv_1= ':' ( (lv_time_2_0= ruleAddition ) ) otherlv_3= 'seconds' )
            // InternalCocktails.g:587:3: ( (lv_make_0_0= ruleMakeCommand ) ) otherlv_1= ':' ( (lv_time_2_0= ruleAddition ) ) otherlv_3= 'seconds'
            {
            // InternalCocktails.g:587:3: ( (lv_make_0_0= ruleMakeCommand ) )
            // InternalCocktails.g:588:4: (lv_make_0_0= ruleMakeCommand )
            {
            // InternalCocktails.g:588:4: (lv_make_0_0= ruleMakeCommand )
            // InternalCocktails.g:589:5: lv_make_0_0= ruleMakeCommand
            {

            					newCompositeNode(grammarAccess.getMakeStatementAccess().getMakeMakeCommandEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_make_0_0=ruleMakeCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMakeStatementRule());
            					}
            					set(
            						current,
            						"make",
            						lv_make_0_0,
            						"org.xtext.example.mydsl.Cocktails.MakeCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMakeStatementAccess().getColonKeyword_1());
            		
            // InternalCocktails.g:610:3: ( (lv_time_2_0= ruleAddition ) )
            // InternalCocktails.g:611:4: (lv_time_2_0= ruleAddition )
            {
            // InternalCocktails.g:611:4: (lv_time_2_0= ruleAddition )
            // InternalCocktails.g:612:5: lv_time_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMakeStatementAccess().getTimeAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_time_2_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMakeStatementRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.example.mydsl.Cocktails.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMakeStatementAccess().getSecondsKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMakeStatement"


    // $ANTLR start "entryRuleAddition"
    // InternalCocktails.g:637:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalCocktails.g:637:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalCocktails.g:638:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalCocktails.g:644:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCocktails.g:650:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalCocktails.g:651:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalCocktails.g:651:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalCocktails.g:652:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCocktails.g:660:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=24 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCocktails.g:661:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalCocktails.g:661:4: ()
            	    // InternalCocktails.g:662:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCocktails.g:668:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalCocktails.g:669:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalCocktails.g:669:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalCocktails.g:670:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalCocktails.g:670:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==24) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==25) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalCocktails.g:671:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,24,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCocktails.g:682:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,25,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCocktails.g:695:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalCocktails.g:696:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalCocktails.g:696:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalCocktails.g:697:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Cocktails.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalCocktails.g:719:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalCocktails.g:719:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalCocktails.g:720:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalCocktails.g:726:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCocktails.g:732:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalCocktails.g:733:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalCocktails.g:733:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalCocktails.g:734:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCocktails.g:742:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=26 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCocktails.g:743:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalCocktails.g:743:4: ()
            	    // InternalCocktails.g:744:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCocktails.g:750:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalCocktails.g:751:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalCocktails.g:751:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalCocktails.g:752:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalCocktails.g:752:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==26) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==27) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalCocktails.g:753:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,26,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCocktails.g:764:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,27,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCocktails.g:777:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalCocktails.g:778:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalCocktails.g:778:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalCocktails.g:779:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Cocktails.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalCocktails.g:801:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalCocktails.g:801:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalCocktails.g:802:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalCocktails.g:808:1: rulePrimaryExpression returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntLiteral_0 = null;

        EObject this_IntVarExpression_1 = null;

        EObject this_Addition_3 = null;



        	enterRule();

        try {
            // InternalCocktails.g:814:2: ( (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) )
            // InternalCocktails.g:815:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            {
            // InternalCocktails.g:815:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCocktails.g:816:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCocktails.g:825:3: this_IntVarExpression_1= ruleIntVarExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIntVarExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVarExpression_1=ruleIntVarExpression();

                    state._fsp--;


                    			current = this_IntVarExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCocktails.g:834:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    {
                    // InternalCocktails.g:834:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    // InternalCocktails.g:835:4: otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAdditionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_Addition_3=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalCocktails.g:856:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalCocktails.g:856:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalCocktails.g:857:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalCocktails.g:863:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalCocktails.g:869:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalCocktails.g:870:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalCocktails.g:870:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalCocktails.g:871:3: (lv_val_0_0= RULE_INT )
            {
            // InternalCocktails.g:871:3: (lv_val_0_0= RULE_INT )
            // InternalCocktails.g:872:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalCocktails.g:891:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalCocktails.g:891:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalCocktails.g:892:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalCocktails.g:898:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalCocktails.g:904:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalCocktails.g:905:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalCocktails.g:905:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalCocktails.g:906:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalCocktails.g:910:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCocktails.g:911:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCocktails.g:911:4: (lv_name_1_0= RULE_ID )
            // InternalCocktails.g:912:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalCocktails.g:932:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalCocktails.g:933:4: (lv_value_3_0= RULE_INT )
            {
            // InternalCocktails.g:933:4: (lv_value_3_0= RULE_INT )
            // InternalCocktails.g:934:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalCocktails.g:954:1: entryRuleIntVarExpression returns [EObject current=null] : iv_ruleIntVarExpression= ruleIntVarExpression EOF ;
    public final EObject entryRuleIntVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarExpression = null;


        try {
            // InternalCocktails.g:954:57: (iv_ruleIntVarExpression= ruleIntVarExpression EOF )
            // InternalCocktails.g:955:2: iv_ruleIntVarExpression= ruleIntVarExpression EOF
            {
             newCompositeNode(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVarExpression=ruleIntVarExpression();

            state._fsp--;

             current =iv_ruleIntVarExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalCocktails.g:961:1: ruleIntVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCocktails.g:967:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCocktails.g:968:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCocktails.g:968:2: ( (otherlv_0= RULE_ID ) )
            // InternalCocktails.g:969:3: (otherlv_0= RULE_ID )
            {
            // InternalCocktails.g:969:3: (otherlv_0= RULE_ID )
            // InternalCocktails.g:970:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "ruleFancyMakeStatement"
    // InternalCocktails.g:984:1: ruleFancyMakeStatement returns [Enumerator current=null] : ( (enumLiteral_0= 'lighter' ) | (enumLiteral_1= 'co2' ) ) ;
    public final Enumerator ruleFancyMakeStatement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCocktails.g:990:2: ( ( (enumLiteral_0= 'lighter' ) | (enumLiteral_1= 'co2' ) ) )
            // InternalCocktails.g:991:2: ( (enumLiteral_0= 'lighter' ) | (enumLiteral_1= 'co2' ) )
            {
            // InternalCocktails.g:991:2: ( (enumLiteral_0= 'lighter' ) | (enumLiteral_1= 'co2' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCocktails.g:992:3: (enumLiteral_0= 'lighter' )
                    {
                    // InternalCocktails.g:992:3: (enumLiteral_0= 'lighter' )
                    // InternalCocktails.g:993:4: enumLiteral_0= 'lighter'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getFancyMakeStatementAccess().getLighterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFancyMakeStatementAccess().getLighterEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:1000:3: (enumLiteral_1= 'co2' )
                    {
                    // InternalCocktails.g:1000:3: (enumLiteral_1= 'co2' )
                    // InternalCocktails.g:1001:4: enumLiteral_1= 'co2'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFancyMakeStatementAccess().getCo2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFancyMakeStatementAccess().getCo2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFancyMakeStatement"


    // $ANTLR start "ruleIceStatement"
    // InternalCocktails.g:1011:1: ruleIceStatement returns [Enumerator current=null] : ( (enumLiteral_0= 'cube' ) | (enumLiteral_1= 'crush' ) | (enumLiteral_2= 'shave' ) | (enumLiteral_3= 'block' ) | (enumLiteral_4= 'ball' ) | (enumLiteral_5= 'cone' ) ) ;
    public final Enumerator ruleIceStatement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalCocktails.g:1017:2: ( ( (enumLiteral_0= 'cube' ) | (enumLiteral_1= 'crush' ) | (enumLiteral_2= 'shave' ) | (enumLiteral_3= 'block' ) | (enumLiteral_4= 'ball' ) | (enumLiteral_5= 'cone' ) ) )
            // InternalCocktails.g:1018:2: ( (enumLiteral_0= 'cube' ) | (enumLiteral_1= 'crush' ) | (enumLiteral_2= 'shave' ) | (enumLiteral_3= 'block' ) | (enumLiteral_4= 'ball' ) | (enumLiteral_5= 'cone' ) )
            {
            // InternalCocktails.g:1018:2: ( (enumLiteral_0= 'cube' ) | (enumLiteral_1= 'crush' ) | (enumLiteral_2= 'shave' ) | (enumLiteral_3= 'block' ) | (enumLiteral_4= 'ball' ) | (enumLiteral_5= 'cone' ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt10=1;
                }
                break;
            case 35:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 37:
                {
                alt10=4;
                }
                break;
            case 38:
                {
                alt10=5;
                }
                break;
            case 39:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCocktails.g:1019:3: (enumLiteral_0= 'cube' )
                    {
                    // InternalCocktails.g:1019:3: (enumLiteral_0= 'cube' )
                    // InternalCocktails.g:1020:4: enumLiteral_0= 'cube'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getIceStatementAccess().getCubeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIceStatementAccess().getCubeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:1027:3: (enumLiteral_1= 'crush' )
                    {
                    // InternalCocktails.g:1027:3: (enumLiteral_1= 'crush' )
                    // InternalCocktails.g:1028:4: enumLiteral_1= 'crush'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getIceStatementAccess().getCrushEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIceStatementAccess().getCrushEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCocktails.g:1035:3: (enumLiteral_2= 'shave' )
                    {
                    // InternalCocktails.g:1035:3: (enumLiteral_2= 'shave' )
                    // InternalCocktails.g:1036:4: enumLiteral_2= 'shave'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getIceStatementAccess().getShaveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIceStatementAccess().getShaveEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCocktails.g:1043:3: (enumLiteral_3= 'block' )
                    {
                    // InternalCocktails.g:1043:3: (enumLiteral_3= 'block' )
                    // InternalCocktails.g:1044:4: enumLiteral_3= 'block'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getIceStatementAccess().getBlockEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIceStatementAccess().getBlockEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCocktails.g:1051:3: (enumLiteral_4= 'ball' )
                    {
                    // InternalCocktails.g:1051:3: (enumLiteral_4= 'ball' )
                    // InternalCocktails.g:1052:4: enumLiteral_4= 'ball'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getIceStatementAccess().getBallEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getIceStatementAccess().getBallEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCocktails.g:1059:3: (enumLiteral_5= 'cone' )
                    {
                    // InternalCocktails.g:1059:3: (enumLiteral_5= 'cone' )
                    // InternalCocktails.g:1060:4: enumLiteral_5= 'cone'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getIceStatementAccess().getConeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getIceStatementAccess().getConeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIceStatement"


    // $ANTLR start "ruleFruitStatement"
    // InternalCocktails.g:1070:1: ruleFruitStatement returns [Enumerator current=null] : ( (enumLiteral_0= 'lime' ) | (enumLiteral_1= 'lemon' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'grapefruit' ) | (enumLiteral_4= 'pineapple' ) | (enumLiteral_5= 'mango' ) | (enumLiteral_6= 'kiwi' ) | (enumLiteral_7= 'strawberry' ) | (enumLiteral_8= 'blueberry' ) | (enumLiteral_9= 'raspberry' ) | (enumLiteral_10= 'blackberry' ) | (enumLiteral_11= 'cherry' ) | (enumLiteral_12= 'peach' ) | (enumLiteral_13= 'plum' ) | (enumLiteral_14= 'watermelon' ) | (enumLiteral_15= 'cucumber' ) | (enumLiteral_16= 'mint' ) | (enumLiteral_17= 'basil' ) | (enumLiteral_18= 'thyme' ) | (enumLiteral_19= 'ginger' ) ) ;
    public final Enumerator ruleFruitStatement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;


        	enterRule();

        try {
            // InternalCocktails.g:1076:2: ( ( (enumLiteral_0= 'lime' ) | (enumLiteral_1= 'lemon' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'grapefruit' ) | (enumLiteral_4= 'pineapple' ) | (enumLiteral_5= 'mango' ) | (enumLiteral_6= 'kiwi' ) | (enumLiteral_7= 'strawberry' ) | (enumLiteral_8= 'blueberry' ) | (enumLiteral_9= 'raspberry' ) | (enumLiteral_10= 'blackberry' ) | (enumLiteral_11= 'cherry' ) | (enumLiteral_12= 'peach' ) | (enumLiteral_13= 'plum' ) | (enumLiteral_14= 'watermelon' ) | (enumLiteral_15= 'cucumber' ) | (enumLiteral_16= 'mint' ) | (enumLiteral_17= 'basil' ) | (enumLiteral_18= 'thyme' ) | (enumLiteral_19= 'ginger' ) ) )
            // InternalCocktails.g:1077:2: ( (enumLiteral_0= 'lime' ) | (enumLiteral_1= 'lemon' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'grapefruit' ) | (enumLiteral_4= 'pineapple' ) | (enumLiteral_5= 'mango' ) | (enumLiteral_6= 'kiwi' ) | (enumLiteral_7= 'strawberry' ) | (enumLiteral_8= 'blueberry' ) | (enumLiteral_9= 'raspberry' ) | (enumLiteral_10= 'blackberry' ) | (enumLiteral_11= 'cherry' ) | (enumLiteral_12= 'peach' ) | (enumLiteral_13= 'plum' ) | (enumLiteral_14= 'watermelon' ) | (enumLiteral_15= 'cucumber' ) | (enumLiteral_16= 'mint' ) | (enumLiteral_17= 'basil' ) | (enumLiteral_18= 'thyme' ) | (enumLiteral_19= 'ginger' ) )
            {
            // InternalCocktails.g:1077:2: ( (enumLiteral_0= 'lime' ) | (enumLiteral_1= 'lemon' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'grapefruit' ) | (enumLiteral_4= 'pineapple' ) | (enumLiteral_5= 'mango' ) | (enumLiteral_6= 'kiwi' ) | (enumLiteral_7= 'strawberry' ) | (enumLiteral_8= 'blueberry' ) | (enumLiteral_9= 'raspberry' ) | (enumLiteral_10= 'blackberry' ) | (enumLiteral_11= 'cherry' ) | (enumLiteral_12= 'peach' ) | (enumLiteral_13= 'plum' ) | (enumLiteral_14= 'watermelon' ) | (enumLiteral_15= 'cucumber' ) | (enumLiteral_16= 'mint' ) | (enumLiteral_17= 'basil' ) | (enumLiteral_18= 'thyme' ) | (enumLiteral_19= 'ginger' ) )
            int alt11=20;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            case 45:
                {
                alt11=6;
                }
                break;
            case 46:
                {
                alt11=7;
                }
                break;
            case 47:
                {
                alt11=8;
                }
                break;
            case 48:
                {
                alt11=9;
                }
                break;
            case 49:
                {
                alt11=10;
                }
                break;
            case 50:
                {
                alt11=11;
                }
                break;
            case 51:
                {
                alt11=12;
                }
                break;
            case 52:
                {
                alt11=13;
                }
                break;
            case 53:
                {
                alt11=14;
                }
                break;
            case 54:
                {
                alt11=15;
                }
                break;
            case 55:
                {
                alt11=16;
                }
                break;
            case 56:
                {
                alt11=17;
                }
                break;
            case 57:
                {
                alt11=18;
                }
                break;
            case 58:
                {
                alt11=19;
                }
                break;
            case 59:
                {
                alt11=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCocktails.g:1078:3: (enumLiteral_0= 'lime' )
                    {
                    // InternalCocktails.g:1078:3: (enumLiteral_0= 'lime' )
                    // InternalCocktails.g:1079:4: enumLiteral_0= 'lime'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getLimeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFruitStatementAccess().getLimeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:1086:3: (enumLiteral_1= 'lemon' )
                    {
                    // InternalCocktails.g:1086:3: (enumLiteral_1= 'lemon' )
                    // InternalCocktails.g:1087:4: enumLiteral_1= 'lemon'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getLemonEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFruitStatementAccess().getLemonEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCocktails.g:1094:3: (enumLiteral_2= 'orange' )
                    {
                    // InternalCocktails.g:1094:3: (enumLiteral_2= 'orange' )
                    // InternalCocktails.g:1095:4: enumLiteral_2= 'orange'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getOrangeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFruitStatementAccess().getOrangeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCocktails.g:1102:3: (enumLiteral_3= 'grapefruit' )
                    {
                    // InternalCocktails.g:1102:3: (enumLiteral_3= 'grapefruit' )
                    // InternalCocktails.g:1103:4: enumLiteral_3= 'grapefruit'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getGrapefruitEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFruitStatementAccess().getGrapefruitEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCocktails.g:1110:3: (enumLiteral_4= 'pineapple' )
                    {
                    // InternalCocktails.g:1110:3: (enumLiteral_4= 'pineapple' )
                    // InternalCocktails.g:1111:4: enumLiteral_4= 'pineapple'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getPineappleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFruitStatementAccess().getPineappleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCocktails.g:1118:3: (enumLiteral_5= 'mango' )
                    {
                    // InternalCocktails.g:1118:3: (enumLiteral_5= 'mango' )
                    // InternalCocktails.g:1119:4: enumLiteral_5= 'mango'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getMangoEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFruitStatementAccess().getMangoEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCocktails.g:1126:3: (enumLiteral_6= 'kiwi' )
                    {
                    // InternalCocktails.g:1126:3: (enumLiteral_6= 'kiwi' )
                    // InternalCocktails.g:1127:4: enumLiteral_6= 'kiwi'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getKiwiEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFruitStatementAccess().getKiwiEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCocktails.g:1134:3: (enumLiteral_7= 'strawberry' )
                    {
                    // InternalCocktails.g:1134:3: (enumLiteral_7= 'strawberry' )
                    // InternalCocktails.g:1135:4: enumLiteral_7= 'strawberry'
                    {
                    enumLiteral_7=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getStrawberryEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFruitStatementAccess().getStrawberryEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalCocktails.g:1142:3: (enumLiteral_8= 'blueberry' )
                    {
                    // InternalCocktails.g:1142:3: (enumLiteral_8= 'blueberry' )
                    // InternalCocktails.g:1143:4: enumLiteral_8= 'blueberry'
                    {
                    enumLiteral_8=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getBlueberryEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getFruitStatementAccess().getBlueberryEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalCocktails.g:1150:3: (enumLiteral_9= 'raspberry' )
                    {
                    // InternalCocktails.g:1150:3: (enumLiteral_9= 'raspberry' )
                    // InternalCocktails.g:1151:4: enumLiteral_9= 'raspberry'
                    {
                    enumLiteral_9=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getRaspberryEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getFruitStatementAccess().getRaspberryEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalCocktails.g:1158:3: (enumLiteral_10= 'blackberry' )
                    {
                    // InternalCocktails.g:1158:3: (enumLiteral_10= 'blackberry' )
                    // InternalCocktails.g:1159:4: enumLiteral_10= 'blackberry'
                    {
                    enumLiteral_10=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getBlackberryEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getFruitStatementAccess().getBlackberryEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalCocktails.g:1166:3: (enumLiteral_11= 'cherry' )
                    {
                    // InternalCocktails.g:1166:3: (enumLiteral_11= 'cherry' )
                    // InternalCocktails.g:1167:4: enumLiteral_11= 'cherry'
                    {
                    enumLiteral_11=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getCherryEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getFruitStatementAccess().getCherryEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalCocktails.g:1174:3: (enumLiteral_12= 'peach' )
                    {
                    // InternalCocktails.g:1174:3: (enumLiteral_12= 'peach' )
                    // InternalCocktails.g:1175:4: enumLiteral_12= 'peach'
                    {
                    enumLiteral_12=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getPeachEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getFruitStatementAccess().getPeachEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalCocktails.g:1182:3: (enumLiteral_13= 'plum' )
                    {
                    // InternalCocktails.g:1182:3: (enumLiteral_13= 'plum' )
                    // InternalCocktails.g:1183:4: enumLiteral_13= 'plum'
                    {
                    enumLiteral_13=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getPlumEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getFruitStatementAccess().getPlumEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalCocktails.g:1190:3: (enumLiteral_14= 'watermelon' )
                    {
                    // InternalCocktails.g:1190:3: (enumLiteral_14= 'watermelon' )
                    // InternalCocktails.g:1191:4: enumLiteral_14= 'watermelon'
                    {
                    enumLiteral_14=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getWatermelonEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getFruitStatementAccess().getWatermelonEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalCocktails.g:1198:3: (enumLiteral_15= 'cucumber' )
                    {
                    // InternalCocktails.g:1198:3: (enumLiteral_15= 'cucumber' )
                    // InternalCocktails.g:1199:4: enumLiteral_15= 'cucumber'
                    {
                    enumLiteral_15=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getCucumberEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getFruitStatementAccess().getCucumberEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalCocktails.g:1206:3: (enumLiteral_16= 'mint' )
                    {
                    // InternalCocktails.g:1206:3: (enumLiteral_16= 'mint' )
                    // InternalCocktails.g:1207:4: enumLiteral_16= 'mint'
                    {
                    enumLiteral_16=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getMintEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getFruitStatementAccess().getMintEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalCocktails.g:1214:3: (enumLiteral_17= 'basil' )
                    {
                    // InternalCocktails.g:1214:3: (enumLiteral_17= 'basil' )
                    // InternalCocktails.g:1215:4: enumLiteral_17= 'basil'
                    {
                    enumLiteral_17=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getBasilEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getFruitStatementAccess().getBasilEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalCocktails.g:1222:3: (enumLiteral_18= 'thyme' )
                    {
                    // InternalCocktails.g:1222:3: (enumLiteral_18= 'thyme' )
                    // InternalCocktails.g:1223:4: enumLiteral_18= 'thyme'
                    {
                    enumLiteral_18=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getThymeEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getFruitStatementAccess().getThymeEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalCocktails.g:1230:3: (enumLiteral_19= 'ginger' )
                    {
                    // InternalCocktails.g:1230:3: (enumLiteral_19= 'ginger' )
                    // InternalCocktails.g:1231:4: enumLiteral_19= 'ginger'
                    {
                    enumLiteral_19=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getFruitStatementAccess().getGingerEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getFruitStatementAccess().getGingerEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFruitStatement"


    // $ANTLR start "ruleDecorationStatement"
    // InternalCocktails.g:1241:1: ruleDecorationStatement returns [Enumerator current=null] : ( (enumLiteral_0= 'orange' ) | (enumLiteral_1= 'lemon' ) | (enumLiteral_2= 'lime' ) | (enumLiteral_3= 'olive' ) | (enumLiteral_4= 'cherry' ) | (enumLiteral_5= 'mint' ) | (enumLiteral_6= 'rose' ) | (enumLiteral_7= 'cinnamon' ) | (enumLiteral_8= 'mango' ) | (enumLiteral_9= 'grapefruit' ) ) ;
    public final Enumerator ruleDecorationStatement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalCocktails.g:1247:2: ( ( (enumLiteral_0= 'orange' ) | (enumLiteral_1= 'lemon' ) | (enumLiteral_2= 'lime' ) | (enumLiteral_3= 'olive' ) | (enumLiteral_4= 'cherry' ) | (enumLiteral_5= 'mint' ) | (enumLiteral_6= 'rose' ) | (enumLiteral_7= 'cinnamon' ) | (enumLiteral_8= 'mango' ) | (enumLiteral_9= 'grapefruit' ) ) )
            // InternalCocktails.g:1248:2: ( (enumLiteral_0= 'orange' ) | (enumLiteral_1= 'lemon' ) | (enumLiteral_2= 'lime' ) | (enumLiteral_3= 'olive' ) | (enumLiteral_4= 'cherry' ) | (enumLiteral_5= 'mint' ) | (enumLiteral_6= 'rose' ) | (enumLiteral_7= 'cinnamon' ) | (enumLiteral_8= 'mango' ) | (enumLiteral_9= 'grapefruit' ) )
            {
            // InternalCocktails.g:1248:2: ( (enumLiteral_0= 'orange' ) | (enumLiteral_1= 'lemon' ) | (enumLiteral_2= 'lime' ) | (enumLiteral_3= 'olive' ) | (enumLiteral_4= 'cherry' ) | (enumLiteral_5= 'mint' ) | (enumLiteral_6= 'rose' ) | (enumLiteral_7= 'cinnamon' ) | (enumLiteral_8= 'mango' ) | (enumLiteral_9= 'grapefruit' ) )
            int alt12=10;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            case 40:
                {
                alt12=3;
                }
                break;
            case 60:
                {
                alt12=4;
                }
                break;
            case 51:
                {
                alt12=5;
                }
                break;
            case 56:
                {
                alt12=6;
                }
                break;
            case 61:
                {
                alt12=7;
                }
                break;
            case 62:
                {
                alt12=8;
                }
                break;
            case 45:
                {
                alt12=9;
                }
                break;
            case 43:
                {
                alt12=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCocktails.g:1249:3: (enumLiteral_0= 'orange' )
                    {
                    // InternalCocktails.g:1249:3: (enumLiteral_0= 'orange' )
                    // InternalCocktails.g:1250:4: enumLiteral_0= 'orange'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDecorationStatementAccess().getOrangeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDecorationStatementAccess().getOrangeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:1257:3: (enumLiteral_1= 'lemon' )
                    {
                    // InternalCocktails.g:1257:3: (enumLiteral_1= 'lemon' )
                    // InternalCocktails.g:1258:4: enumLiteral_1= 'lemon'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDecorationStatementAccess().getLemonEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDecorationStatementAccess().getLemonEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCocktails.g:1265:3: (enumLiteral_2= 'lime' )
                    {
                    // InternalCocktails.g:1265:3: (enumLiteral_2= 'lime' )
                    // InternalCocktails.g:1266:4: enumLiteral_2= 'lime'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDecorationStatementAccess().getLimeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDecorationStatementAccess().getLimeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCocktails.g:1273:3: (enumLiteral_3= 'olive' )
                    {
                    // InternalCocktails.g:1273:3: (enumLiteral_3= 'olive' )
                    // InternalCocktails.g:1274:4: enumLiteral_3= 'olive'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDecorationStatementAccess().getOliveEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDecorationStatementAccess().getOliveEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCocktails.g:1281:3: (enumLiteral_4= 'cherry' )
                    {
                    // InternalCocktails.g:1281:3: (enumLiteral_4= 'cherry' )
                    // InternalCocktails.g:1282:4: enumLiteral_4= 'cherry'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getDecorationStatementAccess().getCherryEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDecorationStatementAccess().getCherryEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCocktails.g:1289:3: (enumLiteral_5= 'mint' )
                    {
                    // InternalCocktails.g:1289:3: (enumLiteral_5= 'mint' )
                    // InternalCocktails.g:1290:4: enumLiteral_5= 'mint'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDecorationStatementAccess().getMintEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDecorationStatementAccess().getMintEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCocktails.g:1297:3: (enumLiteral_6= 'rose' )
                    {
                    // InternalCocktails.g:1297:3: (enumLiteral_6= 'rose' )
                    // InternalCocktails.g:1298:4: enumLiteral_6= 'rose'
                    {
                    enumLiteral_6=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getDecorationStatementAccess().getRoseEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDecorationStatementAccess().getRoseEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCocktails.g:1305:3: (enumLiteral_7= 'cinnamon' )
                    {
                    // InternalCocktails.g:1305:3: (enumLiteral_7= 'cinnamon' )
                    // InternalCocktails.g:1306:4: enumLiteral_7= 'cinnamon'
                    {
                    enumLiteral_7=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getDecorationStatementAccess().getCinnamonEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDecorationStatementAccess().getCinnamonEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalCocktails.g:1313:3: (enumLiteral_8= 'mango' )
                    {
                    // InternalCocktails.g:1313:3: (enumLiteral_8= 'mango' )
                    // InternalCocktails.g:1314:4: enumLiteral_8= 'mango'
                    {
                    enumLiteral_8=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDecorationStatementAccess().getMangoEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDecorationStatementAccess().getMangoEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalCocktails.g:1321:3: (enumLiteral_9= 'grapefruit' )
                    {
                    // InternalCocktails.g:1321:3: (enumLiteral_9= 'grapefruit' )
                    // InternalCocktails.g:1322:4: enumLiteral_9= 'grapefruit'
                    {
                    enumLiteral_9=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDecorationStatementAccess().getGrapefruitEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDecorationStatementAccess().getGrapefruitEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecorationStatement"


    // $ANTLR start "ruleMakeCommand"
    // InternalCocktails.g:1332:1: ruleMakeCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'stir' ) | (enumLiteral_1= 'shake' ) | (enumLiteral_2= 'blend' ) | (enumLiteral_3= 'filter' ) ) ;
    public final Enumerator ruleMakeCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCocktails.g:1338:2: ( ( (enumLiteral_0= 'stir' ) | (enumLiteral_1= 'shake' ) | (enumLiteral_2= 'blend' ) | (enumLiteral_3= 'filter' ) ) )
            // InternalCocktails.g:1339:2: ( (enumLiteral_0= 'stir' ) | (enumLiteral_1= 'shake' ) | (enumLiteral_2= 'blend' ) | (enumLiteral_3= 'filter' ) )
            {
            // InternalCocktails.g:1339:2: ( (enumLiteral_0= 'stir' ) | (enumLiteral_1= 'shake' ) | (enumLiteral_2= 'blend' ) | (enumLiteral_3= 'filter' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt13=1;
                }
                break;
            case 64:
                {
                alt13=2;
                }
                break;
            case 65:
                {
                alt13=3;
                }
                break;
            case 66:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCocktails.g:1340:3: (enumLiteral_0= 'stir' )
                    {
                    // InternalCocktails.g:1340:3: (enumLiteral_0= 'stir' )
                    // InternalCocktails.g:1341:4: enumLiteral_0= 'stir'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getMakeCommandAccess().getStirEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMakeCommandAccess().getStirEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCocktails.g:1348:3: (enumLiteral_1= 'shake' )
                    {
                    // InternalCocktails.g:1348:3: (enumLiteral_1= 'shake' )
                    // InternalCocktails.g:1349:4: enumLiteral_1= 'shake'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getMakeCommandAccess().getShakeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMakeCommandAccess().getShakeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCocktails.g:1356:3: (enumLiteral_2= 'blend' )
                    {
                    // InternalCocktails.g:1356:3: (enumLiteral_2= 'blend' )
                    // InternalCocktails.g:1357:4: enumLiteral_2= 'blend'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getMakeCommandAccess().getBlendEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMakeCommandAccess().getBlendEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCocktails.g:1364:3: (enumLiteral_3= 'filter' )
                    {
                    // InternalCocktails.g:1364:3: (enumLiteral_3= 'filter' )
                    // InternalCocktails.g:1365:4: enumLiteral_3= 'filter'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMakeCommandAccess().getFilterEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMakeCommandAccess().getFilterEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMakeCommand"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x80000000402B4802L,0x0000000000000007L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0FFFFF0000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x71082F0000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});

}