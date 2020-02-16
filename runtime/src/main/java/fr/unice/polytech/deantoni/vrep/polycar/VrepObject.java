package fr.unice.polytech.deantoni.vrep.polycar;

public class VrepObject {
    private Direction direction;
    private int distance;

    public VrepObject(Direction direction, int distance) {
        this.direction = direction;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "VrepObject{" +
                "direction=" + direction +
                ", distance=" + distance +
                '}';
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
