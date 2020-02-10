Car SuperAutonomousCar
	actions:
		GreenLight:
			- SPEED is 10
		RedLight: 
			- SPEED is 0
		AlignLeft:
			- MOTOR_RIGHT is 11 during 4
			- MOTOR_RIGHT is 10
		AlignRight:
			- MOTOR_LEFT is 11 during 4
			- MOTOR_LEFT is 10
	environments:
		- OFF_ROAD_LEFT -> AlignRight
		- OFF_ROAD_RIGHT -> AlignLeft
		- TRAFFIC_LIGHT_OFF -> RedLight
		- TRAFFIC_LIGHT_ON -> GreenLight
RUN