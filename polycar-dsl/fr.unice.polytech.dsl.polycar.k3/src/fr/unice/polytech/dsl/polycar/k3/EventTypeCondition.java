package fr.unice.polytech.dsl.polycar.k3;

import fr.unice.polytech.deantoni.vrep.polycar.PolyCar;
import fr.unice.polytech.dsl.polycar.EventType;

class EventTypeCondition {
	
	private PolyCar car;
	private EventType eventType;
	
	public EventTypeCondition(PolyCar car, EventType eventType) {
		this.car = car;
		this.eventType = eventType;
	}
	
	public boolean isTriggered() {
		switch (eventType) {
			case FORB_FORWARD:
				return false;
			case FORB_LEFT:
				return false;
			case FORB_RIGHT:
				return false;
			case OFF_THE_ROAD:
				return false;
			case TRAFFIC_LIGHT_OFF:
				return car.readVeryRightSensor().isRed();
			case TRAFFIC_LIGHT_ON:
				return car.readVeryRightSensor().isGreen();
			default:
				return false;
		}
	}
}
