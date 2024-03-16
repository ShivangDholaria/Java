package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Design a time-based key-value data structure that can store multiple values for 
 * the same key at different time stamps and retrieve the key's value at a certain timestamp.
 * Implement the TimeMap class:
 *      TimeMap(): Initializes the object of the data structure.
 *      void set(String key, String value, int timestamp): Stores the key key with the value value at the given time timestamp.
 *      String get(String key, int timestamp): Returns a value such that set was called previously, with timestamp_prev <= timestamp. 
 *                                             If there are multiple such values, it returns the value associated with the 
 *                                             largest timestamp_prev. If there are no values, it returns "".
 */


public class TimeBasedKeyValueStore {

    Map<String, TreeMap<Integer, String>> map;

    public TimeBasedKeyValueStore() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) 
            map.put(key, new TreeMap<>());
        map.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        if(map.get(key).floorKey(timestamp) == null)
            return "";
        return map.get(key).get(map.get(key).floorKey(timestamp));
    }

    // Map<String, List<Pair<String, Integer>>> map;
    // public TimeMap() {
    //     map = new HashMap<>();
    // }
    
    // public void set(String key, String value, int timestamp) {
    //     if(!map.containsKey(key)) 
    //         map.put(key, new ArrayList<>());
    //     map.get(key).add(new Pair(value, timestamp));
    // }
    
    // public String get(String key, int timestamp) {
    //     if(!map.containsKey(key)) return "";

    //     List<Pair<String, Integer>> l = map.get(key);

    //     int left = 0, rigth = l.size() - 1;

    //     while(left < rigth) {
    //         int mid = left + (rigth - left + 1) / 2;

    //         if(l.get(mid).getValue() <= timestamp) left = mid;
    //         else rigth = mid - 1;
    //     }

    //     return l.get(left).getValue() <= timestamp ? l.get(left).getKey() : "";
    // }

    public static void main(String[] args) {
        
    }
}
