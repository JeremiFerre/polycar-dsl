/*
 * generated by Xtext 2.14.0
 */
grammar InternalPolycar;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.unice.polytech.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.unice.polytech.dsl.ide.contentassist.antlr.internal;

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
import fr.unice.polytech.dsl.services.PolycarGrammarAccess;

}
@parser::members {
	private PolycarGrammarAccess grammarAccess;

	public void setGrammarAccess(PolycarGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleCar
entryRuleCar
:
{ before(grammarAccess.getCarRule()); }
	 ruleCar
{ after(grammarAccess.getCarRule()); } 
	 EOF 
;

// Rule Car
ruleCar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCarAccess().getGroup()); }
		(rule__Car__Group__0)
		{ after(grammarAccess.getCarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCondition
entryRuleCondition
:
{ before(grammarAccess.getConditionRule()); }
	 ruleCondition
{ after(grammarAccess.getConditionRule()); } 
	 EOF 
;

// Rule Condition
ruleCondition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionAccess().getGroup()); }
		(rule__Condition__Group__0)
		{ after(grammarAccess.getConditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getGroup()); }
		(rule__Action__Group__0)
		{ after(grammarAccess.getActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnvironmentEvent
entryRuleEnvironmentEvent
:
{ before(grammarAccess.getEnvironmentEventRule()); }
	 ruleEnvironmentEvent
{ after(grammarAccess.getEnvironmentEventRule()); } 
	 EOF 
;

// Rule EnvironmentEvent
ruleEnvironmentEvent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnvironmentEventAccess().getGroup()); }
		(rule__EnvironmentEvent__Group__0)
		{ after(grammarAccess.getEnvironmentEventAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubAction
entryRuleSubAction
:
{ before(grammarAccess.getSubActionRule()); }
	 ruleSubAction
{ after(grammarAccess.getSubActionRule()); } 
	 EOF 
;

// Rule SubAction
ruleSubAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubActionAccess().getGroup()); }
		(rule__SubAction__Group__0)
		{ after(grammarAccess.getSubActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule EventType
ruleEventType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventTypeAccess().getAlternatives()); }
		(rule__EventType__Alternatives)
		{ after(grammarAccess.getEventTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule ActionType
ruleActionType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionTypeAccess().getAlternatives()); }
		(rule__ActionType__Alternatives)
		{ after(grammarAccess.getActionTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventTypeAccess().getFORB_FORWARDEnumLiteralDeclaration_0()); }
		('FORB_FORWARD')
		{ after(grammarAccess.getEventTypeAccess().getFORB_FORWARDEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getFORB_LEFTEnumLiteralDeclaration_1()); }
		('FORB_LEFT')
		{ after(grammarAccess.getEventTypeAccess().getFORB_LEFTEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getFORB_RIGHTEnumLiteralDeclaration_2()); }
		('FORB_RIGHT')
		{ after(grammarAccess.getEventTypeAccess().getFORB_RIGHTEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getOFF_ROAD_LEFTEnumLiteralDeclaration_3()); }
		('OFF_ROAD_LEFT')
		{ after(grammarAccess.getEventTypeAccess().getOFF_ROAD_LEFTEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getOFF_ROAD_RIGHTEnumLiteralDeclaration_4()); }
		('OFF_ROAD_RIGHT')
		{ after(grammarAccess.getEventTypeAccess().getOFF_ROAD_RIGHTEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_5()); }
		('TRAFFIC_LIGHT_OFF')
		{ after(grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_OFFEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_ONEnumLiteralDeclaration_6()); }
		('TRAFFIC_LIGHT_ON')
		{ after(grammarAccess.getEventTypeAccess().getTRAFFIC_LIGHT_ONEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getOBJECT_LEFTEnumLiteralDeclaration_7()); }
		('OBJECT_LEFT')
		{ after(grammarAccess.getEventTypeAccess().getOBJECT_LEFTEnumLiteralDeclaration_7()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getOBJECT_RIGHTEnumLiteralDeclaration_8()); }
		('OBJECT_RIGHT')
		{ after(grammarAccess.getEventTypeAccess().getOBJECT_RIGHTEnumLiteralDeclaration_8()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getOBJECT_MIDDLEEnumLiteralDeclaration_9()); }
		('OBJECT_MIDDLE')
		{ after(grammarAccess.getEventTypeAccess().getOBJECT_MIDDLEEnumLiteralDeclaration_9()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getCAN_GO_LEFTEnumLiteralDeclaration_10()); }
		('CAN_GO_LEFT')
		{ after(grammarAccess.getEventTypeAccess().getCAN_GO_LEFTEnumLiteralDeclaration_10()); }
	)
	|
	(
		{ before(grammarAccess.getEventTypeAccess().getCAN_GO_RIGHTEnumLiteralDeclaration_11()); }
		('CAN_GO_RIGHT')
		{ after(grammarAccess.getEventTypeAccess().getCAN_GO_RIGHTEnumLiteralDeclaration_11()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionTypeAccess().getMOTOR_LEFTEnumLiteralDeclaration_0()); }
		('MOTOR_LEFT')
		{ after(grammarAccess.getActionTypeAccess().getMOTOR_LEFTEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionTypeAccess().getMOTOR_RIGHTEnumLiteralDeclaration_1()); }
		('MOTOR_RIGHT')
		{ after(grammarAccess.getActionTypeAccess().getMOTOR_RIGHTEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getActionTypeAccess().getSPEEDEnumLiteralDeclaration_2()); }
		('SPEED')
		{ after(grammarAccess.getActionTypeAccess().getSPEEDEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__0__Impl
	rule__Car__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getCarAction_0()); }
	()
	{ after(grammarAccess.getCarAccess().getCarAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__1__Impl
	rule__Car__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getCarKeyword_1()); }
	'Car'
	{ after(grammarAccess.getCarAccess().getCarKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__2__Impl
	rule__Car__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getNameAssignment_2()); }
	(rule__Car__NameAssignment_2)
	{ after(grammarAccess.getCarAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__3__Impl
	rule__Car__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getActionsKeyword_3()); }
	'actions'
	{ after(grammarAccess.getCarAccess().getActionsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__4__Impl
	rule__Car__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getColonKeyword_4()); }
	':'
	{ after(grammarAccess.getCarAccess().getColonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__5__Impl
	rule__Car__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getActionsAssignment_5()); }
	(rule__Car__ActionsAssignment_5)
	{ after(grammarAccess.getCarAccess().getActionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__6__Impl
	rule__Car__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getActionsAssignment_6()); }
	(rule__Car__ActionsAssignment_6)*
	{ after(grammarAccess.getCarAccess().getActionsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__7__Impl
	rule__Car__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getEnvironmentsKeyword_7()); }
	'environments'
	{ after(grammarAccess.getCarAccess().getEnvironmentsKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__8__Impl
	rule__Car__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getColonKeyword_8()); }
	':'
	{ after(grammarAccess.getCarAccess().getColonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__9__Impl
	rule__Car__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getConditionsAssignment_9()); }
	(rule__Car__ConditionsAssignment_9)
	{ after(grammarAccess.getCarAccess().getConditionsAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__10__Impl
	rule__Car__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getConditionsAssignment_10()); }
	(rule__Car__ConditionsAssignment_10)*
	{ after(grammarAccess.getCarAccess().getConditionsAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__11__Impl
	rule__Car__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getRUNKeyword_11()); }
	'RUN'
	{ after(grammarAccess.getCarAccess().getRUNKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Car__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCarAccess().getDefaultActionAssignment_12()); }
	(rule__Car__DefaultActionAssignment_12)?
	{ after(grammarAccess.getCarAccess().getDefaultActionAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__0__Impl
	rule__Condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getConditionAction_0()); }
	()
	{ after(grammarAccess.getConditionAccess().getConditionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__1__Impl
	rule__Condition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getGroup_1()); }
	(rule__Condition__Group_1__0)
	{ after(grammarAccess.getConditionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__2__Impl
	rule__Condition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getGroup_2()); }
	(rule__Condition__Group_2__0)*
	{ after(grammarAccess.getConditionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__3__Impl
	rule__Condition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
	'->'
	{ after(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getActionAssignment_4()); }
	(rule__Condition__ActionAssignment_4)
	{ after(grammarAccess.getConditionAccess().getActionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_1__0__Impl
	rule__Condition__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getHyphenMinusKeyword_1_0()); }
	'-'
	{ after(grammarAccess.getConditionAccess().getHyphenMinusKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getEnvironmentEventsAssignment_1_1()); }
	(rule__Condition__EnvironmentEventsAssignment_1_1)
	{ after(grammarAccess.getConditionAccess().getEnvironmentEventsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_2__0__Impl
	rule__Condition__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getAndKeyword_2_0()); }
	'and'
	{ after(grammarAccess.getConditionAccess().getAndKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getEnvironmentEventsAssignment_2_1()); }
	(rule__Condition__EnvironmentEventsAssignment_2_1)
	{ after(grammarAccess.getConditionAccess().getEnvironmentEventsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__0__Impl
	rule__Action__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getActionAction_0()); }
	()
	{ after(grammarAccess.getActionAccess().getActionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__1__Impl
	rule__Action__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getNameAssignment_1()); }
	(rule__Action__NameAssignment_1)
	{ after(grammarAccess.getActionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__2__Impl
	rule__Action__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getActionAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__3__Impl
	rule__Action__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getSubActionsAssignment_3()); }
	(rule__Action__SubActionsAssignment_3)
	{ after(grammarAccess.getActionAccess().getSubActionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getSubActionsAssignment_4()); }
	(rule__Action__SubActionsAssignment_4)*
	{ after(grammarAccess.getActionAccess().getSubActionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnvironmentEvent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnvironmentEvent__Group__0__Impl
	rule__EnvironmentEvent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnvironmentEvent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnvironmentEventAccess().getEnvironmentEventAction_0()); }
	()
	{ after(grammarAccess.getEnvironmentEventAccess().getEnvironmentEventAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnvironmentEvent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnvironmentEvent__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnvironmentEvent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnvironmentEventAccess().getTypeAssignment_1()); }
	(rule__EnvironmentEvent__TypeAssignment_1)
	{ after(grammarAccess.getEnvironmentEventAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubAction__Group__0__Impl
	rule__SubAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubActionAccess().getSubActionAction_0()); }
	()
	{ after(grammarAccess.getSubActionAccess().getSubActionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubAction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubActionAccess().getGroup_1()); }
	(rule__SubAction__Group_1__0)
	{ after(grammarAccess.getSubActionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubAction__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubAction__Group_1__0__Impl
	rule__SubAction__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubActionAccess().getHyphenMinusKeyword_1_0()); }
	'-'
	{ after(grammarAccess.getSubActionAccess().getHyphenMinusKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubAction__Group_1__1__Impl
	rule__SubAction__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubActionAccess().getTypeAssignment_1_1()); }
	(rule__SubAction__TypeAssignment_1_1)
	{ after(grammarAccess.getSubActionAccess().getTypeAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubAction__Group_1__2__Impl
	rule__SubAction__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubActionAccess().getIsKeyword_1_2()); }
	'is'
	{ after(grammarAccess.getSubActionAccess().getIsKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubAction__Group_1__3__Impl
	rule__SubAction__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubActionAccess().getValueAssignment_1_3()); }
	(rule__SubAction__ValueAssignment_1_3)
	{ after(grammarAccess.getSubActionAccess().getValueAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubAction__Group_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubActionAccess().getGroup_1_4()); }
	(rule__SubAction__Group_1_4__0)?
	{ after(grammarAccess.getSubActionAccess().getGroup_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubAction__Group_1_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubAction__Group_1_4__0__Impl
	rule__SubAction__Group_1_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubActionAccess().getDuringKeyword_1_4_0()); }
	'during'
	{ after(grammarAccess.getSubActionAccess().getDuringKeyword_1_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubAction__Group_1_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__Group_1_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubActionAccess().getDurationAssignment_1_4_1()); }
	(rule__SubAction__DurationAssignment_1_4_1)
	{ after(grammarAccess.getSubActionAccess().getDurationAssignment_1_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Car__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCarAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getCarAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__ActionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCarAccess().getActionsActionParserRuleCall_5_0()); }
		ruleAction
		{ after(grammarAccess.getCarAccess().getActionsActionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__ActionsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCarAccess().getActionsActionParserRuleCall_6_0()); }
		ruleAction
		{ after(grammarAccess.getCarAccess().getActionsActionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__ConditionsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCarAccess().getConditionsConditionParserRuleCall_9_0()); }
		ruleCondition
		{ after(grammarAccess.getCarAccess().getConditionsConditionParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__ConditionsAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCarAccess().getConditionsConditionParserRuleCall_10_0()); }
		ruleCondition
		{ after(grammarAccess.getCarAccess().getConditionsConditionParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__DefaultActionAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCarAccess().getDefaultActionActionCrossReference_12_0()); }
		(
			{ before(grammarAccess.getCarAccess().getDefaultActionActionIDTerminalRuleCall_12_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCarAccess().getDefaultActionActionIDTerminalRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getCarAccess().getDefaultActionActionCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__EnvironmentEventsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getEnvironmentEventsEnvironmentEventParserRuleCall_1_1_0()); }
		ruleEnvironmentEvent
		{ after(grammarAccess.getConditionAccess().getEnvironmentEventsEnvironmentEventParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__EnvironmentEventsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getEnvironmentEventsEnvironmentEventParserRuleCall_2_1_0()); }
		ruleEnvironmentEvent
		{ after(grammarAccess.getConditionAccess().getEnvironmentEventsEnvironmentEventParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__ActionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getActionActionCrossReference_4_0()); }
		(
			{ before(grammarAccess.getConditionAccess().getActionActionEStringParserRuleCall_4_0_1()); }
			ruleEString
			{ after(grammarAccess.getConditionAccess().getActionActionEStringParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getConditionAccess().getActionActionCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__SubActionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getSubActionsSubActionParserRuleCall_3_0()); }
		ruleSubAction
		{ after(grammarAccess.getActionAccess().getSubActionsSubActionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__SubActionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getSubActionsSubActionParserRuleCall_4_0()); }
		ruleSubAction
		{ after(grammarAccess.getActionAccess().getSubActionsSubActionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnvironmentEvent__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnvironmentEventAccess().getTypeEventTypeEnumRuleCall_1_0()); }
		ruleEventType
		{ after(grammarAccess.getEnvironmentEventAccess().getTypeEventTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__TypeAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubActionAccess().getTypeActionTypeEnumRuleCall_1_1_0()); }
		ruleActionType
		{ after(grammarAccess.getSubActionAccess().getTypeActionTypeEnumRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__ValueAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubActionAccess().getValueEIntParserRuleCall_1_3_0()); }
		ruleEInt
		{ after(grammarAccess.getSubActionAccess().getValueEIntParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAction__DurationAssignment_1_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubActionAccess().getDurationEIntParserRuleCall_1_4_1_0()); }
		ruleEInt
		{ after(grammarAccess.getSubActionAccess().getDurationEIntParserRuleCall_1_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
