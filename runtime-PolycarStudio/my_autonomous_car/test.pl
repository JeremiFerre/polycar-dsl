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
		BackWard:
			- SPEED is 50 during 15
			- SPEED is 10
		GoRight:
			- SPEED is 10 during 20
			- SPEED is 0
			- MOTOR_LEFT is 15 during 21
			- SPEED is 10
		GoLeft:
			- SPEED is 10 during 20
			- SPEED is 0
			- MOTOR_RIGHT is 15 during 21
			- SPEED is 10
	environments:
		- OBJECT_MIDDLE -> BackWard
		- OFF_ROAD_LEFT -> AlignRight
		- OFF_ROAD_RIGHT -> AlignLeft
		- TRAFFIC_LIGHT_OFF -> RedLight
		- TRAFFIC_LIGHT_ON -> GreenLight
		- FORB_LEFT -> GoRight
		- FORB_RIGHT -> GoLeft
		- FORB_FORWARD -> GoRight
		- CAN_GO_LEFT -> GoLeft
		- CAN_GO_RIGHT -> GoRight
RUN GreenLight