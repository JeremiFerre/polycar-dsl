package fr.unice.polytech.polycar.ide.contentassist.antlr.internal;

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
import fr.unice.polytech.polycar.services.AutoLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAutoLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Car'", "'{'", "'}'", "'speed'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalAutoLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAutoLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAutoLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAutoLang.g"; }


    	private AutoLangGrammarAccess grammarAccess;

    	public void setGrammarAccess(AutoLangGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCar"
    // InternalAutoLang.g:53:1: entryRuleCar : ruleCar EOF ;
    public final void entryRuleCar() throws RecognitionException {
        try {
            // InternalAutoLang.g:54:1: ( ruleCar EOF )
            // InternalAutoLang.g:55:1: ruleCar EOF
            {
             before(grammarAccess.getCarRule()); 
            pushFollow(FOLLOW_1);
            ruleCar();

            state._fsp--;

             after(grammarAccess.getCarRule()); 
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
    // $ANTLR end "entryRuleCar"


    // $ANTLR start "ruleCar"
    // InternalAutoLang.g:62:1: ruleCar : ( ( rule__Car__Group__0 ) ) ;
    public final void ruleCar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:66:2: ( ( ( rule__Car__Group__0 ) ) )
            // InternalAutoLang.g:67:2: ( ( rule__Car__Group__0 ) )
            {
            // InternalAutoLang.g:67:2: ( ( rule__Car__Group__0 ) )
            // InternalAutoLang.g:68:3: ( rule__Car__Group__0 )
            {
             before(grammarAccess.getCarAccess().getGroup()); 
            // InternalAutoLang.g:69:3: ( rule__Car__Group__0 )
            // InternalAutoLang.g:69:4: rule__Car__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getGroup()); 

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
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleEString"
    // InternalAutoLang.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAutoLang.g:79:1: ( ruleEString EOF )
            // InternalAutoLang.g:80:1: ruleEString EOF
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
    // InternalAutoLang.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAutoLang.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAutoLang.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalAutoLang.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAutoLang.g:94:3: ( rule__EString__Alternatives )
            // InternalAutoLang.g:94:4: rule__EString__Alternatives
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
    // InternalAutoLang.g:103:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalAutoLang.g:104:1: ( ruleEInt EOF )
            // InternalAutoLang.g:105:1: ruleEInt EOF
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
    // InternalAutoLang.g:112:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:116:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalAutoLang.g:117:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalAutoLang.g:117:2: ( ( rule__EInt__Group__0 ) )
            // InternalAutoLang.g:118:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalAutoLang.g:119:3: ( rule__EInt__Group__0 )
            // InternalAutoLang.g:119:4: rule__EInt__Group__0
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAutoLang.g:127:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:131:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAutoLang.g:132:2: ( RULE_STRING )
                    {
                    // InternalAutoLang.g:132:2: ( RULE_STRING )
                    // InternalAutoLang.g:133:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutoLang.g:138:2: ( RULE_ID )
                    {
                    // InternalAutoLang.g:138:2: ( RULE_ID )
                    // InternalAutoLang.g:139:3: RULE_ID
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


    // $ANTLR start "rule__Car__Group__0"
    // InternalAutoLang.g:148:1: rule__Car__Group__0 : rule__Car__Group__0__Impl rule__Car__Group__1 ;
    public final void rule__Car__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:152:1: ( rule__Car__Group__0__Impl rule__Car__Group__1 )
            // InternalAutoLang.g:153:2: rule__Car__Group__0__Impl rule__Car__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Car__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group__1();

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
    // $ANTLR end "rule__Car__Group__0"


    // $ANTLR start "rule__Car__Group__0__Impl"
    // InternalAutoLang.g:160:1: rule__Car__Group__0__Impl : ( () ) ;
    public final void rule__Car__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:164:1: ( ( () ) )
            // InternalAutoLang.g:165:1: ( () )
            {
            // InternalAutoLang.g:165:1: ( () )
            // InternalAutoLang.g:166:2: ()
            {
             before(grammarAccess.getCarAccess().getCarAction_0()); 
            // InternalAutoLang.g:167:2: ()
            // InternalAutoLang.g:167:3: 
            {
            }

             after(grammarAccess.getCarAccess().getCarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Car__Group__0__Impl"


    // $ANTLR start "rule__Car__Group__1"
    // InternalAutoLang.g:175:1: rule__Car__Group__1 : rule__Car__Group__1__Impl rule__Car__Group__2 ;
    public final void rule__Car__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:179:1: ( rule__Car__Group__1__Impl rule__Car__Group__2 )
            // InternalAutoLang.g:180:2: rule__Car__Group__1__Impl rule__Car__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Car__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group__2();

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
    // $ANTLR end "rule__Car__Group__1"


    // $ANTLR start "rule__Car__Group__1__Impl"
    // InternalAutoLang.g:187:1: rule__Car__Group__1__Impl : ( 'Car' ) ;
    public final void rule__Car__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:191:1: ( ( 'Car' ) )
            // InternalAutoLang.g:192:1: ( 'Car' )
            {
            // InternalAutoLang.g:192:1: ( 'Car' )
            // InternalAutoLang.g:193:2: 'Car'
            {
             before(grammarAccess.getCarAccess().getCarKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCarAccess().getCarKeyword_1()); 

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
    // $ANTLR end "rule__Car__Group__1__Impl"


    // $ANTLR start "rule__Car__Group__2"
    // InternalAutoLang.g:202:1: rule__Car__Group__2 : rule__Car__Group__2__Impl rule__Car__Group__3 ;
    public final void rule__Car__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:206:1: ( rule__Car__Group__2__Impl rule__Car__Group__3 )
            // InternalAutoLang.g:207:2: rule__Car__Group__2__Impl rule__Car__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Car__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group__3();

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
    // $ANTLR end "rule__Car__Group__2"


    // $ANTLR start "rule__Car__Group__2__Impl"
    // InternalAutoLang.g:214:1: rule__Car__Group__2__Impl : ( ( rule__Car__NameAssignment_2 ) ) ;
    public final void rule__Car__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:218:1: ( ( ( rule__Car__NameAssignment_2 ) ) )
            // InternalAutoLang.g:219:1: ( ( rule__Car__NameAssignment_2 ) )
            {
            // InternalAutoLang.g:219:1: ( ( rule__Car__NameAssignment_2 ) )
            // InternalAutoLang.g:220:2: ( rule__Car__NameAssignment_2 )
            {
             before(grammarAccess.getCarAccess().getNameAssignment_2()); 
            // InternalAutoLang.g:221:2: ( rule__Car__NameAssignment_2 )
            // InternalAutoLang.g:221:3: rule__Car__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Car__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Car__Group__2__Impl"


    // $ANTLR start "rule__Car__Group__3"
    // InternalAutoLang.g:229:1: rule__Car__Group__3 : rule__Car__Group__3__Impl rule__Car__Group__4 ;
    public final void rule__Car__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:233:1: ( rule__Car__Group__3__Impl rule__Car__Group__4 )
            // InternalAutoLang.g:234:2: rule__Car__Group__3__Impl rule__Car__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Car__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group__4();

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
    // $ANTLR end "rule__Car__Group__3"


    // $ANTLR start "rule__Car__Group__3__Impl"
    // InternalAutoLang.g:241:1: rule__Car__Group__3__Impl : ( '{' ) ;
    public final void rule__Car__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:245:1: ( ( '{' ) )
            // InternalAutoLang.g:246:1: ( '{' )
            {
            // InternalAutoLang.g:246:1: ( '{' )
            // InternalAutoLang.g:247:2: '{'
            {
             before(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Car__Group__3__Impl"


    // $ANTLR start "rule__Car__Group__4"
    // InternalAutoLang.g:256:1: rule__Car__Group__4 : rule__Car__Group__4__Impl rule__Car__Group__5 ;
    public final void rule__Car__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:260:1: ( rule__Car__Group__4__Impl rule__Car__Group__5 )
            // InternalAutoLang.g:261:2: rule__Car__Group__4__Impl rule__Car__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Car__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group__5();

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
    // $ANTLR end "rule__Car__Group__4"


    // $ANTLR start "rule__Car__Group__4__Impl"
    // InternalAutoLang.g:268:1: rule__Car__Group__4__Impl : ( ( rule__Car__Group_4__0 )? ) ;
    public final void rule__Car__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:272:1: ( ( ( rule__Car__Group_4__0 )? ) )
            // InternalAutoLang.g:273:1: ( ( rule__Car__Group_4__0 )? )
            {
            // InternalAutoLang.g:273:1: ( ( rule__Car__Group_4__0 )? )
            // InternalAutoLang.g:274:2: ( rule__Car__Group_4__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_4()); 
            // InternalAutoLang.g:275:2: ( rule__Car__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAutoLang.g:275:3: rule__Car__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Car__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Car__Group__4__Impl"


    // $ANTLR start "rule__Car__Group__5"
    // InternalAutoLang.g:283:1: rule__Car__Group__5 : rule__Car__Group__5__Impl ;
    public final void rule__Car__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:287:1: ( rule__Car__Group__5__Impl )
            // InternalAutoLang.g:288:2: rule__Car__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group__5__Impl();

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
    // $ANTLR end "rule__Car__Group__5"


    // $ANTLR start "rule__Car__Group__5__Impl"
    // InternalAutoLang.g:294:1: rule__Car__Group__5__Impl : ( '}' ) ;
    public final void rule__Car__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:298:1: ( ( '}' ) )
            // InternalAutoLang.g:299:1: ( '}' )
            {
            // InternalAutoLang.g:299:1: ( '}' )
            // InternalAutoLang.g:300:2: '}'
            {
             before(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Car__Group__5__Impl"


    // $ANTLR start "rule__Car__Group_4__0"
    // InternalAutoLang.g:310:1: rule__Car__Group_4__0 : rule__Car__Group_4__0__Impl rule__Car__Group_4__1 ;
    public final void rule__Car__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:314:1: ( rule__Car__Group_4__0__Impl rule__Car__Group_4__1 )
            // InternalAutoLang.g:315:2: rule__Car__Group_4__0__Impl rule__Car__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Car__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group_4__1();

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
    // $ANTLR end "rule__Car__Group_4__0"


    // $ANTLR start "rule__Car__Group_4__0__Impl"
    // InternalAutoLang.g:322:1: rule__Car__Group_4__0__Impl : ( 'speed' ) ;
    public final void rule__Car__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:326:1: ( ( 'speed' ) )
            // InternalAutoLang.g:327:1: ( 'speed' )
            {
            // InternalAutoLang.g:327:1: ( 'speed' )
            // InternalAutoLang.g:328:2: 'speed'
            {
             before(grammarAccess.getCarAccess().getSpeedKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCarAccess().getSpeedKeyword_4_0()); 

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
    // $ANTLR end "rule__Car__Group_4__0__Impl"


    // $ANTLR start "rule__Car__Group_4__1"
    // InternalAutoLang.g:337:1: rule__Car__Group_4__1 : rule__Car__Group_4__1__Impl ;
    public final void rule__Car__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:341:1: ( rule__Car__Group_4__1__Impl )
            // InternalAutoLang.g:342:2: rule__Car__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group_4__1__Impl();

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
    // $ANTLR end "rule__Car__Group_4__1"


    // $ANTLR start "rule__Car__Group_4__1__Impl"
    // InternalAutoLang.g:348:1: rule__Car__Group_4__1__Impl : ( ( rule__Car__SpeedAssignment_4_1 ) ) ;
    public final void rule__Car__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:352:1: ( ( ( rule__Car__SpeedAssignment_4_1 ) ) )
            // InternalAutoLang.g:353:1: ( ( rule__Car__SpeedAssignment_4_1 ) )
            {
            // InternalAutoLang.g:353:1: ( ( rule__Car__SpeedAssignment_4_1 ) )
            // InternalAutoLang.g:354:2: ( rule__Car__SpeedAssignment_4_1 )
            {
             before(grammarAccess.getCarAccess().getSpeedAssignment_4_1()); 
            // InternalAutoLang.g:355:2: ( rule__Car__SpeedAssignment_4_1 )
            // InternalAutoLang.g:355:3: rule__Car__SpeedAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Car__SpeedAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getSpeedAssignment_4_1()); 

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
    // $ANTLR end "rule__Car__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalAutoLang.g:364:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:368:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalAutoLang.g:369:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalAutoLang.g:376:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:380:1: ( ( ( '-' )? ) )
            // InternalAutoLang.g:381:1: ( ( '-' )? )
            {
            // InternalAutoLang.g:381:1: ( ( '-' )? )
            // InternalAutoLang.g:382:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalAutoLang.g:383:2: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAutoLang.g:383:3: '-'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalAutoLang.g:391:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:395:1: ( rule__EInt__Group__1__Impl )
            // InternalAutoLang.g:396:2: rule__EInt__Group__1__Impl
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
    // InternalAutoLang.g:402:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:406:1: ( ( RULE_INT ) )
            // InternalAutoLang.g:407:1: ( RULE_INT )
            {
            // InternalAutoLang.g:407:1: ( RULE_INT )
            // InternalAutoLang.g:408:2: RULE_INT
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


    // $ANTLR start "rule__Car__NameAssignment_2"
    // InternalAutoLang.g:418:1: rule__Car__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Car__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:422:1: ( ( ruleEString ) )
            // InternalAutoLang.g:423:2: ( ruleEString )
            {
            // InternalAutoLang.g:423:2: ( ruleEString )
            // InternalAutoLang.g:424:3: ruleEString
            {
             before(grammarAccess.getCarAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCarAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Car__NameAssignment_2"


    // $ANTLR start "rule__Car__SpeedAssignment_4_1"
    // InternalAutoLang.g:433:1: rule__Car__SpeedAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Car__SpeedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoLang.g:437:1: ( ( ruleEInt ) )
            // InternalAutoLang.g:438:2: ( ruleEInt )
            {
            // InternalAutoLang.g:438:2: ( ruleEInt )
            // InternalAutoLang.g:439:3: ruleEInt
            {
             before(grammarAccess.getCarAccess().getSpeedEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCarAccess().getSpeedEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Car__SpeedAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008040L});

}