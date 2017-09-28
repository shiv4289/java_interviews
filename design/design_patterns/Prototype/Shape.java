package Prototype;

/**
 * Created by sourabh on 9/7/16.
 */
public abstract class Shape implements Cloneable {

    abstract public void draw();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
