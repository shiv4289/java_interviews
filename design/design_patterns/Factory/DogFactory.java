package Factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * Created by sourabh on 9/7/16.
 */
public class DogFactory {

    private HashMap mRegisteredDogs = new HashMap();

    public void registerDog(String dogName, Class dogClass) {
        mRegisteredDogs.put(dogName, dogClass);
    }

    public Dog createDog(String dogName) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class dogClass = (Class) mRegisteredDogs.get(dogName);
        Constructor dogConstructor = dogClass.getDeclaredConstructor();
        return (Dog) dogConstructor.newInstance(new Object[]{});
    }

    // Noobs way
    public static Dog getDog(String criteria) {

        if (criteria.equals("small"))
            return new Poodle();
        else if (criteria.equals("big"))
            return new Rottweiler();
        else if (criteria.equals("working"))
            return new SiberianHusky();

        return null;
    }


}
