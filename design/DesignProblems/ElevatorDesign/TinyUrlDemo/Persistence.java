package DesignProblems.ElevatorDesign.TinyUrlDemo;

/**
 * Created by sourabh on 20/7/16.
 */
interface Persistence {
    public void put(String key, StringPair stringPair);

    public StringPair get(String key);
}
