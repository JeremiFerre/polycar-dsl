Car SuperAutonomousCar
	actions:
		GreenLight:
			- SPEED is 0
		RedLight: 
			- SPEED is 0
		AlignLeft:
			- MOTOR_RIGHT is 2 during 4
			- MOTOR_RIGHT is 1
		AlignRight:  
			- MOTOR_LEFT is 2 during 4
			- MOTOR_LEFT is 1
		BackWard:
			- SPEED is -1 during 5
	environments:
		- OBJECT_MIDDLE -> BackWard
		- OFF_ROAD_LEFT -> AlignRight
		- OFF_ROAD_RIGHT -> AlignLeft
		- TRAFFIC_LIGHT_OFF -> RedLight
		- TRAFFIC_LIGHT_ON -> GreenLight
RUN