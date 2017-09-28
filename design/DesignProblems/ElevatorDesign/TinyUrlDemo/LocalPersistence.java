package DesignProblems.ElevatorDesign.TinyUrlDemo;

import java.util.HashMap;

/**
 * Created by sourabh on 20/7/16.
 */
class LocalPersistence implements Persistence {
    private HashMap<String, StringPair> hashMap;

    public void put(String key, StringPair stringPair) {

        hashMap.put(key, stringPair);
    }

    public StringPair get(String key) {
        return hashMap.get(key);
    }
}
