package Prototype;

import java.util.HashMap;

/**
 * Created by sourabh on 9/7/16.
 */
public class PrototypeFactory {

    HashMap mNameShapes = new HashMap();

    void registerShape(String name, Shape shape) {
        mNameShapes.put(name, shape);
    }

    public Shape getShape(String name) {
        Shape shape = (Shape) mNameShapes.get(name);
        return (Shape) shape.clone();
    }
}
