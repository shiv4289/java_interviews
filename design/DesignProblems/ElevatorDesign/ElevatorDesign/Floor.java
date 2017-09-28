package DesignProblems.ElevatorDesign.ElevatorDesign;

import java.util.LinkedList;

/**
 * Created by sourabh on 19/7/16.
 */
public class Floor implements FloorListner {

    Integer floorNumber;
    Boolean upButton;
    Boolean downButton;
    LinkedList<ElevatorSystemControlUnit> observers;

    public Floor(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Boolean getUpButton() {
        return upButton;
    }

    public void setUpButton(Boolean upButton) {
        this.upButton = upButton;
    }

    public Boolean getDownButton() {
        return downButton;
    }

    public void setDownButton(Boolean downButton) {
        this.downButton = downButton;
    }


    public void registerObserver(ElevatorSystemControlUnit elevatorSystemControlUnit) {
        observers.addLast(elevatorSystemControlUnit);
    }

    public void notifyObservers() {
        for (ElevatorSystemControlUnit elevatorSystemControlUnit : observers) {
            elevatorSystemControlUnit.update(this.floorNumber);
        }
    }
}
