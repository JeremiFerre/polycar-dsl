package fr.unice.polytech.deantoni.vrep.polycar;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        PolyCar car = new PolyCar("10.211.55.4", 19997);
        // Lambda Runnable
//        Runnable readLeftSensorsTask = () -> {
//            car.readLeftSensor();
//        };
//		SCInterface.readLeftSensors.subscribe(e -> new Thread(readLeftSensorsTask).start());

        car.start();
        car.goStraight(10);
        while (true) {
            Thread.sleep(1000);
        }
    }
}
