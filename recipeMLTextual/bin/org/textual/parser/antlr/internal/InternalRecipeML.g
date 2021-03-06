/*
 * generated by Xtext 2.23.0
 */
grammar InternalRecipeML;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.textual.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRecipe
entryRuleRecipe returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRecipeRule()); }
	iv_ruleRecipe=ruleRecipe
	{ $current=$iv_ruleRecipe.current; }
	EOF;

// Rule Recipe
ruleRecipe returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Recipe : '
		{
			newLeafNode(otherlv_0, grammarAccess.getRecipeAccess().getRecipeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.textual.RecipeML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='serves'
		{
			newLeafNode(otherlv_3, grammarAccess.getRecipeAccess().getServesKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getServesEIntParserRuleCall_4_0());
				}
				lv_serves_4_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					set(
						$current,
						"serves",
						lv_serves_4_0,
						"org.textual.RecipeML.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_5='ingredients : '
		{
			newLeafNode(otherlv_5, grammarAccess.getRecipeAccess().getIngredientsKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getBaseingsBaseIngParserRuleCall_6_0());
				}
				lv_baseings_6_0=ruleBaseIng
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					add(
						$current,
						"baseings",
						lv_baseings_6_0,
						"org.textual.RecipeML.BaseIng");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRecipeAccess().getBaseingsBaseIngParserRuleCall_7_1_0());
					}
					lv_baseings_8_0=ruleBaseIng
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecipeRule());
						}
						add(
							$current,
							"baseings",
							lv_baseings_8_0,
							"org.textual.RecipeML.BaseIng");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9='instructions :'
		{
			newLeafNode(otherlv_9, grammarAccess.getRecipeAccess().getInstructionsKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getMethodsMethodParserRuleCall_9_0());
				}
				lv_methods_10_0=ruleMethod
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					add(
						$current,
						"methods",
						lv_methods_10_0,
						"org.textual.RecipeML.Method");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_11=','
			{
				newLeafNode(otherlv_11, grammarAccess.getRecipeAccess().getCommaKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRecipeAccess().getMethodsMethodParserRuleCall_10_1_0());
					}
					lv_methods_12_0=ruleMethod
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecipeRule());
						}
						add(
							$current,
							"methods",
							lv_methods_12_0,
							"org.textual.RecipeML.Method");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleBaseIng
entryRuleBaseIng returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBaseIngRule()); }
	iv_ruleBaseIng=ruleBaseIng
	{ $current=$iv_ruleBaseIng.current; }
	EOF;

// Rule BaseIng
ruleBaseIng returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBaseIngAccess().getBaseIngAction_0(),
					$current);
			}
		)
		otherlv_1='BaseIng'
		{
			newLeafNode(otherlv_1, grammarAccess.getBaseIngAccess().getBaseIngKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBaseIngAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBaseIngRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.textual.RecipeML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getBaseIngAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='count'
			{
				newLeafNode(otherlv_4, grammarAccess.getBaseIngAccess().getCountKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBaseIngAccess().getCountEFloatParserRuleCall_4_1_0());
					}
					lv_count_5_0=ruleEFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBaseIngRule());
						}
						set(
							$current,
							"count",
							lv_count_5_0,
							"org.textual.RecipeML.EFloat");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='unit'
			{
				newLeafNode(otherlv_6, grammarAccess.getBaseIngAccess().getUnitKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBaseIngAccess().getUnitEStringParserRuleCall_5_1_0());
					}
					lv_unit_7_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBaseIngRule());
						}
						set(
							$current,
							"unit",
							lv_unit_7_0,
							"org.textual.RecipeML.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getBaseIngAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleMethod
entryRuleMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodRule()); }
	iv_ruleMethod=ruleMethod
	{ $current=$iv_ruleMethod.current; }
	EOF;

// Rule Method
ruleMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMethodAccess().getMethodAction_0(),
					$current);
			}
		)
		otherlv_1='Method'
		{
			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
		}
		(
			otherlv_2='step'
			{
				newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getStepKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodAccess().getStepEIntParserRuleCall_2_1_0());
					}
					lv_step_3_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodRule());
						}
						set(
							$current,
							"step",
							lv_step_3_0,
							"org.textual.RecipeML.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=':'
			{
				newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getColonKeyword_2_2());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_3_0());
				}
				lv_name_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					set(
						$current,
						"name",
						lv_name_5_0,
						"org.textual.RecipeML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6='-'
			{
				newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getHyphenMinusKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodAccess().getUsesAmountParserRuleCall_4_1_0());
					}
					lv_uses_7_0=ruleAmount
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodRule());
						}
						add(
							$current,
							"uses",
							lv_uses_7_0,
							"org.textual.RecipeML.Amount");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getCommaKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodAccess().getUsesAmountParserRuleCall_4_2_1_0());
						}
						lv_uses_9_0=ruleAmount
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodRule());
							}
							add(
								$current,
								"uses",
								lv_uses_9_0,
								"org.textual.RecipeML.Amount");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10='-'
			{
				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getHyphenMinusKeyword_4_3());
			}
		)?
		(
			otherlv_11='for'
			{
				newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getForKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodAccess().getTimeEIntParserRuleCall_5_1_0());
					}
					lv_time_12_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodRule());
						}
						set(
							$current,
							"time",
							lv_time_12_0,
							"org.textual.RecipeML.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13='minutes'
			{
				newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getMinutesKeyword_5_2());
			}
		)?
		(
			otherlv_14=':'
			{
				newLeafNode(otherlv_14, grammarAccess.getMethodAccess().getColonKeyword_6_0());
			}
			otherlv_15='{'
			{
				newLeafNode(otherlv_15, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6_1());
			}
			otherlv_16='we'
			{
				newLeafNode(otherlv_16, grammarAccess.getMethodAccess().getWeKeyword_6_2());
			}
			otherlv_17='obtain'
			{
				newLeafNode(otherlv_17, grammarAccess.getMethodAccess().getObtainKeyword_6_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodAccess().getCreatesModIngParserRuleCall_6_4_0());
					}
					lv_creates_18_0=ruleModIng
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodRule());
						}
						add(
							$current,
							"creates",
							lv_creates_18_0,
							"org.textual.RecipeML.ModIng");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_19=','
				{
					newLeafNode(otherlv_19, grammarAccess.getMethodAccess().getCommaKeyword_6_5_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodAccess().getCreatesModIngParserRuleCall_6_5_1_0());
						}
						lv_creates_20_0=ruleModIng
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodRule());
							}
							add(
								$current,
								"creates",
								lv_creates_20_0,
								"org.textual.RecipeML.ModIng");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_21='}'
			{
				newLeafNode(otherlv_21, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6_6());
			}
		)?
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEFloat
entryRuleEFloat returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEFloatRule()); }
	iv_ruleEFloat=ruleEFloat
	{ $current=$iv_ruleEFloat.current.getText(); }
	EOF;

// Rule EFloat
ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Entry rule entryRuleAmount
entryRuleAmount returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAmountRule()); }
	iv_ruleAmount=ruleAmount
	{ $current=$iv_ruleAmount.current; }
	EOF;

// Rule Amount
ruleAmount returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getAmountAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			otherlv_1='amount'
			{
				newLeafNode(otherlv_1, grammarAccess.getAmountAccess().getAmountKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAmountAccess().getQuantityEFloatParserRuleCall_1_1_0());
					}
					lv_quantity_2_0=ruleEFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAmountRule());
						}
						set(
							$current,
							"quantity",
							lv_quantity_2_0,
							"org.textual.RecipeML.EFloat");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_3='unit'
			{
				newLeafNode(otherlv_3, grammarAccess.getAmountAccess().getUnitKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAmountAccess().getUnitEStringParserRuleCall_2_1_0());
					}
					lv_unit_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAmountRule());
						}
						set(
							$current,
							"unit",
							lv_unit_4_0,
							"org.textual.RecipeML.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='of'
		{
			newLeafNode(otherlv_5, grammarAccess.getAmountAccess().getOfKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAmountRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAmountAccess().getAmountofIngredientCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getAmountAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleModIng
entryRuleModIng returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModIngRule()); }
	iv_ruleModIng=ruleModIng
	{ $current=$iv_ruleModIng.current; }
	EOF;

// Rule ModIng
ruleModIng returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getModIngAccess().getModIngAction_0(),
					$current);
			}
		)
		otherlv_1='ModIng'
		{
			newLeafNode(otherlv_1, grammarAccess.getModIngAccess().getModIngKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModIngAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModIngRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.textual.RecipeML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getModIngAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='count'
			{
				newLeafNode(otherlv_4, grammarAccess.getModIngAccess().getCountKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModIngAccess().getCountEFloatParserRuleCall_4_1_0());
					}
					lv_count_5_0=ruleEFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModIngRule());
						}
						set(
							$current,
							"count",
							lv_count_5_0,
							"org.textual.RecipeML.EFloat");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='unit'
			{
				newLeafNode(otherlv_6, grammarAccess.getModIngAccess().getUnitKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModIngAccess().getUnitEStringParserRuleCall_5_1_0());
					}
					lv_unit_7_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModIngRule());
						}
						set(
							$current,
							"unit",
							lv_unit_7_0,
							"org.textual.RecipeML.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getModIngAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
