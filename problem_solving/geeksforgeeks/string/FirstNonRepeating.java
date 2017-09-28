package geeksforgeeks.string;

import java.util.HashSet;
import java.util.LinkedHashMap;

/**
 * Created by sourabh on 15/6/16.
 */
public class FirstNonRepeating {

    LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<Character, Integer>();
    HashSet<Character> hashSet = new HashSet<Character>();

    public void putChar(Character c) {
        if (!hashSet.contains(c)) {
            if (linkedHashMap.containsKey(c)) {
                linkedHashMap.remove(c);
                hashSet.add(c);
            } else {
                linkedHashMap.put(c, 1);
            }
        }
    }

    public Character getNonRepeated() {
        if (linkedHashMap.isEmpty()) return null;
        return linkedHashMap.keySet().iterator().next();
    }

}
