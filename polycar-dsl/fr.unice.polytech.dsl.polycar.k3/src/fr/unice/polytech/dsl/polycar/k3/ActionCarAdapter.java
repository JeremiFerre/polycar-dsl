package fr.unice.polytech.dsl.polycar.k3;

import fr.unice.polytech.deantoni.vrep.polycar.PolyCar;
import fr.unice.polytech.dsl.polycar.ActionType;
import fr.unice.polytech.dsl.polycar.EventType;

class ActionCarAdapter {
	
	private PolyCar car;
	private ActionType actionType;
	private int value;
	
	public ActionCarAdapter(PolyCar car, ActionType actionType, int value) {
		this.car = car;
		this.actionType = actionType;
		this.value = value;
	}
	
	public void execute() {
		switch (actionType) {
			case MOTOR_LEFT:
				car.turnLeft(value);
			case MOTOR_RIGHT:
				car.turnRight(value);
			case SPEED:
				car.goStraight(value);
		}
	}
}
