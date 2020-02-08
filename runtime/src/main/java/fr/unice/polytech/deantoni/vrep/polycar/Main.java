package fr.unice.polytech.deantoni.vrep.polycar;

import fr.unice.polytech.deantoni.vrep.polycar.utils.Pixel;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        PolyCar car = new PolyCar("10.211.55.4", 19997);
        // Lambda Runnable
//        Runnable readLeftSensorsTask = () -> {
//            car.readLeftSensor();
//        };
//		SCInterface.readLeftSensors.subscribe(e -> new Thread(readLeftSensorsTask).start());

        car.start();
        car.goStraight(10);
        for (int i = 0; i < 10; i++) {
            Pixel pixel = car.readMiddleSensor();
            car.synchronize();
        }

        System.in.read();
        System.out.println("FINI");
    }
}
