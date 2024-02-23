package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 */

public class TopKFrequentElements {
    
    //1st sol - using Hashmap
    public static int[] topKFrequent_1(int[] nums, int k) {
        int[] ans = new int[k];
        int ind = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();
    
        for (int i : nums) freq.put(i, freq.getOrDefault(i, 0) + 1);

        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(freq.entrySet());
        l.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        //l.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for(int i = 0; i < Math.min(k, l.size()); i++)
            ans[i] = l.get(i).getKey();
        
        return ans;
    }

    // 2nd Sol - Using hashmap and bucket sort
    public static int[] topKFrequent_2(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] topK = new int[k];                                // Array of top k frequent elements
        for (int i : nums) {                                    // Creating freq map
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];          // Creating bucket of size array length + 1

        for (int k1 : hm.keySet()) {                            // Populating buckets with the freq of each key
            int freq = hm.get(k1);
            
            if (bucket[freq] == null) bucket[freq] = new ArrayList<>();

            bucket[freq].add(k1);
        }

        for (int i = bucket.length - 1; i >= 0; i--) {
            if(bucket[i] != null) {
                for (int j = 0; j < bucket[i].size(); j++)      // Getting the most frequent k elements
                    if(k > 0) topK[--k] = bucket[i].get(j);
                    else break;
            }
        }

        return topK;
    }

    
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 1, 1, 2, 2, 3}, arr2 = new int[] {4, 1, -1, 2, -1, 2, 3};
        int k1 = 2, k2 = 2;
        System.out.println(Arrays.toString(topKFrequent_1(arr1, k1)));
        System.out.println(Arrays.toString(topKFrequent_2(arr2, k2)));
    }
}
