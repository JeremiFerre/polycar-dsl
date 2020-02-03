/*******************************************************************************
 * Copyright (c) 2018 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Julien Deantoni - initial API and implementation
 *******************************************************************************/
package fr.unice.polytech.deantoni.vrep.polycar;

import coppelia.BoolW;
import coppelia.CharWA;
import coppelia.FloatWA;
import coppelia.IntW;
import coppelia.IntWA;
import coppelia.remoteApi;
import fr.unice.polytech.deantoni.vrep.polycar.utils.Pixel;

public class PolyCar {

	protected int clientID = -1;
	protected remoteApi vrep = new remoteApi();

	// handler of robot equipments
	protected IntW leftMotor = new IntW(0);
	protected IntW rightMotor = new IntW(0);
	protected IntW middleProxSensor = new IntW(0);
	protected IntW leftProxSensor = new IntW(0);
	protected IntW rightProxSensor = new IntW(0);

	protected IntW leftSensor = new IntW(0);
	protected IntW rightSensor = new IntW(0);
	protected IntW middleSensor = new IntW(0);
	protected IntW car = new IntW(0);
	protected IntW veryRightSensor = new IntW(0);
	protected IntW veryLeftSensor = new IntW(0);
	
	IntW aTree= new IntW(0);

	//data from sensors:
	protected Pixel leftSensorPixel = new Pixel("left");
	protected Pixel middleSensorPixel = new Pixel("middle");
	protected Pixel rightSensorPixel = new Pixel("right");
	protected Pixel veryRightSensorPixel = new Pixel("veryRight");
	protected Pixel veryLeftSensorPixel = new Pixel("veryLeft");

	
	
	// handlers on detected objects
	protected BoolW objectDetected = new BoolW(false);

	private final IntWA resolution = new IntWA(2);

	/**
	 * x, y and z of the closest detected point
	 */
	public FloatWA leftDetectedObjectPoint = new FloatWA(0);
	public IntW leftHandleDetectedObj = new IntW(0);
	public FloatWA leftMapDetectedObject = new FloatWA(0);

	/**
	 * x, y and z of the closest detected point
	 */
	public FloatWA middleDetectedObjectPoint = new FloatWA(0);
	public IntW middleHandleDetectedObj = new IntW(0);
	public FloatWA middleMapDetectedObject = new FloatWA(0);
	
	/**
	 * x, y and z of the closest detected point
	 */
	public FloatWA rightDetectedObjectPoint = new FloatWA(0);
	public IntW rightHandleDetectedObj = new IntW(0);
	public FloatWA rightMapDetectedObject = new FloatWA(0);

	

	

	
	public PolyCar(String IP, int portNumber) {
		clientID = vrep.simxStart(IP, portNumber, true, true, 5000, 5);
		if (clientID == -1) {
			throw new RuntimeException("impossible to connect to V-REP server");
		} else {
			System.out.println("connected to the server....");
		}
		// Handle car !
		vrep.simxGetObjectHandle(clientID, "polyCar", car, remoteApi.simx_opmode_blocking);
		// Handle of the left motor
		vrep.simxGetObjectHandle(clientID, "polyCarLeftMotor", leftMotor, remoteApi.simx_opmode_blocking);
		// Handle of the right motor
		vrep.simxGetObjectHandle(clientID, "polyCarRightMotor", rightMotor, remoteApi.simx_opmode_blocking);
		// Handle of the left sensor
		vrep.simxGetObjectHandle(clientID, "polyCarLeftSensor", leftSensor, remoteApi.simx_opmode_blocking);
		// Handle of the middle sensor
		vrep.simxGetObjectHandle(clientID, "polyCarMiddleSensor", middleSensor, remoteApi.simx_opmode_blocking);
		// Handle of the right sensor
		vrep.simxGetObjectHandle(clientID, "polyCarRightSensor", rightSensor, remoteApi.simx_opmode_blocking);
		// Handle of the very right sensor
		vrep.simxGetObjectHandle(clientID, "polyCarVeryRightSensor", veryRightSensor, remoteApi.simx_opmode_blocking);
		// Handle of the very left sensor
		vrep.simxGetObjectHandle(clientID, "polyCarVeryLeftSensor", veryLeftSensor, remoteApi.simx_opmode_blocking);
		//Handle of a tree use to get car orientation
		vrep.simxGetObjectHandle(clientID, "Tree", aTree, remoteApi.simx_opmode_blocking);

		// Handle of the proximity sensors
		vrep.simxGetObjectHandle(clientID, "polyCarSensingNose", middleProxSensor, remoteApi.simx_opmode_blocking);
		vrep.simxGetObjectHandle(clientID, "polyCarLeftSensingNose", leftProxSensor, remoteApi.simx_opmode_blocking);
		vrep.simxGetObjectHandle(clientID, "polyCarRightSensingNose", rightProxSensor, remoteApi.simx_opmode_blocking);

		
		resolution.getArray()[0] = 1;
		resolution.getArray()[1] = 1;
		
		
		System.out.println("ready to go ! ");
	}

	/**
	 * start the simulation
	 */
	public void start() {
		vrep.simxStartSimulation(clientID, remoteApi.simx_opmode_oneshot);
	}

	
	/**
	 * read the left sensor that check if car is on the "black" road. Result is stored in the veryLeftSensorPixel, and returned}
	 * @return a Pixel containing the newly read image
	 */
	public Pixel readLeftSensor() {
		CharWA temp = new CharWA(3);
		vrep.simxGetVisionSensorImage(clientID, leftSensor.getValue(), resolution, temp, 0, remoteApi.simx_opmode_blocking);
		leftSensorPixel.R = java.lang.Byte.toUnsignedInt((byte) temp.getArray()[0]);
		leftSensorPixel.G = java.lang.Byte.toUnsignedInt((byte) temp.getArray()[1]);
		leftSensorPixel.B = java.lang.Byte.toUnsignedInt((byte) temp.getArray()[2]);
		return leftSensorPixel;
	}
	
	/**
	 * read the right sensor that check if car is on the "black" road. Result is stored in the veryLeftSensorPixel, and returned}
	 * @return a Pixel containing the newly read image
	 */
	public Pixel readRightSensor() {
		CharWA temp = new CharWA(3);
		vrep.simxGetVisionSensorImage(clientID, rightSensor.getValue(), resolution, temp, 0, remoteApi.simx_opmode_blocking);
		rightSensorPixel.R = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[0]);
		rightSensorPixel.G = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[1]);
		rightSensorPixel.B = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[2]);
		return rightSensorPixel;
	}
	
	/**
	 * read the middle sensor that check if car is on the "black" road. Result is stored in the veryLeftSensorPixel, and returned}
	 * @return a Pixel containing the newly read image
	 */
	public Pixel readMiddleSensor() {
		CharWA temp = new CharWA(3);
		vrep.simxGetVisionSensorImage(clientID, middleSensor.getValue(), resolution, temp, 0, remoteApi.simx_opmode_blocking);
		middleSensorPixel.R = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[0]);
		middleSensorPixel.G = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[1]);
		middleSensorPixel.B = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[2]);
		return middleSensorPixel;
	}
	
	/**
	 * read the sensor that check the possibility to turn or the forbidden sign to turn, as well as traffic light values. Result is stored in the veryLeftSensorPixel, and returned}
	 * @return a Pixel containing the newly read image
	 */
	public Pixel readVeryRightSensor() {
		CharWA temp = new CharWA(3);
		vrep.simxGetVisionSensorImage(clientID, veryRightSensor.getValue(), resolution, temp, 0, remoteApi.simx_opmode_blocking);
		veryRightSensorPixel.R = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[0]);
		veryRightSensorPixel.G = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[1]);
		veryRightSensorPixel.B = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[2]);
		return veryRightSensorPixel;
	}
	
	/**
	 * read the sensor that check the possibility to turn or the forbidden sign to turn. Result is stored in the veryLeftSensorPixel, and returned}
	 * @return a Pixel containing the newly read image
	 */
	public Pixel readVeryLeftSensor() {
		CharWA temp = new CharWA(3);
		vrep.simxGetVisionSensorImage(clientID, veryLeftSensor.getValue(), resolution, temp, 0, remoteApi.simx_opmode_blocking);
		veryLeftSensorPixel.R = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[0]);
		veryLeftSensorPixel.G = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[1]);
		veryLeftSensorPixel.B = java.lang.Byte.toUnsignedInt((byte)temp.getArray()[2]);
		return veryLeftSensorPixel;
	}

	/**
	 * 
	 * @return true if an object is close enought to be detected by the middle proximity sensor. Detected object is store in
	 *         {@link #handleDetectedObj} and sensor values in #detectedObjectPoint.
	 *         A detected Surface Normal Vector is also store in
	 *         {@link #mapDetectedObject}
	 */
	public boolean checkMiddleProximitySensor() {
		vrep.simxReadProximitySensor(clientID, middleProxSensor.getValue(), objectDetected, middleDetectedObjectPoint,
				middleHandleDetectedObj, middleMapDetectedObject, remoteApi.simx_opmode_blocking);
		return objectDetected.getValue();
	}
	
	/**
	 * 
	 * @return true if an object is close enought to be detected by the left proximity sensor. Detected object is store in
	 *         {@link #handleDetectedObj} and sensor values in #detectedObjectPoint.
	 *         A detected Surface Normal Vector is also store in
	 *         {@link #mapDetectedObject}
	 */
	public boolean checkLeftProximitySensor() {
		vrep.simxReadProximitySensor(clientID, leftProxSensor.getValue(), objectDetected, leftDetectedObjectPoint,
				leftHandleDetectedObj, leftMapDetectedObject, remoteApi.simx_opmode_blocking);
		return objectDetected.getValue();
	}
	
	/**
	 * 
	 * @return true if an object is close enought to be detected by the right proximity sensor. Detected object is store in
	 *         {@link #handleDetectedObj} and sensor values in #detectedObjectPoint.
	 *         A detected Surface Normal Vector is also store in
	 *         {@link #mapDetectedObject}
	 */
	public boolean checkRightProximitySensor() {
		vrep.simxReadProximitySensor(clientID, rightProxSensor.getValue(), objectDetected, rightDetectedObjectPoint,
				rightHandleDetectedObj, rightMapDetectedObject, remoteApi.simx_opmode_blocking);
		return objectDetected.getValue();
	}

	/**
	 * compute the distance to the cosest detected object from the point given as a parameter
	 * @param detectedObjectPoint, a FloatWA of size 3
	 * @return an int representing the distance
	 */
	public int getDetectedObjectDistance(FloatWA detectedObjectPoint) {
		double distX = detectedObjectPoint.getArray()[0];
		double distY = detectedObjectPoint.getArray()[1];
		return (int) (Math.sqrt(distX * distX + distY * distY) * 10000);
	}


	/**
	 * retrieve the orientation of the car, in radiant
	 * @return a float representing the orientation of the car, in radian
	 */
	public float getOrientation() {
		FloatWA angles = new FloatWA(3);
		vrep.simxGetObjectOrientation(clientID, leftMotor.getValue(), aTree.getValue(), angles, remoteApi.simx_opmode_streaming);
		return angles.getArray()[1];
	}
	

	/**
	 * make the robot go forward straight if @speed is positive and backward
	 * if @speed is negative
	 * 
	 * @param speed:
	 *            the desired speed (0 = stopped, negative = backward, positive =
	 *            forward)
	 */
	public void goStraight(int speed) {
		vrep.simxSetJointTargetVelocity(clientID, leftMotor.getValue(), (float) speed, remoteApi.simx_opmode_streaming);
		vrep.simxSetJointTargetVelocity(clientID, rightMotor.getValue(), (float) speed,
				remoteApi.simx_opmode_streaming);
	}

	/**
	 * make the robot go forward straight if @speed is positive and backward
	 * if @speed is negative
	 * 
	 * @param speed:
	 *            the desired speed (0 = stopped, negative = backward, positive =
	 *            forward)
	 * @param duration:
	 *            the duration, in milliseconds during which the robot goes straight
	 *            and then stop
	 */
	public void goStraight(int speed, int duration) {
		goStraight(speed);
		sleep(duration);
		goStraight(0);
	}

	public void turnRight(int speed) {
		vrep.simxSetJointTargetVelocity(clientID, leftMotor.getValue(), (float) speed, remoteApi.simx_opmode_streaming);
		vrep.simxSetJointTargetVelocity(clientID, rightMotor.getValue(), (float) 0.0, remoteApi.simx_opmode_streaming);
	}

	public void turnRight(int speed, int duration) {
		turnRight(speed);
		sleep(duration);
		turnRight(0);
	}

	public void turnLeft(int speed) {
		vrep.simxSetJointTargetVelocity(clientID, leftMotor.getValue(), (float) 0.0, remoteApi.simx_opmode_streaming);
		vrep.simxSetJointTargetVelocity(clientID, rightMotor.getValue(), (float) speed,
				remoteApi.simx_opmode_streaming);
	}

	public void turnLeft(int speed, int duration) {
		turnLeft(speed);
		sleep(duration);
		turnLeft(0);
	}

	public void goCurved(int speedLeft, int speedRight) {
		vrep.simxSetJointTargetVelocity(clientID, leftMotor.getValue(), (float) speedLeft,
				remoteApi.simx_opmode_streaming);
		vrep.simxSetJointTargetVelocity(clientID, rightMotor.getValue(), (float) speedRight,
				remoteApi.simx_opmode_streaming);
	}

	public void goCurved(int speedLeft, int speedRight, int duration) {
		goCurved(speedLeft, speedRight);
		sleep(duration);
		goStraight(0);
	}

	/**
	 * stop the simulation.
	 */
	public void stopSimulation() {
		// Before closing the connection to V-REP, make sure that the last command sent
		// out had time to arrive. You can guarantee this with (for example):
		IntW pingTime = new IntW(0);
		vrep.simxGetPingTime(clientID, pingTime);

		// Now close the connection to V-REP:
		vrep.simxStopSimulation(clientID, remoteApi.simx_opmode_blocking);
		vrep.simxFinish(clientID);
	}


	public void log2vrep(String s) {
		vrep.simxAddStatusbarMessage(clientID, s, remoteApi.simx_opmode_oneshot);
	}

	public void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.stopSimulation();
		super.finalize();
	}
}
