package fr.unice.polytech.polycar.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.polycar.services.AutoLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAutoLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Car'", "'{'", "'speed'", "'}'", "'-'"
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

        public InternalAutoLangParser(TokenStream input, AutoLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Car";
       	}

       	@Override
       	protected AutoLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCar"
    // InternalAutoLang.g:64:1: entryRuleCar returns [EObject current=null] : iv_ruleCar= ruleCar EOF ;
    public final EObject entryRuleCar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCar = null;


        try {
            // InternalAutoLang.g:64:44: (iv_ruleCar= ruleCar EOF )
            // InternalAutoLang.g:65:2: iv_ruleCar= ruleCar EOF
            {
             newCompositeNode(grammarAccess.getCarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCar=ruleCar();

            state._fsp--;

             current =iv_ruleCar; 
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
    // $ANTLR end "entryRuleCar"


    // $ANTLR start "ruleCar"
    // InternalAutoLang.g:71:1: ruleCar returns [EObject current=null] : ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'speed' ( (lv_speed_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleCar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_speed_5_0 = null;



        	enterRule();

        try {
            // InternalAutoLang.g:77:2: ( ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'speed' ( (lv_speed_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalAutoLang.g:78:2: ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'speed' ( (lv_speed_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalAutoLang.g:78:2: ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'speed' ( (lv_speed_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalAutoLang.g:79:3: () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'speed' ( (lv_speed_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalAutoLang.g:79:3: ()
            // InternalAutoLang.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCarAccess().getCarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCarAccess().getCarKeyword_1());
            		
            // InternalAutoLang.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAutoLang.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalAutoLang.g:91:4: (lv_name_2_0= ruleEString )
            // InternalAutoLang.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCarAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.polycar.AutoLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAutoLang.g:113:3: (otherlv_4= 'speed' ( (lv_speed_5_0= ruleEInt ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAutoLang.g:114:4: otherlv_4= 'speed' ( (lv_speed_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getCarAccess().getSpeedKeyword_4_0());
                    			
                    // InternalAutoLang.g:118:4: ( (lv_speed_5_0= ruleEInt ) )
                    // InternalAutoLang.g:119:5: (lv_speed_5_0= ruleEInt )
                    {
                    // InternalAutoLang.g:119:5: (lv_speed_5_0= ruleEInt )
                    // InternalAutoLang.g:120:6: lv_speed_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCarAccess().getSpeedEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_speed_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCarRule());
                    						}
                    						set(
                    							current,
                    							"speed",
                    							lv_speed_5_0,
                    							"fr.unice.polytech.polycar.AutoLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCarAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleEString"
    // InternalAutoLang.g:146:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAutoLang.g:146:47: (iv_ruleEString= ruleEString EOF )
            // InternalAutoLang.g:147:2: iv_ruleEString= ruleEString EOF
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
    // InternalAutoLang.g:153:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAutoLang.g:159:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAutoLang.g:160:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAutoLang.g:160:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAutoLang.g:161:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAutoLang.g:169:3: this_ID_1= RULE_ID
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
    // InternalAutoLang.g:180:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalAutoLang.g:180:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalAutoLang.g:181:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalAutoLang.g:187:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAutoLang.g:193:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAutoLang.g:194:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAutoLang.g:194:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAutoLang.g:195:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAutoLang.g:195:3: (kw= '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAutoLang.g:196:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_8); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});

}