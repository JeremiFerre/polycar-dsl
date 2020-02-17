/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PolycarGrammarAccess extends AbstractGrammarElementFinder {
	
	public class CarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.Polycar.Car");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCarAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCarKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cActionsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cActionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cActionsActionParserRuleCall_5_0 = (RuleCall)cActionsAssignment_5.eContents().get(0);
		private final Assignment cActionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cActionsActionParserRuleCall_6_0 = (RuleCall)cActionsAssignment_6.eContents().get(0);
		private final Keyword cEnvironmentsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cColonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cConditionsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cConditionsConditionParserRuleCall_9_0 = (RuleCall)cConditionsAssignment_9.eContents().get(0);
		private final Assignment cConditionsAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cConditionsConditionParserRuleCall_10_0 = (RuleCall)cConditionsAssignment_10.eContents().get(0);
		private final Keyword cRUNKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDefaultActionAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final CrossReference cDefaultActionActionCrossReference_12_0 = (CrossReference)cDefaultActionAssignment_12.eContents().get(0);
		private final RuleCall cDefaultActionActionIDTerminalRuleCall_12_0_1 = (RuleCall)cDefaultActionActionCrossReference_12_0.eContents().get(1);
		
		//Car:
		//	{Car}
		//	'Car'
		//	name=EString
		//	'actions' ':'
		//	actions+=Action
		//	actions+=Action*
		//	'environments' ':'
		//	conditions+=Condition
		//	conditions+=Condition*
		//	'RUN' defaultAction=[Action]?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Car} 'Car' name=EString 'actions' ':' actions+=Action actions+=Action* 'environments' ':' conditions+=Condition
		//conditions+=Condition* 'RUN' defaultAction=[Action]?
		public Group getGroup() { return cGroup; }
		
		//{Car}
		public Action getCarAction_0() { return cCarAction_0; }
		
		//'Car'
		public Keyword getCarKeyword_1() { return cCarKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'actions'
		public Keyword getActionsKeyword_3() { return cActionsKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//actions+=Action
		public Assignment getActionsAssignment_5() { return cActionsAssignment_5; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_5_0() { return cActionsActionParserRuleCall_5_0; }
		
		//actions+=Action*
		public Assignment getActionsAssignment_6() { return cActionsAssignment_6; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_6_0() { return cActionsActionParserRuleCall_6_0; }
		
		//'environments'
		public Keyword getEnvironmentsKeyword_7() { return cEnvironmentsKeyword_7; }
		
		//':'
		public Keyword getColonKeyword_8() { return cColonKeyword_8; }
		
		//conditions+=Condition
		public Assignment getConditionsAssignment_9() { return cConditionsAssignment_9; }
		
		//Condition
		public RuleCall getConditionsConditionParserRuleCall_9_0() { return cConditionsConditionParserRuleCall_9_0; }
		
		//conditions+=Condition*
		public Assignment getConditionsAssignment_10() { return cConditionsAssignment_10; }
		
		//Condition
		public RuleCall getConditionsConditionParserRuleCall_10_0() { return cConditionsConditionParserRuleCall_10_0; }
		
		//'RUN'
		public Keyword getRUNKeyword_11() { return cRUNKeyword_11; }
		
		//defaultAction=[Action]?
		public Assignment getDefaultActionAssignment_12() { return cDefaultActionAssignment_12; }
		
		//[Action]
		public CrossReference getDefaultActionActionCrossReference_12_0() { return cDefaultActionActionCrossReference_12_0; }
		
		//ID
		public RuleCall getDefaultActionActionIDTerminalRuleCall_12_0_1() { return cDefaultActionActionIDTerminalRuleCall_12_0_1; }
	}
	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.Polycar.Condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConditionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEnvironmentEventsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEnvironmentEventsEnvironmentEventParserRuleCall_1_1_0 = (RuleCall)cEnvironmentEventsAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAndKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEnvironmentEventsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEnvironmentEventsEnvironmentEventParserRuleCall_2_1_0 = (RuleCall)cEnvironmentEventsAssignment_2_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cActionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cActionActionCrossReference_4_0 = (CrossReference)cActionAssignment_4.eContents().get(0);
		private final RuleCall cActionActionEStringParserRuleCall_4_0_1 = (RuleCall)cActionActionCrossReference_4_0.eContents().get(1);
		
		//Condition:
		//	{Condition} ('-' environmentEvents+=EnvironmentEvent) ('and' environmentEvents+=EnvironmentEvent)*
		//	'->' action=[Action|EString];
		@Override public ParserRule getRule() { return rule; }
		
		//{Condition} ('-' environmentEvents+=EnvironmentEvent) ('and' environmentEvents+=EnvironmentEvent)* '->'
		//action=[Action|EString]
		public Group getGroup() { return cGroup; }
		
		//{Condition}
		public Action getConditionAction_0() { return cConditionAction_0; }
		
		//'-' environmentEvents+=EnvironmentEvent
		public Group getGroup_1() { return cGroup_1; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0() { return cHyphenMinusKeyword_1_0; }
		
		//environmentEvents+=EnvironmentEvent
		public Assignment getEnvironmentEventsAssignment_1_1() { return cEnvironmentEventsAssignment_1_1; }
		
		//EnvironmentEvent
		public RuleCall getEnvironmentEventsEnvironmentEventParserRuleCall_1_1_0() { return cEnvironmentEventsEnvironmentEventParserRuleCall_1_1_0; }
		
		//('and' environmentEvents+=EnvironmentEvent)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'and'
		public Keyword getAndKeyword_2_0() { return cAndKeyword_2_0; }
		
		//environmentEvents+=EnvironmentEvent
		public Assignment getEnvironmentEventsAssignment_2_1() { return cEnvironmentEventsAssignment_2_1; }
		
		//EnvironmentEvent
		public RuleCall getEnvironmentEventsEnvironmentEventParserRuleCall_2_1_0() { return cEnvironmentEventsEnvironmentEventParserRuleCall_2_1_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }
		
		//action=[Action|EString]
		public Assignment getActionAssignment_4() { return cActionAssignment_4; }
		
		//[Action|EString]
		public CrossReference getActionActionCrossReference_4_0() { return cActionActionCrossReference_4_0; }
		
		//EString
		public RuleCall getActionActionEStringParserRuleCall_4_0_1() { return cActionActionEStringParserRuleCall_4_0_1; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.Polycar.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSubActionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSubActionsSubActionParserRuleCall_3_0 = (RuleCall)cSubActionsAssignment_3.eContents().get(0);
		private final Assignment cSubActionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSubActionsSubActionParserRuleCall_4_0 = (RuleCall)cSubActionsAssignment_4.eContents().get(0);
		
		//Action:
		//	{Action} name=EString ':'
		//	subActions+=SubAction
		//	subActions+=SubAction*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Action} name=EString ':' subActions+=SubAction subActions+=SubAction*
		public Group getGroup() { return cGroup; }
		
		//{Action}
		public Action getActionAction_0() { return cActionAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//subActions+=SubAction
		public Assignment getSubActionsAssignment_3() { return cSubActionsAssignment_3; }
		
		//SubAction
		public RuleCall getSubActionsSubActionParserRuleCall_3_0() { return cSubActionsSubActionParserRuleCall_3_0; }
		
		//subActions+=SubAction*
		public Assignment getSubActionsAssignment_4() { return cSubActionsAssignment_4; }
		
		//SubAction
		public RuleCall getSubActionsSubActionParserRuleCall_4_0() { return cSubActionsSubActionParserRuleCall_4_0; }
	}
	public class EnvironmentEventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.Polycar.EnvironmentEvent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEnvironmentEventAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeEventTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//EnvironmentEvent:
		//	{EnvironmentEvent} type=EventType;
		@Override public ParserRule getRule() { return rule; }
		
		//{EnvironmentEvent} type=EventType
		public Group getGroup() { return cGroup; }
		
		//{EnvironmentEvent}
		public Action getEnvironmentEventAction_0() { return cEnvironmentEventAction_0; }
		
		//type=EventType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//EventType
		public RuleCall getTypeEventTypeEnumRuleCall_1_0() { return cTypeEventTypeEnumRuleCall_1_0; }
	}
	public class SubActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.Polycar.SubAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSubActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypeActionTypeEnumRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Keyword cIsKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cValueAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cValueEIntParserRuleCall_1_3_0 = (RuleCall)cValueAssignment_1_3.eContents().get(0);
		private final Group cGroup_1_4 = (Group)cGroup_1.eContents().get(4);
		private final Keyword cDuringKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Assignment cDurationAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final RuleCall cDurationEIntParserRuleCall_1_4_1_0 = (RuleCall)cDurationAssignment_1_4_1.eContents().get(0);
		
		//SubAction:
		//	{SubAction} ('-' type=ActionType 'is' value=EInt ('during' duration=EInt)?);
		@Override public ParserRule getRule() { return rule; }
		
		//{SubAction} ('-' type=ActionType 'is' value=EInt ('during' duration=EInt)?)
		public Group getGroup() { return cGroup; }
		
		//{SubAction}
		public Action getSubActionAction_0() { return cSubActionAction_0; }
		
		//'-' type=ActionType 'is' value=EInt ('during' duration=EInt)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0() { return cHyphenMinusKeyword_1_0; }
		
		//type=ActionType
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//ActionType
		public RuleCall getTypeActionTypeEnumRuleCall_1_1_0() { return cTypeActionTypeEnumRuleCall_1_1_0; }
		
		//'is'
		public Keyword getIsKeyword_1_2() { return cIsKeyword_1_2; }
		
		//value=EInt
		public Assignment getValueAssignment_1_3() { return cValueAssignment_1_3; }
		
		//EInt
		public RuleCall getValueEIntParserRuleCall_1_3_0() { return cValueEIntParserRuleCall_1_3_0; }
		
		//('during' duration=EInt)?
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//'during'
		public Keyword getDuringKeyword_1_4_0() { return cDuringKeyword_1_4_0; }
		
		//duration=EInt
		public Assignment getDurationAssignment_1_4_1() { return cDurationAssignment_1_4_1; }
		
		//EInt
		public RuleCall getDurationEIntParserRuleCall_1_4_1_0() { return cDurationEIntParserRuleCall_1_4_1_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.Polycar.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.Polycar.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	public class EventTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.Polycar.EventType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFORB_FORWARDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFORB_FORWARDFORB_FORWARDKeyword_0_0 = (Keyword)cFORB_FORWARDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFORB_LEFTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFORB_LEFTFORB_LEFTKeyword_1_0 = (Keyword)cFORB_LEFTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFORB_RIGHTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFORB_RIGHTFORB_RIGHTKeyword_2_0 = (Keyword)cFORB_RIGHTEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cOFF_ROAD_LEFTEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cOFF_ROAD_LEFTOFF_ROAD_LEFTKeyword_3_0 = (Keyword)cOFF_ROAD_LEFTEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cOFF_ROAD_RIGHTEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cOFF_ROAD_RIGHTOFF_ROAD_RIGHTKeyword_4_0 = (Keyword)cOFF_ROAD_RIGHTEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cTRAFFIC_LIGHT_OFFTRAFFIC_LIGHT_OFFKeyword_5_0 = (Keyword)cTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cTRAFFIC_LIGHT_ONEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cTRAFFIC_LIGHT_ONTRAFFIC_LIGHT_ONKeyword_6_0 = (Keyword)cTRAFFIC_LIGHT_ONEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cOBJECT_LEFTEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cOBJECT_LEFTOBJECT_LEFTKeyword_7_0 = (Keyword)cOBJECT_LEFTEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cOBJECT_RIGHTEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cOBJECT_RIGHTOBJECT_RIGHTKeyword_8_0 = (Keyword)cOBJECT_RIGHTEnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cOBJECT_MIDDLEEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cOBJECT_MIDDLEOBJECT_MIDDLEKeyword_9_0 = (Keyword)cOBJECT_MIDDLEEnumLiteralDeclaration_9.eContents().get(0);
		private final EnumLiteralDeclaration cCAN_GO_LEFTEnumLiteralDeclaration_10 = (EnumLiteralDeclaration)cAlternatives.eContents().get(10);
		private final Keyword cCAN_GO_LEFTCAN_GO_LEFTKeyword_10_0 = (Keyword)cCAN_GO_LEFTEnumLiteralDeclaration_10.eContents().get(0);
		private final EnumLiteralDeclaration cCAN_GO_RIGHTEnumLiteralDeclaration_11 = (EnumLiteralDeclaration)cAlternatives.eContents().get(11);
		private final Keyword cCAN_GO_RIGHTCAN_GO_RIGHTKeyword_11_0 = (Keyword)cCAN_GO_RIGHTEnumLiteralDeclaration_11.eContents().get(0);
		
		//enum EventType:
		//	FORB_FORWARD | FORB_LEFT |
		//	FORB_RIGHT | OFF_ROAD_LEFT | OFF_ROAD_RIGHT |
		//	TRAFFIC_LIGHT_OFF | TRAFFIC_LIGHT_ON | OBJECT_LEFT |
		//	OBJECT_RIGHT | OBJECT_MIDDLE | CAN_GO_LEFT | CAN_GO_RIGHT;
		public EnumRule getRule() { return rule; }
		
		//FORB_FORWARD | FORB_LEFT | FORB_RIGHT | OFF_ROAD_LEFT | OFF_ROAD_RIGHT | TRAFFIC_LIGHT_OFF | TRAFFIC_LIGHT_ON |
		//OBJECT_LEFT | OBJECT_RIGHT | OBJECT_MIDDLE | CAN_GO_LEFT | CAN_GO_RIGHT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FORB_FORWARD
		public EnumLiteralDeclaration getFORB_FORWARDEnumLiteralDeclaration_0() { return cFORB_FORWARDEnumLiteralDeclaration_0; }
		
		//'FORB_FORWARD'
		public Keyword getFORB_FORWARDFORB_FORWARDKeyword_0_0() { return cFORB_FORWARDFORB_FORWARDKeyword_0_0; }
		
		//FORB_LEFT
		public EnumLiteralDeclaration getFORB_LEFTEnumLiteralDeclaration_1() { return cFORB_LEFTEnumLiteralDeclaration_1; }
		
		//'FORB_LEFT'
		public Keyword getFORB_LEFTFORB_LEFTKeyword_1_0() { return cFORB_LEFTFORB_LEFTKeyword_1_0; }
		
		//FORB_RIGHT
		public EnumLiteralDeclaration getFORB_RIGHTEnumLiteralDeclaration_2() { return cFORB_RIGHTEnumLiteralDeclaration_2; }
		
		//'FORB_RIGHT'
		public Keyword getFORB_RIGHTFORB_RIGHTKeyword_2_0() { return cFORB_RIGHTFORB_RIGHTKeyword_2_0; }
		
		//OFF_ROAD_LEFT
		public EnumLiteralDeclaration getOFF_ROAD_LEFTEnumLiteralDeclaration_3() { return cOFF_ROAD_LEFTEnumLiteralDeclaration_3; }
		
		//'OFF_ROAD_LEFT'
		public Keyword getOFF_ROAD_LEFTOFF_ROAD_LEFTKeyword_3_0() { return cOFF_ROAD_LEFTOFF_ROAD_LEFTKeyword_3_0; }
		
		//OFF_ROAD_RIGHT
		public EnumLiteralDeclaration getOFF_ROAD_RIGHTEnumLiteralDeclaration_4() { return cOFF_ROAD_RIGHTEnumLiteralDeclaration_4; }
		
		//'OFF_ROAD_RIGHT'
		public Keyword getOFF_ROAD_RIGHTOFF_ROAD_RIGHTKeyword_4_0() { return cOFF_ROAD_RIGHTOFF_ROAD_RIGHTKeyword_4_0; }
		
		//TRAFFIC_LIGHT_OFF
		public EnumLiteralDeclaration getTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_5() { return cTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_5; }
		
		//'TRAFFIC_LIGHT_OFF'
		public Keyword getTRAFFIC_LIGHT_OFFTRAFFIC_LIGHT_OFFKeyword_5_0() { return cTRAFFIC_LIGHT_OFFTRAFFIC_LIGHT_OFFKeyword_5_0; }
		
		//TRAFFIC_LIGHT_ON
		public EnumLiteralDeclaration getTRAFFIC_LIGHT_ONEnumLiteralDeclaration_6() { return cTRAFFIC_LIGHT_ONEnumLiteralDeclaration_6; }
		
		//'TRAFFIC_LIGHT_ON'
		public Keyword getTRAFFIC_LIGHT_ONTRAFFIC_LIGHT_ONKeyword_6_0() { return cTRAFFIC_LIGHT_ONTRAFFIC_LIGHT_ONKeyword_6_0; }
		
		//OBJECT_LEFT
		public EnumLiteralDeclaration getOBJECT_LEFTEnumLiteralDeclaration_7() { return cOBJECT_LEFTEnumLiteralDeclaration_7; }
		
		//'OBJECT_LEFT'
		public Keyword getOBJECT_LEFTOBJECT_LEFTKeyword_7_0() { return cOBJECT_LEFTOBJECT_LEFTKeyword_7_0; }
		
		//OBJECT_RIGHT
		public EnumLiteralDeclaration getOBJECT_RIGHTEnumLiteralDeclaration_8() { return cOBJECT_RIGHTEnumLiteralDeclaration_8; }
		
		//'OBJECT_RIGHT'
		public Keyword getOBJECT_RIGHTOBJECT_RIGHTKeyword_8_0() { return cOBJECT_RIGHTOBJECT_RIGHTKeyword_8_0; }
		
		//OBJECT_MIDDLE
		public EnumLiteralDeclaration getOBJECT_MIDDLEEnumLiteralDeclaration_9() { return cOBJECT_MIDDLEEnumLiteralDeclaration_9; }
		
		//'OBJECT_MIDDLE'
		public Keyword getOBJECT_MIDDLEOBJECT_MIDDLEKeyword_9_0() { return cOBJECT_MIDDLEOBJECT_MIDDLEKeyword_9_0; }
		
		//CAN_GO_LEFT
		public EnumLiteralDeclaration getCAN_GO_LEFTEnumLiteralDeclaration_10() { return cCAN_GO_LEFTEnumLiteralDeclaration_10; }
		
		//'CAN_GO_LEFT'
		public Keyword getCAN_GO_LEFTCAN_GO_LEFTKeyword_10_0() { return cCAN_GO_LEFTCAN_GO_LEFTKeyword_10_0; }
		
		//CAN_GO_RIGHT
		public EnumLiteralDeclaration getCAN_GO_RIGHTEnumLiteralDeclaration_11() { return cCAN_GO_RIGHTEnumLiteralDeclaration_11; }
		
		//'CAN_GO_RIGHT'
		public Keyword getCAN_GO_RIGHTCAN_GO_RIGHTKeyword_11_0() { return cCAN_GO_RIGHTCAN_GO_RIGHTKeyword_11_0; }
	}
	public class ActionTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.Polycar.ActionType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMOTOR_LEFTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMOTOR_LEFTMOTOR_LEFTKeyword_0_0 = (Keyword)cMOTOR_LEFTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMOTOR_RIGHTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMOTOR_RIGHTMOTOR_RIGHTKeyword_1_0 = (Keyword)cMOTOR_RIGHTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSPEEDEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSPEEDSPEEDKeyword_2_0 = (Keyword)cSPEEDEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum ActionType:
		//	MOTOR_LEFT | MOTOR_RIGHT | SPEED;
		public EnumRule getRule() { return rule; }
		
		//MOTOR_LEFT | MOTOR_RIGHT | SPEED
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MOTOR_LEFT
		public EnumLiteralDeclaration getMOTOR_LEFTEnumLiteralDeclaration_0() { return cMOTOR_LEFTEnumLiteralDeclaration_0; }
		
		//'MOTOR_LEFT'
		public Keyword getMOTOR_LEFTMOTOR_LEFTKeyword_0_0() { return cMOTOR_LEFTMOTOR_LEFTKeyword_0_0; }
		
		//MOTOR_RIGHT
		public EnumLiteralDeclaration getMOTOR_RIGHTEnumLiteralDeclaration_1() { return cMOTOR_RIGHTEnumLiteralDeclaration_1; }
		
		//'MOTOR_RIGHT'
		public Keyword getMOTOR_RIGHTMOTOR_RIGHTKeyword_1_0() { return cMOTOR_RIGHTMOTOR_RIGHTKeyword_1_0; }
		
		//SPEED
		public EnumLiteralDeclaration getSPEEDEnumLiteralDeclaration_2() { return cSPEEDEnumLiteralDeclaration_2; }
		
		//'SPEED'
		public Keyword getSPEEDSPEEDKeyword_2_0() { return cSPEEDSPEEDKeyword_2_0; }
	}
	
	private final CarElements pCar;
	private final ConditionElements pCondition;
	private final ActionElements pAction;
	private final EnvironmentEventElements pEnvironmentEvent;
	private final SubActionElements pSubAction;
	private final EventTypeElements eEventType;
	private final ActionTypeElements eActionType;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PolycarGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pCar = new CarElements();
		this.pCondition = new ConditionElements();
		this.pAction = new ActionElements();
		this.pEnvironmentEvent = new EnvironmentEventElements();
		this.pSubAction = new SubActionElements();
		this.eEventType = new EventTypeElements();
		this.eActionType = new ActionTypeElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.unice.polytech.dsl.Polycar".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Car:
	//	{Car}
	//	'Car'
	//	name=EString
	//	'actions' ':'
	//	actions+=Action
	//	actions+=Action*
	//	'environments' ':'
	//	conditions+=Condition
	//	conditions+=Condition*
	//	'RUN' defaultAction=[Action]?;
	public CarElements getCarAccess() {
		return pCar;
	}
	
	public ParserRule getCarRule() {
		return getCarAccess().getRule();
	}
	
	//Condition:
	//	{Condition} ('-' environmentEvents+=EnvironmentEvent) ('and' environmentEvents+=EnvironmentEvent)*
	//	'->' action=[Action|EString];
	public ConditionElements getConditionAccess() {
		return pCondition;
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}
	
	//Action:
	//	{Action} name=EString ':'
	//	subActions+=SubAction
	//	subActions+=SubAction*;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//EnvironmentEvent:
	//	{EnvironmentEvent} type=EventType;
	public EnvironmentEventElements getEnvironmentEventAccess() {
		return pEnvironmentEvent;
	}
	
	public ParserRule getEnvironmentEventRule() {
		return getEnvironmentEventAccess().getRule();
	}
	
	//SubAction:
	//	{SubAction} ('-' type=ActionType 'is' value=EInt ('during' duration=EInt)?);
	public SubActionElements getSubActionAccess() {
		return pSubAction;
	}
	
	public ParserRule getSubActionRule() {
		return getSubActionAccess().getRule();
	}
	
	//enum EventType:
	//	FORB_FORWARD | FORB_LEFT |
	//	FORB_RIGHT | OFF_ROAD_LEFT | OFF_ROAD_RIGHT |
	//	TRAFFIC_LIGHT_OFF | TRAFFIC_LIGHT_ON | OBJECT_LEFT |
	//	OBJECT_RIGHT | OBJECT_MIDDLE | CAN_GO_LEFT | CAN_GO_RIGHT;
	public EventTypeElements getEventTypeAccess() {
		return eEventType;
	}
	
	public EnumRule getEventTypeRule() {
		return getEventTypeAccess().getRule();
	}
	
	//enum ActionType:
	//	MOTOR_LEFT | MOTOR_RIGHT | SPEED;
	public ActionTypeElements getActionTypeAccess() {
		return eActionType;
	}
	
	public EnumRule getActionTypeRule() {
		return getActionTypeAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
