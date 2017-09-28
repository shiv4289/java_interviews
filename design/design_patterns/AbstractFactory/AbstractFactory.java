package AbstractFactory;

/**
 * Created by sourabh on 9/7/16.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Wheel getWheel(String wheel);
}
