package AbstractFactory;

/**
 * Created by sourabh on 9/7/16.
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("WHEEL")) {
            return new WheelFactory();

        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }

}
