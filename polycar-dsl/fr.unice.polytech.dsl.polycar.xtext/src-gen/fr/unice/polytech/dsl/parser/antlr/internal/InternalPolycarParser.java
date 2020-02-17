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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Car'", "'actions'", "':'", "'environments'", "'RUN'", "'-'", "'and'", "'->'", "'is'", "'during'", "'FORB_FORWARD'", "'FORB_LEFT'", "'FORB_RIGHT'", "'OFF_ROAD_LEFT'", "'OFF_ROAD_RIGHT'", "'TRAFFIC_LIGHT_OFF'", "'TRAFFIC_LIGHT_ON'", "'OBJECT_LEFT'", "'OBJECT_RIGHT'", "'OBJECT_MIDDLE'", "'CAN_GO_LEFT'", "'CAN_GO_RIGHT'", "'MOTOR_LEFT'", "'MOTOR_RIGHT'", "'SPEED'"
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
    public static final int T__35=35;
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
    // InternalPolycar.g:72:1: ruleCar returns [EObject current=null] : ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_conditions_9_0= ruleCondition ) ) ( (lv_conditions_10_0= ruleCondition ) )* otherlv_11= 'RUN' ( (otherlv_12= RULE_ID ) )? ) ;
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

        EObject lv_conditions_9_0 = null;

        EObject lv_conditions_10_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:78:2: ( ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_conditions_9_0= ruleCondition ) ) ( (lv_conditions_10_0= ruleCondition ) )* otherlv_11= 'RUN' ( (otherlv_12= RULE_ID ) )? ) )
            // InternalPolycar.g:79:2: ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_conditions_9_0= ruleCondition ) ) ( (lv_conditions_10_0= ruleCondition ) )* otherlv_11= 'RUN' ( (otherlv_12= RULE_ID ) )? )
            {
            // InternalPolycar.g:79:2: ( () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_conditions_9_0= ruleCondition ) ) ( (lv_conditions_10_0= ruleCondition ) )* otherlv_11= 'RUN' ( (otherlv_12= RULE_ID ) )? )
            // InternalPolycar.g:80:3: () otherlv_1= 'Car' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'environments' otherlv_8= ':' ( (lv_conditions_9_0= ruleCondition ) ) ( (lv_conditions_10_0= ruleCondition ) )* otherlv_11= 'RUN' ( (otherlv_12= RULE_ID ) )?
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
            		
            // InternalPolycar.g:164:3: ( (lv_conditions_9_0= ruleCondition ) )
            // InternalPolycar.g:165:4: (lv_conditions_9_0= ruleCondition )
            {
            // InternalPolycar.g:165:4: (lv_conditions_9_0= ruleCondition )
            // InternalPolycar.g:166:5: lv_conditions_9_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getCarAccess().getConditionsConditionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_conditions_9_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_9_0,
            						"fr.unice.polytech.dsl.Polycar.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycar.g:183:3: ( (lv_conditions_10_0= ruleCondition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPolycar.g:184:4: (lv_conditions_10_0= ruleCondition )
            	    {
            	    // InternalPolycar.g:184:4: (lv_conditions_10_0= ruleCondition )
            	    // InternalPolycar.g:185:5: lv_conditions_10_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getCarAccess().getConditionsConditionParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_conditions_10_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_10_0,
            	    						"fr.unice.polytech.dsl.Polycar.Condition");
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


    // $ANTLR start "entryRuleCondition"
    // InternalPolycar.g:223:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalPolycar.g:223:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalPolycar.g:224:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalPolycar.g:230:1: ruleCondition returns [EObject current=null] : ( () (otherlv_1= '-' ( (lv_environmentEvents_2_0= ruleEnvironmentEvent ) ) ) (otherlv_3= 'and' ( (lv_environmentEvents_4_0= ruleEnvironmentEvent ) ) )* otherlv_5= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_environmentEvents_2_0 = null;

        EObject lv_environmentEvents_4_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:236:2: ( ( () (otherlv_1= '-' ( (lv_environmentEvents_2_0= ruleEnvironmentEvent ) ) ) (otherlv_3= 'and' ( (lv_environmentEvents_4_0= ruleEnvironmentEvent ) ) )* otherlv_5= '->' ( ( ruleEString ) ) ) )
            // InternalPolycar.g:237:2: ( () (otherlv_1= '-' ( (lv_environmentEvents_2_0= ruleEnvironmentEvent ) ) ) (otherlv_3= 'and' ( (lv_environmentEvents_4_0= ruleEnvironmentEvent ) ) )* otherlv_5= '->' ( ( ruleEString ) ) )
            {
            // InternalPolycar.g:237:2: ( () (otherlv_1= '-' ( (lv_environmentEvents_2_0= ruleEnvironmentEvent ) ) ) (otherlv_3= 'and' ( (lv_environmentEvents_4_0= ruleEnvironmentEvent ) ) )* otherlv_5= '->' ( ( ruleEString ) ) )
            // InternalPolycar.g:238:3: () (otherlv_1= '-' ( (lv_environmentEvents_2_0= ruleEnvironmentEvent ) ) ) (otherlv_3= 'and' ( (lv_environmentEvents_4_0= ruleEnvironmentEvent ) ) )* otherlv_5= '->' ( ( ruleEString ) )
            {
            // InternalPolycar.g:238:3: ()
            // InternalPolycar.g:239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            // InternalPolycar.g:245:3: (otherlv_1= '-' ( (lv_environmentEvents_2_0= ruleEnvironmentEvent ) ) )
            // InternalPolycar.g:246:4: otherlv_1= '-' ( (lv_environmentEvents_2_0= ruleEnvironmentEvent ) )
            {
            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getHyphenMinusKeyword_1_0());
            			
            // InternalPolycar.g:250:4: ( (lv_environmentEvents_2_0= ruleEnvironmentEvent ) )
            // InternalPolycar.g:251:5: (lv_environmentEvents_2_0= ruleEnvironmentEvent )
            {
            // InternalPolycar.g:251:5: (lv_environmentEvents_2_0= ruleEnvironmentEvent )
            // InternalPolycar.g:252:6: lv_environmentEvents_2_0= ruleEnvironmentEvent
            {

            						newCompositeNode(grammarAccess.getConditionAccess().getEnvironmentEventsEnvironmentEventParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_11);
            lv_environmentEvents_2_0=ruleEnvironmentEvent();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getConditionRule());
            						}
            						add(
            							current,
            							"environmentEvents",
            							lv_environmentEvents_2_0,
            							"fr.unice.polytech.dsl.Polycar.EnvironmentEvent");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPolycar.g:270:3: (otherlv_3= 'and' ( (lv_environmentEvents_4_0= ruleEnvironmentEvent ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPolycar.g:271:4: otherlv_3= 'and' ( (lv_environmentEvents_4_0= ruleEnvironmentEvent ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getAndKeyword_2_0());
            	    			
            	    // InternalPolycar.g:275:4: ( (lv_environmentEvents_4_0= ruleEnvironmentEvent ) )
            	    // InternalPolycar.g:276:5: (lv_environmentEvents_4_0= ruleEnvironmentEvent )
            	    {
            	    // InternalPolycar.g:276:5: (lv_environmentEvents_4_0= ruleEnvironmentEvent )
            	    // InternalPolycar.g:277:6: lv_environmentEvents_4_0= ruleEnvironmentEvent
            	    {

            	    						newCompositeNode(grammarAccess.getConditionAccess().getEnvironmentEventsEnvironmentEventParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_environmentEvents_4_0=ruleEnvironmentEvent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environmentEvents",
            	    							lv_environmentEvents_4_0,
            	    							"fr.unice.polytech.dsl.Polycar.EnvironmentEvent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalPolycar.g:299:3: ( ( ruleEString ) )
            // InternalPolycar.g:300:4: ( ruleEString )
            {
            // InternalPolycar.g:300:4: ( ruleEString )
            // InternalPolycar.g:301:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getActionActionCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAction"
    // InternalPolycar.g:319:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPolycar.g:319:47: (iv_ruleAction= ruleAction EOF )
            // InternalPolycar.g:320:2: iv_ruleAction= ruleAction EOF
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
    // InternalPolycar.g:326:1: ruleAction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subActions_3_0 = null;

        EObject lv_subActions_4_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:332:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* ) )
            // InternalPolycar.g:333:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* )
            {
            // InternalPolycar.g:333:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )* )
            // InternalPolycar.g:334:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_subActions_3_0= ruleSubAction ) ) ( (lv_subActions_4_0= ruleSubAction ) )*
            {
            // InternalPolycar.g:334:3: ()
            // InternalPolycar.g:335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalPolycar.g:341:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPolycar.g:342:4: (lv_name_1_0= ruleEString )
            {
            // InternalPolycar.g:342:4: (lv_name_1_0= ruleEString )
            // InternalPolycar.g:343:5: lv_name_1_0= ruleEString
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
            		
            // InternalPolycar.g:364:3: ( (lv_subActions_3_0= ruleSubAction ) )
            // InternalPolycar.g:365:4: (lv_subActions_3_0= ruleSubAction )
            {
            // InternalPolycar.g:365:4: (lv_subActions_3_0= ruleSubAction )
            // InternalPolycar.g:366:5: lv_subActions_3_0= ruleSubAction
            {

            					newCompositeNode(grammarAccess.getActionAccess().getSubActionsSubActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalPolycar.g:383:3: ( (lv_subActions_4_0= ruleSubAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPolycar.g:384:4: (lv_subActions_4_0= ruleSubAction )
            	    {
            	    // InternalPolycar.g:384:4: (lv_subActions_4_0= ruleSubAction )
            	    // InternalPolycar.g:385:5: lv_subActions_4_0= ruleSubAction
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getSubActionsSubActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEnvironmentEvent"
    // InternalPolycar.g:406:1: entryRuleEnvironmentEvent returns [EObject current=null] : iv_ruleEnvironmentEvent= ruleEnvironmentEvent EOF ;
    public final EObject entryRuleEnvironmentEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentEvent = null;


        try {
            // InternalPolycar.g:406:57: (iv_ruleEnvironmentEvent= ruleEnvironmentEvent EOF )
            // InternalPolycar.g:407:2: iv_ruleEnvironmentEvent= ruleEnvironmentEvent EOF
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
    // InternalPolycar.g:413:1: ruleEnvironmentEvent returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEventType ) ) ) ;
    public final EObject ruleEnvironmentEvent() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPolycar.g:419:2: ( ( () ( (lv_type_1_0= ruleEventType ) ) ) )
            // InternalPolycar.g:420:2: ( () ( (lv_type_1_0= ruleEventType ) ) )
            {
            // InternalPolycar.g:420:2: ( () ( (lv_type_1_0= ruleEventType ) ) )
            // InternalPolycar.g:421:3: () ( (lv_type_1_0= ruleEventType ) )
            {
            // InternalPolycar.g:421:3: ()
            // InternalPolycar.g:422:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentEventAccess().getEnvironmentEventAction_0(),
            					current);
            			

            }

            // InternalPolycar.g:428:3: ( (lv_type_1_0= ruleEventType ) )
            // InternalPolycar.g:429:4: (lv_type_1_0= ruleEventType )
            {
            // InternalPolycar.g:429:4: (lv_type_1_0= ruleEventType )
            // InternalPolycar.g:430:5: lv_type_1_0= ruleEventType
            {

            					newCompositeNode(grammarAccess.getEnvironmentEventAccess().getTypeEventTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleEventType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentEventRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"fr.unice.polytech.dsl.Polycar.EventType");
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
    // $ANTLR end "ruleEnvironmentEvent"


    // $ANTLR start "entryRuleSubAction"
    // InternalPolycar.g:451:1: entryRuleSubAction returns [EObject current=null] : iv_ruleSubAction= ruleSubAction EOF ;
    public final EObject entryRuleSubAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAction = null;


        try {
            // InternalPolycar.g:451:50: (iv_ruleSubAction= ruleSubAction EOF )
            // InternalPolycar.g:452:2: iv_ruleSubAction= ruleSubAction EOF
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
    // InternalPolycar.g:458:1: ruleSubAction returns [EObject current=null] : ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? ) ) ;
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
            // InternalPolycar.g:464:2: ( ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? ) ) )
            // InternalPolycar.g:465:2: ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? ) )
            {
            // InternalPolycar.g:465:2: ( () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? ) )
            // InternalPolycar.g:466:3: () (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? )
            {
            // InternalPolycar.g:466:3: ()
            // InternalPolycar.g:467:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubActionAccess().getSubActionAction_0(),
            					current);
            			

            }

            // InternalPolycar.g:473:3: (otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )? )
            // InternalPolycar.g:474:4: otherlv_1= '-' ( (lv_type_2_0= ruleActionType ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleEInt ) ) (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )?
            {
            otherlv_1=(Token)match(input,16,FOLLOW_13); 

            				newLeafNode(otherlv_1, grammarAccess.getSubActionAccess().getHyphenMinusKeyword_1_0());
            			
            // InternalPolycar.g:478:4: ( (lv_type_2_0= ruleActionType ) )
            // InternalPolycar.g:479:5: (lv_type_2_0= ruleActionType )
            {
            // InternalPolycar.g:479:5: (lv_type_2_0= ruleActionType )
            // InternalPolycar.g:480:6: lv_type_2_0= ruleActionType
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

            otherlv_3=(Token)match(input,19,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getSubActionAccess().getIsKeyword_1_2());
            			
            // InternalPolycar.g:501:4: ( (lv_value_4_0= ruleEInt ) )
            // InternalPolycar.g:502:5: (lv_value_4_0= ruleEInt )
            {
            // InternalPolycar.g:502:5: (lv_value_4_0= ruleEInt )
            // InternalPolycar.g:503:6: lv_value_4_0= ruleEInt
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

            // InternalPolycar.g:520:4: (otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPolycar.g:521:5: otherlv_5= 'during' ( (lv_duration_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_15); 

                    					newLeafNode(otherlv_5, grammarAccess.getSubActionAccess().getDuringKeyword_1_4_0());
                    				
                    // InternalPolycar.g:525:5: ( (lv_duration_6_0= ruleEInt ) )
                    // InternalPolycar.g:526:6: (lv_duration_6_0= ruleEInt )
                    {
                    // InternalPolycar.g:526:6: (lv_duration_6_0= ruleEInt )
                    // InternalPolycar.g:527:7: lv_duration_6_0= ruleEInt
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
    // InternalPolycar.g:550:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPolycar.g:550:47: (iv_ruleEString= ruleEString EOF )
            // InternalPolycar.g:551:2: iv_ruleEString= ruleEString EOF
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
    // InternalPolycar.g:557:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPolycar.g:563:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPolycar.g:564:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPolycar.g:564:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPolycar.g:565:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycar.g:573:3: this_ID_1= RULE_ID
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
    // InternalPolycar.g:584:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPolycar.g:584:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPolycar.g:585:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalPolycar.g:591:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPolycar.g:597:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPolycar.g:598:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPolycar.g:598:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPolycar.g:599:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPolycar.g:599:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPolycar.g:600:4: kw= '-'
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
    // InternalPolycar.g:617:1: ruleEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_ROAD_LEFT' ) | (enumLiteral_4= 'OFF_ROAD_RIGHT' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_6= 'TRAFFIC_LIGHT_ON' ) | (enumLiteral_7= 'OBJECT_LEFT' ) | (enumLiteral_8= 'OBJECT_RIGHT' ) | (enumLiteral_9= 'OBJECT_MIDDLE' ) | (enumLiteral_10= 'CAN_GO_LEFT' ) | (enumLiteral_11= 'CAN_GO_RIGHT' ) ) ;
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
            // InternalPolycar.g:623:2: ( ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_ROAD_LEFT' ) | (enumLiteral_4= 'OFF_ROAD_RIGHT' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_6= 'TRAFFIC_LIGHT_ON' ) | (enumLiteral_7= 'OBJECT_LEFT' ) | (enumLiteral_8= 'OBJECT_RIGHT' ) | (enumLiteral_9= 'OBJECT_MIDDLE' ) | (enumLiteral_10= 'CAN_GO_LEFT' ) | (enumLiteral_11= 'CAN_GO_RIGHT' ) ) )
            // InternalPolycar.g:624:2: ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_ROAD_LEFT' ) | (enumLiteral_4= 'OFF_ROAD_RIGHT' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_6= 'TRAFFIC_LIGHT_ON' ) | (enumLiteral_7= 'OBJECT_LEFT' ) | (enumLiteral_8= 'OBJECT_RIGHT' ) | (enumLiteral_9= 'OBJECT_MIDDLE' ) | (enumLiteral_10= 'CAN_GO_LEFT' ) | (enumLiteral_11= 'CAN_GO_RIGHT' ) )
            {
            // InternalPolycar.g:624:2: ( (enumLiteral_0= 'FORB_FORWARD' ) | (enumLiteral_1= 'FORB_LEFT' ) | (enumLiteral_2= 'FORB_RIGHT' ) | (enumLiteral_3= 'OFF_ROAD_LEFT' ) | (enumLiteral_4= 'OFF_ROAD_RIGHT' ) | (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' ) | (enumLiteral_6= 'TRAFFIC_LIGHT_ON' ) | (enumLiteral_7= 'OBJECT_LEFT' ) | (enumLiteral_8= 'OBJECT_RIGHT' ) | (enumLiteral_9= 'OBJECT_MIDDLE' ) | (enumLiteral_10= 'CAN_GO_LEFT' ) | (enumLiteral_11= 'CAN_GO_RIGHT' ) )
            int alt9=12;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            case 25:
                {
                alt9=5;
                }
                break;
            case 26:
                {
                alt9=6;
                }
                break;
            case 27:
                {
                alt9=7;
                }
                break;
            case 28:
                {
                alt9=8;
                }
                break;
            case 29:
                {
                alt9=9;
                }
                break;
            case 30:
                {
                alt9=10;
                }
                break;
            case 31:
                {
                alt9=11;
                }
                break;
            case 32:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPolycar.g:625:3: (enumLiteral_0= 'FORB_FORWARD' )
                    {
                    // InternalPolycar.g:625:3: (enumLiteral_0= 'FORB_FORWARD' )
                    // InternalPolycar.g:626:4: enumLiteral_0= 'FORB_FORWARD'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getFORB_FORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getFORB_FORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycar.g:633:3: (enumLiteral_1= 'FORB_LEFT' )
                    {
                    // InternalPolycar.g:633:3: (enumLiteral_1= 'FORB_LEFT' )
                    // InternalPolycar.g:634:4: enumLiteral_1= 'FORB_LEFT'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getFORB_LEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventTypeAccess().getFORB_LEFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycar.g:641:3: (enumLiteral_2= 'FORB_RIGHT' )
                    {
                    // InternalPolycar.g:641:3: (enumLiteral_2= 'FORB_RIGHT' )
                    // InternalPolycar.g:642:4: enumLiteral_2= 'FORB_RIGHT'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getFORB_RIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEventTypeAccess().getFORB_RIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycar.g:649:3: (enumLiteral_3= 'OFF_ROAD_LEFT' )
                    {
                    // InternalPolycar.g:649:3: (enumLiteral_3= 'OFF_ROAD_LEFT' )
                    // InternalPolycar.g:650:4: enumLiteral_3= 'OFF_ROAD_LEFT'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOFF_ROAD_LEFTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEventTypeAccess().getOFF_ROAD_LEFTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycar.g:657:3: (enumLiteral_4= 'OFF_ROAD_RIGHT' )
                    {
                    // InternalPolycar.g:657:3: (enumLiteral_4= 'OFF_ROAD_RIGHT' )
                    // InternalPolycar.g:658:4: enumLiteral_4= 'OFF_ROAD_RIGHT'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOFF_ROAD_RIGHTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEventTypeAccess().getOFF_ROAD_RIGHTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycar.g:665:3: (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' )
                    {
                    // InternalPolycar.g:665:3: (enumLiteral_5= 'TRAFFIC_LIGHT_OFF' )
                    // InternalPolycar.g:666:4: enumLiteral_5= 'TRAFFIC_LIGHT_OFF'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalPolycar.g:673:3: (enumLiteral_6= 'TRAFFIC_LIGHT_ON' )
                    {
                    // InternalPolycar.g:673:3: (enumLiteral_6= 'TRAFFIC_LIGHT_ON' )
                    // InternalPolycar.g:674:4: enumLiteral_6= 'TRAFFIC_LIGHT_ON'
                    {
                    enumLiteral_6=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_ONEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_ONEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalPolycar.g:681:3: (enumLiteral_7= 'OBJECT_LEFT' )
                    {
                    // InternalPolycar.g:681:3: (enumLiteral_7= 'OBJECT_LEFT' )
                    // InternalPolycar.g:682:4: enumLiteral_7= 'OBJECT_LEFT'
                    {
                    enumLiteral_7=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOBJECT_LEFTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getEventTypeAccess().getOBJECT_LEFTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalPolycar.g:689:3: (enumLiteral_8= 'OBJECT_RIGHT' )
                    {
                    // InternalPolycar.g:689:3: (enumLiteral_8= 'OBJECT_RIGHT' )
                    // InternalPolycar.g:690:4: enumLiteral_8= 'OBJECT_RIGHT'
                    {
                    enumLiteral_8=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOBJECT_RIGHTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getEventTypeAccess().getOBJECT_RIGHTEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalPolycar.g:697:3: (enumLiteral_9= 'OBJECT_MIDDLE' )
                    {
                    // InternalPolycar.g:697:3: (enumLiteral_9= 'OBJECT_MIDDLE' )
                    // InternalPolycar.g:698:4: enumLiteral_9= 'OBJECT_MIDDLE'
                    {
                    enumLiteral_9=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getOBJECT_MIDDLEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getEventTypeAccess().getOBJECT_MIDDLEEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalPolycar.g:705:3: (enumLiteral_10= 'CAN_GO_LEFT' )
                    {
                    // InternalPolycar.g:705:3: (enumLiteral_10= 'CAN_GO_LEFT' )
                    // InternalPolycar.g:706:4: enumLiteral_10= 'CAN_GO_LEFT'
                    {
                    enumLiteral_10=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getCAN_GO_LEFTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getEventTypeAccess().getCAN_GO_LEFTEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalPolycar.g:713:3: (enumLiteral_11= 'CAN_GO_RIGHT' )
                    {
                    // InternalPolycar.g:713:3: (enumLiteral_11= 'CAN_GO_RIGHT' )
                    // InternalPolycar.g:714:4: enumLiteral_11= 'CAN_GO_RIGHT'
                    {
                    enumLiteral_11=(Token)match(input,32,FOLLOW_2); 

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
    // InternalPolycar.g:724:1: ruleActionType returns [Enumerator current=null] : ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) ) ;
    public final Enumerator ruleActionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPolycar.g:730:2: ( ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) ) )
            // InternalPolycar.g:731:2: ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) )
            {
            // InternalPolycar.g:731:2: ( (enumLiteral_0= 'MOTOR_LEFT' ) | (enumLiteral_1= 'MOTOR_RIGHT' ) | (enumLiteral_2= 'SPEED' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPolycar.g:732:3: (enumLiteral_0= 'MOTOR_LEFT' )
                    {
                    // InternalPolycar.g:732:3: (enumLiteral_0= 'MOTOR_LEFT' )
                    // InternalPolycar.g:733:4: enumLiteral_0= 'MOTOR_LEFT'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getMOTOR_LEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionTypeAccess().getMOTOR_LEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycar.g:740:3: (enumLiteral_1= 'MOTOR_RIGHT' )
                    {
                    // InternalPolycar.g:740:3: (enumLiteral_1= 'MOTOR_RIGHT' )
                    // InternalPolycar.g:741:4: enumLiteral_1= 'MOTOR_RIGHT'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getMOTOR_RIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionTypeAccess().getMOTOR_RIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycar.g:748:3: (enumLiteral_2= 'SPEED' )
                    {
                    // InternalPolycar.g:748:3: (enumLiteral_2= 'SPEED' )
                    // InternalPolycar.g:749:4: enumLiteral_2= 'SPEED'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001FFE00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});

}