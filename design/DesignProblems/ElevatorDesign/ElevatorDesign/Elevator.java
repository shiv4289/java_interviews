package DesignProblems.ElevatorDesign.ElevatorDesign;

import java.util.TreeSet;

/**
 * Created by sourabh on 19/7/16.
 */
public class Elevator {

    Integer currentFloor;
    ElevatorDirection elevatorDirection;
    TreeSet<Integer> requestedFloors;

    public Elevator() {
        this.requestedFloors = new TreeSet<Integer>();
        this.elevatorDirection = ElevatorDirection.UP;
        this.currentFloor = 0;
    }

    public void addRequest(Integer floor) {
        requestedFloors.add(floor);
    }

    public void processFloor(Integer floor) {
        System.out.println("Processed floor : " + floor);
    }

    public void move() {
        while (!requestedFloors.isEmpty()) {
            Integer floor;
            switch (this.elevatorDirection) {
                case UP:
                    floor = requestedFloors.floor(this.currentFloor);
                    processFloor(floor);
                    break;
                case DOWN:
                    floor = requestedFloors.ceiling(this.currentFloor);
                    processFloor(floor);
                    break;
                case HAULT:
                    break;
            }
        }
    }

    public Integer getDistance(Integer floor) {
        if (floor < this.currentFloor) {
            switch (elevatorDirection) {
                case UP:
                    Integer maxRequestedFloor = requestedFloors.last();
                    return (this.currentFloor - floor) + 2 * (maxRequestedFloor - this.currentFloor);
                default:
                    return currentFloor - floor;
            }
        } else {
            switch (elevatorDirection) {
                case DOWN:
                    Integer minRequestedFloor = requestedFloors.first();
                    return (floor - this.currentFloor) + 2 * (this.currentFloor - minRequestedFloor);
                default:
                    return floor - this.currentFloor;
            }
        }
    }
}
