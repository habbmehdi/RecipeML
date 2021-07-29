package org.textual.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.textual.services.RecipeMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecipeMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Recipe : '", "'{'", "'serves'", "'ingredients : '", "','", "'instructions :'", "'}'", "'BaseIng'", "'count'", "'unit'", "'Method'", "'step'", "':'", "'-'", "'for'", "'minutes'", "'we'", "'obtain'", "'.'", "'E'", "'e'", "'amount'", "'of'", "'ModIng'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRecipeMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRecipeMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRecipeMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRecipeML.g"; }



     	private RecipeMLGrammarAccess grammarAccess;

        public InternalRecipeMLParser(TokenStream input, RecipeMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Recipe";
       	}

       	@Override
       	protected RecipeMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRecipe"
    // InternalRecipeML.g:64:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalRecipeML.g:64:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalRecipeML.g:65:2: iv_ruleRecipe= ruleRecipe EOF
            {
             newCompositeNode(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecipe=ruleRecipe();

            state._fsp--;

             current =iv_ruleRecipe; 
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
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // InternalRecipeML.g:71:1: ruleRecipe returns [EObject current=null] : (otherlv_0= 'Recipe : ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'serves' ( (lv_serves_4_0= ruleEInt ) )? otherlv_5= 'ingredients : ' ( (lv_baseings_6_0= ruleBaseIng ) ) (otherlv_7= ',' ( (lv_baseings_8_0= ruleBaseIng ) ) )* otherlv_9= 'instructions :' ( (lv_methods_10_0= ruleMethod ) ) (otherlv_11= ',' ( (lv_methods_12_0= ruleMethod ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_serves_4_0 = null;

        EObject lv_baseings_6_0 = null;

        EObject lv_baseings_8_0 = null;

        EObject lv_methods_10_0 = null;

        EObject lv_methods_12_0 = null;



        	enterRule();

        try {
            // InternalRecipeML.g:77:2: ( (otherlv_0= 'Recipe : ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'serves' ( (lv_serves_4_0= ruleEInt ) )? otherlv_5= 'ingredients : ' ( (lv_baseings_6_0= ruleBaseIng ) ) (otherlv_7= ',' ( (lv_baseings_8_0= ruleBaseIng ) ) )* otherlv_9= 'instructions :' ( (lv_methods_10_0= ruleMethod ) ) (otherlv_11= ',' ( (lv_methods_12_0= ruleMethod ) ) )* otherlv_13= '}' ) )
            // InternalRecipeML.g:78:2: (otherlv_0= 'Recipe : ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'serves' ( (lv_serves_4_0= ruleEInt ) )? otherlv_5= 'ingredients : ' ( (lv_baseings_6_0= ruleBaseIng ) ) (otherlv_7= ',' ( (lv_baseings_8_0= ruleBaseIng ) ) )* otherlv_9= 'instructions :' ( (lv_methods_10_0= ruleMethod ) ) (otherlv_11= ',' ( (lv_methods_12_0= ruleMethod ) ) )* otherlv_13= '}' )
            {
            // InternalRecipeML.g:78:2: (otherlv_0= 'Recipe : ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'serves' ( (lv_serves_4_0= ruleEInt ) )? otherlv_5= 'ingredients : ' ( (lv_baseings_6_0= ruleBaseIng ) ) (otherlv_7= ',' ( (lv_baseings_8_0= ruleBaseIng ) ) )* otherlv_9= 'instructions :' ( (lv_methods_10_0= ruleMethod ) ) (otherlv_11= ',' ( (lv_methods_12_0= ruleMethod ) ) )* otherlv_13= '}' )
            // InternalRecipeML.g:79:3: otherlv_0= 'Recipe : ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'serves' ( (lv_serves_4_0= ruleEInt ) )? otherlv_5= 'ingredients : ' ( (lv_baseings_6_0= ruleBaseIng ) ) (otherlv_7= ',' ( (lv_baseings_8_0= ruleBaseIng ) ) )* otherlv_9= 'instructions :' ( (lv_methods_10_0= ruleMethod ) ) (otherlv_11= ',' ( (lv_methods_12_0= ruleMethod ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeAccess().getRecipeKeyword_0());
            		
            // InternalRecipeML.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRecipeML.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalRecipeML.g:84:4: (lv_name_1_0= ruleEString )
            // InternalRecipeML.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.textual.RecipeML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRecipeAccess().getServesKeyword_3());
            		
            // InternalRecipeML.g:110:3: ( (lv_serves_4_0= ruleEInt ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT||LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRecipeML.g:111:4: (lv_serves_4_0= ruleEInt )
                    {
                    // InternalRecipeML.g:111:4: (lv_serves_4_0= ruleEInt )
                    // InternalRecipeML.g:112:5: lv_serves_4_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getRecipeAccess().getServesEIntParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_serves_4_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRecipeRule());
                    					}
                    					set(
                    						current,
                    						"serves",
                    						lv_serves_4_0,
                    						"org.textual.RecipeML.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRecipeAccess().getIngredientsKeyword_5());
            		
            // InternalRecipeML.g:133:3: ( (lv_baseings_6_0= ruleBaseIng ) )
            // InternalRecipeML.g:134:4: (lv_baseings_6_0= ruleBaseIng )
            {
            // InternalRecipeML.g:134:4: (lv_baseings_6_0= ruleBaseIng )
            // InternalRecipeML.g:135:5: lv_baseings_6_0= ruleBaseIng
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getBaseingsBaseIngParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_baseings_6_0=ruleBaseIng();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"baseings",
            						lv_baseings_6_0,
            						"org.textual.RecipeML.BaseIng");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipeML.g:152:3: (otherlv_7= ',' ( (lv_baseings_8_0= ruleBaseIng ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRecipeML.g:153:4: otherlv_7= ',' ( (lv_baseings_8_0= ruleBaseIng ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRecipeML.g:157:4: ( (lv_baseings_8_0= ruleBaseIng ) )
            	    // InternalRecipeML.g:158:5: (lv_baseings_8_0= ruleBaseIng )
            	    {
            	    // InternalRecipeML.g:158:5: (lv_baseings_8_0= ruleBaseIng )
            	    // InternalRecipeML.g:159:6: lv_baseings_8_0= ruleBaseIng
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeAccess().getBaseingsBaseIngParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_baseings_8_0=ruleBaseIng();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"baseings",
            	    							lv_baseings_8_0,
            	    							"org.textual.RecipeML.BaseIng");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getRecipeAccess().getInstructionsKeyword_8());
            		
            // InternalRecipeML.g:181:3: ( (lv_methods_10_0= ruleMethod ) )
            // InternalRecipeML.g:182:4: (lv_methods_10_0= ruleMethod )
            {
            // InternalRecipeML.g:182:4: (lv_methods_10_0= ruleMethod )
            // InternalRecipeML.g:183:5: lv_methods_10_0= ruleMethod
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getMethodsMethodParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_methods_10_0=ruleMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"methods",
            						lv_methods_10_0,
            						"org.textual.RecipeML.Method");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipeML.g:200:3: (otherlv_11= ',' ( (lv_methods_12_0= ruleMethod ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRecipeML.g:201:4: otherlv_11= ',' ( (lv_methods_12_0= ruleMethod ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_11, grammarAccess.getRecipeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalRecipeML.g:205:4: ( (lv_methods_12_0= ruleMethod ) )
            	    // InternalRecipeML.g:206:5: (lv_methods_12_0= ruleMethod )
            	    {
            	    // InternalRecipeML.g:206:5: (lv_methods_12_0= ruleMethod )
            	    // InternalRecipeML.g:207:6: lv_methods_12_0= ruleMethod
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeAccess().getMethodsMethodParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_methods_12_0=ruleMethod();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"methods",
            	    							lv_methods_12_0,
            	    							"org.textual.RecipeML.Method");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleBaseIng"
    // InternalRecipeML.g:233:1: entryRuleBaseIng returns [EObject current=null] : iv_ruleBaseIng= ruleBaseIng EOF ;
    public final EObject entryRuleBaseIng() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseIng = null;


        try {
            // InternalRecipeML.g:233:48: (iv_ruleBaseIng= ruleBaseIng EOF )
            // InternalRecipeML.g:234:2: iv_ruleBaseIng= ruleBaseIng EOF
            {
             newCompositeNode(grammarAccess.getBaseIngRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseIng=ruleBaseIng();

            state._fsp--;

             current =iv_ruleBaseIng; 
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
    // $ANTLR end "entryRuleBaseIng"


    // $ANTLR start "ruleBaseIng"
    // InternalRecipeML.g:240:1: ruleBaseIng returns [EObject current=null] : ( () otherlv_1= 'BaseIng' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )? (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleBaseIng() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_count_5_0 = null;

        AntlrDatatypeRuleToken lv_unit_7_0 = null;



        	enterRule();

        try {
            // InternalRecipeML.g:246:2: ( ( () otherlv_1= 'BaseIng' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )? (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalRecipeML.g:247:2: ( () otherlv_1= 'BaseIng' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )? (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalRecipeML.g:247:2: ( () otherlv_1= 'BaseIng' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )? (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalRecipeML.g:248:3: () otherlv_1= 'BaseIng' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )? (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalRecipeML.g:248:3: ()
            // InternalRecipeML.g:249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseIngAccess().getBaseIngAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseIngAccess().getBaseIngKeyword_1());
            		
            // InternalRecipeML.g:259:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRecipeML.g:260:4: (lv_name_2_0= ruleEString )
            {
            // InternalRecipeML.g:260:4: (lv_name_2_0= ruleEString )
            // InternalRecipeML.g:261:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBaseIngAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseIngRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.textual.RecipeML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getBaseIngAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRecipeML.g:282:3: (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRecipeML.g:283:4: otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseIngAccess().getCountKeyword_4_0());
                    			
                    // InternalRecipeML.g:287:4: ( (lv_count_5_0= ruleEFloat ) )
                    // InternalRecipeML.g:288:5: (lv_count_5_0= ruleEFloat )
                    {
                    // InternalRecipeML.g:288:5: (lv_count_5_0= ruleEFloat )
                    // InternalRecipeML.g:289:6: lv_count_5_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getBaseIngAccess().getCountEFloatParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_count_5_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseIngRule());
                    						}
                    						set(
                    							current,
                    							"count",
                    							lv_count_5_0,
                    							"org.textual.RecipeML.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRecipeML.g:307:3: (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRecipeML.g:308:4: otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getBaseIngAccess().getUnitKeyword_5_0());
                    			
                    // InternalRecipeML.g:312:4: ( (lv_unit_7_0= ruleEString ) )
                    // InternalRecipeML.g:313:5: (lv_unit_7_0= ruleEString )
                    {
                    // InternalRecipeML.g:313:5: (lv_unit_7_0= ruleEString )
                    // InternalRecipeML.g:314:6: lv_unit_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBaseIngAccess().getUnitEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_unit_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseIngRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_7_0,
                    							"org.textual.RecipeML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBaseIngAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleBaseIng"


    // $ANTLR start "entryRuleMethod"
    // InternalRecipeML.g:340:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalRecipeML.g:340:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalRecipeML.g:341:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalRecipeML.g:347:1: ruleMethod returns [EObject current=null] : ( () otherlv_1= 'Method' (otherlv_2= 'step' ( (lv_step_3_0= ruleEInt ) ) otherlv_4= ':' )? ( (lv_name_5_0= ruleEString ) ) (otherlv_6= '-' ( (lv_uses_7_0= ruleAmount ) ) (otherlv_8= ',' ( (lv_uses_9_0= ruleAmount ) ) )* otherlv_10= '-' )? (otherlv_11= 'for' ( (lv_time_12_0= ruleEInt ) ) otherlv_13= 'minutes' )? (otherlv_14= ':' otherlv_15= '{' otherlv_16= 'we' otherlv_17= 'obtain' ( (lv_creates_18_0= ruleModIng ) ) (otherlv_19= ',' ( (lv_creates_20_0= ruleModIng ) ) )* otherlv_21= '}' )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_step_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_uses_7_0 = null;

        EObject lv_uses_9_0 = null;

        AntlrDatatypeRuleToken lv_time_12_0 = null;

        EObject lv_creates_18_0 = null;

        EObject lv_creates_20_0 = null;



        	enterRule();

        try {
            // InternalRecipeML.g:353:2: ( ( () otherlv_1= 'Method' (otherlv_2= 'step' ( (lv_step_3_0= ruleEInt ) ) otherlv_4= ':' )? ( (lv_name_5_0= ruleEString ) ) (otherlv_6= '-' ( (lv_uses_7_0= ruleAmount ) ) (otherlv_8= ',' ( (lv_uses_9_0= ruleAmount ) ) )* otherlv_10= '-' )? (otherlv_11= 'for' ( (lv_time_12_0= ruleEInt ) ) otherlv_13= 'minutes' )? (otherlv_14= ':' otherlv_15= '{' otherlv_16= 'we' otherlv_17= 'obtain' ( (lv_creates_18_0= ruleModIng ) ) (otherlv_19= ',' ( (lv_creates_20_0= ruleModIng ) ) )* otherlv_21= '}' )? ) )
            // InternalRecipeML.g:354:2: ( () otherlv_1= 'Method' (otherlv_2= 'step' ( (lv_step_3_0= ruleEInt ) ) otherlv_4= ':' )? ( (lv_name_5_0= ruleEString ) ) (otherlv_6= '-' ( (lv_uses_7_0= ruleAmount ) ) (otherlv_8= ',' ( (lv_uses_9_0= ruleAmount ) ) )* otherlv_10= '-' )? (otherlv_11= 'for' ( (lv_time_12_0= ruleEInt ) ) otherlv_13= 'minutes' )? (otherlv_14= ':' otherlv_15= '{' otherlv_16= 'we' otherlv_17= 'obtain' ( (lv_creates_18_0= ruleModIng ) ) (otherlv_19= ',' ( (lv_creates_20_0= ruleModIng ) ) )* otherlv_21= '}' )? )
            {
            // InternalRecipeML.g:354:2: ( () otherlv_1= 'Method' (otherlv_2= 'step' ( (lv_step_3_0= ruleEInt ) ) otherlv_4= ':' )? ( (lv_name_5_0= ruleEString ) ) (otherlv_6= '-' ( (lv_uses_7_0= ruleAmount ) ) (otherlv_8= ',' ( (lv_uses_9_0= ruleAmount ) ) )* otherlv_10= '-' )? (otherlv_11= 'for' ( (lv_time_12_0= ruleEInt ) ) otherlv_13= 'minutes' )? (otherlv_14= ':' otherlv_15= '{' otherlv_16= 'we' otherlv_17= 'obtain' ( (lv_creates_18_0= ruleModIng ) ) (otherlv_19= ',' ( (lv_creates_20_0= ruleModIng ) ) )* otherlv_21= '}' )? )
            // InternalRecipeML.g:355:3: () otherlv_1= 'Method' (otherlv_2= 'step' ( (lv_step_3_0= ruleEInt ) ) otherlv_4= ':' )? ( (lv_name_5_0= ruleEString ) ) (otherlv_6= '-' ( (lv_uses_7_0= ruleAmount ) ) (otherlv_8= ',' ( (lv_uses_9_0= ruleAmount ) ) )* otherlv_10= '-' )? (otherlv_11= 'for' ( (lv_time_12_0= ruleEInt ) ) otherlv_13= 'minutes' )? (otherlv_14= ':' otherlv_15= '{' otherlv_16= 'we' otherlv_17= 'obtain' ( (lv_creates_18_0= ruleModIng ) ) (otherlv_19= ',' ( (lv_creates_20_0= ruleModIng ) ) )* otherlv_21= '}' )?
            {
            // InternalRecipeML.g:355:3: ()
            // InternalRecipeML.g:356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
            		
            // InternalRecipeML.g:366:3: (otherlv_2= 'step' ( (lv_step_3_0= ruleEInt ) ) otherlv_4= ':' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRecipeML.g:367:4: otherlv_2= 'step' ( (lv_step_3_0= ruleEInt ) ) otherlv_4= ':'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getStepKeyword_2_0());
                    			
                    // InternalRecipeML.g:371:4: ( (lv_step_3_0= ruleEInt ) )
                    // InternalRecipeML.g:372:5: (lv_step_3_0= ruleEInt )
                    {
                    // InternalRecipeML.g:372:5: (lv_step_3_0= ruleEInt )
                    // InternalRecipeML.g:373:6: lv_step_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getStepEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_step_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						set(
                    							current,
                    							"step",
                    							lv_step_3_0,
                    							"org.textual.RecipeML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getColonKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalRecipeML.g:395:3: ( (lv_name_5_0= ruleEString ) )
            // InternalRecipeML.g:396:4: (lv_name_5_0= ruleEString )
            {
            // InternalRecipeML.g:396:4: (lv_name_5_0= ruleEString )
            // InternalRecipeML.g:397:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.textual.RecipeML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipeML.g:414:3: (otherlv_6= '-' ( (lv_uses_7_0= ruleAmount ) ) (otherlv_8= ',' ( (lv_uses_9_0= ruleAmount ) ) )* otherlv_10= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRecipeML.g:415:4: otherlv_6= '-' ( (lv_uses_7_0= ruleAmount ) ) (otherlv_8= ',' ( (lv_uses_9_0= ruleAmount ) ) )* otherlv_10= '-'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getHyphenMinusKeyword_4_0());
                    			
                    // InternalRecipeML.g:419:4: ( (lv_uses_7_0= ruleAmount ) )
                    // InternalRecipeML.g:420:5: (lv_uses_7_0= ruleAmount )
                    {
                    // InternalRecipeML.g:420:5: (lv_uses_7_0= ruleAmount )
                    // InternalRecipeML.g:421:6: lv_uses_7_0= ruleAmount
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getUsesAmountParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_uses_7_0=ruleAmount();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"uses",
                    							lv_uses_7_0,
                    							"org.textual.RecipeML.Amount");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRecipeML.g:438:4: (otherlv_8= ',' ( (lv_uses_9_0= ruleAmount ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRecipeML.g:439:5: otherlv_8= ',' ( (lv_uses_9_0= ruleAmount ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalRecipeML.g:443:5: ( (lv_uses_9_0= ruleAmount ) )
                    	    // InternalRecipeML.g:444:6: (lv_uses_9_0= ruleAmount )
                    	    {
                    	    // InternalRecipeML.g:444:6: (lv_uses_9_0= ruleAmount )
                    	    // InternalRecipeML.g:445:7: lv_uses_9_0= ruleAmount
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getUsesAmountParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_uses_9_0=ruleAmount();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"uses",
                    	    								lv_uses_9_0,
                    	    								"org.textual.RecipeML.Amount");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getHyphenMinusKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalRecipeML.g:468:3: (otherlv_11= 'for' ( (lv_time_12_0= ruleEInt ) ) otherlv_13= 'minutes' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRecipeML.g:469:4: otherlv_11= 'for' ( (lv_time_12_0= ruleEInt ) ) otherlv_13= 'minutes'
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getForKeyword_5_0());
                    			
                    // InternalRecipeML.g:473:4: ( (lv_time_12_0= ruleEInt ) )
                    // InternalRecipeML.g:474:5: (lv_time_12_0= ruleEInt )
                    {
                    // InternalRecipeML.g:474:5: (lv_time_12_0= ruleEInt )
                    // InternalRecipeML.g:475:6: lv_time_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getTimeEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_time_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_12_0,
                    							"org.textual.RecipeML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getMinutesKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalRecipeML.g:497:3: (otherlv_14= ':' otherlv_15= '{' otherlv_16= 'we' otherlv_17= 'obtain' ( (lv_creates_18_0= ruleModIng ) ) (otherlv_19= ',' ( (lv_creates_20_0= ruleModIng ) ) )* otherlv_21= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRecipeML.g:498:4: otherlv_14= ':' otherlv_15= '{' otherlv_16= 'we' otherlv_17= 'obtain' ( (lv_creates_18_0= ruleModIng ) ) (otherlv_19= ',' ( (lv_creates_20_0= ruleModIng ) ) )* otherlv_21= '}'
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getMethodAccess().getColonKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_15, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    otherlv_16=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getMethodAccess().getWeKeyword_6_2());
                    			
                    otherlv_17=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_17, grammarAccess.getMethodAccess().getObtainKeyword_6_3());
                    			
                    // InternalRecipeML.g:514:4: ( (lv_creates_18_0= ruleModIng ) )
                    // InternalRecipeML.g:515:5: (lv_creates_18_0= ruleModIng )
                    {
                    // InternalRecipeML.g:515:5: (lv_creates_18_0= ruleModIng )
                    // InternalRecipeML.g:516:6: lv_creates_18_0= ruleModIng
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getCreatesModIngParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_creates_18_0=ruleModIng();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"creates",
                    							lv_creates_18_0,
                    							"org.textual.RecipeML.ModIng");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRecipeML.g:533:4: (otherlv_19= ',' ( (lv_creates_20_0= ruleModIng ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRecipeML.g:534:5: otherlv_19= ',' ( (lv_creates_20_0= ruleModIng ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_26); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getMethodAccess().getCommaKeyword_6_5_0());
                    	    				
                    	    // InternalRecipeML.g:538:5: ( (lv_creates_20_0= ruleModIng ) )
                    	    // InternalRecipeML.g:539:6: (lv_creates_20_0= ruleModIng )
                    	    {
                    	    // InternalRecipeML.g:539:6: (lv_creates_20_0= ruleModIng )
                    	    // InternalRecipeML.g:540:7: lv_creates_20_0= ruleModIng
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getCreatesModIngParserRuleCall_6_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_creates_20_0=ruleModIng();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"creates",
                    	    								lv_creates_20_0,
                    	    								"org.textual.RecipeML.ModIng");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6_6());
                    			

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleEString"
    // InternalRecipeML.g:567:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRecipeML.g:567:47: (iv_ruleEString= ruleEString EOF )
            // InternalRecipeML.g:568:2: iv_ruleEString= ruleEString EOF
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
    // InternalRecipeML.g:574:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRecipeML.g:580:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRecipeML.g:581:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRecipeML.g:581:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRecipeML.g:582:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRecipeML.g:590:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalRecipeML.g:601:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRecipeML.g:601:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRecipeML.g:602:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRecipeML.g:608:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRecipeML.g:614:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRecipeML.g:615:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRecipeML.g:615:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRecipeML.g:616:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRecipeML.g:616:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRecipeML.g:617:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalRecipeML.g:634:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalRecipeML.g:634:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalRecipeML.g:635:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalRecipeML.g:641:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalRecipeML.g:647:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalRecipeML.g:648:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalRecipeML.g:648:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalRecipeML.g:649:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalRecipeML.g:649:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRecipeML.g:650:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalRecipeML.g:656:3: (this_INT_1= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRecipeML.g:657:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_29); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,29,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_30); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalRecipeML.g:677:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=30 && LA18_0<=31)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRecipeML.g:678:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalRecipeML.g:678:4: (kw= 'E' | kw= 'e' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==30) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==31) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalRecipeML.g:679:5: kw= 'E'
                            {
                            kw=(Token)match(input,30,FOLLOW_17); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRecipeML.g:685:5: kw= 'e'
                            {
                            kw=(Token)match(input,31,FOLLOW_17); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalRecipeML.g:691:4: (kw= '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalRecipeML.g:692:5: kw= '-'
                            {
                            kw=(Token)match(input,24,FOLLOW_27); 

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


    // $ANTLR start "entryRuleAmount"
    // InternalRecipeML.g:710:1: entryRuleAmount returns [EObject current=null] : iv_ruleAmount= ruleAmount EOF ;
    public final EObject entryRuleAmount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmount = null;


        try {
            // InternalRecipeML.g:710:47: (iv_ruleAmount= ruleAmount EOF )
            // InternalRecipeML.g:711:2: iv_ruleAmount= ruleAmount EOF
            {
             newCompositeNode(grammarAccess.getAmountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmount=ruleAmount();

            state._fsp--;

             current =iv_ruleAmount; 
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
    // $ANTLR end "entryRuleAmount"


    // $ANTLR start "ruleAmount"
    // InternalRecipeML.g:717:1: ruleAmount returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'amount' ( (lv_quantity_2_0= ruleEFloat ) ) )? (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? otherlv_5= 'of' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleAmount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_quantity_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalRecipeML.g:723:2: ( (otherlv_0= '{' (otherlv_1= 'amount' ( (lv_quantity_2_0= ruleEFloat ) ) )? (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? otherlv_5= 'of' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalRecipeML.g:724:2: (otherlv_0= '{' (otherlv_1= 'amount' ( (lv_quantity_2_0= ruleEFloat ) ) )? (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? otherlv_5= 'of' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalRecipeML.g:724:2: (otherlv_0= '{' (otherlv_1= 'amount' ( (lv_quantity_2_0= ruleEFloat ) ) )? (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? otherlv_5= 'of' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalRecipeML.g:725:3: otherlv_0= '{' (otherlv_1= 'amount' ( (lv_quantity_2_0= ruleEFloat ) ) )? (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? otherlv_5= 'of' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getAmountAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRecipeML.g:729:3: (otherlv_1= 'amount' ( (lv_quantity_2_0= ruleEFloat ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRecipeML.g:730:4: otherlv_1= 'amount' ( (lv_quantity_2_0= ruleEFloat ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getAmountAccess().getAmountKeyword_1_0());
                    			
                    // InternalRecipeML.g:734:4: ( (lv_quantity_2_0= ruleEFloat ) )
                    // InternalRecipeML.g:735:5: (lv_quantity_2_0= ruleEFloat )
                    {
                    // InternalRecipeML.g:735:5: (lv_quantity_2_0= ruleEFloat )
                    // InternalRecipeML.g:736:6: lv_quantity_2_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getAmountAccess().getQuantityEFloatParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_quantity_2_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmountRule());
                    						}
                    						set(
                    							current,
                    							"quantity",
                    							lv_quantity_2_0,
                    							"org.textual.RecipeML.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRecipeML.g:754:3: (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRecipeML.g:755:4: otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAmountAccess().getUnitKeyword_2_0());
                    			
                    // InternalRecipeML.g:759:4: ( (lv_unit_4_0= ruleEString ) )
                    // InternalRecipeML.g:760:5: (lv_unit_4_0= ruleEString )
                    {
                    // InternalRecipeML.g:760:5: (lv_unit_4_0= ruleEString )
                    // InternalRecipeML.g:761:6: lv_unit_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAmountAccess().getUnitEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_unit_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmountRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_4_0,
                    							"org.textual.RecipeML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAmountAccess().getOfKeyword_3());
            		
            // InternalRecipeML.g:783:3: ( ( ruleEString ) )
            // InternalRecipeML.g:784:4: ( ruleEString )
            {
            // InternalRecipeML.g:784:4: ( ruleEString )
            // InternalRecipeML.g:785:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAmountRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAmountAccess().getAmountofIngredientCrossReference_4_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAmountAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAmount"


    // $ANTLR start "entryRuleModIng"
    // InternalRecipeML.g:807:1: entryRuleModIng returns [EObject current=null] : iv_ruleModIng= ruleModIng EOF ;
    public final EObject entryRuleModIng() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModIng = null;


        try {
            // InternalRecipeML.g:807:47: (iv_ruleModIng= ruleModIng EOF )
            // InternalRecipeML.g:808:2: iv_ruleModIng= ruleModIng EOF
            {
             newCompositeNode(grammarAccess.getModIngRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModIng=ruleModIng();

            state._fsp--;

             current =iv_ruleModIng; 
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
    // $ANTLR end "entryRuleModIng"


    // $ANTLR start "ruleModIng"
    // InternalRecipeML.g:814:1: ruleModIng returns [EObject current=null] : ( () otherlv_1= 'ModIng' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )? (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleModIng() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_count_5_0 = null;

        AntlrDatatypeRuleToken lv_unit_7_0 = null;



        	enterRule();

        try {
            // InternalRecipeML.g:820:2: ( ( () otherlv_1= 'ModIng' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )? (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalRecipeML.g:821:2: ( () otherlv_1= 'ModIng' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )? (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalRecipeML.g:821:2: ( () otherlv_1= 'ModIng' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )? (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalRecipeML.g:822:3: () otherlv_1= 'ModIng' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )? (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalRecipeML.g:822:3: ()
            // InternalRecipeML.g:823:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModIngAccess().getModIngAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModIngAccess().getModIngKeyword_1());
            		
            // InternalRecipeML.g:833:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRecipeML.g:834:4: (lv_name_2_0= ruleEString )
            {
            // InternalRecipeML.g:834:4: (lv_name_2_0= ruleEString )
            // InternalRecipeML.g:835:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModIngAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModIngRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.textual.RecipeML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getModIngAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRecipeML.g:856:3: (otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRecipeML.g:857:4: otherlv_4= 'count' ( (lv_count_5_0= ruleEFloat ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getModIngAccess().getCountKeyword_4_0());
                    			
                    // InternalRecipeML.g:861:4: ( (lv_count_5_0= ruleEFloat ) )
                    // InternalRecipeML.g:862:5: (lv_count_5_0= ruleEFloat )
                    {
                    // InternalRecipeML.g:862:5: (lv_count_5_0= ruleEFloat )
                    // InternalRecipeML.g:863:6: lv_count_5_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getModIngAccess().getCountEFloatParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_count_5_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModIngRule());
                    						}
                    						set(
                    							current,
                    							"count",
                    							lv_count_5_0,
                    							"org.textual.RecipeML.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRecipeML.g:881:3: (otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRecipeML.g:882:4: otherlv_6= 'unit' ( (lv_unit_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getModIngAccess().getUnitKeyword_5_0());
                    			
                    // InternalRecipeML.g:886:4: ( (lv_unit_7_0= ruleEString ) )
                    // InternalRecipeML.g:887:5: (lv_unit_7_0= ruleEString )
                    {
                    // InternalRecipeML.g:887:5: (lv_unit_7_0= ruleEString )
                    // InternalRecipeML.g:888:6: lv_unit_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModIngAccess().getUnitEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_unit_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModIngRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_7_0,
                    							"org.textual.RecipeML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getModIngAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleModIng"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001004040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000021000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});

}