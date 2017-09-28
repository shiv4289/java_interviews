package DesignProblems.ElevatorDesign.ElevatorDesign;

/**
 * Created by sourabh on 19/7/16.
 */
public class FloorControlPanel extends Thread {

    Floor floor;
    public volatile boolean upflag = false;
    public volatile boolean downflag = false;

    public void pressUpButton() {
        floor.setUpButton(!floor.getUpButton());
    }

    public void pressDownButton() {
        floor.setDownButton(!floor.getDownButton());
    }

    public void run() {
        while (true) {
            if (upflag) {
                pressUpButton();
                upflag = false;
            }
            if (downflag) {
                pressDownButton();
                downflag = false;
            }
        }
    }
}
