package fr.unice.polytech.deantoni.vrep.polycar;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        JbossCar car = new JbossCar("10.211.55.8", 19997);
        // Lambda Runnable
//        Runnable readLeftSensorsTask = () -> {
//            car.readLeftSensor();
//        };
//		SCInterface.readLeftSensors.subscribe(e -> new Thread(readLeftSensorsTask).start());

        car.start();
        car.goStraight(0);
        while (true) {
            for (VrepObject vrepObject : car.getVrepObjects()) {
                System.out.println(vrepObject);
            }
            Thread.sleep(200);
        }
    }
}
