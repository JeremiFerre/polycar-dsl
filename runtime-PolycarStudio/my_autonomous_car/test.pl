Car SuperAutonomousCar
	actions:
		GreenLight: 
			- SPEED is 10
		RedLight: 
			- SPEED is 0
		TurnLeft:
			- MOTOR_RIGHT is 0
			- MOTOR_LEFT is 25
	environments:
		- TRAFFIC_LIGHT_OFF -> RedLight
		- TRAFFIC_LIGHT_ON -> GreenLight
RUN