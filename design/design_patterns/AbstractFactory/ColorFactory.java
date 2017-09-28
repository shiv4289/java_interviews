package AbstractFactory;

/**
 * Created by sourabh on 9/7/16.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Wheel getWheel(String wheel) {
        if (wheel == null) {
            return null;
        }
        return null;
    }

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        return null;
    }
}
