package fr.unice.polytech.dsl.parser.antlr.internal;

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
import fr.unice.polytech.dsl.services.PolycarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPolycarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Car'", "'actions'", "':'", "'environments'", "'RUN'", "'-'", "'->'", "'is'", "'during'", "'FORB_FORWARD'", "'FORB_LEFT'", "'FORB_RIGHT'", "'OFF_ROAD_LEFT'", "'OFF_ROAD_RIGHT'", "'TRAFFIC_LIGHT_OFF'", "'TRAFFIC_LIGHT_ON'", "'OBJECT_LEFT'", "'OBJECT_RIGHT'", "'OBJECT_MIDDLE'", "'CAN_GO_LEFT'", "'CAN_GO_RIGHT'", "'MOTOR_LEFT'", "'MOTOR_RIGHT'", "'SPEED'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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


        public InternalPolycarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPolycarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPolycarParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPolycar.g"; }



     	private PolycarGrammarAccess grammarAccess;

        public InternalPolycarParser(TokenStream input, PolycarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Car";
       	}

       	@Override
       	protected PolycarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCar"
    // InternalPolycar.g:65:1: entryRuleCar returns [EObject current=null] : iv_ruleCar= ruleCar EOF ;
    public final EObject entryRuleCar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCar = null;


        try {
            // InternalPolycar.g:65:44: (iv_ruleCar= ruleCar EOF )
            // InternalPolycar.g:66:2: iv_ruleCar= ruleCar EOF
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
    // InternalPolycar.g:72:1: ruleCar returns [EObject current=null] : ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) ) ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )* otherlv_11= 'RUN' ( (otherlv_12= RULE_ID ) )? ) ;
    public final EObject ruleCar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actions_5_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_environmentEvents_9_0 = null;

        EObject lv_environmentEvents_10_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:78:2: ( ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) ) ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )* otherlv_11= 'RUN' ( (otherlv_12= RULE_ID ) )? ) )
            // InternalPolycar.g:79:2: ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) ) ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )* otherlv_11= 'RUN' ( (otherlv_12= RULE_ID ) )? )
            {
            // InternalPolycar.g:79:2: ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) ) ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )* otherlv_11= 'RUN' ( (otherlv_12= RULE_ID ) )? )
            // InternalPolycar.g:80:3: () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) ) ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )* otherlv_11= 'RUN' ( (otherlv_12= RULE_ID ) )?
            {
            // InternalPolycar.g:80:3: ()
            // InternalPolycar.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCarAccess().getCarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCarAccess().getCarKeyword_1());
            		
            // InternalPolycar.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPolycar.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalPolycar.g:92:4: (lv_name_2_0= ruleEString )
            // InternalPolycar.g:93:5: lv_name_2_0= ruleEString
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
            						"fr.unice.polytech.dsl.Polycar.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCarAccess().getActionsKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCarAccess().getColonKeyword_4());
            		
            // InternalPolycar.g:118:3: ( (lv_actions_5_0= ruleAction ) )
            // InternalPolycar.g:119:4: (lv_actions_5_0= ruleAction )
            {
            // InternalPolycar.g:119:4: (lv_actions_5_0= ruleAction )
            // InternalPolycar.g:120:5: lv_actions_5_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getCarAccess().getActionsActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_actions_5_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_5_0,
            						"fr.unice.polytech.dsl.Polycar.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycar.g:137:3: ( (lv_actions_6_0= ruleAction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPolycar.g:138:4: (lv_actions_6_0= ruleAction )
            	    {
            	    // InternalPolycar.g:138:4: (lv_actions_6_0= ruleAction )
            	    // InternalPolycar.g:139:5: lv_actions_6_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getCarAccess().getActionsActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_actions_6_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_6_0,
            	    						"fr.unice.polytech.dsl.Polycar.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getCarAccess().getEnvironmentsKeyword_7());
            		
            otherlv_8=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getCarAccess().getColonKeyword_8());
            		
            // InternalPolycar.g:164:3: ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) )
            // InternalPolycar.g:165:4: (lv_environmentEvents_9_0= ruleEnvironmentEvent )
            {
            // InternalPolycar.g:165:4: (lv_environmentEvents_9_0= ruleEnvironmentEvent )
            // InternalPolycar.g:166:5: lv_environmentEvents_9_0= ruleEnvironmentEvent
            {

            					newCompositeNode(grammarAccess.getCarAccess().getEnvironmentEventsEnvironmentEventParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_environmentEvents_9_0=ruleEnvironmentEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarRule());
            					}
            					add(
            						current,
            						"environmentEvents",
            						lv_environmentEvents_9_0,
            						"fr.unice.polytech.dsl.Polycar.EnvironmentEvent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycar.g:183:3: ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPolycar.g:184:4: (lv_environmentEvents_10_0= ruleEnvironmentEvent )
            	    {
            	    // InternalPolycar.g:184:4: (lv_environmentEvents_10_0= ruleEnvironmentEvent )
            	    // InternalPolycar.g:185:5: lv_environmentEvents_10_0= ruleEnvironmentEvent
            	    {

            	    					newCompositeNode(grammarAccess.getCarAccess().getEnvironmentEventsEnvironmentEventParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_environmentEvents_10_0=ruleEnvironmentEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"environmentEvents",
            	    						lv_environmentEvents_10_0,
            	    						"fr.unice.polytech.dsl.Polycar.EnvironmentEvent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getCarAccess().getRUNKeyword_11());
            		
            // InternalPolycar.g:206:3: ( (otherlv_12= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPolycar.g:207:4: (otherlv_12= RULE_ID )
                    {
                    // InternalPolycar.g:207:4: (otherlv_12= RULE_ID )
                    // InternalPolycar.g:208:5: otherlv_12= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCarRule());
                    					}
                    				
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getCarAccess().getDefaultActionActionCrossReference_12_0());
                    				

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
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleAction"
    // InternalPolycar.g:223:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPolycar.g:223:47: (iv_ruleAction= ruleAction EOF )
            // InternalPolycar.g:224:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalPolycar.g:230:1: ruleAction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subActions_3_0 = null;

        EObject lv_subActions_4_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:236:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* ) )
            // InternalPolycar.g:237:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* )
            {
            // InternalPolycar.g:237:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* )
            // InternalPolycar.g:238:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )*
            {
            // InternalPolycar.g:238:3: ()
            // InternalPolycar.g:239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalPolycar.g:245:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPolycar.g:246:4: (lv_name_1_0= ruleEString )
            {
            // InternalPolycar.g:246:4: (lv_name_1_0= ruleEString )
            // InternalPolycar.g:247:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.Polycar.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getColonKeyword_2());
            		
            // InternalPolycar.g:268:3: ( (lv_subActions_3_0= ruleSubAction ) )
            // InternalPolycar.g:269:4: (lv_subActions_3_0= ruleSubAction )
            {
            // InternalPolycar.g:269:4: (lv_subActions_3_0= ruleSubAction )
            // InternalPolycar.g:270:5: lv_subActions_3_0= ruleSubAction
            {

            					newCompositeNode(grammarAccess.getActionAccess().getSubActionsSubActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_subActions_3_0=ruleSubAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					add(
            						current,
            						"subActions",
            						lv_subActions_3_0,
            						"fr.unice.polytech.dsl.Polycar.SubAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycar.g:287:3: ( (lv_subActions_4_0= ruleSubAction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPolycar.g:288:4: (lv_subActions_4_0= ruleSubAction )
            	    {
            	    // InternalPolycar.g:288:4: (lv_subActions_4_0= ruleSubAction )
            	    // InternalPolycar.g:289:5: lv_subActions_4_0= ruleSubAction
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getSubActionsSubActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_subActions_4_0=ruleSubAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subActions",
            	    						lv_subActions_4_0,
            	    						"fr.unice.polytech.dsl.Polycar.SubAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEnvironmentEvent"
    // InternalPolycar.g:310:1: entryRuleEnvironmentEvent returns [EObject current=null] : iv_ruleEnvironmentEvent= ruleEnvironmentEvent EOF ;
    public final EObject entryRuleEnvironmentEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentEvent = null;


        try {
            // InternalPolycar.g:310:57: (iv_ruleEnvironmentEvent= ruleEnvironmentEvent EOF )
            // InternalPolycar.g:311:2: iv_ruleEnvironmentEvent= ruleEnvironmentEvent EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentEvent=ruleEnvironmentEvent();

            state._fsp--;

             current =iv_ruleEnvironmentEvent; 
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
    // $ANTLR end "entryRuleEnvironmentEvent"


    // $ANTLR start "ruleEnvironmentEvent"
    // InternalPolycar.g:317:1: ruleEnvironmentEvent returns [EObject current=null] : ( () (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ) ;
    public final EObject ruleEnvironmentEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:323:2: ( ( () (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ) )
            // InternalPolycar.g:324:2: ( () (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            {
            // InternalPolycar.g:324:2: ( () (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            // InternalPolycar.g:325:3: () (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            {
            // InternalPolycar.g:325:3: ()
            // InternalPolycar.g:326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentEventAccess().getEnvironmentEventAction_0(),
            					current);
            			

            }

            // InternalPolycar.g:332:3: (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalPolycar.g:333:4: otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) )
            {
            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            				newLeafNode(otherlv_1, grammarAccess.getEnvironmentEventAccess().getHyphenMinusKeyword_1_0());
            			
            // InternalPolycar.g:337:4: ( (lv_type_2_0= ruleEventType ) )
            // InternalPolycar.g:338:5: (lv_type_2_0= ruleEventType )
            {
            // InternalPolycar.g:338:5: (lv_type_2_0= ruleEventType )
            // InternalPolycar.g:339:6: lv_type_2_0= ruleEventType
            {

            						newCompositeNode(grammarAccess.getEnvironmentEventAccess().getTypeEventTypeEnumRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_12);
            lv_type_2_0=ruleEventType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEnvironmentEventRule());
            						}
            						set(
            							current,
            							"type",
            							lv_type_2_0,
            							"fr.unice.polytech.dsl.Polycar.EventType");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getEnvironmentEventAccess().getHyphenMinusGreaterThanSignKeyword_1_2());
            			
            // InternalPolycar.g:360:4: ( ( ruleEString ) )
            // InternalPolycar.g:361:5: ( ruleEString )
            {
            // InternalPolycar.g:361:5: ( ruleEString )
            // InternalPolycar.g:362:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEnvironmentEventRule());
            						}
            					

            						newCompositeNode(grammarAccess.getEnvironmentEventAccess().getActionActionCrossReference_1_3_0());
            					
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


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
    // $ANTLR end "ruleEnvironmentEvent"


    // $ANTLR start "entryRuleSubAction"
    // InternalPolycar.g:381:1: entryRuleSubAction returns [EObject current=null] : iv_ruleSubAction= ruleSubAction EOF ;
    public final EObject entryRuleSubAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAction = null;


        try {
            // InternalPolycar.g:381:50: (iv_ruleSubAction= ruleSubAction EOF )
            // InternalPolycar.g:382:2: iv_ruleSubAction= ruleSubAction EOF
            {
             newCompositeNode(grammarAccess.getSubActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubAction=ruleSubAction();

            state._fsp--;

             current =iv_ruleSubAction; 
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
    // $ANTLR end "entryRuleSubAction"


    // $ANTLR start "ruleSubAction"
    // InternalPolycar.g:388:1: ruleSubAction returns [EObject current=null] : ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? ) ) ;
    public final EObject ruleSubAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_duration_6_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:394:2: ( ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? ) ) )
            // InternalPolycar.g:395:2: ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? ) )
            {
            // InternalPolycar.g:395:2: ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? ) )
            // InternalPolycar.g:396:3: () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? )
            {
            // InternalPolycar.g:396:3: ()
            // InternalPolycar.g:397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubActionAccess().getSubActionAction_0(),
            					current);
            			

            }

            // InternalPolycar.g:403:3: (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? )
            // InternalPolycar.g:404:4: otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )?
            {
            otherlv_1=(Token)match(input,16,FOLLOW_13); 

            				newLeafNode(otherlv_1, grammarAccess.getSubActionAccess().getHyphenMinusKeyword_1_0());
            			
            // InternalPolycar.g:408:4: ( (lv_type_2_0= ruleActionType ) )
            // InternalPolycar.g:409:5: (lv_type_2_0= ruleActionType )
            {
            // InternalPolycar.g:409:5: (lv_type_2_0= ruleActionType )
            // InternalPolycar.g:410:6: lv_type_2_0= ruleActionType
            {

            						newCompositeNode(grammarAccess.getSubActionAccess().getTypeActionTypeEnumRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_14);
            lv_type_2_0=ruleActionType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSubActionRule());
            						}
            						set(
            							current,
            							"type",
            							lv_type_2_0,
            							"fr.unice.polytech.dsl.Polycar.ActionType");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getSubActionAccess().getIsKeyword_1_2());
            			
            // InternalPolycar.g:431:4: ( (lv_value_4_0= ruleEInt ) )
            // InternalPolycar.g:432:5: (lv_value_4_0= ruleEInt )
            {
            // InternalPolycar.g:432:5: (lv_value_4_0= ruleEInt )
            // InternalPolycar.g:433:6: lv_value_4_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getSubActionAccess().getValueEIntParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_16);
            lv_value_4_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSubActionRule());
            						}
            						set(
            							current,
            							"value",
            							lv_value_4_0,
            							"fr.unice.polytech.dsl.Polycar.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPolycar.g:450:4: (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPolycar.g:451:5: otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_15); 

                    					newLeafNode(otherlv_5, grammarAccess.getSubActionAccess().getDuringKeyword_1_4_0());
                    				
                    // InternalPolycar.g:455:5: ( (lv_duration_6_0= ruleEInt ) )
                    // InternalPolycar.g:456:6: (lv_duration_6_0= ruleEInt )
                    {
                    // InternalPolycar.g:456:6: (lv_duration_6_0= ruleEInt )
                    // InternalPolycar.g:457:7: lv_duration_6_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getSubActionAccess().getDurationEIntParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_duration_6_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSubActionRule());
                    							}
                    							set(
                    								current,
                    								"duration",
                    								lv_duration_6_0,
                    								"fr.unice.polytech.dsl.Polycar.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSubAction"


    // $ANTLR start "entryRuleEString"
    // InternalPolycar.g:480:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPolycar.g:480:47: (iv_ruleEString= ruleEString EOF )
            // InternalPolycar.g:481:2: iv_ruleEString= ruleEString EOF
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
    // InternalPolycar.g:487:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPolycar.g:493:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPolycar.g:494:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPolycar.g:494:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPolycar.g:495:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycar.g:503:3: this_ID_1= RULE_ID
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
    // InternalPolycar.g:514:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPolycar.g:514:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPolycar.g:515:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalPolycar.g:521:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPolycar.g:527:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPolycar.g:528:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPolycar.g:528:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPolycar.g:529:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPolycar.g:529:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPolycar.g:530:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_17); 

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


    // $ANTLR start "ruleEventType"
    // InternalPolycar.g:547:1: ruleEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_ROAD_LEFT' ) | (enumLiteral_4= 'OFF_ROAD_RIGHT' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_6= 'TRAFFIC_LIGHT_ON' ) | (enumLiteral_7= 'OBJECT_LEFT' ) | (enumLiteral_8= 'OBJECT_RIGHT' ) | (enumLiteral_9= 'OBJECT_MIDDLE' ) | (enumLiteral_10= 'CAN_GO_LEFT' ) | (enumLiteral_11= 'CAN_GO_RIGHT' ) ) ;
    public final Enumerator ruleEventType() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalPolycar.g:553:2: ( ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_ROAD_LEFT' ) | (enumLiteral_4= 'OFF_ROAD_RIGHT' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_6= 'TRAFFIC_LIGHT_ON' ) | (enumLiteral_7= 'OBJECT_LEFT' ) | (enumLiteral_8= 'OBJECT_RIGHT' ) | (enumLiteral_9= 'OBJECT_MIDDLE' ) | (enumLiteral_10= 'CAN_GO_LEFT' ) | (enumLiteral_11= 'CAN_GO_RIGHT' ) ) )
            // InternalPolycar.g:554:2: ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_ROAD_LEFT' ) | (enumLiteral_4= 'OFF_ROAD_RIGHT' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_6= 'TRAFFIC_LIGHT_ON' ) | (enumLiteral_7= 'OBJECT_LEFT' ) | (enumLiteral_8= 'OBJECT_RIGHT' ) | (enumLiteral_9= 'OBJECT_MIDDLE' ) | (enumLiteral_10= 'CAN_GO_LEFT' ) | (enumLiteral_11= 'CAN_GO_RIGHT' ) )
            {
            // InternalPolycar.g:554:2: ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_ROAD_LEFT' ) | (enumLiteral_4= 'OFF_ROAD_RIGHT' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_6= 'TRAFFIC_LIGHT_ON' ) | (enumLiteral_7= 'OBJECT_LEFT' ) | (enumLiteral_8= 'OBJECT_RIGHT' ) | (enumLiteral_9= 'OBJECT_MIDDLE' ) | (enumLiteral_10= 'CAN_GO_LEFT' ) | (enumLiteral_11= 'CAN_GO_RIGHT' ) )
            int alt8=12;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            case 26:
                {
                alt8=7;
                }
                break;
            case 27:
                {
                alt8=8;
                }
                break;
            case 28:
                {
                alt8=9;
                }
                break;
            case 29:
                {
                alt8=10;
                }
                break;
            case 30:
                {
                alt8=11;
                }
                break;
            case 31:
                {
                alt8=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPolycar.g:555:3: (enumLiteral_0= 'FORB_FORWARD' )
                    {
                    // InternalPolycar.g:555:3: (enumLiteral_0= 'FORB_FORWARD' )
                    // InternalPolycar.g:556:4: enumLiteral_0= 'FORB_FORWARD'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getFORB_FORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getFORB_FORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycar.g:563:3: (enumLiteral_1= 'FORB_LEFT' )
                    {
                    // InternalPolycar.g:563:3: (enumLiteral_1= 'FORB_LEFT' )
                    // InternalPolycar.g:564:4: enumLiteral_1= 'FORB_LEFT'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getFORB_LEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventTypeAccess().getFORB_LEFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycar.g:571:3: (enumLiteral_2= 'FORB_RIGHT' )
                    {
                    // InternalPolycar.g:571:3: (enumLiteral_2= 'FORB_RIGHT' )
                    // InternalPolycar.g:572:4: enumLiteral_2= 'FORB_RIGHT'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getFORB_RIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEventTypeAccess().getFORB_RIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycar.g:579:3: (enumLiteral_3= 'OFF_ROAD_LEFT' )
                    {
                    // InternalPolycar.g:579:3: (enumLiteral_3= 'OFF_ROAD_LEFT' )
                    // InternalPolycar.g:580:4: enumLiteral_3= 'OFF_ROAD_LEFT'
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOFF_ROAD_LEFTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEventTypeAccess().getOFF_ROAD_LEFTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycar.g:587:3: (enumLiteral_4= 'OFF_ROAD_RIGHT' )
                    {
                    // InternalPolycar.g:587:3: (enumLiteral_4= 'OFF_ROAD_RIGHT' )
                    // InternalPolycar.g:588:4: enumLiteral_4= 'OFF_ROAD_RIGHT'
                    {
                    enumLiteral_4=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOFF_ROAD_RIGHTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEventTypeAccess().getOFF_ROAD_RIGHTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycar.g:595:3: (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' )
                    {
                    // InternalPolycar.g:595:3: (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' )
                    // InternalPolycar.g:596:4: enumLiteral_5= 'TRAFFIC_LIGHT_OFF'
                    {
                    enumLiteral_5=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalPolycar.g:603:3: (enumLiteral_6= 'TRAFFIC_LIGHT_ON' )
                    {
                    // InternalPolycar.g:603:3: (enumLiteral_6= 'TRAFFIC_LIGHT_ON' )
                    // InternalPolycar.g:604:4: enumLiteral_6= 'TRAFFIC_LIGHT_ON'
                    {
                    enumLiteral_6=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_ONEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_ONEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalPolycar.g:611:3: (enumLiteral_7= 'OBJECT_LEFT' )
                    {
                    // InternalPolycar.g:611:3: (enumLiteral_7= 'OBJECT_LEFT' )
                    // InternalPolycar.g:612:4: enumLiteral_7= 'OBJECT_LEFT'
                    {
                    enumLiteral_7=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOBJECT_LEFTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getEventTypeAccess().getOBJECT_LEFTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalPolycar.g:619:3: (enumLiteral_8= 'OBJECT_RIGHT' )
                    {
                    // InternalPolycar.g:619:3: (enumLiteral_8= 'OBJECT_RIGHT' )
                    // InternalPolycar.g:620:4: enumLiteral_8= 'OBJECT_RIGHT'
                    {
                    enumLiteral_8=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOBJECT_RIGHTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getEventTypeAccess().getOBJECT_RIGHTEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalPolycar.g:627:3: (enumLiteral_9= 'OBJECT_MIDDLE' )
                    {
                    // InternalPolycar.g:627:3: (enumLiteral_9= 'OBJECT_MIDDLE' )
                    // InternalPolycar.g:628:4: enumLiteral_9= 'OBJECT_MIDDLE'
                    {
                    enumLiteral_9=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOBJECT_MIDDLEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getEventTypeAccess().getOBJECT_MIDDLEEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalPolycar.g:635:3: (enumLiteral_10= 'CAN_GO_LEFT' )
                    {
                    // InternalPolycar.g:635:3: (enumLiteral_10= 'CAN_GO_LEFT' )
                    // InternalPolycar.g:636:4: enumLiteral_10= 'CAN_GO_LEFT'
                    {
                    enumLiteral_10=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getCAN_GO_LEFTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getEventTypeAccess().getCAN_GO_LEFTEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalPolycar.g:643:3: (enumLiteral_11= 'CAN_GO_RIGHT' )
                    {
                    // InternalPolycar.g:643:3: (enumLiteral_11= 'CAN_GO_RIGHT' )
                    // InternalPolycar.g:644:4: enumLiteral_11= 'CAN_GO_RIGHT'
                    {
                    enumLiteral_11=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getCAN_GO_RIGHTEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getEventTypeAccess().getCAN_GO_RIGHTEnumLiteralDeclaration_11());
                    			

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
    // $ANTLR end "ruleEventType"


    // $ANTLR start "ruleActionType"
    // InternalPolycar.g:654:1: ruleActionType returns [Enumerator current=null] : ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) ) ;
    public final Enumerator ruleActionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPolycar.g:660:2: ( ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) ) )
            // InternalPolycar.g:661:2: ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) )
            {
            // InternalPolycar.g:661:2: ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPolycar.g:662:3: (enumLiteral_0= 'MOTOR_LEFT' )
                    {
                    // InternalPolycar.g:662:3: (enumLiteral_0= 'MOTOR_LEFT' )
                    // InternalPolycar.g:663:4: enumLiteral_0= 'MOTOR_LEFT'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getMOTOR_LEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionTypeAccess().getMOTOR_LEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycar.g:670:3: (enumLiteral_1= 'MOTOR_RIGHT' )
                    {
                    // InternalPolycar.g:670:3: (enumLiteral_1= 'MOTOR_RIGHT' )
                    // InternalPolycar.g:671:4: enumLiteral_1= 'MOTOR_RIGHT'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getMOTOR_RIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionTypeAccess().getMOTOR_RIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycar.g:678:3: (enumLiteral_2= 'SPEED' )
                    {
                    // InternalPolycar.g:678:3: (enumLiteral_2= 'SPEED' )
                    // InternalPolycar.g:679:4: enumLiteral_2= 'SPEED'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getSPEEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionTypeAccess().getSPEEDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleActionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000FFF00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});

}