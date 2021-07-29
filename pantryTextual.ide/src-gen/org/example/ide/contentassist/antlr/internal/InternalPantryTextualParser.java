package org.example.ide.contentassist.antlr.internal;

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
import org.example.services.PantryTextualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPantryTextualParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Pantry:'", "','", "':'", "'{'", "'}'", "'amount'", "'unit'", "'-'", "'.'"
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

    	public void setGrammarAccess(PantryTextualGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePantry"
    // InternalPantryTextual.g:53:1: entryRulePantry : rulePantry EOF ;
    public final void entryRulePantry() throws RecognitionException {
        try {
            // InternalPantryTextual.g:54:1: ( rulePantry EOF )
            // InternalPantryTextual.g:55:1: rulePantry EOF
            {
             before(grammarAccess.getPantryRule()); 
            pushFollow(FOLLOW_1);
            rulePantry();

            state._fsp--;

             after(grammarAccess.getPantryRule()); 
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
    // $ANTLR end "entryRulePantry"


    // $ANTLR start "rulePantry"
    // InternalPantryTextual.g:62:1: rulePantry : ( ( rule__Pantry__Group__0 ) ) ;
    public final void rulePantry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:66:2: ( ( ( rule__Pantry__Group__0 ) ) )
            // InternalPantryTextual.g:67:2: ( ( rule__Pantry__Group__0 ) )
            {
            // InternalPantryTextual.g:67:2: ( ( rule__Pantry__Group__0 ) )
            // InternalPantryTextual.g:68:3: ( rule__Pantry__Group__0 )
            {
             before(grammarAccess.getPantryAccess().getGroup()); 
            // InternalPantryTextual.g:69:3: ( rule__Pantry__Group__0 )
            // InternalPantryTextual.g:69:4: rule__Pantry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pantry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPantryAccess().getGroup()); 

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
    // $ANTLR end "rulePantry"


    // $ANTLR start "entryRuleIngredient"
    // InternalPantryTextual.g:78:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalPantryTextual.g:79:1: ( ruleIngredient EOF )
            // InternalPantryTextual.g:80:1: ruleIngredient EOF
            {
             before(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientRule()); 
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
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalPantryTextual.g:87:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:91:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // InternalPantryTextual.g:92:2: ( ( rule__Ingredient__Group__0 ) )
            {
            // InternalPantryTextual.g:92:2: ( ( rule__Ingredient__Group__0 ) )
            // InternalPantryTextual.g:93:3: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // InternalPantryTextual.g:94:3: ( rule__Ingredient__Group__0 )
            // InternalPantryTextual.g:94:4: rule__Ingredient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getGroup()); 

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
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleEString"
    // InternalPantryTextual.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPantryTextual.g:104:1: ( ruleEString EOF )
            // InternalPantryTextual.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPantryTextual.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPantryTextual.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPantryTextual.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalPantryTextual.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPantryTextual.g:119:3: ( rule__EString__Alternatives )
            // InternalPantryTextual.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMass"
    // InternalPantryTextual.g:128:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalPantryTextual.g:129:1: ( ruleMass EOF )
            // InternalPantryTextual.g:130:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
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
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalPantryTextual.g:137:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:141:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalPantryTextual.g:142:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalPantryTextual.g:142:2: ( ( rule__Mass__Group__0 ) )
            // InternalPantryTextual.g:143:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalPantryTextual.g:144:3: ( rule__Mass__Group__0 )
            // InternalPantryTextual.g:144:4: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getGroup()); 

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
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleEFloat"
    // InternalPantryTextual.g:153:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalPantryTextual.g:154:1: ( ruleEFloat EOF )
            // InternalPantryTextual.g:155:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalPantryTextual.g:162:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:166:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalPantryTextual.g:167:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalPantryTextual.g:167:2: ( ( rule__EFloat__Group__0 ) )
            // InternalPantryTextual.g:168:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalPantryTextual.g:169:3: ( rule__EFloat__Group__0 )
            // InternalPantryTextual.g:169:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPantryTextual.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPantryTextual.g:182:2: ( RULE_STRING )
                    {
                    // InternalPantryTextual.g:182:2: ( RULE_STRING )
                    // InternalPantryTextual.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPantryTextual.g:188:2: ( RULE_ID )
                    {
                    // InternalPantryTextual.g:188:2: ( RULE_ID )
                    // InternalPantryTextual.g:189:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalPantryTextual.g:198:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:202:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPantryTextual.g:203:2: ( 'E' )
                    {
                    // InternalPantryTextual.g:203:2: ( 'E' )
                    // InternalPantryTextual.g:204:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPantryTextual.g:209:2: ( 'e' )
                    {
                    // InternalPantryTextual.g:209:2: ( 'e' )
                    // InternalPantryTextual.g:210:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__Pantry__Group__0"
    // InternalPantryTextual.g:219:1: rule__Pantry__Group__0 : rule__Pantry__Group__0__Impl rule__Pantry__Group__1 ;
    public final void rule__Pantry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:223:1: ( rule__Pantry__Group__0__Impl rule__Pantry__Group__1 )
            // InternalPantryTextual.g:224:2: rule__Pantry__Group__0__Impl rule__Pantry__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Pantry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pantry__Group__1();

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
    // $ANTLR end "rule__Pantry__Group__0"


    // $ANTLR start "rule__Pantry__Group__0__Impl"
    // InternalPantryTextual.g:231:1: rule__Pantry__Group__0__Impl : ( 'Pantry:' ) ;
    public final void rule__Pantry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:235:1: ( ( 'Pantry:' ) )
            // InternalPantryTextual.g:236:1: ( 'Pantry:' )
            {
            // InternalPantryTextual.g:236:1: ( 'Pantry:' )
            // InternalPantryTextual.g:237:2: 'Pantry:'
            {
             before(grammarAccess.getPantryAccess().getPantryKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPantryAccess().getPantryKeyword_0()); 

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
    // $ANTLR end "rule__Pantry__Group__0__Impl"


    // $ANTLR start "rule__Pantry__Group__1"
    // InternalPantryTextual.g:246:1: rule__Pantry__Group__1 : rule__Pantry__Group__1__Impl rule__Pantry__Group__2 ;
    public final void rule__Pantry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:250:1: ( rule__Pantry__Group__1__Impl rule__Pantry__Group__2 )
            // InternalPantryTextual.g:251:2: rule__Pantry__Group__1__Impl rule__Pantry__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Pantry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pantry__Group__2();

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
    // $ANTLR end "rule__Pantry__Group__1"


    // $ANTLR start "rule__Pantry__Group__1__Impl"
    // InternalPantryTextual.g:258:1: rule__Pantry__Group__1__Impl : ( ( rule__Pantry__IngredientAssignment_1 ) ) ;
    public final void rule__Pantry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:262:1: ( ( ( rule__Pantry__IngredientAssignment_1 ) ) )
            // InternalPantryTextual.g:263:1: ( ( rule__Pantry__IngredientAssignment_1 ) )
            {
            // InternalPantryTextual.g:263:1: ( ( rule__Pantry__IngredientAssignment_1 ) )
            // InternalPantryTextual.g:264:2: ( rule__Pantry__IngredientAssignment_1 )
            {
             before(grammarAccess.getPantryAccess().getIngredientAssignment_1()); 
            // InternalPantryTextual.g:265:2: ( rule__Pantry__IngredientAssignment_1 )
            // InternalPantryTextual.g:265:3: rule__Pantry__IngredientAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pantry__IngredientAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPantryAccess().getIngredientAssignment_1()); 

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
    // $ANTLR end "rule__Pantry__Group__1__Impl"


    // $ANTLR start "rule__Pantry__Group__2"
    // InternalPantryTextual.g:273:1: rule__Pantry__Group__2 : rule__Pantry__Group__2__Impl ;
    public final void rule__Pantry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:277:1: ( rule__Pantry__Group__2__Impl )
            // InternalPantryTextual.g:278:2: rule__Pantry__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pantry__Group__2__Impl();

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
    // $ANTLR end "rule__Pantry__Group__2"


    // $ANTLR start "rule__Pantry__Group__2__Impl"
    // InternalPantryTextual.g:284:1: rule__Pantry__Group__2__Impl : ( ( rule__Pantry__Group_2__0 )* ) ;
    public final void rule__Pantry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:288:1: ( ( ( rule__Pantry__Group_2__0 )* ) )
            // InternalPantryTextual.g:289:1: ( ( rule__Pantry__Group_2__0 )* )
            {
            // InternalPantryTextual.g:289:1: ( ( rule__Pantry__Group_2__0 )* )
            // InternalPantryTextual.g:290:2: ( rule__Pantry__Group_2__0 )*
            {
             before(grammarAccess.getPantryAccess().getGroup_2()); 
            // InternalPantryTextual.g:291:2: ( rule__Pantry__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPantryTextual.g:291:3: rule__Pantry__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Pantry__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPantryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Pantry__Group__2__Impl"


    // $ANTLR start "rule__Pantry__Group_2__0"
    // InternalPantryTextual.g:300:1: rule__Pantry__Group_2__0 : rule__Pantry__Group_2__0__Impl rule__Pantry__Group_2__1 ;
    public final void rule__Pantry__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:304:1: ( rule__Pantry__Group_2__0__Impl rule__Pantry__Group_2__1 )
            // InternalPantryTextual.g:305:2: rule__Pantry__Group_2__0__Impl rule__Pantry__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Pantry__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pantry__Group_2__1();

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
    // $ANTLR end "rule__Pantry__Group_2__0"


    // $ANTLR start "rule__Pantry__Group_2__0__Impl"
    // InternalPantryTextual.g:312:1: rule__Pantry__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Pantry__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:316:1: ( ( ',' ) )
            // InternalPantryTextual.g:317:1: ( ',' )
            {
            // InternalPantryTextual.g:317:1: ( ',' )
            // InternalPantryTextual.g:318:2: ','
            {
             before(grammarAccess.getPantryAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPantryAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Pantry__Group_2__0__Impl"


    // $ANTLR start "rule__Pantry__Group_2__1"
    // InternalPantryTextual.g:327:1: rule__Pantry__Group_2__1 : rule__Pantry__Group_2__1__Impl ;
    public final void rule__Pantry__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:331:1: ( rule__Pantry__Group_2__1__Impl )
            // InternalPantryTextual.g:332:2: rule__Pantry__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pantry__Group_2__1__Impl();

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
    // $ANTLR end "rule__Pantry__Group_2__1"


    // $ANTLR start "rule__Pantry__Group_2__1__Impl"
    // InternalPantryTextual.g:338:1: rule__Pantry__Group_2__1__Impl : ( ( rule__Pantry__IngredientAssignment_2_1 ) ) ;
    public final void rule__Pantry__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:342:1: ( ( ( rule__Pantry__IngredientAssignment_2_1 ) ) )
            // InternalPantryTextual.g:343:1: ( ( rule__Pantry__IngredientAssignment_2_1 ) )
            {
            // InternalPantryTextual.g:343:1: ( ( rule__Pantry__IngredientAssignment_2_1 ) )
            // InternalPantryTextual.g:344:2: ( rule__Pantry__IngredientAssignment_2_1 )
            {
             before(grammarAccess.getPantryAccess().getIngredientAssignment_2_1()); 
            // InternalPantryTextual.g:345:2: ( rule__Pantry__IngredientAssignment_2_1 )
            // InternalPantryTextual.g:345:3: rule__Pantry__IngredientAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Pantry__IngredientAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPantryAccess().getIngredientAssignment_2_1()); 

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
    // $ANTLR end "rule__Pantry__Group_2__1__Impl"


    // $ANTLR start "rule__Ingredient__Group__0"
    // InternalPantryTextual.g:354:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:358:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // InternalPantryTextual.g:359:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__1();

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
    // $ANTLR end "rule__Ingredient__Group__0"


    // $ANTLR start "rule__Ingredient__Group__0__Impl"
    // InternalPantryTextual.g:366:1: rule__Ingredient__Group__0__Impl : ( () ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:370:1: ( ( () ) )
            // InternalPantryTextual.g:371:1: ( () )
            {
            // InternalPantryTextual.g:371:1: ( () )
            // InternalPantryTextual.g:372:2: ()
            {
             before(grammarAccess.getIngredientAccess().getIngredientAction_0()); 
            // InternalPantryTextual.g:373:2: ()
            // InternalPantryTextual.g:373:3: 
            {
            }

             after(grammarAccess.getIngredientAccess().getIngredientAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0__Impl"


    // $ANTLR start "rule__Ingredient__Group__1"
    // InternalPantryTextual.g:381:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:385:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // InternalPantryTextual.g:386:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Ingredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__2();

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
    // $ANTLR end "rule__Ingredient__Group__1"


    // $ANTLR start "rule__Ingredient__Group__1__Impl"
    // InternalPantryTextual.g:393:1: rule__Ingredient__Group__1__Impl : ( ( rule__Ingredient__NameAssignment_1 ) ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:397:1: ( ( ( rule__Ingredient__NameAssignment_1 ) ) )
            // InternalPantryTextual.g:398:1: ( ( rule__Ingredient__NameAssignment_1 ) )
            {
            // InternalPantryTextual.g:398:1: ( ( rule__Ingredient__NameAssignment_1 ) )
            // InternalPantryTextual.g:399:2: ( rule__Ingredient__NameAssignment_1 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_1()); 
            // InternalPantryTextual.g:400:2: ( rule__Ingredient__NameAssignment_1 )
            // InternalPantryTextual.g:400:3: rule__Ingredient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Ingredient__Group__1__Impl"


    // $ANTLR start "rule__Ingredient__Group__2"
    // InternalPantryTextual.g:408:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:412:1: ( rule__Ingredient__Group__2__Impl )
            // InternalPantryTextual.g:413:2: rule__Ingredient__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__2__Impl();

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
    // $ANTLR end "rule__Ingredient__Group__2"


    // $ANTLR start "rule__Ingredient__Group__2__Impl"
    // InternalPantryTextual.g:419:1: rule__Ingredient__Group__2__Impl : ( ( rule__Ingredient__Group_2__0 )? ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:423:1: ( ( ( rule__Ingredient__Group_2__0 )? ) )
            // InternalPantryTextual.g:424:1: ( ( rule__Ingredient__Group_2__0 )? )
            {
            // InternalPantryTextual.g:424:1: ( ( rule__Ingredient__Group_2__0 )? )
            // InternalPantryTextual.g:425:2: ( rule__Ingredient__Group_2__0 )?
            {
             before(grammarAccess.getIngredientAccess().getGroup_2()); 
            // InternalPantryTextual.g:426:2: ( rule__Ingredient__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPantryTextual.g:426:3: rule__Ingredient__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Ingredient__Group__2__Impl"


    // $ANTLR start "rule__Ingredient__Group_2__0"
    // InternalPantryTextual.g:435:1: rule__Ingredient__Group_2__0 : rule__Ingredient__Group_2__0__Impl rule__Ingredient__Group_2__1 ;
    public final void rule__Ingredient__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:439:1: ( rule__Ingredient__Group_2__0__Impl rule__Ingredient__Group_2__1 )
            // InternalPantryTextual.g:440:2: rule__Ingredient__Group_2__0__Impl rule__Ingredient__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Ingredient__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_2__1();

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
    // $ANTLR end "rule__Ingredient__Group_2__0"


    // $ANTLR start "rule__Ingredient__Group_2__0__Impl"
    // InternalPantryTextual.g:447:1: rule__Ingredient__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Ingredient__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:451:1: ( ( ':' ) )
            // InternalPantryTextual.g:452:1: ( ':' )
            {
            // InternalPantryTextual.g:452:1: ( ':' )
            // InternalPantryTextual.g:453:2: ':'
            {
             before(grammarAccess.getIngredientAccess().getColonKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getColonKeyword_2_0()); 

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
    // $ANTLR end "rule__Ingredient__Group_2__0__Impl"


    // $ANTLR start "rule__Ingredient__Group_2__1"
    // InternalPantryTextual.g:462:1: rule__Ingredient__Group_2__1 : rule__Ingredient__Group_2__1__Impl ;
    public final void rule__Ingredient__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:466:1: ( rule__Ingredient__Group_2__1__Impl )
            // InternalPantryTextual.g:467:2: rule__Ingredient__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_2__1__Impl();

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
    // $ANTLR end "rule__Ingredient__Group_2__1"


    // $ANTLR start "rule__Ingredient__Group_2__1__Impl"
    // InternalPantryTextual.g:473:1: rule__Ingredient__Group_2__1__Impl : ( ( rule__Ingredient__MassAssignment_2_1 ) ) ;
    public final void rule__Ingredient__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:477:1: ( ( ( rule__Ingredient__MassAssignment_2_1 ) ) )
            // InternalPantryTextual.g:478:1: ( ( rule__Ingredient__MassAssignment_2_1 ) )
            {
            // InternalPantryTextual.g:478:1: ( ( rule__Ingredient__MassAssignment_2_1 ) )
            // InternalPantryTextual.g:479:2: ( rule__Ingredient__MassAssignment_2_1 )
            {
             before(grammarAccess.getIngredientAccess().getMassAssignment_2_1()); 
            // InternalPantryTextual.g:480:2: ( rule__Ingredient__MassAssignment_2_1 )
            // InternalPantryTextual.g:480:3: rule__Ingredient__MassAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__MassAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getMassAssignment_2_1()); 

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
    // $ANTLR end "rule__Ingredient__Group_2__1__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // InternalPantryTextual.g:489:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:493:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalPantryTextual.g:494:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__1();

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
    // $ANTLR end "rule__Mass__Group__0"


    // $ANTLR start "rule__Mass__Group__0__Impl"
    // InternalPantryTextual.g:501:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:505:1: ( ( () ) )
            // InternalPantryTextual.g:506:1: ( () )
            {
            // InternalPantryTextual.g:506:1: ( () )
            // InternalPantryTextual.g:507:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalPantryTextual.g:508:2: ()
            // InternalPantryTextual.g:508:3: 
            {
            }

             after(grammarAccess.getMassAccess().getMassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0__Impl"


    // $ANTLR start "rule__Mass__Group__1"
    // InternalPantryTextual.g:516:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:520:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalPantryTextual.g:521:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__2();

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
    // $ANTLR end "rule__Mass__Group__1"


    // $ANTLR start "rule__Mass__Group__1__Impl"
    // InternalPantryTextual.g:528:1: rule__Mass__Group__1__Impl : ( '{' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:532:1: ( ( '{' ) )
            // InternalPantryTextual.g:533:1: ( '{' )
            {
            // InternalPantryTextual.g:533:1: ( '{' )
            // InternalPantryTextual.g:534:2: '{'
            {
             before(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Mass__Group__1__Impl"


    // $ANTLR start "rule__Mass__Group__2"
    // InternalPantryTextual.g:543:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:547:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalPantryTextual.g:548:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__3();

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
    // $ANTLR end "rule__Mass__Group__2"


    // $ANTLR start "rule__Mass__Group__2__Impl"
    // InternalPantryTextual.g:555:1: rule__Mass__Group__2__Impl : ( ( rule__Mass__Group_2__0 )? ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:559:1: ( ( ( rule__Mass__Group_2__0 )? ) )
            // InternalPantryTextual.g:560:1: ( ( rule__Mass__Group_2__0 )? )
            {
            // InternalPantryTextual.g:560:1: ( ( rule__Mass__Group_2__0 )? )
            // InternalPantryTextual.g:561:2: ( rule__Mass__Group_2__0 )?
            {
             before(grammarAccess.getMassAccess().getGroup_2()); 
            // InternalPantryTextual.g:562:2: ( rule__Mass__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPantryTextual.g:562:3: rule__Mass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMassAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Mass__Group__2__Impl"


    // $ANTLR start "rule__Mass__Group__3"
    // InternalPantryTextual.g:570:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:574:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // InternalPantryTextual.g:575:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Mass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__4();

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
    // $ANTLR end "rule__Mass__Group__3"


    // $ANTLR start "rule__Mass__Group__3__Impl"
    // InternalPantryTextual.g:582:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__Group_3__0 )? ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:586:1: ( ( ( rule__Mass__Group_3__0 )? ) )
            // InternalPantryTextual.g:587:1: ( ( rule__Mass__Group_3__0 )? )
            {
            // InternalPantryTextual.g:587:1: ( ( rule__Mass__Group_3__0 )? )
            // InternalPantryTextual.g:588:2: ( rule__Mass__Group_3__0 )?
            {
             before(grammarAccess.getMassAccess().getGroup_3()); 
            // InternalPantryTextual.g:589:2: ( rule__Mass__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPantryTextual.g:589:3: rule__Mass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMassAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Mass__Group__3__Impl"


    // $ANTLR start "rule__Mass__Group__4"
    // InternalPantryTextual.g:597:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:601:1: ( rule__Mass__Group__4__Impl )
            // InternalPantryTextual.g:602:2: rule__Mass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__4__Impl();

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
    // $ANTLR end "rule__Mass__Group__4"


    // $ANTLR start "rule__Mass__Group__4__Impl"
    // InternalPantryTextual.g:608:1: rule__Mass__Group__4__Impl : ( '}' ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:612:1: ( ( '}' ) )
            // InternalPantryTextual.g:613:1: ( '}' )
            {
            // InternalPantryTextual.g:613:1: ( '}' )
            // InternalPantryTextual.g:614:2: '}'
            {
             before(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Mass__Group__4__Impl"


    // $ANTLR start "rule__Mass__Group_2__0"
    // InternalPantryTextual.g:624:1: rule__Mass__Group_2__0 : rule__Mass__Group_2__0__Impl rule__Mass__Group_2__1 ;
    public final void rule__Mass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:628:1: ( rule__Mass__Group_2__0__Impl rule__Mass__Group_2__1 )
            // InternalPantryTextual.g:629:2: rule__Mass__Group_2__0__Impl rule__Mass__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Mass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group_2__1();

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
    // $ANTLR end "rule__Mass__Group_2__0"


    // $ANTLR start "rule__Mass__Group_2__0__Impl"
    // InternalPantryTextual.g:636:1: rule__Mass__Group_2__0__Impl : ( 'amount' ) ;
    public final void rule__Mass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:640:1: ( ( 'amount' ) )
            // InternalPantryTextual.g:641:1: ( 'amount' )
            {
            // InternalPantryTextual.g:641:1: ( 'amount' )
            // InternalPantryTextual.g:642:2: 'amount'
            {
             before(grammarAccess.getMassAccess().getAmountKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getAmountKeyword_2_0()); 

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
    // $ANTLR end "rule__Mass__Group_2__0__Impl"


    // $ANTLR start "rule__Mass__Group_2__1"
    // InternalPantryTextual.g:651:1: rule__Mass__Group_2__1 : rule__Mass__Group_2__1__Impl ;
    public final void rule__Mass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:655:1: ( rule__Mass__Group_2__1__Impl )
            // InternalPantryTextual.g:656:2: rule__Mass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group_2__1__Impl();

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
    // $ANTLR end "rule__Mass__Group_2__1"


    // $ANTLR start "rule__Mass__Group_2__1__Impl"
    // InternalPantryTextual.g:662:1: rule__Mass__Group_2__1__Impl : ( ( rule__Mass__AmountAssignment_2_1 ) ) ;
    public final void rule__Mass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:666:1: ( ( ( rule__Mass__AmountAssignment_2_1 ) ) )
            // InternalPantryTextual.g:667:1: ( ( rule__Mass__AmountAssignment_2_1 ) )
            {
            // InternalPantryTextual.g:667:1: ( ( rule__Mass__AmountAssignment_2_1 ) )
            // InternalPantryTextual.g:668:2: ( rule__Mass__AmountAssignment_2_1 )
            {
             before(grammarAccess.getMassAccess().getAmountAssignment_2_1()); 
            // InternalPantryTextual.g:669:2: ( rule__Mass__AmountAssignment_2_1 )
            // InternalPantryTextual.g:669:3: rule__Mass__AmountAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Mass__AmountAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getAmountAssignment_2_1()); 

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
    // $ANTLR end "rule__Mass__Group_2__1__Impl"


    // $ANTLR start "rule__Mass__Group_3__0"
    // InternalPantryTextual.g:678:1: rule__Mass__Group_3__0 : rule__Mass__Group_3__0__Impl rule__Mass__Group_3__1 ;
    public final void rule__Mass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:682:1: ( rule__Mass__Group_3__0__Impl rule__Mass__Group_3__1 )
            // InternalPantryTextual.g:683:2: rule__Mass__Group_3__0__Impl rule__Mass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Mass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group_3__1();

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
    // $ANTLR end "rule__Mass__Group_3__0"


    // $ANTLR start "rule__Mass__Group_3__0__Impl"
    // InternalPantryTextual.g:690:1: rule__Mass__Group_3__0__Impl : ( 'unit' ) ;
    public final void rule__Mass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:694:1: ( ( 'unit' ) )
            // InternalPantryTextual.g:695:1: ( 'unit' )
            {
            // InternalPantryTextual.g:695:1: ( 'unit' )
            // InternalPantryTextual.g:696:2: 'unit'
            {
             before(grammarAccess.getMassAccess().getUnitKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getUnitKeyword_3_0()); 

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
    // $ANTLR end "rule__Mass__Group_3__0__Impl"


    // $ANTLR start "rule__Mass__Group_3__1"
    // InternalPantryTextual.g:705:1: rule__Mass__Group_3__1 : rule__Mass__Group_3__1__Impl ;
    public final void rule__Mass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:709:1: ( rule__Mass__Group_3__1__Impl )
            // InternalPantryTextual.g:710:2: rule__Mass__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group_3__1__Impl();

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
    // $ANTLR end "rule__Mass__Group_3__1"


    // $ANTLR start "rule__Mass__Group_3__1__Impl"
    // InternalPantryTextual.g:716:1: rule__Mass__Group_3__1__Impl : ( ( rule__Mass__UnitAssignment_3_1 ) ) ;
    public final void rule__Mass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:720:1: ( ( ( rule__Mass__UnitAssignment_3_1 ) ) )
            // InternalPantryTextual.g:721:1: ( ( rule__Mass__UnitAssignment_3_1 ) )
            {
            // InternalPantryTextual.g:721:1: ( ( rule__Mass__UnitAssignment_3_1 ) )
            // InternalPantryTextual.g:722:2: ( rule__Mass__UnitAssignment_3_1 )
            {
             before(grammarAccess.getMassAccess().getUnitAssignment_3_1()); 
            // InternalPantryTextual.g:723:2: ( rule__Mass__UnitAssignment_3_1 )
            // InternalPantryTextual.g:723:3: rule__Mass__UnitAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mass__UnitAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getUnitAssignment_3_1()); 

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
    // $ANTLR end "rule__Mass__Group_3__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalPantryTextual.g:732:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:736:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalPantryTextual.g:737:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalPantryTextual.g:744:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:748:1: ( ( ( '-' )? ) )
            // InternalPantryTextual.g:749:1: ( ( '-' )? )
            {
            // InternalPantryTextual.g:749:1: ( ( '-' )? )
            // InternalPantryTextual.g:750:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalPantryTextual.g:751:2: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPantryTextual.g:751:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalPantryTextual.g:759:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:763:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalPantryTextual.g:764:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalPantryTextual.g:771:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:775:1: ( ( ( RULE_INT )? ) )
            // InternalPantryTextual.g:776:1: ( ( RULE_INT )? )
            {
            // InternalPantryTextual.g:776:1: ( ( RULE_INT )? )
            // InternalPantryTextual.g:777:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalPantryTextual.g:778:2: ( RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPantryTextual.g:778:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalPantryTextual.g:786:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:790:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalPantryTextual.g:791:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalPantryTextual.g:798:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:802:1: ( ( '.' ) )
            // InternalPantryTextual.g:803:1: ( '.' )
            {
            // InternalPantryTextual.g:803:1: ( '.' )
            // InternalPantryTextual.g:804:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalPantryTextual.g:813:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:817:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalPantryTextual.g:818:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

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
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalPantryTextual.g:825:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:829:1: ( ( RULE_INT ) )
            // InternalPantryTextual.g:830:1: ( RULE_INT )
            {
            // InternalPantryTextual.g:830:1: ( RULE_INT )
            // InternalPantryTextual.g:831:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalPantryTextual.g:840:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:844:1: ( rule__EFloat__Group__4__Impl )
            // InternalPantryTextual.g:845:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

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
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalPantryTextual.g:851:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:855:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalPantryTextual.g:856:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalPantryTextual.g:856:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalPantryTextual.g:857:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalPantryTextual.g:858:2: ( rule__EFloat__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPantryTextual.g:858:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalPantryTextual.g:867:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:871:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalPantryTextual.g:872:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

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
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalPantryTextual.g:879:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:883:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalPantryTextual.g:884:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalPantryTextual.g:884:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalPantryTextual.g:885:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalPantryTextual.g:886:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalPantryTextual.g:886:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalPantryTextual.g:894:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:898:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalPantryTextual.g:899:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

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
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalPantryTextual.g:906:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:910:1: ( ( ( '-' )? ) )
            // InternalPantryTextual.g:911:1: ( ( '-' )? )
            {
            // InternalPantryTextual.g:911:1: ( ( '-' )? )
            // InternalPantryTextual.g:912:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalPantryTextual.g:913:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPantryTextual.g:913:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalPantryTextual.g:921:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:925:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalPantryTextual.g:926:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalPantryTextual.g:932:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:936:1: ( ( RULE_INT ) )
            // InternalPantryTextual.g:937:1: ( RULE_INT )
            {
            // InternalPantryTextual.g:937:1: ( RULE_INT )
            // InternalPantryTextual.g:938:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__Pantry__IngredientAssignment_1"
    // InternalPantryTextual.g:948:1: rule__Pantry__IngredientAssignment_1 : ( ruleIngredient ) ;
    public final void rule__Pantry__IngredientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:952:1: ( ( ruleIngredient ) )
            // InternalPantryTextual.g:953:2: ( ruleIngredient )
            {
            // InternalPantryTextual.g:953:2: ( ruleIngredient )
            // InternalPantryTextual.g:954:3: ruleIngredient
            {
             before(grammarAccess.getPantryAccess().getIngredientIngredientParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getPantryAccess().getIngredientIngredientParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Pantry__IngredientAssignment_1"


    // $ANTLR start "rule__Pantry__IngredientAssignment_2_1"
    // InternalPantryTextual.g:963:1: rule__Pantry__IngredientAssignment_2_1 : ( ruleIngredient ) ;
    public final void rule__Pantry__IngredientAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:967:1: ( ( ruleIngredient ) )
            // InternalPantryTextual.g:968:2: ( ruleIngredient )
            {
            // InternalPantryTextual.g:968:2: ( ruleIngredient )
            // InternalPantryTextual.g:969:3: ruleIngredient
            {
             before(grammarAccess.getPantryAccess().getIngredientIngredientParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getPantryAccess().getIngredientIngredientParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Pantry__IngredientAssignment_2_1"


    // $ANTLR start "rule__Ingredient__NameAssignment_1"
    // InternalPantryTextual.g:978:1: rule__Ingredient__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ingredient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:982:1: ( ( ruleEString ) )
            // InternalPantryTextual.g:983:2: ( ruleEString )
            {
            // InternalPantryTextual.g:983:2: ( ruleEString )
            // InternalPantryTextual.g:984:3: ruleEString
            {
             before(grammarAccess.getIngredientAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ingredient__NameAssignment_1"


    // $ANTLR start "rule__Ingredient__MassAssignment_2_1"
    // InternalPantryTextual.g:993:1: rule__Ingredient__MassAssignment_2_1 : ( ruleMass ) ;
    public final void rule__Ingredient__MassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:997:1: ( ( ruleMass ) )
            // InternalPantryTextual.g:998:2: ( ruleMass )
            {
            // InternalPantryTextual.g:998:2: ( ruleMass )
            // InternalPantryTextual.g:999:3: ruleMass
            {
             before(grammarAccess.getIngredientAccess().getMassMassParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getMassMassParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Ingredient__MassAssignment_2_1"


    // $ANTLR start "rule__Mass__AmountAssignment_2_1"
    // InternalPantryTextual.g:1008:1: rule__Mass__AmountAssignment_2_1 : ( ruleEFloat ) ;
    public final void rule__Mass__AmountAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:1012:1: ( ( ruleEFloat ) )
            // InternalPantryTextual.g:1013:2: ( ruleEFloat )
            {
            // InternalPantryTextual.g:1013:2: ( ruleEFloat )
            // InternalPantryTextual.g:1014:3: ruleEFloat
            {
             before(grammarAccess.getMassAccess().getAmountEFloatParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getMassAccess().getAmountEFloatParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Mass__AmountAssignment_2_1"


    // $ANTLR start "rule__Mass__UnitAssignment_3_1"
    // InternalPantryTextual.g:1023:1: rule__Mass__UnitAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Mass__UnitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPantryTextual.g:1027:1: ( ( ruleEString ) )
            // InternalPantryTextual.g:1028:2: ( ruleEString )
            {
            // InternalPantryTextual.g:1028:2: ( ruleEString )
            // InternalPantryTextual.g:1029:3: ruleEString
            {
             before(grammarAccess.getMassAccess().getUnitEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMassAccess().getUnitEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Mass__UnitAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100040L});

}