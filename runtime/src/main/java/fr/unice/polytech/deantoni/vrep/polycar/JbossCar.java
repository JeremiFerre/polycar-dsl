package fr.unice.polytech.deantoni.vrep.polycar;


import java.util.ArrayList;
import java.util.List;

public class JbossCar extends PolyCar {
    public JbossCar(String IP, int portNumber) {
        super(IP, portNumber);
    }

    public List<VrepObject> getVrepObjects() {
        List<VrepObject> vrepObjects = new ArrayList<>();
        if (checkLeftProximitySensor()) {
            vrepObjects.add(new VrepObject(Direction.LEFT, this.getDetectedObjectDistance(
                    this.leftDetectedObjectPoint)));
        }
        if (checkRightProximitySensor()) {
            vrepObjects.add(new VrepObject(Direction.RIGHT, this.getDetectedObjectDistance(
                    this.rightDetectedObjectPoint)));
        }
        if (checkMiddleProximitySensor()) {
            vrepObjects.add(new VrepObject(Direction.MIDDLE, this.getDetectedObjectDistance(
                    this.middleDetectedObjectPoint)));

        }
        return vrepObjects;
    }
}
