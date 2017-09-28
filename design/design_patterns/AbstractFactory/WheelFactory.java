package AbstractFactory;

/**
 * Created by sourabh on 9/7/16.
 */
public class WheelFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Wheel getWheel(String wheel) {

        if (wheel == null) {
            return null;
        }

        if (wheel.equalsIgnoreCase("SteelWheel")) {
            return new SteelWheel();

        } else if (wheel.equalsIgnoreCase("AlloyWheel")) {
            return new AlloyWheel();
        }

        return null;
    }
}
