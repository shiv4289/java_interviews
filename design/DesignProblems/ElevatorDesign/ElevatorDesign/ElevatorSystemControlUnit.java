package DesignProblems.ElevatorDesign.ElevatorDesign;

import java.util.LinkedList;

/**
 * Created by sourabh on 19/7/16.
 */
public class ElevatorSystemControlUnit {

    LinkedList<ElevatorControlPanel> elevatorControlPanels;

    public void update(Integer floor) {
        Integer minDistance = Integer.MAX_VALUE;
        Integer minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < elevatorControlPanels.size(); i++) {
            Integer currentDistance = elevatorControlPanels.get(i).getDistance(floor);
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                minIndex = i;
            }
        }
        elevatorControlPanels.get(minIndex).pressButton(floor);
    }
}
