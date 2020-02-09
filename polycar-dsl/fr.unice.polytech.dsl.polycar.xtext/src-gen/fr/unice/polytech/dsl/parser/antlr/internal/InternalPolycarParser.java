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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Car'", "'actions'", "':'", "'environments'", "'RUN'", "'-'", "'->'", "'is'", "'FORB_FORWARD'", "'FORB_LEFT'", "'FORB_RIGHT'", "'OFF_THE_ROAD'", "'TRAFFIC_LIGHT_OFF'", "'TRAFFIC_LIGHT_ON'", "'MOTOR_LEFT'", "'MOTOR_RIGHT'", "'SPEED'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
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
    // InternalPolycar.g:72:1: ruleCar returns [EObject current=null] : ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) ) ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )* otherlv_11= 'RUN' ) ;
    public final EObject ruleCar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actions_5_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_environmentEvents_9_0 = null;

        EObject lv_environmentEvents_10_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:78:2: ( ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) ) ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )* otherlv_11= 'RUN' ) )
            // InternalPolycar.g:79:2: ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) ) ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )* otherlv_11= 'RUN' )
            {
            // InternalPolycar.g:79:2: ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) ) ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )* otherlv_11= 'RUN' )
            // InternalPolycar.g:80:3: () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_environmentEvents_9_0= ruleEnvironmentEvent ) ) ( (lv_environmentEvents_10_0= ruleEnvironmentEvent ) )* otherlv_11= 'RUN'
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

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
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

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCarAccess().getRUNKeyword_11());
            		

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
    // InternalPolycar.g:210:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPolycar.g:210:47: (iv_ruleAction= ruleAction EOF )
            // InternalPolycar.g:211:2: iv_ruleAction= ruleAction EOF
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
    // InternalPolycar.g:217:1: ruleAction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subActions_3_0 = null;

        EObject lv_subActions_4_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:223:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* ) )
            // InternalPolycar.g:224:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* )
            {
            // InternalPolycar.g:224:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* )
            // InternalPolycar.g:225:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )*
            {
            // InternalPolycar.g:225:3: ()
            // InternalPolycar.g:226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalPolycar.g:232:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPolycar.g:233:4: (lv_name_1_0= ruleEString )
            {
            // InternalPolycar.g:233:4: (lv_name_1_0= ruleEString )
            // InternalPolycar.g:234:5: lv_name_1_0= ruleEString
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
            		
            // InternalPolycar.g:255:3: ( (lv_subActions_3_0= ruleSubAction ) )
            // InternalPolycar.g:256:4: (lv_subActions_3_0= ruleSubAction )
            {
            // InternalPolycar.g:256:4: (lv_subActions_3_0= ruleSubAction )
            // InternalPolycar.g:257:5: lv_subActions_3_0= ruleSubAction
            {

            					newCompositeNode(grammarAccess.getActionAccess().getSubActionsSubActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalPolycar.g:274:3: ( (lv_subActions_4_0= ruleSubAction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPolycar.g:275:4: (lv_subActions_4_0= ruleSubAction )
            	    {
            	    // InternalPolycar.g:275:4: (lv_subActions_4_0= ruleSubAction )
            	    // InternalPolycar.g:276:5: lv_subActions_4_0= ruleSubAction
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getSubActionsSubActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop3;
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
    // InternalPolycar.g:297:1: entryRuleEnvironmentEvent returns [EObject current=null] : iv_ruleEnvironmentEvent= ruleEnvironmentEvent EOF ;
    public final EObject entryRuleEnvironmentEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentEvent = null;


        try {
            // InternalPolycar.g:297:57: (iv_ruleEnvironmentEvent= ruleEnvironmentEvent EOF )
            // InternalPolycar.g:298:2: iv_ruleEnvironmentEvent= ruleEnvironmentEvent EOF
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
    // InternalPolycar.g:304:1: ruleEnvironmentEvent returns [EObject current=null] : ( () (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ) ;
    public final EObject ruleEnvironmentEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:310:2: ( ( () (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ) )
            // InternalPolycar.g:311:2: ( () (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            {
            // InternalPolycar.g:311:2: ( () (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            // InternalPolycar.g:312:3: () (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            {
            // InternalPolycar.g:312:3: ()
            // InternalPolycar.g:313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentEventAccess().getEnvironmentEventAction_0(),
            					current);
            			

            }

            // InternalPolycar.g:319:3: (otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalPolycar.g:320:4: otherlv_1= '-' ( (lv_type_2_0= ruleEventType ) ) otherlv_3= '->' ( ( ruleEString ) )
            {
            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            				newLeafNode(otherlv_1, grammarAccess.getEnvironmentEventAccess().getHyphenMinusKeyword_1_0());
            			
            // InternalPolycar.g:324:4: ( (lv_type_2_0= ruleEventType ) )
            // InternalPolycar.g:325:5: (lv_type_2_0= ruleEventType )
            {
            // InternalPolycar.g:325:5: (lv_type_2_0= ruleEventType )
            // InternalPolycar.g:326:6: lv_type_2_0= ruleEventType
            {

            						newCompositeNode(grammarAccess.getEnvironmentEventAccess().getTypeEventTypeEnumRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_11);
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
            			
            // InternalPolycar.g:347:4: ( ( ruleEString ) )
            // InternalPolycar.g:348:5: ( ruleEString )
            {
            // InternalPolycar.g:348:5: ( ruleEString )
            // InternalPolycar.g:349:6: ruleEString
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
    // InternalPolycar.g:368:1: entryRuleSubAction returns [EObject current=null] : iv_ruleSubAction= ruleSubAction EOF ;
    public final EObject entryRuleSubAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAction = null;


        try {
            // InternalPolycar.g:368:50: (iv_ruleSubAction= ruleSubAction EOF )
            // InternalPolycar.g:369:2: iv_ruleSubAction= ruleSubAction EOF
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
    // InternalPolycar.g:375:1: ruleSubAction returns [EObject current=null] : ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) ) ) ;
    public final EObject ruleSubAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:381:2: ( ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) ) ) )
            // InternalPolycar.g:382:2: ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) ) )
            {
            // InternalPolycar.g:382:2: ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) ) )
            // InternalPolycar.g:383:3: () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) )
            {
            // InternalPolycar.g:383:3: ()
            // InternalPolycar.g:384:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubActionAccess().getSubActionAction_0(),
            					current);
            			

            }

            // InternalPolycar.g:390:3: (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) )
            // InternalPolycar.g:391:4: otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) )
            {
            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            				newLeafNode(otherlv_1, grammarAccess.getSubActionAccess().getHyphenMinusKeyword_1_0());
            			
            // InternalPolycar.g:395:4: ( (lv_type_2_0= ruleActionType ) )
            // InternalPolycar.g:396:5: (lv_type_2_0= ruleActionType )
            {
            // InternalPolycar.g:396:5: (lv_type_2_0= ruleActionType )
            // InternalPolycar.g:397:6: lv_type_2_0= ruleActionType
            {

            						newCompositeNode(grammarAccess.getSubActionAccess().getTypeActionTypeEnumRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,18,FOLLOW_14); 

            				newLeafNode(otherlv_3, grammarAccess.getSubActionAccess().getIsKeyword_1_2());
            			
            // InternalPolycar.g:418:4: ( (lv_value_4_0= ruleEInt ) )
            // InternalPolycar.g:419:5: (lv_value_4_0= ruleEInt )
            {
            // InternalPolycar.g:419:5: (lv_value_4_0= ruleEInt )
            // InternalPolycar.g:420:6: lv_value_4_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getSubActionAccess().getValueEIntParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_2);
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
    // InternalPolycar.g:442:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPolycar.g:442:47: (iv_ruleEString= ruleEString EOF )
            // InternalPolycar.g:443:2: iv_ruleEString= ruleEString EOF
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
    // InternalPolycar.g:449:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPolycar.g:455:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPolycar.g:456:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPolycar.g:456:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPolycar.g:457:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycar.g:465:3: this_ID_1= RULE_ID
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
    // InternalPolycar.g:476:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPolycar.g:476:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPolycar.g:477:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalPolycar.g:483:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPolycar.g:489:2: (this_INT_0= RULE_INT )
            // InternalPolycar.g:490:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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
    // InternalPolycar.g:500:1: ruleEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_THE_ROAD' ) | (enumLiteral_4= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_ON' ) ) ;
    public final Enumerator ruleEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalPolycar.g:506:2: ( ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_THE_ROAD' ) | (enumLiteral_4= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_ON' ) ) )
            // InternalPolycar.g:507:2: ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_THE_ROAD' ) | (enumLiteral_4= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_ON' ) )
            {
            // InternalPolycar.g:507:2: ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_THE_ROAD' ) | (enumLiteral_4= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_ON' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            case 24:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPolycar.g:508:3: (enumLiteral_0= 'FORB_FORWARD' )
                    {
                    // InternalPolycar.g:508:3: (enumLiteral_0= 'FORB_FORWARD' )
                    // InternalPolycar.g:509:4: enumLiteral_0= 'FORB_FORWARD'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getFORB_FORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getFORB_FORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycar.g:516:3: (enumLiteral_1= 'FORB_LEFT' )
                    {
                    // InternalPolycar.g:516:3: (enumLiteral_1= 'FORB_LEFT' )
                    // InternalPolycar.g:517:4: enumLiteral_1= 'FORB_LEFT'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getFORB_LEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventTypeAccess().getFORB_LEFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycar.g:524:3: (enumLiteral_2= 'FORB_RIGHT' )
                    {
                    // InternalPolycar.g:524:3: (enumLiteral_2= 'FORB_RIGHT' )
                    // InternalPolycar.g:525:4: enumLiteral_2= 'FORB_RIGHT'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getFORB_RIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEventTypeAccess().getFORB_RIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycar.g:532:3: (enumLiteral_3= 'OFF_THE_ROAD' )
                    {
                    // InternalPolycar.g:532:3: (enumLiteral_3= 'OFF_THE_ROAD' )
                    // InternalPolycar.g:533:4: enumLiteral_3= 'OFF_THE_ROAD'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOFF_THE_ROADEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEventTypeAccess().getOFF_THE_ROADEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycar.g:540:3: (enumLiteral_4= 'TRAFFIC_LIGHT_OFF' )
                    {
                    // InternalPolycar.g:540:3: (enumLiteral_4= 'TRAFFIC_LIGHT_OFF' )
                    // InternalPolycar.g:541:4: enumLiteral_4= 'TRAFFIC_LIGHT_OFF'
                    {
                    enumLiteral_4=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycar.g:548:3: (enumLiteral_5= 'TRAFFIC_LIGHT_ON' )
                    {
                    // InternalPolycar.g:548:3: (enumLiteral_5= 'TRAFFIC_LIGHT_ON' )
                    // InternalPolycar.g:549:4: enumLiteral_5= 'TRAFFIC_LIGHT_ON'
                    {
                    enumLiteral_5=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_ONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_ONEnumLiteralDeclaration_5());
                    			

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
    // InternalPolycar.g:559:1: ruleActionType returns [Enumerator current=null] : ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) ) ;
    public final Enumerator ruleActionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPolycar.g:565:2: ( ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) ) )
            // InternalPolycar.g:566:2: ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) )
            {
            // InternalPolycar.g:566:2: ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPolycar.g:567:3: (enumLiteral_0= 'MOTOR_LEFT' )
                    {
                    // InternalPolycar.g:567:3: (enumLiteral_0= 'MOTOR_LEFT' )
                    // InternalPolycar.g:568:4: enumLiteral_0= 'MOTOR_LEFT'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getMOTOR_LEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionTypeAccess().getMOTOR_LEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycar.g:575:3: (enumLiteral_1= 'MOTOR_RIGHT' )
                    {
                    // InternalPolycar.g:575:3: (enumLiteral_1= 'MOTOR_RIGHT' )
                    // InternalPolycar.g:576:4: enumLiteral_1= 'MOTOR_RIGHT'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getMOTOR_RIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionTypeAccess().getMOTOR_RIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycar.g:583:3: (enumLiteral_2= 'SPEED' )
                    {
                    // InternalPolycar.g:583:3: (enumLiteral_2= 'SPEED' )
                    // InternalPolycar.g:584:4: enumLiteral_2= 'SPEED'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});

}