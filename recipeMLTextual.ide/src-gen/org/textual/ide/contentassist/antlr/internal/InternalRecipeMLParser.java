package org.textual.ide.contentassist.antlr.internal;

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
import org.textual.services.RecipeMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecipeMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Recipe : '", "'{'", "'serves'", "'ingredients : '", "'instructions :'", "'}'", "','", "'BaseIng'", "'count'", "'unit'", "'Method'", "'step'", "':'", "'-'", "'for'", "'minutes'", "'we'", "'obtain'", "'.'", "'of'", "'amount'", "'ModIng'"
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

    	public void setGrammarAccess(RecipeMLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRecipe"
    // InternalRecipeML.g:53:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // InternalRecipeML.g:54:1: ( ruleRecipe EOF )
            // InternalRecipeML.g:55:1: ruleRecipe EOF
            {
             before(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_1);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeRule()); 
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
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // InternalRecipeML.g:62:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:66:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // InternalRecipeML.g:67:2: ( ( rule__Recipe__Group__0 ) )
            {
            // InternalRecipeML.g:67:2: ( ( rule__Recipe__Group__0 ) )
            // InternalRecipeML.g:68:3: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // InternalRecipeML.g:69:3: ( rule__Recipe__Group__0 )
            // InternalRecipeML.g:69:4: rule__Recipe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getGroup()); 

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
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleBaseIng"
    // InternalRecipeML.g:78:1: entryRuleBaseIng : ruleBaseIng EOF ;
    public final void entryRuleBaseIng() throws RecognitionException {
        try {
            // InternalRecipeML.g:79:1: ( ruleBaseIng EOF )
            // InternalRecipeML.g:80:1: ruleBaseIng EOF
            {
             before(grammarAccess.getBaseIngRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseIng();

            state._fsp--;

             after(grammarAccess.getBaseIngRule()); 
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
    // $ANTLR end "entryRuleBaseIng"


    // $ANTLR start "ruleBaseIng"
    // InternalRecipeML.g:87:1: ruleBaseIng : ( ( rule__BaseIng__Group__0 ) ) ;
    public final void ruleBaseIng() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:91:2: ( ( ( rule__BaseIng__Group__0 ) ) )
            // InternalRecipeML.g:92:2: ( ( rule__BaseIng__Group__0 ) )
            {
            // InternalRecipeML.g:92:2: ( ( rule__BaseIng__Group__0 ) )
            // InternalRecipeML.g:93:3: ( rule__BaseIng__Group__0 )
            {
             before(grammarAccess.getBaseIngAccess().getGroup()); 
            // InternalRecipeML.g:94:3: ( rule__BaseIng__Group__0 )
            // InternalRecipeML.g:94:4: rule__BaseIng__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaseIng__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseIngAccess().getGroup()); 

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
    // $ANTLR end "ruleBaseIng"


    // $ANTLR start "entryRuleMethod"
    // InternalRecipeML.g:103:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalRecipeML.g:104:1: ( ruleMethod EOF )
            // InternalRecipeML.g:105:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalRecipeML.g:112:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:116:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalRecipeML.g:117:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalRecipeML.g:117:2: ( ( rule__Method__Group__0 ) )
            // InternalRecipeML.g:118:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalRecipeML.g:119:3: ( rule__Method__Group__0 )
            // InternalRecipeML.g:119:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleEString"
    // InternalRecipeML.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRecipeML.g:129:1: ( ruleEString EOF )
            // InternalRecipeML.g:130:1: ruleEString EOF
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
    // InternalRecipeML.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRecipeML.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRecipeML.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalRecipeML.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRecipeML.g:144:3: ( rule__EString__Alternatives )
            // InternalRecipeML.g:144:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEInt"
    // InternalRecipeML.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRecipeML.g:154:1: ( ruleEInt EOF )
            // InternalRecipeML.g:155:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRecipeML.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalRecipeML.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalRecipeML.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalRecipeML.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalRecipeML.g:169:3: ( rule__EInt__Group__0 )
            // InternalRecipeML.g:169:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalRecipeML.g:178:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalRecipeML.g:179:1: ( ruleEFloat EOF )
            // InternalRecipeML.g:180:1: ruleEFloat EOF
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
    // InternalRecipeML.g:187:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:191:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalRecipeML.g:192:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalRecipeML.g:192:2: ( ( rule__EFloat__Group__0 ) )
            // InternalRecipeML.g:193:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalRecipeML.g:194:3: ( rule__EFloat__Group__0 )
            // InternalRecipeML.g:194:4: rule__EFloat__Group__0
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


    // $ANTLR start "entryRuleAmount"
    // InternalRecipeML.g:203:1: entryRuleAmount : ruleAmount EOF ;
    public final void entryRuleAmount() throws RecognitionException {
        try {
            // InternalRecipeML.g:204:1: ( ruleAmount EOF )
            // InternalRecipeML.g:205:1: ruleAmount EOF
            {
             before(grammarAccess.getAmountRule()); 
            pushFollow(FOLLOW_1);
            ruleAmount();

            state._fsp--;

             after(grammarAccess.getAmountRule()); 
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
    // $ANTLR end "entryRuleAmount"


    // $ANTLR start "ruleAmount"
    // InternalRecipeML.g:212:1: ruleAmount : ( ( rule__Amount__Group__0 ) ) ;
    public final void ruleAmount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:216:2: ( ( ( rule__Amount__Group__0 ) ) )
            // InternalRecipeML.g:217:2: ( ( rule__Amount__Group__0 ) )
            {
            // InternalRecipeML.g:217:2: ( ( rule__Amount__Group__0 ) )
            // InternalRecipeML.g:218:3: ( rule__Amount__Group__0 )
            {
             before(grammarAccess.getAmountAccess().getGroup()); 
            // InternalRecipeML.g:219:3: ( rule__Amount__Group__0 )
            // InternalRecipeML.g:219:4: rule__Amount__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Amount__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAmountAccess().getGroup()); 

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
    // $ANTLR end "ruleAmount"


    // $ANTLR start "entryRuleModIng"
    // InternalRecipeML.g:228:1: entryRuleModIng : ruleModIng EOF ;
    public final void entryRuleModIng() throws RecognitionException {
        try {
            // InternalRecipeML.g:229:1: ( ruleModIng EOF )
            // InternalRecipeML.g:230:1: ruleModIng EOF
            {
             before(grammarAccess.getModIngRule()); 
            pushFollow(FOLLOW_1);
            ruleModIng();

            state._fsp--;

             after(grammarAccess.getModIngRule()); 
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
    // $ANTLR end "entryRuleModIng"


    // $ANTLR start "ruleModIng"
    // InternalRecipeML.g:237:1: ruleModIng : ( ( rule__ModIng__Group__0 ) ) ;
    public final void ruleModIng() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:241:2: ( ( ( rule__ModIng__Group__0 ) ) )
            // InternalRecipeML.g:242:2: ( ( rule__ModIng__Group__0 ) )
            {
            // InternalRecipeML.g:242:2: ( ( rule__ModIng__Group__0 ) )
            // InternalRecipeML.g:243:3: ( rule__ModIng__Group__0 )
            {
             before(grammarAccess.getModIngAccess().getGroup()); 
            // InternalRecipeML.g:244:3: ( rule__ModIng__Group__0 )
            // InternalRecipeML.g:244:4: rule__ModIng__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModIng__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModIngAccess().getGroup()); 

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
    // $ANTLR end "ruleModIng"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRecipeML.g:252:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:256:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRecipeML.g:257:2: ( RULE_STRING )
                    {
                    // InternalRecipeML.g:257:2: ( RULE_STRING )
                    // InternalRecipeML.g:258:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeML.g:263:2: ( RULE_ID )
                    {
                    // InternalRecipeML.g:263:2: ( RULE_ID )
                    // InternalRecipeML.g:264:3: RULE_ID
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
    // InternalRecipeML.g:273:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:277:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalRecipeML.g:278:2: ( 'E' )
                    {
                    // InternalRecipeML.g:278:2: ( 'E' )
                    // InternalRecipeML.g:279:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeML.g:284:2: ( 'e' )
                    {
                    // InternalRecipeML.g:284:2: ( 'e' )
                    // InternalRecipeML.g:285:3: 'e'
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


    // $ANTLR start "rule__Recipe__Group__0"
    // InternalRecipeML.g:294:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:298:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalRecipeML.g:299:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__1();

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
    // $ANTLR end "rule__Recipe__Group__0"


    // $ANTLR start "rule__Recipe__Group__0__Impl"
    // InternalRecipeML.g:306:1: rule__Recipe__Group__0__Impl : ( 'Recipe : ' ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:310:1: ( ( 'Recipe : ' ) )
            // InternalRecipeML.g:311:1: ( 'Recipe : ' )
            {
            // InternalRecipeML.g:311:1: ( 'Recipe : ' )
            // InternalRecipeML.g:312:2: 'Recipe : '
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 

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
    // $ANTLR end "rule__Recipe__Group__0__Impl"


    // $ANTLR start "rule__Recipe__Group__1"
    // InternalRecipeML.g:321:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:325:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalRecipeML.g:326:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__2();

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
    // $ANTLR end "rule__Recipe__Group__1"


    // $ANTLR start "rule__Recipe__Group__1__Impl"
    // InternalRecipeML.g:333:1: rule__Recipe__Group__1__Impl : ( ( rule__Recipe__NameAssignment_1 ) ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:337:1: ( ( ( rule__Recipe__NameAssignment_1 ) ) )
            // InternalRecipeML.g:338:1: ( ( rule__Recipe__NameAssignment_1 ) )
            {
            // InternalRecipeML.g:338:1: ( ( rule__Recipe__NameAssignment_1 ) )
            // InternalRecipeML.g:339:2: ( rule__Recipe__NameAssignment_1 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_1()); 
            // InternalRecipeML.g:340:2: ( rule__Recipe__NameAssignment_1 )
            // InternalRecipeML.g:340:3: rule__Recipe__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Recipe__Group__1__Impl"


    // $ANTLR start "rule__Recipe__Group__2"
    // InternalRecipeML.g:348:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:352:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalRecipeML.g:353:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__3();

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
    // $ANTLR end "rule__Recipe__Group__2"


    // $ANTLR start "rule__Recipe__Group__2__Impl"
    // InternalRecipeML.g:360:1: rule__Recipe__Group__2__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:364:1: ( ( '{' ) )
            // InternalRecipeML.g:365:1: ( '{' )
            {
            // InternalRecipeML.g:365:1: ( '{' )
            // InternalRecipeML.g:366:2: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Recipe__Group__2__Impl"


    // $ANTLR start "rule__Recipe__Group__3"
    // InternalRecipeML.g:375:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:379:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalRecipeML.g:380:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__4();

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
    // $ANTLR end "rule__Recipe__Group__3"


    // $ANTLR start "rule__Recipe__Group__3__Impl"
    // InternalRecipeML.g:387:1: rule__Recipe__Group__3__Impl : ( 'serves' ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:391:1: ( ( 'serves' ) )
            // InternalRecipeML.g:392:1: ( 'serves' )
            {
            // InternalRecipeML.g:392:1: ( 'serves' )
            // InternalRecipeML.g:393:2: 'serves'
            {
             before(grammarAccess.getRecipeAccess().getServesKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getServesKeyword_3()); 

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
    // $ANTLR end "rule__Recipe__Group__3__Impl"


    // $ANTLR start "rule__Recipe__Group__4"
    // InternalRecipeML.g:402:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:406:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalRecipeML.g:407:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__5();

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
    // $ANTLR end "rule__Recipe__Group__4"


    // $ANTLR start "rule__Recipe__Group__4__Impl"
    // InternalRecipeML.g:414:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__ServesAssignment_4 )? ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:418:1: ( ( ( rule__Recipe__ServesAssignment_4 )? ) )
            // InternalRecipeML.g:419:1: ( ( rule__Recipe__ServesAssignment_4 )? )
            {
            // InternalRecipeML.g:419:1: ( ( rule__Recipe__ServesAssignment_4 )? )
            // InternalRecipeML.g:420:2: ( rule__Recipe__ServesAssignment_4 )?
            {
             before(grammarAccess.getRecipeAccess().getServesAssignment_4()); 
            // InternalRecipeML.g:421:2: ( rule__Recipe__ServesAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRecipeML.g:421:3: rule__Recipe__ServesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recipe__ServesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getServesAssignment_4()); 

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
    // $ANTLR end "rule__Recipe__Group__4__Impl"


    // $ANTLR start "rule__Recipe__Group__5"
    // InternalRecipeML.g:429:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:433:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // InternalRecipeML.g:434:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Recipe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__6();

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
    // $ANTLR end "rule__Recipe__Group__5"


    // $ANTLR start "rule__Recipe__Group__5__Impl"
    // InternalRecipeML.g:441:1: rule__Recipe__Group__5__Impl : ( 'ingredients : ' ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:445:1: ( ( 'ingredients : ' ) )
            // InternalRecipeML.g:446:1: ( 'ingredients : ' )
            {
            // InternalRecipeML.g:446:1: ( 'ingredients : ' )
            // InternalRecipeML.g:447:2: 'ingredients : '
            {
             before(grammarAccess.getRecipeAccess().getIngredientsKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getIngredientsKeyword_5()); 

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
    // $ANTLR end "rule__Recipe__Group__5__Impl"


    // $ANTLR start "rule__Recipe__Group__6"
    // InternalRecipeML.g:456:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:460:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // InternalRecipeML.g:461:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Recipe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__7();

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
    // $ANTLR end "rule__Recipe__Group__6"


    // $ANTLR start "rule__Recipe__Group__6__Impl"
    // InternalRecipeML.g:468:1: rule__Recipe__Group__6__Impl : ( ( rule__Recipe__BaseingsAssignment_6 ) ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:472:1: ( ( ( rule__Recipe__BaseingsAssignment_6 ) ) )
            // InternalRecipeML.g:473:1: ( ( rule__Recipe__BaseingsAssignment_6 ) )
            {
            // InternalRecipeML.g:473:1: ( ( rule__Recipe__BaseingsAssignment_6 ) )
            // InternalRecipeML.g:474:2: ( rule__Recipe__BaseingsAssignment_6 )
            {
             before(grammarAccess.getRecipeAccess().getBaseingsAssignment_6()); 
            // InternalRecipeML.g:475:2: ( rule__Recipe__BaseingsAssignment_6 )
            // InternalRecipeML.g:475:3: rule__Recipe__BaseingsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__BaseingsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getBaseingsAssignment_6()); 

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
    // $ANTLR end "rule__Recipe__Group__6__Impl"


    // $ANTLR start "rule__Recipe__Group__7"
    // InternalRecipeML.g:483:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:487:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // InternalRecipeML.g:488:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Recipe__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__8();

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
    // $ANTLR end "rule__Recipe__Group__7"


    // $ANTLR start "rule__Recipe__Group__7__Impl"
    // InternalRecipeML.g:495:1: rule__Recipe__Group__7__Impl : ( ( rule__Recipe__Group_7__0 )* ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:499:1: ( ( ( rule__Recipe__Group_7__0 )* ) )
            // InternalRecipeML.g:500:1: ( ( rule__Recipe__Group_7__0 )* )
            {
            // InternalRecipeML.g:500:1: ( ( rule__Recipe__Group_7__0 )* )
            // InternalRecipeML.g:501:2: ( rule__Recipe__Group_7__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_7()); 
            // InternalRecipeML.g:502:2: ( rule__Recipe__Group_7__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRecipeML.g:502:3: rule__Recipe__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Recipe__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Recipe__Group__7__Impl"


    // $ANTLR start "rule__Recipe__Group__8"
    // InternalRecipeML.g:510:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl rule__Recipe__Group__9 ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:514:1: ( rule__Recipe__Group__8__Impl rule__Recipe__Group__9 )
            // InternalRecipeML.g:515:2: rule__Recipe__Group__8__Impl rule__Recipe__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Recipe__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__9();

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
    // $ANTLR end "rule__Recipe__Group__8"


    // $ANTLR start "rule__Recipe__Group__8__Impl"
    // InternalRecipeML.g:522:1: rule__Recipe__Group__8__Impl : ( 'instructions :' ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:526:1: ( ( 'instructions :' ) )
            // InternalRecipeML.g:527:1: ( 'instructions :' )
            {
            // InternalRecipeML.g:527:1: ( 'instructions :' )
            // InternalRecipeML.g:528:2: 'instructions :'
            {
             before(grammarAccess.getRecipeAccess().getInstructionsKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getInstructionsKeyword_8()); 

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
    // $ANTLR end "rule__Recipe__Group__8__Impl"


    // $ANTLR start "rule__Recipe__Group__9"
    // InternalRecipeML.g:537:1: rule__Recipe__Group__9 : rule__Recipe__Group__9__Impl rule__Recipe__Group__10 ;
    public final void rule__Recipe__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:541:1: ( rule__Recipe__Group__9__Impl rule__Recipe__Group__10 )
            // InternalRecipeML.g:542:2: rule__Recipe__Group__9__Impl rule__Recipe__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Recipe__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__10();

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
    // $ANTLR end "rule__Recipe__Group__9"


    // $ANTLR start "rule__Recipe__Group__9__Impl"
    // InternalRecipeML.g:549:1: rule__Recipe__Group__9__Impl : ( ( rule__Recipe__MethodsAssignment_9 ) ) ;
    public final void rule__Recipe__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:553:1: ( ( ( rule__Recipe__MethodsAssignment_9 ) ) )
            // InternalRecipeML.g:554:1: ( ( rule__Recipe__MethodsAssignment_9 ) )
            {
            // InternalRecipeML.g:554:1: ( ( rule__Recipe__MethodsAssignment_9 ) )
            // InternalRecipeML.g:555:2: ( rule__Recipe__MethodsAssignment_9 )
            {
             before(grammarAccess.getRecipeAccess().getMethodsAssignment_9()); 
            // InternalRecipeML.g:556:2: ( rule__Recipe__MethodsAssignment_9 )
            // InternalRecipeML.g:556:3: rule__Recipe__MethodsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__MethodsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getMethodsAssignment_9()); 

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
    // $ANTLR end "rule__Recipe__Group__9__Impl"


    // $ANTLR start "rule__Recipe__Group__10"
    // InternalRecipeML.g:564:1: rule__Recipe__Group__10 : rule__Recipe__Group__10__Impl rule__Recipe__Group__11 ;
    public final void rule__Recipe__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:568:1: ( rule__Recipe__Group__10__Impl rule__Recipe__Group__11 )
            // InternalRecipeML.g:569:2: rule__Recipe__Group__10__Impl rule__Recipe__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Recipe__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__11();

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
    // $ANTLR end "rule__Recipe__Group__10"


    // $ANTLR start "rule__Recipe__Group__10__Impl"
    // InternalRecipeML.g:576:1: rule__Recipe__Group__10__Impl : ( ( rule__Recipe__Group_10__0 )* ) ;
    public final void rule__Recipe__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:580:1: ( ( ( rule__Recipe__Group_10__0 )* ) )
            // InternalRecipeML.g:581:1: ( ( rule__Recipe__Group_10__0 )* )
            {
            // InternalRecipeML.g:581:1: ( ( rule__Recipe__Group_10__0 )* )
            // InternalRecipeML.g:582:2: ( rule__Recipe__Group_10__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_10()); 
            // InternalRecipeML.g:583:2: ( rule__Recipe__Group_10__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRecipeML.g:583:3: rule__Recipe__Group_10__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Recipe__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Recipe__Group__10__Impl"


    // $ANTLR start "rule__Recipe__Group__11"
    // InternalRecipeML.g:591:1: rule__Recipe__Group__11 : rule__Recipe__Group__11__Impl ;
    public final void rule__Recipe__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:595:1: ( rule__Recipe__Group__11__Impl )
            // InternalRecipeML.g:596:2: rule__Recipe__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__11__Impl();

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
    // $ANTLR end "rule__Recipe__Group__11"


    // $ANTLR start "rule__Recipe__Group__11__Impl"
    // InternalRecipeML.g:602:1: rule__Recipe__Group__11__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:606:1: ( ( '}' ) )
            // InternalRecipeML.g:607:1: ( '}' )
            {
            // InternalRecipeML.g:607:1: ( '}' )
            // InternalRecipeML.g:608:2: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Recipe__Group__11__Impl"


    // $ANTLR start "rule__Recipe__Group_7__0"
    // InternalRecipeML.g:618:1: rule__Recipe__Group_7__0 : rule__Recipe__Group_7__0__Impl rule__Recipe__Group_7__1 ;
    public final void rule__Recipe__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:622:1: ( rule__Recipe__Group_7__0__Impl rule__Recipe__Group_7__1 )
            // InternalRecipeML.g:623:2: rule__Recipe__Group_7__0__Impl rule__Recipe__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Recipe__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_7__1();

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
    // $ANTLR end "rule__Recipe__Group_7__0"


    // $ANTLR start "rule__Recipe__Group_7__0__Impl"
    // InternalRecipeML.g:630:1: rule__Recipe__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:634:1: ( ( ',' ) )
            // InternalRecipeML.g:635:1: ( ',' )
            {
            // InternalRecipeML.g:635:1: ( ',' )
            // InternalRecipeML.g:636:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Recipe__Group_7__0__Impl"


    // $ANTLR start "rule__Recipe__Group_7__1"
    // InternalRecipeML.g:645:1: rule__Recipe__Group_7__1 : rule__Recipe__Group_7__1__Impl ;
    public final void rule__Recipe__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:649:1: ( rule__Recipe__Group_7__1__Impl )
            // InternalRecipeML.g:650:2: rule__Recipe__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_7__1__Impl();

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
    // $ANTLR end "rule__Recipe__Group_7__1"


    // $ANTLR start "rule__Recipe__Group_7__1__Impl"
    // InternalRecipeML.g:656:1: rule__Recipe__Group_7__1__Impl : ( ( rule__Recipe__BaseingsAssignment_7_1 ) ) ;
    public final void rule__Recipe__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:660:1: ( ( ( rule__Recipe__BaseingsAssignment_7_1 ) ) )
            // InternalRecipeML.g:661:1: ( ( rule__Recipe__BaseingsAssignment_7_1 ) )
            {
            // InternalRecipeML.g:661:1: ( ( rule__Recipe__BaseingsAssignment_7_1 ) )
            // InternalRecipeML.g:662:2: ( rule__Recipe__BaseingsAssignment_7_1 )
            {
             before(grammarAccess.getRecipeAccess().getBaseingsAssignment_7_1()); 
            // InternalRecipeML.g:663:2: ( rule__Recipe__BaseingsAssignment_7_1 )
            // InternalRecipeML.g:663:3: rule__Recipe__BaseingsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__BaseingsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getBaseingsAssignment_7_1()); 

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
    // $ANTLR end "rule__Recipe__Group_7__1__Impl"


    // $ANTLR start "rule__Recipe__Group_10__0"
    // InternalRecipeML.g:672:1: rule__Recipe__Group_10__0 : rule__Recipe__Group_10__0__Impl rule__Recipe__Group_10__1 ;
    public final void rule__Recipe__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:676:1: ( rule__Recipe__Group_10__0__Impl rule__Recipe__Group_10__1 )
            // InternalRecipeML.g:677:2: rule__Recipe__Group_10__0__Impl rule__Recipe__Group_10__1
            {
            pushFollow(FOLLOW_10);
            rule__Recipe__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_10__1();

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
    // $ANTLR end "rule__Recipe__Group_10__0"


    // $ANTLR start "rule__Recipe__Group_10__0__Impl"
    // InternalRecipeML.g:684:1: rule__Recipe__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:688:1: ( ( ',' ) )
            // InternalRecipeML.g:689:1: ( ',' )
            {
            // InternalRecipeML.g:689:1: ( ',' )
            // InternalRecipeML.g:690:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_10_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_10_0()); 

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
    // $ANTLR end "rule__Recipe__Group_10__0__Impl"


    // $ANTLR start "rule__Recipe__Group_10__1"
    // InternalRecipeML.g:699:1: rule__Recipe__Group_10__1 : rule__Recipe__Group_10__1__Impl ;
    public final void rule__Recipe__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:703:1: ( rule__Recipe__Group_10__1__Impl )
            // InternalRecipeML.g:704:2: rule__Recipe__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_10__1__Impl();

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
    // $ANTLR end "rule__Recipe__Group_10__1"


    // $ANTLR start "rule__Recipe__Group_10__1__Impl"
    // InternalRecipeML.g:710:1: rule__Recipe__Group_10__1__Impl : ( ( rule__Recipe__MethodsAssignment_10_1 ) ) ;
    public final void rule__Recipe__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:714:1: ( ( ( rule__Recipe__MethodsAssignment_10_1 ) ) )
            // InternalRecipeML.g:715:1: ( ( rule__Recipe__MethodsAssignment_10_1 ) )
            {
            // InternalRecipeML.g:715:1: ( ( rule__Recipe__MethodsAssignment_10_1 ) )
            // InternalRecipeML.g:716:2: ( rule__Recipe__MethodsAssignment_10_1 )
            {
             before(grammarAccess.getRecipeAccess().getMethodsAssignment_10_1()); 
            // InternalRecipeML.g:717:2: ( rule__Recipe__MethodsAssignment_10_1 )
            // InternalRecipeML.g:717:3: rule__Recipe__MethodsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__MethodsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getMethodsAssignment_10_1()); 

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
    // $ANTLR end "rule__Recipe__Group_10__1__Impl"


    // $ANTLR start "rule__BaseIng__Group__0"
    // InternalRecipeML.g:726:1: rule__BaseIng__Group__0 : rule__BaseIng__Group__0__Impl rule__BaseIng__Group__1 ;
    public final void rule__BaseIng__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:730:1: ( rule__BaseIng__Group__0__Impl rule__BaseIng__Group__1 )
            // InternalRecipeML.g:731:2: rule__BaseIng__Group__0__Impl rule__BaseIng__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__BaseIng__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseIng__Group__1();

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
    // $ANTLR end "rule__BaseIng__Group__0"


    // $ANTLR start "rule__BaseIng__Group__0__Impl"
    // InternalRecipeML.g:738:1: rule__BaseIng__Group__0__Impl : ( () ) ;
    public final void rule__BaseIng__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:742:1: ( ( () ) )
            // InternalRecipeML.g:743:1: ( () )
            {
            // InternalRecipeML.g:743:1: ( () )
            // InternalRecipeML.g:744:2: ()
            {
             before(grammarAccess.getBaseIngAccess().getBaseIngAction_0()); 
            // InternalRecipeML.g:745:2: ()
            // InternalRecipeML.g:745:3: 
            {
            }

             after(grammarAccess.getBaseIngAccess().getBaseIngAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseIng__Group__0__Impl"


    // $ANTLR start "rule__BaseIng__Group__1"
    // InternalRecipeML.g:753:1: rule__BaseIng__Group__1 : rule__BaseIng__Group__1__Impl rule__BaseIng__Group__2 ;
    public final void rule__BaseIng__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:757:1: ( rule__BaseIng__Group__1__Impl rule__BaseIng__Group__2 )
            // InternalRecipeML.g:758:2: rule__BaseIng__Group__1__Impl rule__BaseIng__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BaseIng__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseIng__Group__2();

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
    // $ANTLR end "rule__BaseIng__Group__1"


    // $ANTLR start "rule__BaseIng__Group__1__Impl"
    // InternalRecipeML.g:765:1: rule__BaseIng__Group__1__Impl : ( 'BaseIng' ) ;
    public final void rule__BaseIng__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:769:1: ( ( 'BaseIng' ) )
            // InternalRecipeML.g:770:1: ( 'BaseIng' )
            {
            // InternalRecipeML.g:770:1: ( 'BaseIng' )
            // InternalRecipeML.g:771:2: 'BaseIng'
            {
             before(grammarAccess.getBaseIngAccess().getBaseIngKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBaseIngAccess().getBaseIngKeyword_1()); 

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
    // $ANTLR end "rule__BaseIng__Group__1__Impl"


    // $ANTLR start "rule__BaseIng__Group__2"
    // InternalRecipeML.g:780:1: rule__BaseIng__Group__2 : rule__BaseIng__Group__2__Impl rule__BaseIng__Group__3 ;
    public final void rule__BaseIng__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:784:1: ( rule__BaseIng__Group__2__Impl rule__BaseIng__Group__3 )
            // InternalRecipeML.g:785:2: rule__BaseIng__Group__2__Impl rule__BaseIng__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BaseIng__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseIng__Group__3();

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
    // $ANTLR end "rule__BaseIng__Group__2"


    // $ANTLR start "rule__BaseIng__Group__2__Impl"
    // InternalRecipeML.g:792:1: rule__BaseIng__Group__2__Impl : ( ( rule__BaseIng__NameAssignment_2 ) ) ;
    public final void rule__BaseIng__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:796:1: ( ( ( rule__BaseIng__NameAssignment_2 ) ) )
            // InternalRecipeML.g:797:1: ( ( rule__BaseIng__NameAssignment_2 ) )
            {
            // InternalRecipeML.g:797:1: ( ( rule__BaseIng__NameAssignment_2 ) )
            // InternalRecipeML.g:798:2: ( rule__BaseIng__NameAssignment_2 )
            {
             before(grammarAccess.getBaseIngAccess().getNameAssignment_2()); 
            // InternalRecipeML.g:799:2: ( rule__BaseIng__NameAssignment_2 )
            // InternalRecipeML.g:799:3: rule__BaseIng__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseIng__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseIngAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__BaseIng__Group__2__Impl"


    // $ANTLR start "rule__BaseIng__Group__3"
    // InternalRecipeML.g:807:1: rule__BaseIng__Group__3 : rule__BaseIng__Group__3__Impl rule__BaseIng__Group__4 ;
    public final void rule__BaseIng__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:811:1: ( rule__BaseIng__Group__3__Impl rule__BaseIng__Group__4 )
            // InternalRecipeML.g:812:2: rule__BaseIng__Group__3__Impl rule__BaseIng__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__BaseIng__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseIng__Group__4();

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
    // $ANTLR end "rule__BaseIng__Group__3"


    // $ANTLR start "rule__BaseIng__Group__3__Impl"
    // InternalRecipeML.g:819:1: rule__BaseIng__Group__3__Impl : ( '{' ) ;
    public final void rule__BaseIng__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:823:1: ( ( '{' ) )
            // InternalRecipeML.g:824:1: ( '{' )
            {
            // InternalRecipeML.g:824:1: ( '{' )
            // InternalRecipeML.g:825:2: '{'
            {
             before(grammarAccess.getBaseIngAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBaseIngAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__BaseIng__Group__3__Impl"


    // $ANTLR start "rule__BaseIng__Group__4"
    // InternalRecipeML.g:834:1: rule__BaseIng__Group__4 : rule__BaseIng__Group__4__Impl rule__BaseIng__Group__5 ;
    public final void rule__BaseIng__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:838:1: ( rule__BaseIng__Group__4__Impl rule__BaseIng__Group__5 )
            // InternalRecipeML.g:839:2: rule__BaseIng__Group__4__Impl rule__BaseIng__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__BaseIng__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseIng__Group__5();

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
    // $ANTLR end "rule__BaseIng__Group__4"


    // $ANTLR start "rule__BaseIng__Group__4__Impl"
    // InternalRecipeML.g:846:1: rule__BaseIng__Group__4__Impl : ( ( rule__BaseIng__Group_4__0 )? ) ;
    public final void rule__BaseIng__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:850:1: ( ( ( rule__BaseIng__Group_4__0 )? ) )
            // InternalRecipeML.g:851:1: ( ( rule__BaseIng__Group_4__0 )? )
            {
            // InternalRecipeML.g:851:1: ( ( rule__BaseIng__Group_4__0 )? )
            // InternalRecipeML.g:852:2: ( rule__BaseIng__Group_4__0 )?
            {
             before(grammarAccess.getBaseIngAccess().getGroup_4()); 
            // InternalRecipeML.g:853:2: ( rule__BaseIng__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRecipeML.g:853:3: rule__BaseIng__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseIng__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseIngAccess().getGroup_4()); 

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
    // $ANTLR end "rule__BaseIng__Group__4__Impl"


    // $ANTLR start "rule__BaseIng__Group__5"
    // InternalRecipeML.g:861:1: rule__BaseIng__Group__5 : rule__BaseIng__Group__5__Impl rule__BaseIng__Group__6 ;
    public final void rule__BaseIng__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:865:1: ( rule__BaseIng__Group__5__Impl rule__BaseIng__Group__6 )
            // InternalRecipeML.g:866:2: rule__BaseIng__Group__5__Impl rule__BaseIng__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__BaseIng__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseIng__Group__6();

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
    // $ANTLR end "rule__BaseIng__Group__5"


    // $ANTLR start "rule__BaseIng__Group__5__Impl"
    // InternalRecipeML.g:873:1: rule__BaseIng__Group__5__Impl : ( ( rule__BaseIng__Group_5__0 )? ) ;
    public final void rule__BaseIng__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:877:1: ( ( ( rule__BaseIng__Group_5__0 )? ) )
            // InternalRecipeML.g:878:1: ( ( rule__BaseIng__Group_5__0 )? )
            {
            // InternalRecipeML.g:878:1: ( ( rule__BaseIng__Group_5__0 )? )
            // InternalRecipeML.g:879:2: ( rule__BaseIng__Group_5__0 )?
            {
             before(grammarAccess.getBaseIngAccess().getGroup_5()); 
            // InternalRecipeML.g:880:2: ( rule__BaseIng__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRecipeML.g:880:3: rule__BaseIng__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseIng__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseIngAccess().getGroup_5()); 

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
    // $ANTLR end "rule__BaseIng__Group__5__Impl"


    // $ANTLR start "rule__BaseIng__Group__6"
    // InternalRecipeML.g:888:1: rule__BaseIng__Group__6 : rule__BaseIng__Group__6__Impl ;
    public final void rule__BaseIng__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:892:1: ( rule__BaseIng__Group__6__Impl )
            // InternalRecipeML.g:893:2: rule__BaseIng__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseIng__Group__6__Impl();

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
    // $ANTLR end "rule__BaseIng__Group__6"


    // $ANTLR start "rule__BaseIng__Group__6__Impl"
    // InternalRecipeML.g:899:1: rule__BaseIng__Group__6__Impl : ( '}' ) ;
    public final void rule__BaseIng__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:903:1: ( ( '}' ) )
            // InternalRecipeML.g:904:1: ( '}' )
            {
            // InternalRecipeML.g:904:1: ( '}' )
            // InternalRecipeML.g:905:2: '}'
            {
             before(grammarAccess.getBaseIngAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBaseIngAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__BaseIng__Group__6__Impl"


    // $ANTLR start "rule__BaseIng__Group_4__0"
    // InternalRecipeML.g:915:1: rule__BaseIng__Group_4__0 : rule__BaseIng__Group_4__0__Impl rule__BaseIng__Group_4__1 ;
    public final void rule__BaseIng__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:919:1: ( rule__BaseIng__Group_4__0__Impl rule__BaseIng__Group_4__1 )
            // InternalRecipeML.g:920:2: rule__BaseIng__Group_4__0__Impl rule__BaseIng__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__BaseIng__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseIng__Group_4__1();

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
    // $ANTLR end "rule__BaseIng__Group_4__0"


    // $ANTLR start "rule__BaseIng__Group_4__0__Impl"
    // InternalRecipeML.g:927:1: rule__BaseIng__Group_4__0__Impl : ( 'count' ) ;
    public final void rule__BaseIng__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:931:1: ( ( 'count' ) )
            // InternalRecipeML.g:932:1: ( 'count' )
            {
            // InternalRecipeML.g:932:1: ( 'count' )
            // InternalRecipeML.g:933:2: 'count'
            {
             before(grammarAccess.getBaseIngAccess().getCountKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBaseIngAccess().getCountKeyword_4_0()); 

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
    // $ANTLR end "rule__BaseIng__Group_4__0__Impl"


    // $ANTLR start "rule__BaseIng__Group_4__1"
    // InternalRecipeML.g:942:1: rule__BaseIng__Group_4__1 : rule__BaseIng__Group_4__1__Impl ;
    public final void rule__BaseIng__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:946:1: ( rule__BaseIng__Group_4__1__Impl )
            // InternalRecipeML.g:947:2: rule__BaseIng__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseIng__Group_4__1__Impl();

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
    // $ANTLR end "rule__BaseIng__Group_4__1"


    // $ANTLR start "rule__BaseIng__Group_4__1__Impl"
    // InternalRecipeML.g:953:1: rule__BaseIng__Group_4__1__Impl : ( ( rule__BaseIng__CountAssignment_4_1 ) ) ;
    public final void rule__BaseIng__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:957:1: ( ( ( rule__BaseIng__CountAssignment_4_1 ) ) )
            // InternalRecipeML.g:958:1: ( ( rule__BaseIng__CountAssignment_4_1 ) )
            {
            // InternalRecipeML.g:958:1: ( ( rule__BaseIng__CountAssignment_4_1 ) )
            // InternalRecipeML.g:959:2: ( rule__BaseIng__CountAssignment_4_1 )
            {
             before(grammarAccess.getBaseIngAccess().getCountAssignment_4_1()); 
            // InternalRecipeML.g:960:2: ( rule__BaseIng__CountAssignment_4_1 )
            // InternalRecipeML.g:960:3: rule__BaseIng__CountAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseIng__CountAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseIngAccess().getCountAssignment_4_1()); 

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
    // $ANTLR end "rule__BaseIng__Group_4__1__Impl"


    // $ANTLR start "rule__BaseIng__Group_5__0"
    // InternalRecipeML.g:969:1: rule__BaseIng__Group_5__0 : rule__BaseIng__Group_5__0__Impl rule__BaseIng__Group_5__1 ;
    public final void rule__BaseIng__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:973:1: ( rule__BaseIng__Group_5__0__Impl rule__BaseIng__Group_5__1 )
            // InternalRecipeML.g:974:2: rule__BaseIng__Group_5__0__Impl rule__BaseIng__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__BaseIng__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseIng__Group_5__1();

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
    // $ANTLR end "rule__BaseIng__Group_5__0"


    // $ANTLR start "rule__BaseIng__Group_5__0__Impl"
    // InternalRecipeML.g:981:1: rule__BaseIng__Group_5__0__Impl : ( 'unit' ) ;
    public final void rule__BaseIng__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:985:1: ( ( 'unit' ) )
            // InternalRecipeML.g:986:1: ( 'unit' )
            {
            // InternalRecipeML.g:986:1: ( 'unit' )
            // InternalRecipeML.g:987:2: 'unit'
            {
             before(grammarAccess.getBaseIngAccess().getUnitKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBaseIngAccess().getUnitKeyword_5_0()); 

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
    // $ANTLR end "rule__BaseIng__Group_5__0__Impl"


    // $ANTLR start "rule__BaseIng__Group_5__1"
    // InternalRecipeML.g:996:1: rule__BaseIng__Group_5__1 : rule__BaseIng__Group_5__1__Impl ;
    public final void rule__BaseIng__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1000:1: ( rule__BaseIng__Group_5__1__Impl )
            // InternalRecipeML.g:1001:2: rule__BaseIng__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseIng__Group_5__1__Impl();

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
    // $ANTLR end "rule__BaseIng__Group_5__1"


    // $ANTLR start "rule__BaseIng__Group_5__1__Impl"
    // InternalRecipeML.g:1007:1: rule__BaseIng__Group_5__1__Impl : ( ( rule__BaseIng__UnitAssignment_5_1 ) ) ;
    public final void rule__BaseIng__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1011:1: ( ( ( rule__BaseIng__UnitAssignment_5_1 ) ) )
            // InternalRecipeML.g:1012:1: ( ( rule__BaseIng__UnitAssignment_5_1 ) )
            {
            // InternalRecipeML.g:1012:1: ( ( rule__BaseIng__UnitAssignment_5_1 ) )
            // InternalRecipeML.g:1013:2: ( rule__BaseIng__UnitAssignment_5_1 )
            {
             before(grammarAccess.getBaseIngAccess().getUnitAssignment_5_1()); 
            // InternalRecipeML.g:1014:2: ( rule__BaseIng__UnitAssignment_5_1 )
            // InternalRecipeML.g:1014:3: rule__BaseIng__UnitAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseIng__UnitAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseIngAccess().getUnitAssignment_5_1()); 

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
    // $ANTLR end "rule__BaseIng__Group_5__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalRecipeML.g:1023:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1027:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalRecipeML.g:1028:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalRecipeML.g:1035:1: rule__Method__Group__0__Impl : ( () ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1039:1: ( ( () ) )
            // InternalRecipeML.g:1040:1: ( () )
            {
            // InternalRecipeML.g:1040:1: ( () )
            // InternalRecipeML.g:1041:2: ()
            {
             before(grammarAccess.getMethodAccess().getMethodAction_0()); 
            // InternalRecipeML.g:1042:2: ()
            // InternalRecipeML.g:1042:3: 
            {
            }

             after(grammarAccess.getMethodAccess().getMethodAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalRecipeML.g:1050:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1054:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalRecipeML.g:1055:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalRecipeML.g:1062:1: rule__Method__Group__1__Impl : ( 'Method' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1066:1: ( ( 'Method' ) )
            // InternalRecipeML.g:1067:1: ( 'Method' )
            {
            // InternalRecipeML.g:1067:1: ( 'Method' )
            // InternalRecipeML.g:1068:2: 'Method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getMethodKeyword_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalRecipeML.g:1077:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1081:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalRecipeML.g:1082:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalRecipeML.g:1089:1: rule__Method__Group__2__Impl : ( ( rule__Method__Group_2__0 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1093:1: ( ( ( rule__Method__Group_2__0 )? ) )
            // InternalRecipeML.g:1094:1: ( ( rule__Method__Group_2__0 )? )
            {
            // InternalRecipeML.g:1094:1: ( ( rule__Method__Group_2__0 )? )
            // InternalRecipeML.g:1095:2: ( rule__Method__Group_2__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_2()); 
            // InternalRecipeML.g:1096:2: ( rule__Method__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRecipeML.g:1096:3: rule__Method__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalRecipeML.g:1104:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1108:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalRecipeML.g:1109:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalRecipeML.g:1116:1: rule__Method__Group__3__Impl : ( ( rule__Method__NameAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1120:1: ( ( ( rule__Method__NameAssignment_3 ) ) )
            // InternalRecipeML.g:1121:1: ( ( rule__Method__NameAssignment_3 ) )
            {
            // InternalRecipeML.g:1121:1: ( ( rule__Method__NameAssignment_3 ) )
            // InternalRecipeML.g:1122:2: ( rule__Method__NameAssignment_3 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_3()); 
            // InternalRecipeML.g:1123:2: ( rule__Method__NameAssignment_3 )
            // InternalRecipeML.g:1123:3: rule__Method__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalRecipeML.g:1131:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1135:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalRecipeML.g:1136:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalRecipeML.g:1143:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1147:1: ( ( ( rule__Method__Group_4__0 )? ) )
            // InternalRecipeML.g:1148:1: ( ( rule__Method__Group_4__0 )? )
            {
            // InternalRecipeML.g:1148:1: ( ( rule__Method__Group_4__0 )? )
            // InternalRecipeML.g:1149:2: ( rule__Method__Group_4__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalRecipeML.g:1150:2: ( rule__Method__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRecipeML.g:1150:3: rule__Method__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalRecipeML.g:1158:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1162:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalRecipeML.g:1163:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalRecipeML.g:1170:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1174:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // InternalRecipeML.g:1175:1: ( ( rule__Method__Group_5__0 )? )
            {
            // InternalRecipeML.g:1175:1: ( ( rule__Method__Group_5__0 )? )
            // InternalRecipeML.g:1176:2: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalRecipeML.g:1177:2: ( rule__Method__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRecipeML.g:1177:3: rule__Method__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalRecipeML.g:1185:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1189:1: ( rule__Method__Group__6__Impl )
            // InternalRecipeML.g:1190:2: rule__Method__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__6__Impl();

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
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalRecipeML.g:1196:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1200:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalRecipeML.g:1201:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalRecipeML.g:1201:1: ( ( rule__Method__Group_6__0 )? )
            // InternalRecipeML.g:1202:2: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalRecipeML.g:1203:2: ( rule__Method__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRecipeML.g:1203:3: rule__Method__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group_2__0"
    // InternalRecipeML.g:1212:1: rule__Method__Group_2__0 : rule__Method__Group_2__0__Impl rule__Method__Group_2__1 ;
    public final void rule__Method__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1216:1: ( rule__Method__Group_2__0__Impl rule__Method__Group_2__1 )
            // InternalRecipeML.g:1217:2: rule__Method__Group_2__0__Impl rule__Method__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_2__1();

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
    // $ANTLR end "rule__Method__Group_2__0"


    // $ANTLR start "rule__Method__Group_2__0__Impl"
    // InternalRecipeML.g:1224:1: rule__Method__Group_2__0__Impl : ( 'step' ) ;
    public final void rule__Method__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1228:1: ( ( 'step' ) )
            // InternalRecipeML.g:1229:1: ( 'step' )
            {
            // InternalRecipeML.g:1229:1: ( 'step' )
            // InternalRecipeML.g:1230:2: 'step'
            {
             before(grammarAccess.getMethodAccess().getStepKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getStepKeyword_2_0()); 

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
    // $ANTLR end "rule__Method__Group_2__0__Impl"


    // $ANTLR start "rule__Method__Group_2__1"
    // InternalRecipeML.g:1239:1: rule__Method__Group_2__1 : rule__Method__Group_2__1__Impl rule__Method__Group_2__2 ;
    public final void rule__Method__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1243:1: ( rule__Method__Group_2__1__Impl rule__Method__Group_2__2 )
            // InternalRecipeML.g:1244:2: rule__Method__Group_2__1__Impl rule__Method__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__Method__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_2__2();

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
    // $ANTLR end "rule__Method__Group_2__1"


    // $ANTLR start "rule__Method__Group_2__1__Impl"
    // InternalRecipeML.g:1251:1: rule__Method__Group_2__1__Impl : ( ( rule__Method__StepAssignment_2_1 ) ) ;
    public final void rule__Method__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1255:1: ( ( ( rule__Method__StepAssignment_2_1 ) ) )
            // InternalRecipeML.g:1256:1: ( ( rule__Method__StepAssignment_2_1 ) )
            {
            // InternalRecipeML.g:1256:1: ( ( rule__Method__StepAssignment_2_1 ) )
            // InternalRecipeML.g:1257:2: ( rule__Method__StepAssignment_2_1 )
            {
             before(grammarAccess.getMethodAccess().getStepAssignment_2_1()); 
            // InternalRecipeML.g:1258:2: ( rule__Method__StepAssignment_2_1 )
            // InternalRecipeML.g:1258:3: rule__Method__StepAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__StepAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getStepAssignment_2_1()); 

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
    // $ANTLR end "rule__Method__Group_2__1__Impl"


    // $ANTLR start "rule__Method__Group_2__2"
    // InternalRecipeML.g:1266:1: rule__Method__Group_2__2 : rule__Method__Group_2__2__Impl ;
    public final void rule__Method__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1270:1: ( rule__Method__Group_2__2__Impl )
            // InternalRecipeML.g:1271:2: rule__Method__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_2__2__Impl();

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
    // $ANTLR end "rule__Method__Group_2__2"


    // $ANTLR start "rule__Method__Group_2__2__Impl"
    // InternalRecipeML.g:1277:1: rule__Method__Group_2__2__Impl : ( ':' ) ;
    public final void rule__Method__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1281:1: ( ( ':' ) )
            // InternalRecipeML.g:1282:1: ( ':' )
            {
            // InternalRecipeML.g:1282:1: ( ':' )
            // InternalRecipeML.g:1283:2: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_2_2()); 

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
    // $ANTLR end "rule__Method__Group_2__2__Impl"


    // $ANTLR start "rule__Method__Group_4__0"
    // InternalRecipeML.g:1293:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1297:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalRecipeML.g:1298:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4__1();

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
    // $ANTLR end "rule__Method__Group_4__0"


    // $ANTLR start "rule__Method__Group_4__0__Impl"
    // InternalRecipeML.g:1305:1: rule__Method__Group_4__0__Impl : ( '-' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1309:1: ( ( '-' ) )
            // InternalRecipeML.g:1310:1: ( '-' )
            {
            // InternalRecipeML.g:1310:1: ( '-' )
            // InternalRecipeML.g:1311:2: '-'
            {
             before(grammarAccess.getMethodAccess().getHyphenMinusKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getHyphenMinusKeyword_4_0()); 

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
    // $ANTLR end "rule__Method__Group_4__0__Impl"


    // $ANTLR start "rule__Method__Group_4__1"
    // InternalRecipeML.g:1320:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl rule__Method__Group_4__2 ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1324:1: ( rule__Method__Group_4__1__Impl rule__Method__Group_4__2 )
            // InternalRecipeML.g:1325:2: rule__Method__Group_4__1__Impl rule__Method__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__Method__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4__2();

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
    // $ANTLR end "rule__Method__Group_4__1"


    // $ANTLR start "rule__Method__Group_4__1__Impl"
    // InternalRecipeML.g:1332:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__UsesAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1336:1: ( ( ( rule__Method__UsesAssignment_4_1 ) ) )
            // InternalRecipeML.g:1337:1: ( ( rule__Method__UsesAssignment_4_1 ) )
            {
            // InternalRecipeML.g:1337:1: ( ( rule__Method__UsesAssignment_4_1 ) )
            // InternalRecipeML.g:1338:2: ( rule__Method__UsesAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getUsesAssignment_4_1()); 
            // InternalRecipeML.g:1339:2: ( rule__Method__UsesAssignment_4_1 )
            // InternalRecipeML.g:1339:3: rule__Method__UsesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__UsesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getUsesAssignment_4_1()); 

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
    // $ANTLR end "rule__Method__Group_4__1__Impl"


    // $ANTLR start "rule__Method__Group_4__2"
    // InternalRecipeML.g:1347:1: rule__Method__Group_4__2 : rule__Method__Group_4__2__Impl rule__Method__Group_4__3 ;
    public final void rule__Method__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1351:1: ( rule__Method__Group_4__2__Impl rule__Method__Group_4__3 )
            // InternalRecipeML.g:1352:2: rule__Method__Group_4__2__Impl rule__Method__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__Method__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4__3();

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
    // $ANTLR end "rule__Method__Group_4__2"


    // $ANTLR start "rule__Method__Group_4__2__Impl"
    // InternalRecipeML.g:1359:1: rule__Method__Group_4__2__Impl : ( ( rule__Method__Group_4_2__0 )* ) ;
    public final void rule__Method__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1363:1: ( ( ( rule__Method__Group_4_2__0 )* ) )
            // InternalRecipeML.g:1364:1: ( ( rule__Method__Group_4_2__0 )* )
            {
            // InternalRecipeML.g:1364:1: ( ( rule__Method__Group_4_2__0 )* )
            // InternalRecipeML.g:1365:2: ( rule__Method__Group_4_2__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4_2()); 
            // InternalRecipeML.g:1366:2: ( rule__Method__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRecipeML.g:1366:3: rule__Method__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Method__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Method__Group_4__2__Impl"


    // $ANTLR start "rule__Method__Group_4__3"
    // InternalRecipeML.g:1374:1: rule__Method__Group_4__3 : rule__Method__Group_4__3__Impl ;
    public final void rule__Method__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1378:1: ( rule__Method__Group_4__3__Impl )
            // InternalRecipeML.g:1379:2: rule__Method__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_4__3__Impl();

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
    // $ANTLR end "rule__Method__Group_4__3"


    // $ANTLR start "rule__Method__Group_4__3__Impl"
    // InternalRecipeML.g:1385:1: rule__Method__Group_4__3__Impl : ( '-' ) ;
    public final void rule__Method__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1389:1: ( ( '-' ) )
            // InternalRecipeML.g:1390:1: ( '-' )
            {
            // InternalRecipeML.g:1390:1: ( '-' )
            // InternalRecipeML.g:1391:2: '-'
            {
             before(grammarAccess.getMethodAccess().getHyphenMinusKeyword_4_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getHyphenMinusKeyword_4_3()); 

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
    // $ANTLR end "rule__Method__Group_4__3__Impl"


    // $ANTLR start "rule__Method__Group_4_2__0"
    // InternalRecipeML.g:1401:1: rule__Method__Group_4_2__0 : rule__Method__Group_4_2__0__Impl rule__Method__Group_4_2__1 ;
    public final void rule__Method__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1405:1: ( rule__Method__Group_4_2__0__Impl rule__Method__Group_4_2__1 )
            // InternalRecipeML.g:1406:2: rule__Method__Group_4_2__0__Impl rule__Method__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4_2__1();

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
    // $ANTLR end "rule__Method__Group_4_2__0"


    // $ANTLR start "rule__Method__Group_4_2__0__Impl"
    // InternalRecipeML.g:1413:1: rule__Method__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1417:1: ( ( ',' ) )
            // InternalRecipeML.g:1418:1: ( ',' )
            {
            // InternalRecipeML.g:1418:1: ( ',' )
            // InternalRecipeML.g:1419:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_4_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Method__Group_4_2__0__Impl"


    // $ANTLR start "rule__Method__Group_4_2__1"
    // InternalRecipeML.g:1428:1: rule__Method__Group_4_2__1 : rule__Method__Group_4_2__1__Impl ;
    public final void rule__Method__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1432:1: ( rule__Method__Group_4_2__1__Impl )
            // InternalRecipeML.g:1433:2: rule__Method__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Method__Group_4_2__1"


    // $ANTLR start "rule__Method__Group_4_2__1__Impl"
    // InternalRecipeML.g:1439:1: rule__Method__Group_4_2__1__Impl : ( ( rule__Method__UsesAssignment_4_2_1 ) ) ;
    public final void rule__Method__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1443:1: ( ( ( rule__Method__UsesAssignment_4_2_1 ) ) )
            // InternalRecipeML.g:1444:1: ( ( rule__Method__UsesAssignment_4_2_1 ) )
            {
            // InternalRecipeML.g:1444:1: ( ( rule__Method__UsesAssignment_4_2_1 ) )
            // InternalRecipeML.g:1445:2: ( rule__Method__UsesAssignment_4_2_1 )
            {
             before(grammarAccess.getMethodAccess().getUsesAssignment_4_2_1()); 
            // InternalRecipeML.g:1446:2: ( rule__Method__UsesAssignment_4_2_1 )
            // InternalRecipeML.g:1446:3: rule__Method__UsesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__UsesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getUsesAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Method__Group_4_2__1__Impl"


    // $ANTLR start "rule__Method__Group_5__0"
    // InternalRecipeML.g:1455:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1459:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalRecipeML.g:1460:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__1();

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
    // $ANTLR end "rule__Method__Group_5__0"


    // $ANTLR start "rule__Method__Group_5__0__Impl"
    // InternalRecipeML.g:1467:1: rule__Method__Group_5__0__Impl : ( 'for' ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1471:1: ( ( 'for' ) )
            // InternalRecipeML.g:1472:1: ( 'for' )
            {
            // InternalRecipeML.g:1472:1: ( 'for' )
            // InternalRecipeML.g:1473:2: 'for'
            {
             before(grammarAccess.getMethodAccess().getForKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getForKeyword_5_0()); 

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
    // $ANTLR end "rule__Method__Group_5__0__Impl"


    // $ANTLR start "rule__Method__Group_5__1"
    // InternalRecipeML.g:1482:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl rule__Method__Group_5__2 ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1486:1: ( rule__Method__Group_5__1__Impl rule__Method__Group_5__2 )
            // InternalRecipeML.g:1487:2: rule__Method__Group_5__1__Impl rule__Method__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__Method__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__2();

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
    // $ANTLR end "rule__Method__Group_5__1"


    // $ANTLR start "rule__Method__Group_5__1__Impl"
    // InternalRecipeML.g:1494:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__TimeAssignment_5_1 ) ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1498:1: ( ( ( rule__Method__TimeAssignment_5_1 ) ) )
            // InternalRecipeML.g:1499:1: ( ( rule__Method__TimeAssignment_5_1 ) )
            {
            // InternalRecipeML.g:1499:1: ( ( rule__Method__TimeAssignment_5_1 ) )
            // InternalRecipeML.g:1500:2: ( rule__Method__TimeAssignment_5_1 )
            {
             before(grammarAccess.getMethodAccess().getTimeAssignment_5_1()); 
            // InternalRecipeML.g:1501:2: ( rule__Method__TimeAssignment_5_1 )
            // InternalRecipeML.g:1501:3: rule__Method__TimeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__TimeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTimeAssignment_5_1()); 

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
    // $ANTLR end "rule__Method__Group_5__1__Impl"


    // $ANTLR start "rule__Method__Group_5__2"
    // InternalRecipeML.g:1509:1: rule__Method__Group_5__2 : rule__Method__Group_5__2__Impl ;
    public final void rule__Method__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1513:1: ( rule__Method__Group_5__2__Impl )
            // InternalRecipeML.g:1514:2: rule__Method__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_5__2__Impl();

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
    // $ANTLR end "rule__Method__Group_5__2"


    // $ANTLR start "rule__Method__Group_5__2__Impl"
    // InternalRecipeML.g:1520:1: rule__Method__Group_5__2__Impl : ( 'minutes' ) ;
    public final void rule__Method__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1524:1: ( ( 'minutes' ) )
            // InternalRecipeML.g:1525:1: ( 'minutes' )
            {
            // InternalRecipeML.g:1525:1: ( 'minutes' )
            // InternalRecipeML.g:1526:2: 'minutes'
            {
             before(grammarAccess.getMethodAccess().getMinutesKeyword_5_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getMinutesKeyword_5_2()); 

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
    // $ANTLR end "rule__Method__Group_5__2__Impl"


    // $ANTLR start "rule__Method__Group_6__0"
    // InternalRecipeML.g:1536:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1540:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalRecipeML.g:1541:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1();

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
    // $ANTLR end "rule__Method__Group_6__0"


    // $ANTLR start "rule__Method__Group_6__0__Impl"
    // InternalRecipeML.g:1548:1: rule__Method__Group_6__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1552:1: ( ( ':' ) )
            // InternalRecipeML.g:1553:1: ( ':' )
            {
            // InternalRecipeML.g:1553:1: ( ':' )
            // InternalRecipeML.g:1554:2: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_6_0()); 

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
    // $ANTLR end "rule__Method__Group_6__0__Impl"


    // $ANTLR start "rule__Method__Group_6__1"
    // InternalRecipeML.g:1563:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl rule__Method__Group_6__2 ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1567:1: ( rule__Method__Group_6__1__Impl rule__Method__Group_6__2 )
            // InternalRecipeML.g:1568:2: rule__Method__Group_6__1__Impl rule__Method__Group_6__2
            {
            pushFollow(FOLLOW_20);
            rule__Method__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__2();

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
    // $ANTLR end "rule__Method__Group_6__1"


    // $ANTLR start "rule__Method__Group_6__1__Impl"
    // InternalRecipeML.g:1575:1: rule__Method__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1579:1: ( ( '{' ) )
            // InternalRecipeML.g:1580:1: ( '{' )
            {
            // InternalRecipeML.g:1580:1: ( '{' )
            // InternalRecipeML.g:1581:2: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Method__Group_6__1__Impl"


    // $ANTLR start "rule__Method__Group_6__2"
    // InternalRecipeML.g:1590:1: rule__Method__Group_6__2 : rule__Method__Group_6__2__Impl rule__Method__Group_6__3 ;
    public final void rule__Method__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1594:1: ( rule__Method__Group_6__2__Impl rule__Method__Group_6__3 )
            // InternalRecipeML.g:1595:2: rule__Method__Group_6__2__Impl rule__Method__Group_6__3
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__3();

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
    // $ANTLR end "rule__Method__Group_6__2"


    // $ANTLR start "rule__Method__Group_6__2__Impl"
    // InternalRecipeML.g:1602:1: rule__Method__Group_6__2__Impl : ( 'we' ) ;
    public final void rule__Method__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1606:1: ( ( 'we' ) )
            // InternalRecipeML.g:1607:1: ( 'we' )
            {
            // InternalRecipeML.g:1607:1: ( 'we' )
            // InternalRecipeML.g:1608:2: 'we'
            {
             before(grammarAccess.getMethodAccess().getWeKeyword_6_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getWeKeyword_6_2()); 

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
    // $ANTLR end "rule__Method__Group_6__2__Impl"


    // $ANTLR start "rule__Method__Group_6__3"
    // InternalRecipeML.g:1617:1: rule__Method__Group_6__3 : rule__Method__Group_6__3__Impl rule__Method__Group_6__4 ;
    public final void rule__Method__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1621:1: ( rule__Method__Group_6__3__Impl rule__Method__Group_6__4 )
            // InternalRecipeML.g:1622:2: rule__Method__Group_6__3__Impl rule__Method__Group_6__4
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__4();

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
    // $ANTLR end "rule__Method__Group_6__3"


    // $ANTLR start "rule__Method__Group_6__3__Impl"
    // InternalRecipeML.g:1629:1: rule__Method__Group_6__3__Impl : ( 'obtain' ) ;
    public final void rule__Method__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1633:1: ( ( 'obtain' ) )
            // InternalRecipeML.g:1634:1: ( 'obtain' )
            {
            // InternalRecipeML.g:1634:1: ( 'obtain' )
            // InternalRecipeML.g:1635:2: 'obtain'
            {
             before(grammarAccess.getMethodAccess().getObtainKeyword_6_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getObtainKeyword_6_3()); 

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
    // $ANTLR end "rule__Method__Group_6__3__Impl"


    // $ANTLR start "rule__Method__Group_6__4"
    // InternalRecipeML.g:1644:1: rule__Method__Group_6__4 : rule__Method__Group_6__4__Impl rule__Method__Group_6__5 ;
    public final void rule__Method__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1648:1: ( rule__Method__Group_6__4__Impl rule__Method__Group_6__5 )
            // InternalRecipeML.g:1649:2: rule__Method__Group_6__4__Impl rule__Method__Group_6__5
            {
            pushFollow(FOLLOW_11);
            rule__Method__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__5();

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
    // $ANTLR end "rule__Method__Group_6__4"


    // $ANTLR start "rule__Method__Group_6__4__Impl"
    // InternalRecipeML.g:1656:1: rule__Method__Group_6__4__Impl : ( ( rule__Method__CreatesAssignment_6_4 ) ) ;
    public final void rule__Method__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1660:1: ( ( ( rule__Method__CreatesAssignment_6_4 ) ) )
            // InternalRecipeML.g:1661:1: ( ( rule__Method__CreatesAssignment_6_4 ) )
            {
            // InternalRecipeML.g:1661:1: ( ( rule__Method__CreatesAssignment_6_4 ) )
            // InternalRecipeML.g:1662:2: ( rule__Method__CreatesAssignment_6_4 )
            {
             before(grammarAccess.getMethodAccess().getCreatesAssignment_6_4()); 
            // InternalRecipeML.g:1663:2: ( rule__Method__CreatesAssignment_6_4 )
            // InternalRecipeML.g:1663:3: rule__Method__CreatesAssignment_6_4
            {
            pushFollow(FOLLOW_2);
            rule__Method__CreatesAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getCreatesAssignment_6_4()); 

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
    // $ANTLR end "rule__Method__Group_6__4__Impl"


    // $ANTLR start "rule__Method__Group_6__5"
    // InternalRecipeML.g:1671:1: rule__Method__Group_6__5 : rule__Method__Group_6__5__Impl rule__Method__Group_6__6 ;
    public final void rule__Method__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1675:1: ( rule__Method__Group_6__5__Impl rule__Method__Group_6__6 )
            // InternalRecipeML.g:1676:2: rule__Method__Group_6__5__Impl rule__Method__Group_6__6
            {
            pushFollow(FOLLOW_11);
            rule__Method__Group_6__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__6();

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
    // $ANTLR end "rule__Method__Group_6__5"


    // $ANTLR start "rule__Method__Group_6__5__Impl"
    // InternalRecipeML.g:1683:1: rule__Method__Group_6__5__Impl : ( ( rule__Method__Group_6_5__0 )* ) ;
    public final void rule__Method__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1687:1: ( ( ( rule__Method__Group_6_5__0 )* ) )
            // InternalRecipeML.g:1688:1: ( ( rule__Method__Group_6_5__0 )* )
            {
            // InternalRecipeML.g:1688:1: ( ( rule__Method__Group_6_5__0 )* )
            // InternalRecipeML.g:1689:2: ( rule__Method__Group_6_5__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6_5()); 
            // InternalRecipeML.g:1690:2: ( rule__Method__Group_6_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRecipeML.g:1690:3: rule__Method__Group_6_5__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Method__Group_6_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_6_5()); 

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
    // $ANTLR end "rule__Method__Group_6__5__Impl"


    // $ANTLR start "rule__Method__Group_6__6"
    // InternalRecipeML.g:1698:1: rule__Method__Group_6__6 : rule__Method__Group_6__6__Impl ;
    public final void rule__Method__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1702:1: ( rule__Method__Group_6__6__Impl )
            // InternalRecipeML.g:1703:2: rule__Method__Group_6__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6__6__Impl();

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
    // $ANTLR end "rule__Method__Group_6__6"


    // $ANTLR start "rule__Method__Group_6__6__Impl"
    // InternalRecipeML.g:1709:1: rule__Method__Group_6__6__Impl : ( '}' ) ;
    public final void rule__Method__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1713:1: ( ( '}' ) )
            // InternalRecipeML.g:1714:1: ( '}' )
            {
            // InternalRecipeML.g:1714:1: ( '}' )
            // InternalRecipeML.g:1715:2: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6_6()); 

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
    // $ANTLR end "rule__Method__Group_6__6__Impl"


    // $ANTLR start "rule__Method__Group_6_5__0"
    // InternalRecipeML.g:1725:1: rule__Method__Group_6_5__0 : rule__Method__Group_6_5__0__Impl rule__Method__Group_6_5__1 ;
    public final void rule__Method__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1729:1: ( rule__Method__Group_6_5__0__Impl rule__Method__Group_6_5__1 )
            // InternalRecipeML.g:1730:2: rule__Method__Group_6_5__0__Impl rule__Method__Group_6_5__1
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6_5__1();

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
    // $ANTLR end "rule__Method__Group_6_5__0"


    // $ANTLR start "rule__Method__Group_6_5__0__Impl"
    // InternalRecipeML.g:1737:1: rule__Method__Group_6_5__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1741:1: ( ( ',' ) )
            // InternalRecipeML.g:1742:1: ( ',' )
            {
            // InternalRecipeML.g:1742:1: ( ',' )
            // InternalRecipeML.g:1743:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_6_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_6_5_0()); 

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
    // $ANTLR end "rule__Method__Group_6_5__0__Impl"


    // $ANTLR start "rule__Method__Group_6_5__1"
    // InternalRecipeML.g:1752:1: rule__Method__Group_6_5__1 : rule__Method__Group_6_5__1__Impl ;
    public final void rule__Method__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1756:1: ( rule__Method__Group_6_5__1__Impl )
            // InternalRecipeML.g:1757:2: rule__Method__Group_6_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6_5__1__Impl();

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
    // $ANTLR end "rule__Method__Group_6_5__1"


    // $ANTLR start "rule__Method__Group_6_5__1__Impl"
    // InternalRecipeML.g:1763:1: rule__Method__Group_6_5__1__Impl : ( ( rule__Method__CreatesAssignment_6_5_1 ) ) ;
    public final void rule__Method__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1767:1: ( ( ( rule__Method__CreatesAssignment_6_5_1 ) ) )
            // InternalRecipeML.g:1768:1: ( ( rule__Method__CreatesAssignment_6_5_1 ) )
            {
            // InternalRecipeML.g:1768:1: ( ( rule__Method__CreatesAssignment_6_5_1 ) )
            // InternalRecipeML.g:1769:2: ( rule__Method__CreatesAssignment_6_5_1 )
            {
             before(grammarAccess.getMethodAccess().getCreatesAssignment_6_5_1()); 
            // InternalRecipeML.g:1770:2: ( rule__Method__CreatesAssignment_6_5_1 )
            // InternalRecipeML.g:1770:3: rule__Method__CreatesAssignment_6_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__CreatesAssignment_6_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getCreatesAssignment_6_5_1()); 

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
    // $ANTLR end "rule__Method__Group_6_5__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalRecipeML.g:1779:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1783:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRecipeML.g:1784:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalRecipeML.g:1791:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1795:1: ( ( ( '-' )? ) )
            // InternalRecipeML.g:1796:1: ( ( '-' )? )
            {
            // InternalRecipeML.g:1796:1: ( ( '-' )? )
            // InternalRecipeML.g:1797:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRecipeML.g:1798:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRecipeML.g:1798:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalRecipeML.g:1806:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1810:1: ( rule__EInt__Group__1__Impl )
            // InternalRecipeML.g:1811:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalRecipeML.g:1817:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1821:1: ( ( RULE_INT ) )
            // InternalRecipeML.g:1822:1: ( RULE_INT )
            {
            // InternalRecipeML.g:1822:1: ( RULE_INT )
            // InternalRecipeML.g:1823:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalRecipeML.g:1833:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1837:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalRecipeML.g:1838:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRecipeML.g:1845:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1849:1: ( ( ( '-' )? ) )
            // InternalRecipeML.g:1850:1: ( ( '-' )? )
            {
            // InternalRecipeML.g:1850:1: ( ( '-' )? )
            // InternalRecipeML.g:1851:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalRecipeML.g:1852:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRecipeML.g:1852:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalRecipeML.g:1860:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1864:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalRecipeML.g:1865:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalRecipeML.g:1872:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1876:1: ( ( ( RULE_INT )? ) )
            // InternalRecipeML.g:1877:1: ( ( RULE_INT )? )
            {
            // InternalRecipeML.g:1877:1: ( ( RULE_INT )? )
            // InternalRecipeML.g:1878:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalRecipeML.g:1879:2: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRecipeML.g:1879:3: RULE_INT
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
    // InternalRecipeML.g:1887:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1891:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalRecipeML.g:1892:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRecipeML.g:1899:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1903:1: ( ( '.' ) )
            // InternalRecipeML.g:1904:1: ( '.' )
            {
            // InternalRecipeML.g:1904:1: ( '.' )
            // InternalRecipeML.g:1905:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRecipeML.g:1914:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1918:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalRecipeML.g:1919:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalRecipeML.g:1926:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1930:1: ( ( RULE_INT ) )
            // InternalRecipeML.g:1931:1: ( RULE_INT )
            {
            // InternalRecipeML.g:1931:1: ( RULE_INT )
            // InternalRecipeML.g:1932:2: RULE_INT
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
    // InternalRecipeML.g:1941:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1945:1: ( rule__EFloat__Group__4__Impl )
            // InternalRecipeML.g:1946:2: rule__EFloat__Group__4__Impl
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
    // InternalRecipeML.g:1952:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1956:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalRecipeML.g:1957:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalRecipeML.g:1957:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalRecipeML.g:1958:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalRecipeML.g:1959:2: ( rule__EFloat__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=11 && LA17_0<=12)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRecipeML.g:1959:3: rule__EFloat__Group_4__0
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
    // InternalRecipeML.g:1968:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1972:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalRecipeML.g:1973:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRecipeML.g:1980:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1984:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalRecipeML.g:1985:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalRecipeML.g:1985:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalRecipeML.g:1986:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalRecipeML.g:1987:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalRecipeML.g:1987:3: rule__EFloat__Alternatives_4_0
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
    // InternalRecipeML.g:1995:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:1999:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalRecipeML.g:2000:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalRecipeML.g:2007:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2011:1: ( ( ( '-' )? ) )
            // InternalRecipeML.g:2012:1: ( ( '-' )? )
            {
            // InternalRecipeML.g:2012:1: ( ( '-' )? )
            // InternalRecipeML.g:2013:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalRecipeML.g:2014:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRecipeML.g:2014:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalRecipeML.g:2022:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2026:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalRecipeML.g:2027:2: rule__EFloat__Group_4__2__Impl
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
    // InternalRecipeML.g:2033:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2037:1: ( ( RULE_INT ) )
            // InternalRecipeML.g:2038:1: ( RULE_INT )
            {
            // InternalRecipeML.g:2038:1: ( RULE_INT )
            // InternalRecipeML.g:2039:2: RULE_INT
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


    // $ANTLR start "rule__Amount__Group__0"
    // InternalRecipeML.g:2049:1: rule__Amount__Group__0 : rule__Amount__Group__0__Impl rule__Amount__Group__1 ;
    public final void rule__Amount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2053:1: ( rule__Amount__Group__0__Impl rule__Amount__Group__1 )
            // InternalRecipeML.g:2054:2: rule__Amount__Group__0__Impl rule__Amount__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Amount__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Amount__Group__1();

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
    // $ANTLR end "rule__Amount__Group__0"


    // $ANTLR start "rule__Amount__Group__0__Impl"
    // InternalRecipeML.g:2061:1: rule__Amount__Group__0__Impl : ( '{' ) ;
    public final void rule__Amount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2065:1: ( ( '{' ) )
            // InternalRecipeML.g:2066:1: ( '{' )
            {
            // InternalRecipeML.g:2066:1: ( '{' )
            // InternalRecipeML.g:2067:2: '{'
            {
             before(grammarAccess.getAmountAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAmountAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Amount__Group__0__Impl"


    // $ANTLR start "rule__Amount__Group__1"
    // InternalRecipeML.g:2076:1: rule__Amount__Group__1 : rule__Amount__Group__1__Impl rule__Amount__Group__2 ;
    public final void rule__Amount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2080:1: ( rule__Amount__Group__1__Impl rule__Amount__Group__2 )
            // InternalRecipeML.g:2081:2: rule__Amount__Group__1__Impl rule__Amount__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Amount__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Amount__Group__2();

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
    // $ANTLR end "rule__Amount__Group__1"


    // $ANTLR start "rule__Amount__Group__1__Impl"
    // InternalRecipeML.g:2088:1: rule__Amount__Group__1__Impl : ( ( rule__Amount__Group_1__0 )? ) ;
    public final void rule__Amount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2092:1: ( ( ( rule__Amount__Group_1__0 )? ) )
            // InternalRecipeML.g:2093:1: ( ( rule__Amount__Group_1__0 )? )
            {
            // InternalRecipeML.g:2093:1: ( ( rule__Amount__Group_1__0 )? )
            // InternalRecipeML.g:2094:2: ( rule__Amount__Group_1__0 )?
            {
             before(grammarAccess.getAmountAccess().getGroup_1()); 
            // InternalRecipeML.g:2095:2: ( rule__Amount__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRecipeML.g:2095:3: rule__Amount__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Amount__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmountAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Amount__Group__1__Impl"


    // $ANTLR start "rule__Amount__Group__2"
    // InternalRecipeML.g:2103:1: rule__Amount__Group__2 : rule__Amount__Group__2__Impl rule__Amount__Group__3 ;
    public final void rule__Amount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2107:1: ( rule__Amount__Group__2__Impl rule__Amount__Group__3 )
            // InternalRecipeML.g:2108:2: rule__Amount__Group__2__Impl rule__Amount__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Amount__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Amount__Group__3();

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
    // $ANTLR end "rule__Amount__Group__2"


    // $ANTLR start "rule__Amount__Group__2__Impl"
    // InternalRecipeML.g:2115:1: rule__Amount__Group__2__Impl : ( ( rule__Amount__Group_2__0 )? ) ;
    public final void rule__Amount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2119:1: ( ( ( rule__Amount__Group_2__0 )? ) )
            // InternalRecipeML.g:2120:1: ( ( rule__Amount__Group_2__0 )? )
            {
            // InternalRecipeML.g:2120:1: ( ( rule__Amount__Group_2__0 )? )
            // InternalRecipeML.g:2121:2: ( rule__Amount__Group_2__0 )?
            {
             before(grammarAccess.getAmountAccess().getGroup_2()); 
            // InternalRecipeML.g:2122:2: ( rule__Amount__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRecipeML.g:2122:3: rule__Amount__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Amount__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmountAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Amount__Group__2__Impl"


    // $ANTLR start "rule__Amount__Group__3"
    // InternalRecipeML.g:2130:1: rule__Amount__Group__3 : rule__Amount__Group__3__Impl rule__Amount__Group__4 ;
    public final void rule__Amount__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2134:1: ( rule__Amount__Group__3__Impl rule__Amount__Group__4 )
            // InternalRecipeML.g:2135:2: rule__Amount__Group__3__Impl rule__Amount__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Amount__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Amount__Group__4();

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
    // $ANTLR end "rule__Amount__Group__3"


    // $ANTLR start "rule__Amount__Group__3__Impl"
    // InternalRecipeML.g:2142:1: rule__Amount__Group__3__Impl : ( 'of' ) ;
    public final void rule__Amount__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2146:1: ( ( 'of' ) )
            // InternalRecipeML.g:2147:1: ( 'of' )
            {
            // InternalRecipeML.g:2147:1: ( 'of' )
            // InternalRecipeML.g:2148:2: 'of'
            {
             before(grammarAccess.getAmountAccess().getOfKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAmountAccess().getOfKeyword_3()); 

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
    // $ANTLR end "rule__Amount__Group__3__Impl"


    // $ANTLR start "rule__Amount__Group__4"
    // InternalRecipeML.g:2157:1: rule__Amount__Group__4 : rule__Amount__Group__4__Impl rule__Amount__Group__5 ;
    public final void rule__Amount__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2161:1: ( rule__Amount__Group__4__Impl rule__Amount__Group__5 )
            // InternalRecipeML.g:2162:2: rule__Amount__Group__4__Impl rule__Amount__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Amount__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Amount__Group__5();

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
    // $ANTLR end "rule__Amount__Group__4"


    // $ANTLR start "rule__Amount__Group__4__Impl"
    // InternalRecipeML.g:2169:1: rule__Amount__Group__4__Impl : ( ( rule__Amount__AmountofAssignment_4 ) ) ;
    public final void rule__Amount__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2173:1: ( ( ( rule__Amount__AmountofAssignment_4 ) ) )
            // InternalRecipeML.g:2174:1: ( ( rule__Amount__AmountofAssignment_4 ) )
            {
            // InternalRecipeML.g:2174:1: ( ( rule__Amount__AmountofAssignment_4 ) )
            // InternalRecipeML.g:2175:2: ( rule__Amount__AmountofAssignment_4 )
            {
             before(grammarAccess.getAmountAccess().getAmountofAssignment_4()); 
            // InternalRecipeML.g:2176:2: ( rule__Amount__AmountofAssignment_4 )
            // InternalRecipeML.g:2176:3: rule__Amount__AmountofAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Amount__AmountofAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAmountAccess().getAmountofAssignment_4()); 

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
    // $ANTLR end "rule__Amount__Group__4__Impl"


    // $ANTLR start "rule__Amount__Group__5"
    // InternalRecipeML.g:2184:1: rule__Amount__Group__5 : rule__Amount__Group__5__Impl ;
    public final void rule__Amount__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2188:1: ( rule__Amount__Group__5__Impl )
            // InternalRecipeML.g:2189:2: rule__Amount__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Amount__Group__5__Impl();

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
    // $ANTLR end "rule__Amount__Group__5"


    // $ANTLR start "rule__Amount__Group__5__Impl"
    // InternalRecipeML.g:2195:1: rule__Amount__Group__5__Impl : ( '}' ) ;
    public final void rule__Amount__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2199:1: ( ( '}' ) )
            // InternalRecipeML.g:2200:1: ( '}' )
            {
            // InternalRecipeML.g:2200:1: ( '}' )
            // InternalRecipeML.g:2201:2: '}'
            {
             before(grammarAccess.getAmountAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAmountAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Amount__Group__5__Impl"


    // $ANTLR start "rule__Amount__Group_1__0"
    // InternalRecipeML.g:2211:1: rule__Amount__Group_1__0 : rule__Amount__Group_1__0__Impl rule__Amount__Group_1__1 ;
    public final void rule__Amount__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2215:1: ( rule__Amount__Group_1__0__Impl rule__Amount__Group_1__1 )
            // InternalRecipeML.g:2216:2: rule__Amount__Group_1__0__Impl rule__Amount__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Amount__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Amount__Group_1__1();

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
    // $ANTLR end "rule__Amount__Group_1__0"


    // $ANTLR start "rule__Amount__Group_1__0__Impl"
    // InternalRecipeML.g:2223:1: rule__Amount__Group_1__0__Impl : ( 'amount' ) ;
    public final void rule__Amount__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2227:1: ( ( 'amount' ) )
            // InternalRecipeML.g:2228:1: ( 'amount' )
            {
            // InternalRecipeML.g:2228:1: ( 'amount' )
            // InternalRecipeML.g:2229:2: 'amount'
            {
             before(grammarAccess.getAmountAccess().getAmountKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAmountAccess().getAmountKeyword_1_0()); 

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
    // $ANTLR end "rule__Amount__Group_1__0__Impl"


    // $ANTLR start "rule__Amount__Group_1__1"
    // InternalRecipeML.g:2238:1: rule__Amount__Group_1__1 : rule__Amount__Group_1__1__Impl ;
    public final void rule__Amount__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2242:1: ( rule__Amount__Group_1__1__Impl )
            // InternalRecipeML.g:2243:2: rule__Amount__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Amount__Group_1__1__Impl();

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
    // $ANTLR end "rule__Amount__Group_1__1"


    // $ANTLR start "rule__Amount__Group_1__1__Impl"
    // InternalRecipeML.g:2249:1: rule__Amount__Group_1__1__Impl : ( ( rule__Amount__QuantityAssignment_1_1 ) ) ;
    public final void rule__Amount__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2253:1: ( ( ( rule__Amount__QuantityAssignment_1_1 ) ) )
            // InternalRecipeML.g:2254:1: ( ( rule__Amount__QuantityAssignment_1_1 ) )
            {
            // InternalRecipeML.g:2254:1: ( ( rule__Amount__QuantityAssignment_1_1 ) )
            // InternalRecipeML.g:2255:2: ( rule__Amount__QuantityAssignment_1_1 )
            {
             before(grammarAccess.getAmountAccess().getQuantityAssignment_1_1()); 
            // InternalRecipeML.g:2256:2: ( rule__Amount__QuantityAssignment_1_1 )
            // InternalRecipeML.g:2256:3: rule__Amount__QuantityAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Amount__QuantityAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAmountAccess().getQuantityAssignment_1_1()); 

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
    // $ANTLR end "rule__Amount__Group_1__1__Impl"


    // $ANTLR start "rule__Amount__Group_2__0"
    // InternalRecipeML.g:2265:1: rule__Amount__Group_2__0 : rule__Amount__Group_2__0__Impl rule__Amount__Group_2__1 ;
    public final void rule__Amount__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2269:1: ( rule__Amount__Group_2__0__Impl rule__Amount__Group_2__1 )
            // InternalRecipeML.g:2270:2: rule__Amount__Group_2__0__Impl rule__Amount__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Amount__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Amount__Group_2__1();

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
    // $ANTLR end "rule__Amount__Group_2__0"


    // $ANTLR start "rule__Amount__Group_2__0__Impl"
    // InternalRecipeML.g:2277:1: rule__Amount__Group_2__0__Impl : ( 'unit' ) ;
    public final void rule__Amount__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2281:1: ( ( 'unit' ) )
            // InternalRecipeML.g:2282:1: ( 'unit' )
            {
            // InternalRecipeML.g:2282:1: ( 'unit' )
            // InternalRecipeML.g:2283:2: 'unit'
            {
             before(grammarAccess.getAmountAccess().getUnitKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAmountAccess().getUnitKeyword_2_0()); 

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
    // $ANTLR end "rule__Amount__Group_2__0__Impl"


    // $ANTLR start "rule__Amount__Group_2__1"
    // InternalRecipeML.g:2292:1: rule__Amount__Group_2__1 : rule__Amount__Group_2__1__Impl ;
    public final void rule__Amount__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2296:1: ( rule__Amount__Group_2__1__Impl )
            // InternalRecipeML.g:2297:2: rule__Amount__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Amount__Group_2__1__Impl();

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
    // $ANTLR end "rule__Amount__Group_2__1"


    // $ANTLR start "rule__Amount__Group_2__1__Impl"
    // InternalRecipeML.g:2303:1: rule__Amount__Group_2__1__Impl : ( ( rule__Amount__UnitAssignment_2_1 ) ) ;
    public final void rule__Amount__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2307:1: ( ( ( rule__Amount__UnitAssignment_2_1 ) ) )
            // InternalRecipeML.g:2308:1: ( ( rule__Amount__UnitAssignment_2_1 ) )
            {
            // InternalRecipeML.g:2308:1: ( ( rule__Amount__UnitAssignment_2_1 ) )
            // InternalRecipeML.g:2309:2: ( rule__Amount__UnitAssignment_2_1 )
            {
             before(grammarAccess.getAmountAccess().getUnitAssignment_2_1()); 
            // InternalRecipeML.g:2310:2: ( rule__Amount__UnitAssignment_2_1 )
            // InternalRecipeML.g:2310:3: rule__Amount__UnitAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Amount__UnitAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAmountAccess().getUnitAssignment_2_1()); 

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
    // $ANTLR end "rule__Amount__Group_2__1__Impl"


    // $ANTLR start "rule__ModIng__Group__0"
    // InternalRecipeML.g:2319:1: rule__ModIng__Group__0 : rule__ModIng__Group__0__Impl rule__ModIng__Group__1 ;
    public final void rule__ModIng__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2323:1: ( rule__ModIng__Group__0__Impl rule__ModIng__Group__1 )
            // InternalRecipeML.g:2324:2: rule__ModIng__Group__0__Impl rule__ModIng__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ModIng__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModIng__Group__1();

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
    // $ANTLR end "rule__ModIng__Group__0"


    // $ANTLR start "rule__ModIng__Group__0__Impl"
    // InternalRecipeML.g:2331:1: rule__ModIng__Group__0__Impl : ( () ) ;
    public final void rule__ModIng__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2335:1: ( ( () ) )
            // InternalRecipeML.g:2336:1: ( () )
            {
            // InternalRecipeML.g:2336:1: ( () )
            // InternalRecipeML.g:2337:2: ()
            {
             before(grammarAccess.getModIngAccess().getModIngAction_0()); 
            // InternalRecipeML.g:2338:2: ()
            // InternalRecipeML.g:2338:3: 
            {
            }

             after(grammarAccess.getModIngAccess().getModIngAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModIng__Group__0__Impl"


    // $ANTLR start "rule__ModIng__Group__1"
    // InternalRecipeML.g:2346:1: rule__ModIng__Group__1 : rule__ModIng__Group__1__Impl rule__ModIng__Group__2 ;
    public final void rule__ModIng__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2350:1: ( rule__ModIng__Group__1__Impl rule__ModIng__Group__2 )
            // InternalRecipeML.g:2351:2: rule__ModIng__Group__1__Impl rule__ModIng__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ModIng__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModIng__Group__2();

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
    // $ANTLR end "rule__ModIng__Group__1"


    // $ANTLR start "rule__ModIng__Group__1__Impl"
    // InternalRecipeML.g:2358:1: rule__ModIng__Group__1__Impl : ( 'ModIng' ) ;
    public final void rule__ModIng__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2362:1: ( ( 'ModIng' ) )
            // InternalRecipeML.g:2363:1: ( 'ModIng' )
            {
            // InternalRecipeML.g:2363:1: ( 'ModIng' )
            // InternalRecipeML.g:2364:2: 'ModIng'
            {
             before(grammarAccess.getModIngAccess().getModIngKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModIngAccess().getModIngKeyword_1()); 

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
    // $ANTLR end "rule__ModIng__Group__1__Impl"


    // $ANTLR start "rule__ModIng__Group__2"
    // InternalRecipeML.g:2373:1: rule__ModIng__Group__2 : rule__ModIng__Group__2__Impl rule__ModIng__Group__3 ;
    public final void rule__ModIng__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2377:1: ( rule__ModIng__Group__2__Impl rule__ModIng__Group__3 )
            // InternalRecipeML.g:2378:2: rule__ModIng__Group__2__Impl rule__ModIng__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ModIng__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModIng__Group__3();

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
    // $ANTLR end "rule__ModIng__Group__2"


    // $ANTLR start "rule__ModIng__Group__2__Impl"
    // InternalRecipeML.g:2385:1: rule__ModIng__Group__2__Impl : ( ( rule__ModIng__NameAssignment_2 ) ) ;
    public final void rule__ModIng__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2389:1: ( ( ( rule__ModIng__NameAssignment_2 ) ) )
            // InternalRecipeML.g:2390:1: ( ( rule__ModIng__NameAssignment_2 ) )
            {
            // InternalRecipeML.g:2390:1: ( ( rule__ModIng__NameAssignment_2 ) )
            // InternalRecipeML.g:2391:2: ( rule__ModIng__NameAssignment_2 )
            {
             before(grammarAccess.getModIngAccess().getNameAssignment_2()); 
            // InternalRecipeML.g:2392:2: ( rule__ModIng__NameAssignment_2 )
            // InternalRecipeML.g:2392:3: rule__ModIng__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModIng__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModIngAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ModIng__Group__2__Impl"


    // $ANTLR start "rule__ModIng__Group__3"
    // InternalRecipeML.g:2400:1: rule__ModIng__Group__3 : rule__ModIng__Group__3__Impl rule__ModIng__Group__4 ;
    public final void rule__ModIng__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2404:1: ( rule__ModIng__Group__3__Impl rule__ModIng__Group__4 )
            // InternalRecipeML.g:2405:2: rule__ModIng__Group__3__Impl rule__ModIng__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ModIng__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModIng__Group__4();

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
    // $ANTLR end "rule__ModIng__Group__3"


    // $ANTLR start "rule__ModIng__Group__3__Impl"
    // InternalRecipeML.g:2412:1: rule__ModIng__Group__3__Impl : ( '{' ) ;
    public final void rule__ModIng__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2416:1: ( ( '{' ) )
            // InternalRecipeML.g:2417:1: ( '{' )
            {
            // InternalRecipeML.g:2417:1: ( '{' )
            // InternalRecipeML.g:2418:2: '{'
            {
             before(grammarAccess.getModIngAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModIngAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ModIng__Group__3__Impl"


    // $ANTLR start "rule__ModIng__Group__4"
    // InternalRecipeML.g:2427:1: rule__ModIng__Group__4 : rule__ModIng__Group__4__Impl rule__ModIng__Group__5 ;
    public final void rule__ModIng__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2431:1: ( rule__ModIng__Group__4__Impl rule__ModIng__Group__5 )
            // InternalRecipeML.g:2432:2: rule__ModIng__Group__4__Impl rule__ModIng__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ModIng__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModIng__Group__5();

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
    // $ANTLR end "rule__ModIng__Group__4"


    // $ANTLR start "rule__ModIng__Group__4__Impl"
    // InternalRecipeML.g:2439:1: rule__ModIng__Group__4__Impl : ( ( rule__ModIng__Group_4__0 )? ) ;
    public final void rule__ModIng__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2443:1: ( ( ( rule__ModIng__Group_4__0 )? ) )
            // InternalRecipeML.g:2444:1: ( ( rule__ModIng__Group_4__0 )? )
            {
            // InternalRecipeML.g:2444:1: ( ( rule__ModIng__Group_4__0 )? )
            // InternalRecipeML.g:2445:2: ( rule__ModIng__Group_4__0 )?
            {
             before(grammarAccess.getModIngAccess().getGroup_4()); 
            // InternalRecipeML.g:2446:2: ( rule__ModIng__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRecipeML.g:2446:3: rule__ModIng__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModIng__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModIngAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ModIng__Group__4__Impl"


    // $ANTLR start "rule__ModIng__Group__5"
    // InternalRecipeML.g:2454:1: rule__ModIng__Group__5 : rule__ModIng__Group__5__Impl rule__ModIng__Group__6 ;
    public final void rule__ModIng__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2458:1: ( rule__ModIng__Group__5__Impl rule__ModIng__Group__6 )
            // InternalRecipeML.g:2459:2: rule__ModIng__Group__5__Impl rule__ModIng__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ModIng__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModIng__Group__6();

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
    // $ANTLR end "rule__ModIng__Group__5"


    // $ANTLR start "rule__ModIng__Group__5__Impl"
    // InternalRecipeML.g:2466:1: rule__ModIng__Group__5__Impl : ( ( rule__ModIng__Group_5__0 )? ) ;
    public final void rule__ModIng__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2470:1: ( ( ( rule__ModIng__Group_5__0 )? ) )
            // InternalRecipeML.g:2471:1: ( ( rule__ModIng__Group_5__0 )? )
            {
            // InternalRecipeML.g:2471:1: ( ( rule__ModIng__Group_5__0 )? )
            // InternalRecipeML.g:2472:2: ( rule__ModIng__Group_5__0 )?
            {
             before(grammarAccess.getModIngAccess().getGroup_5()); 
            // InternalRecipeML.g:2473:2: ( rule__ModIng__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRecipeML.g:2473:3: rule__ModIng__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModIng__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModIngAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ModIng__Group__5__Impl"


    // $ANTLR start "rule__ModIng__Group__6"
    // InternalRecipeML.g:2481:1: rule__ModIng__Group__6 : rule__ModIng__Group__6__Impl ;
    public final void rule__ModIng__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2485:1: ( rule__ModIng__Group__6__Impl )
            // InternalRecipeML.g:2486:2: rule__ModIng__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModIng__Group__6__Impl();

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
    // $ANTLR end "rule__ModIng__Group__6"


    // $ANTLR start "rule__ModIng__Group__6__Impl"
    // InternalRecipeML.g:2492:1: rule__ModIng__Group__6__Impl : ( '}' ) ;
    public final void rule__ModIng__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2496:1: ( ( '}' ) )
            // InternalRecipeML.g:2497:1: ( '}' )
            {
            // InternalRecipeML.g:2497:1: ( '}' )
            // InternalRecipeML.g:2498:2: '}'
            {
             before(grammarAccess.getModIngAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModIngAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ModIng__Group__6__Impl"


    // $ANTLR start "rule__ModIng__Group_4__0"
    // InternalRecipeML.g:2508:1: rule__ModIng__Group_4__0 : rule__ModIng__Group_4__0__Impl rule__ModIng__Group_4__1 ;
    public final void rule__ModIng__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2512:1: ( rule__ModIng__Group_4__0__Impl rule__ModIng__Group_4__1 )
            // InternalRecipeML.g:2513:2: rule__ModIng__Group_4__0__Impl rule__ModIng__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__ModIng__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModIng__Group_4__1();

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
    // $ANTLR end "rule__ModIng__Group_4__0"


    // $ANTLR start "rule__ModIng__Group_4__0__Impl"
    // InternalRecipeML.g:2520:1: rule__ModIng__Group_4__0__Impl : ( 'count' ) ;
    public final void rule__ModIng__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2524:1: ( ( 'count' ) )
            // InternalRecipeML.g:2525:1: ( 'count' )
            {
            // InternalRecipeML.g:2525:1: ( 'count' )
            // InternalRecipeML.g:2526:2: 'count'
            {
             before(grammarAccess.getModIngAccess().getCountKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModIngAccess().getCountKeyword_4_0()); 

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
    // $ANTLR end "rule__ModIng__Group_4__0__Impl"


    // $ANTLR start "rule__ModIng__Group_4__1"
    // InternalRecipeML.g:2535:1: rule__ModIng__Group_4__1 : rule__ModIng__Group_4__1__Impl ;
    public final void rule__ModIng__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2539:1: ( rule__ModIng__Group_4__1__Impl )
            // InternalRecipeML.g:2540:2: rule__ModIng__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModIng__Group_4__1__Impl();

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
    // $ANTLR end "rule__ModIng__Group_4__1"


    // $ANTLR start "rule__ModIng__Group_4__1__Impl"
    // InternalRecipeML.g:2546:1: rule__ModIng__Group_4__1__Impl : ( ( rule__ModIng__CountAssignment_4_1 ) ) ;
    public final void rule__ModIng__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2550:1: ( ( ( rule__ModIng__CountAssignment_4_1 ) ) )
            // InternalRecipeML.g:2551:1: ( ( rule__ModIng__CountAssignment_4_1 ) )
            {
            // InternalRecipeML.g:2551:1: ( ( rule__ModIng__CountAssignment_4_1 ) )
            // InternalRecipeML.g:2552:2: ( rule__ModIng__CountAssignment_4_1 )
            {
             before(grammarAccess.getModIngAccess().getCountAssignment_4_1()); 
            // InternalRecipeML.g:2553:2: ( rule__ModIng__CountAssignment_4_1 )
            // InternalRecipeML.g:2553:3: rule__ModIng__CountAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ModIng__CountAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getModIngAccess().getCountAssignment_4_1()); 

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
    // $ANTLR end "rule__ModIng__Group_4__1__Impl"


    // $ANTLR start "rule__ModIng__Group_5__0"
    // InternalRecipeML.g:2562:1: rule__ModIng__Group_5__0 : rule__ModIng__Group_5__0__Impl rule__ModIng__Group_5__1 ;
    public final void rule__ModIng__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2566:1: ( rule__ModIng__Group_5__0__Impl rule__ModIng__Group_5__1 )
            // InternalRecipeML.g:2567:2: rule__ModIng__Group_5__0__Impl rule__ModIng__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ModIng__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModIng__Group_5__1();

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
    // $ANTLR end "rule__ModIng__Group_5__0"


    // $ANTLR start "rule__ModIng__Group_5__0__Impl"
    // InternalRecipeML.g:2574:1: rule__ModIng__Group_5__0__Impl : ( 'unit' ) ;
    public final void rule__ModIng__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2578:1: ( ( 'unit' ) )
            // InternalRecipeML.g:2579:1: ( 'unit' )
            {
            // InternalRecipeML.g:2579:1: ( 'unit' )
            // InternalRecipeML.g:2580:2: 'unit'
            {
             before(grammarAccess.getModIngAccess().getUnitKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModIngAccess().getUnitKeyword_5_0()); 

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
    // $ANTLR end "rule__ModIng__Group_5__0__Impl"


    // $ANTLR start "rule__ModIng__Group_5__1"
    // InternalRecipeML.g:2589:1: rule__ModIng__Group_5__1 : rule__ModIng__Group_5__1__Impl ;
    public final void rule__ModIng__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2593:1: ( rule__ModIng__Group_5__1__Impl )
            // InternalRecipeML.g:2594:2: rule__ModIng__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModIng__Group_5__1__Impl();

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
    // $ANTLR end "rule__ModIng__Group_5__1"


    // $ANTLR start "rule__ModIng__Group_5__1__Impl"
    // InternalRecipeML.g:2600:1: rule__ModIng__Group_5__1__Impl : ( ( rule__ModIng__UnitAssignment_5_1 ) ) ;
    public final void rule__ModIng__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2604:1: ( ( ( rule__ModIng__UnitAssignment_5_1 ) ) )
            // InternalRecipeML.g:2605:1: ( ( rule__ModIng__UnitAssignment_5_1 ) )
            {
            // InternalRecipeML.g:2605:1: ( ( rule__ModIng__UnitAssignment_5_1 ) )
            // InternalRecipeML.g:2606:2: ( rule__ModIng__UnitAssignment_5_1 )
            {
             before(grammarAccess.getModIngAccess().getUnitAssignment_5_1()); 
            // InternalRecipeML.g:2607:2: ( rule__ModIng__UnitAssignment_5_1 )
            // InternalRecipeML.g:2607:3: rule__ModIng__UnitAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ModIng__UnitAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getModIngAccess().getUnitAssignment_5_1()); 

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
    // $ANTLR end "rule__ModIng__Group_5__1__Impl"


    // $ANTLR start "rule__Recipe__NameAssignment_1"
    // InternalRecipeML.g:2616:1: rule__Recipe__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Recipe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2620:1: ( ( ruleEString ) )
            // InternalRecipeML.g:2621:2: ( ruleEString )
            {
            // InternalRecipeML.g:2621:2: ( ruleEString )
            // InternalRecipeML.g:2622:3: ruleEString
            {
             before(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Recipe__NameAssignment_1"


    // $ANTLR start "rule__Recipe__ServesAssignment_4"
    // InternalRecipeML.g:2631:1: rule__Recipe__ServesAssignment_4 : ( ruleEInt ) ;
    public final void rule__Recipe__ServesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2635:1: ( ( ruleEInt ) )
            // InternalRecipeML.g:2636:2: ( ruleEInt )
            {
            // InternalRecipeML.g:2636:2: ( ruleEInt )
            // InternalRecipeML.g:2637:3: ruleEInt
            {
             before(grammarAccess.getRecipeAccess().getServesEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getServesEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Recipe__ServesAssignment_4"


    // $ANTLR start "rule__Recipe__BaseingsAssignment_6"
    // InternalRecipeML.g:2646:1: rule__Recipe__BaseingsAssignment_6 : ( ruleBaseIng ) ;
    public final void rule__Recipe__BaseingsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2650:1: ( ( ruleBaseIng ) )
            // InternalRecipeML.g:2651:2: ( ruleBaseIng )
            {
            // InternalRecipeML.g:2651:2: ( ruleBaseIng )
            // InternalRecipeML.g:2652:3: ruleBaseIng
            {
             before(grammarAccess.getRecipeAccess().getBaseingsBaseIngParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseIng();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getBaseingsBaseIngParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Recipe__BaseingsAssignment_6"


    // $ANTLR start "rule__Recipe__BaseingsAssignment_7_1"
    // InternalRecipeML.g:2661:1: rule__Recipe__BaseingsAssignment_7_1 : ( ruleBaseIng ) ;
    public final void rule__Recipe__BaseingsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2665:1: ( ( ruleBaseIng ) )
            // InternalRecipeML.g:2666:2: ( ruleBaseIng )
            {
            // InternalRecipeML.g:2666:2: ( ruleBaseIng )
            // InternalRecipeML.g:2667:3: ruleBaseIng
            {
             before(grammarAccess.getRecipeAccess().getBaseingsBaseIngParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseIng();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getBaseingsBaseIngParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Recipe__BaseingsAssignment_7_1"


    // $ANTLR start "rule__Recipe__MethodsAssignment_9"
    // InternalRecipeML.g:2676:1: rule__Recipe__MethodsAssignment_9 : ( ruleMethod ) ;
    public final void rule__Recipe__MethodsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2680:1: ( ( ruleMethod ) )
            // InternalRecipeML.g:2681:2: ( ruleMethod )
            {
            // InternalRecipeML.g:2681:2: ( ruleMethod )
            // InternalRecipeML.g:2682:3: ruleMethod
            {
             before(grammarAccess.getRecipeAccess().getMethodsMethodParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getMethodsMethodParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Recipe__MethodsAssignment_9"


    // $ANTLR start "rule__Recipe__MethodsAssignment_10_1"
    // InternalRecipeML.g:2691:1: rule__Recipe__MethodsAssignment_10_1 : ( ruleMethod ) ;
    public final void rule__Recipe__MethodsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2695:1: ( ( ruleMethod ) )
            // InternalRecipeML.g:2696:2: ( ruleMethod )
            {
            // InternalRecipeML.g:2696:2: ( ruleMethod )
            // InternalRecipeML.g:2697:3: ruleMethod
            {
             before(grammarAccess.getRecipeAccess().getMethodsMethodParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getMethodsMethodParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Recipe__MethodsAssignment_10_1"


    // $ANTLR start "rule__BaseIng__NameAssignment_2"
    // InternalRecipeML.g:2706:1: rule__BaseIng__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BaseIng__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2710:1: ( ( ruleEString ) )
            // InternalRecipeML.g:2711:2: ( ruleEString )
            {
            // InternalRecipeML.g:2711:2: ( ruleEString )
            // InternalRecipeML.g:2712:3: ruleEString
            {
             before(grammarAccess.getBaseIngAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseIngAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BaseIng__NameAssignment_2"


    // $ANTLR start "rule__BaseIng__CountAssignment_4_1"
    // InternalRecipeML.g:2721:1: rule__BaseIng__CountAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__BaseIng__CountAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2725:1: ( ( ruleEFloat ) )
            // InternalRecipeML.g:2726:2: ( ruleEFloat )
            {
            // InternalRecipeML.g:2726:2: ( ruleEFloat )
            // InternalRecipeML.g:2727:3: ruleEFloat
            {
             before(grammarAccess.getBaseIngAccess().getCountEFloatParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getBaseIngAccess().getCountEFloatParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__BaseIng__CountAssignment_4_1"


    // $ANTLR start "rule__BaseIng__UnitAssignment_5_1"
    // InternalRecipeML.g:2736:1: rule__BaseIng__UnitAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BaseIng__UnitAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2740:1: ( ( ruleEString ) )
            // InternalRecipeML.g:2741:2: ( ruleEString )
            {
            // InternalRecipeML.g:2741:2: ( ruleEString )
            // InternalRecipeML.g:2742:3: ruleEString
            {
             before(grammarAccess.getBaseIngAccess().getUnitEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseIngAccess().getUnitEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__BaseIng__UnitAssignment_5_1"


    // $ANTLR start "rule__Method__StepAssignment_2_1"
    // InternalRecipeML.g:2751:1: rule__Method__StepAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Method__StepAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2755:1: ( ( ruleEInt ) )
            // InternalRecipeML.g:2756:2: ( ruleEInt )
            {
            // InternalRecipeML.g:2756:2: ( ruleEInt )
            // InternalRecipeML.g:2757:3: ruleEInt
            {
             before(grammarAccess.getMethodAccess().getStepEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getStepEIntParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Method__StepAssignment_2_1"


    // $ANTLR start "rule__Method__NameAssignment_3"
    // InternalRecipeML.g:2766:1: rule__Method__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2770:1: ( ( ruleEString ) )
            // InternalRecipeML.g:2771:2: ( ruleEString )
            {
            // InternalRecipeML.g:2771:2: ( ruleEString )
            // InternalRecipeML.g:2772:3: ruleEString
            {
             before(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Method__NameAssignment_3"


    // $ANTLR start "rule__Method__UsesAssignment_4_1"
    // InternalRecipeML.g:2781:1: rule__Method__UsesAssignment_4_1 : ( ruleAmount ) ;
    public final void rule__Method__UsesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2785:1: ( ( ruleAmount ) )
            // InternalRecipeML.g:2786:2: ( ruleAmount )
            {
            // InternalRecipeML.g:2786:2: ( ruleAmount )
            // InternalRecipeML.g:2787:3: ruleAmount
            {
             before(grammarAccess.getMethodAccess().getUsesAmountParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAmount();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getUsesAmountParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Method__UsesAssignment_4_1"


    // $ANTLR start "rule__Method__UsesAssignment_4_2_1"
    // InternalRecipeML.g:2796:1: rule__Method__UsesAssignment_4_2_1 : ( ruleAmount ) ;
    public final void rule__Method__UsesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2800:1: ( ( ruleAmount ) )
            // InternalRecipeML.g:2801:2: ( ruleAmount )
            {
            // InternalRecipeML.g:2801:2: ( ruleAmount )
            // InternalRecipeML.g:2802:3: ruleAmount
            {
             before(grammarAccess.getMethodAccess().getUsesAmountParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAmount();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getUsesAmountParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__Method__UsesAssignment_4_2_1"


    // $ANTLR start "rule__Method__TimeAssignment_5_1"
    // InternalRecipeML.g:2811:1: rule__Method__TimeAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Method__TimeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2815:1: ( ( ruleEInt ) )
            // InternalRecipeML.g:2816:2: ( ruleEInt )
            {
            // InternalRecipeML.g:2816:2: ( ruleEInt )
            // InternalRecipeML.g:2817:3: ruleEInt
            {
             before(grammarAccess.getMethodAccess().getTimeEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTimeEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Method__TimeAssignment_5_1"


    // $ANTLR start "rule__Method__CreatesAssignment_6_4"
    // InternalRecipeML.g:2826:1: rule__Method__CreatesAssignment_6_4 : ( ruleModIng ) ;
    public final void rule__Method__CreatesAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2830:1: ( ( ruleModIng ) )
            // InternalRecipeML.g:2831:2: ( ruleModIng )
            {
            // InternalRecipeML.g:2831:2: ( ruleModIng )
            // InternalRecipeML.g:2832:3: ruleModIng
            {
             before(grammarAccess.getMethodAccess().getCreatesModIngParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_2);
            ruleModIng();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getCreatesModIngParserRuleCall_6_4_0()); 

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
    // $ANTLR end "rule__Method__CreatesAssignment_6_4"


    // $ANTLR start "rule__Method__CreatesAssignment_6_5_1"
    // InternalRecipeML.g:2841:1: rule__Method__CreatesAssignment_6_5_1 : ( ruleModIng ) ;
    public final void rule__Method__CreatesAssignment_6_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2845:1: ( ( ruleModIng ) )
            // InternalRecipeML.g:2846:2: ( ruleModIng )
            {
            // InternalRecipeML.g:2846:2: ( ruleModIng )
            // InternalRecipeML.g:2847:3: ruleModIng
            {
             before(grammarAccess.getMethodAccess().getCreatesModIngParserRuleCall_6_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModIng();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getCreatesModIngParserRuleCall_6_5_1_0()); 

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
    // $ANTLR end "rule__Method__CreatesAssignment_6_5_1"


    // $ANTLR start "rule__Amount__QuantityAssignment_1_1"
    // InternalRecipeML.g:2856:1: rule__Amount__QuantityAssignment_1_1 : ( ruleEFloat ) ;
    public final void rule__Amount__QuantityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2860:1: ( ( ruleEFloat ) )
            // InternalRecipeML.g:2861:2: ( ruleEFloat )
            {
            // InternalRecipeML.g:2861:2: ( ruleEFloat )
            // InternalRecipeML.g:2862:3: ruleEFloat
            {
             before(grammarAccess.getAmountAccess().getQuantityEFloatParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getAmountAccess().getQuantityEFloatParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Amount__QuantityAssignment_1_1"


    // $ANTLR start "rule__Amount__UnitAssignment_2_1"
    // InternalRecipeML.g:2871:1: rule__Amount__UnitAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Amount__UnitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2875:1: ( ( ruleEString ) )
            // InternalRecipeML.g:2876:2: ( ruleEString )
            {
            // InternalRecipeML.g:2876:2: ( ruleEString )
            // InternalRecipeML.g:2877:3: ruleEString
            {
             before(grammarAccess.getAmountAccess().getUnitEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAmountAccess().getUnitEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Amount__UnitAssignment_2_1"


    // $ANTLR start "rule__Amount__AmountofAssignment_4"
    // InternalRecipeML.g:2886:1: rule__Amount__AmountofAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Amount__AmountofAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2890:1: ( ( ( ruleEString ) ) )
            // InternalRecipeML.g:2891:2: ( ( ruleEString ) )
            {
            // InternalRecipeML.g:2891:2: ( ( ruleEString ) )
            // InternalRecipeML.g:2892:3: ( ruleEString )
            {
             before(grammarAccess.getAmountAccess().getAmountofIngredientCrossReference_4_0()); 
            // InternalRecipeML.g:2893:3: ( ruleEString )
            // InternalRecipeML.g:2894:4: ruleEString
            {
             before(grammarAccess.getAmountAccess().getAmountofIngredientEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAmountAccess().getAmountofIngredientEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAmountAccess().getAmountofIngredientCrossReference_4_0()); 

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
    // $ANTLR end "rule__Amount__AmountofAssignment_4"


    // $ANTLR start "rule__ModIng__NameAssignment_2"
    // InternalRecipeML.g:2905:1: rule__ModIng__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ModIng__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2909:1: ( ( ruleEString ) )
            // InternalRecipeML.g:2910:2: ( ruleEString )
            {
            // InternalRecipeML.g:2910:2: ( ruleEString )
            // InternalRecipeML.g:2911:3: ruleEString
            {
             before(grammarAccess.getModIngAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModIngAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ModIng__NameAssignment_2"


    // $ANTLR start "rule__ModIng__CountAssignment_4_1"
    // InternalRecipeML.g:2920:1: rule__ModIng__CountAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__ModIng__CountAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2924:1: ( ( ruleEFloat ) )
            // InternalRecipeML.g:2925:2: ( ruleEFloat )
            {
            // InternalRecipeML.g:2925:2: ( ruleEFloat )
            // InternalRecipeML.g:2926:3: ruleEFloat
            {
             before(grammarAccess.getModIngAccess().getCountEFloatParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getModIngAccess().getCountEFloatParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ModIng__CountAssignment_4_1"


    // $ANTLR start "rule__ModIng__UnitAssignment_5_1"
    // InternalRecipeML.g:2935:1: rule__ModIng__UnitAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ModIng__UnitAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeML.g:2939:1: ( ( ruleEString ) )
            // InternalRecipeML.g:2940:2: ( ruleEString )
            {
            // InternalRecipeML.g:2940:2: ( ruleEString )
            // InternalRecipeML.g:2941:3: ruleEString
            {
             before(grammarAccess.getModIngAccess().getUnitEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModIngAccess().getUnitEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__ModIng__UnitAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004010040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000084000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000300400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});

}