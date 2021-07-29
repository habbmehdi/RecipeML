package org.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.services.PantryTextualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPantryTextualParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pantry:'", "','", "':'", "'{'", "'amount'", "'unit'", "'}'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPantryTextualParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPantryTextualParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPantryTextualParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPantryTextual.g"; }



     	private PantryTextualGrammarAccess grammarAccess;

        public InternalPantryTextualParser(TokenStream input, PantryTextualGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Pantry";
       	}

       	@Override
       	protected PantryTextualGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePantry"
    // InternalPantryTextual.g:64:1: entryRulePantry returns [EObject current=null] : iv_rulePantry= rulePantry EOF ;
    public final EObject entryRulePantry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePantry = null;


        try {
            // InternalPantryTextual.g:64:47: (iv_rulePantry= rulePantry EOF )
            // InternalPantryTextual.g:65:2: iv_rulePantry= rulePantry EOF
            {
             newCompositeNode(grammarAccess.getPantryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePantry=rulePantry();

            state._fsp--;

             current =iv_rulePantry; 
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
    // $ANTLR end "entryRulePantry"


    // $ANTLR start "rulePantry"
    // InternalPantryTextual.g:71:1: rulePantry returns [EObject current=null] : (otherlv_0= 'Pantry:' ( (lv_ingredient_1_0= ruleIngredient ) ) (otherlv_2= ',' ( (lv_ingredient_3_0= ruleIngredient ) ) )* ) ;
    public final EObject rulePantry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ingredient_1_0 = null;

        EObject lv_ingredient_3_0 = null;



        	enterRule();

        try {
            // InternalPantryTextual.g:77:2: ( (otherlv_0= 'Pantry:' ( (lv_ingredient_1_0= ruleIngredient ) ) (otherlv_2= ',' ( (lv_ingredient_3_0= ruleIngredient ) ) )* ) )
            // InternalPantryTextual.g:78:2: (otherlv_0= 'Pantry:' ( (lv_ingredient_1_0= ruleIngredient ) ) (otherlv_2= ',' ( (lv_ingredient_3_0= ruleIngredient ) ) )* )
            {
            // InternalPantryTextual.g:78:2: (otherlv_0= 'Pantry:' ( (lv_ingredient_1_0= ruleIngredient ) ) (otherlv_2= ',' ( (lv_ingredient_3_0= ruleIngredient ) ) )* )
            // InternalPantryTextual.g:79:3: otherlv_0= 'Pantry:' ( (lv_ingredient_1_0= ruleIngredient ) ) (otherlv_2= ',' ( (lv_ingredient_3_0= ruleIngredient ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPantryAccess().getPantryKeyword_0());
            		
            // InternalPantryTextual.g:83:3: ( (lv_ingredient_1_0= ruleIngredient ) )
            // InternalPantryTextual.g:84:4: (lv_ingredient_1_0= ruleIngredient )
            {
            // InternalPantryTextual.g:84:4: (lv_ingredient_1_0= ruleIngredient )
            // InternalPantryTextual.g:85:5: lv_ingredient_1_0= ruleIngredient
            {

            					newCompositeNode(grammarAccess.getPantryAccess().getIngredientIngredientParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_ingredient_1_0=ruleIngredient();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPantryRule());
            					}
            					add(
            						current,
            						"ingredient",
            						lv_ingredient_1_0,
            						"org.example.PantryTextual.Ingredient");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPantryTextual.g:102:3: (otherlv_2= ',' ( (lv_ingredient_3_0= ruleIngredient ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPantryTextual.g:103:4: otherlv_2= ',' ( (lv_ingredient_3_0= ruleIngredient ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPantryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPantryTextual.g:107:4: ( (lv_ingredient_3_0= ruleIngredient ) )
            	    // InternalPantryTextual.g:108:5: (lv_ingredient_3_0= ruleIngredient )
            	    {
            	    // InternalPantryTextual.g:108:5: (lv_ingredient_3_0= ruleIngredient )
            	    // InternalPantryTextual.g:109:6: lv_ingredient_3_0= ruleIngredient
            	    {

            	    						newCompositeNode(grammarAccess.getPantryAccess().getIngredientIngredientParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ingredient_3_0=ruleIngredient();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPantryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ingredient",
            	    							lv_ingredient_3_0,
            	    							"org.example.PantryTextual.Ingredient");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "rulePantry"


    // $ANTLR start "entryRuleIngredient"
    // InternalPantryTextual.g:131:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalPantryTextual.g:131:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalPantryTextual.g:132:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
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
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalPantryTextual.g:138:1: ruleIngredient returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_mass_3_0= ruleMass ) ) )? ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mass_3_0 = null;



        	enterRule();

        try {
            // InternalPantryTextual.g:144:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_mass_3_0= ruleMass ) ) )? ) )
            // InternalPantryTextual.g:145:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_mass_3_0= ruleMass ) ) )? )
            {
            // InternalPantryTextual.g:145:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_mass_3_0= ruleMass ) ) )? )
            // InternalPantryTextual.g:146:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_mass_3_0= ruleMass ) ) )?
            {
            // InternalPantryTextual.g:146:3: ()
            // InternalPantryTextual.g:147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIngredientAccess().getIngredientAction_0(),
            					current);
            			

            }

            // InternalPantryTextual.g:153:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPantryTextual.g:154:4: (lv_name_1_0= ruleEString )
            {
            // InternalPantryTextual.g:154:4: (lv_name_1_0= ruleEString )
            // InternalPantryTextual.g:155:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIngredientAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngredientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.example.PantryTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPantryTextual.g:172:3: (otherlv_2= ':' ( (lv_mass_3_0= ruleMass ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPantryTextual.g:173:4: otherlv_2= ':' ( (lv_mass_3_0= ruleMass ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getIngredientAccess().getColonKeyword_2_0());
                    			
                    // InternalPantryTextual.g:177:4: ( (lv_mass_3_0= ruleMass ) )
                    // InternalPantryTextual.g:178:5: (lv_mass_3_0= ruleMass )
                    {
                    // InternalPantryTextual.g:178:5: (lv_mass_3_0= ruleMass )
                    // InternalPantryTextual.g:179:6: lv_mass_3_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getIngredientAccess().getMassMassParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mass_3_0=ruleMass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngredientRule());
                    						}
                    						set(
                    							current,
                    							"mass",
                    							lv_mass_3_0,
                    							"org.example.PantryTextual.Mass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleEString"
    // InternalPantryTextual.g:201:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPantryTextual.g:201:47: (iv_ruleEString= ruleEString EOF )
            // InternalPantryTextual.g:202:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPantryTextual.g:208:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPantryTextual.g:214:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPantryTextual.g:215:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPantryTextual.g:215:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPantryTextual.g:216:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPantryTextual.g:224:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMass"
    // InternalPantryTextual.g:235:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalPantryTextual.g:235:45: (iv_ruleMass= ruleMass EOF )
            // InternalPantryTextual.g:236:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
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
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalPantryTextual.g:242:1: ruleMass returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'amount' ( (lv_amount_3_0= ruleEFloat ) ) )? (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_amount_3_0 = null;

        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalPantryTextual.g:248:2: ( ( () otherlv_1= '{' (otherlv_2= 'amount' ( (lv_amount_3_0= ruleEFloat ) ) )? (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalPantryTextual.g:249:2: ( () otherlv_1= '{' (otherlv_2= 'amount' ( (lv_amount_3_0= ruleEFloat ) ) )? (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalPantryTextual.g:249:2: ( () otherlv_1= '{' (otherlv_2= 'amount' ( (lv_amount_3_0= ruleEFloat ) ) )? (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalPantryTextual.g:250:3: () otherlv_1= '{' (otherlv_2= 'amount' ( (lv_amount_3_0= ruleEFloat ) ) )? (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalPantryTextual.g:250:3: ()
            // InternalPantryTextual.g:251:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPantryTextual.g:261:3: (otherlv_2= 'amount' ( (lv_amount_3_0= ruleEFloat ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPantryTextual.g:262:4: otherlv_2= 'amount' ( (lv_amount_3_0= ruleEFloat ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getMassAccess().getAmountKeyword_2_0());
                    			
                    // InternalPantryTextual.g:266:4: ( (lv_amount_3_0= ruleEFloat ) )
                    // InternalPantryTextual.g:267:5: (lv_amount_3_0= ruleEFloat )
                    {
                    // InternalPantryTextual.g:267:5: (lv_amount_3_0= ruleEFloat )
                    // InternalPantryTextual.g:268:6: lv_amount_3_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getMassAccess().getAmountEFloatParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_amount_3_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMassRule());
                    						}
                    						set(
                    							current,
                    							"amount",
                    							lv_amount_3_0,
                    							"org.example.PantryTextual.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPantryTextual.g:286:3: (otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPantryTextual.g:287:4: otherlv_4= 'unit' ( (lv_unit_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMassAccess().getUnitKeyword_3_0());
                    			
                    // InternalPantryTextual.g:291:4: ( (lv_unit_5_0= ruleEString ) )
                    // InternalPantryTextual.g:292:5: (lv_unit_5_0= ruleEString )
                    {
                    // InternalPantryTextual.g:292:5: (lv_unit_5_0= ruleEString )
                    // InternalPantryTextual.g:293:6: lv_unit_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMassAccess().getUnitEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_unit_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMassRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_5_0,
                    							"org.example.PantryTextual.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMassAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleEFloat"
    // InternalPantryTextual.g:319:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalPantryTextual.g:319:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalPantryTextual.g:320:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalPantryTextual.g:326:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalPantryTextual.g:332:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalPantryTextual.g:333:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalPantryTextual.g:333:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalPantryTextual.g:334:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalPantryTextual.g:334:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPantryTextual.g:335:4: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPantryTextual.g:341:3: (this_INT_1= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPantryTextual.g:342:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_12); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,19,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_14); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalPantryTextual.g:362:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=20 && LA10_0<=21)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPantryTextual.g:363:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalPantryTextual.g:363:4: (kw= 'E' | kw= 'e' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==21) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalPantryTextual.g:364:5: kw= 'E'
                            {
                            kw=(Token)match(input,20,FOLLOW_15); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPantryTextual.g:370:5: kw= 'e'
                            {
                            kw=(Token)match(input,21,FOLLOW_15); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalPantryTextual.g:376:4: (kw= '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPantryTextual.g:377:5: kw= '-'
                            {
                            kw=(Token)match(input,18,FOLLOW_13); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEFloat"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040040L});

}