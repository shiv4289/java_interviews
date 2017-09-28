package DesignProblems.ElevatorDesign.ElevatorDesign;

/**
 * Created by sourabh on 19/7/16.
 */
public class ElevatorDemo {

    public static void main(String args) {
        Elevator elevator = new Elevator();
        ElevatorSystemControlUnit elevatorSystemControlUnit = new ElevatorSystemControlUnit();
        for (int i = 0; i < 10; i++) {
            Floor floor = new Floor(i);
            floor.registerObserver(elevatorSystemControlUnit);
        }

    }


}
