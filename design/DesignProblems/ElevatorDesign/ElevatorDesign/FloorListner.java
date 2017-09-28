package DesignProblems.ElevatorDesign.ElevatorDesign;

/**
 * Created by sourabh on 19/7/16.
 */
public interface FloorListner {
    public void registerObserver(ElevatorSystemControlUnit elevatorSystemControlUnit);

    public void notifyObservers();
}
