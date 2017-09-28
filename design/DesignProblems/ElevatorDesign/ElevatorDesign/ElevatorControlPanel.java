package DesignProblems.ElevatorDesign.ElevatorDesign;

/**
 * Created by sourabh on 19/7/16.
 */
public class ElevatorControlPanel extends Thread {
    public Elevator elevator;
    public volatile Boolean stop = false;

    public void startElevator() {
        this.stop = false;
        this.start();
    }

    public void stopElevator() {
        this.stop = true;
    }

    public void run() {
        while (!stop) {
            elevator.move();
        }
    }

    public void pressButton(Integer floor) {
        elevator.addRequest(floor);
    }

    public Integer getDistance(Integer floor) {
        return elevator.getDistance(floor);
    }
}
