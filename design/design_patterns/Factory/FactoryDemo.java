package Factory;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by sourabh on 9/7/16.
 */
public class FactoryDemo {
    private static DogFactory dogFactory = new DogFactory();

    public static void main(String args[]) {

        try {
            dogFactory.registerDog("poodle", Poodle.class);
            Dog dog = dogFactory.createDog("poodle");
            dog.speak();

            Dog poodle = DogFactory.getDog("small");
            poodle.speak();
        } catch (Exception e) {
            try {
                throw e;
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            } catch (InvocationTargetException e1) {
                e1.printStackTrace();
            } catch (InstantiationException e1) {
                e1.printStackTrace();
            }
            System.out.println(e.getCause());
        }

    }

}
