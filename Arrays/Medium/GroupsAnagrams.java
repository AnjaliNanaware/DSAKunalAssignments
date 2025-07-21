/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]
 */

import java.util.*;

class Solution {

    // public static boolean helper(String str1 , String str2){
    //     if (str1.length() != str2.length()) return false;

    //     int[] hash = new int[26];

    //     for (int i = 0; i < str1.length(); i++) {
    //         hash[str1.charAt(i) - 'a']++;
    //         hash[str2.charAt(i) - 'a']--;
    //     }

    //     for (int count : hash) {
    //         if (count != 0) return false;
    //     }

    //     return true;
    // }

    // public List<List<String>> groupAnagrams(String[] strs) {
    //     List<List<String>> ans = new ArrayList<>();
    //     boolean[] visited = new boolean[strs.length];

    //     for (int i = 0; i < strs.length; i++) {
    //         if (visited[i]) continue;

    //         List<String> list = new ArrayList<>();
    //         list.add(strs[i]);
    //         visited[i] = true;

    //         for (int j = i + 1; j < strs.length; j++) {
    //             if (!visited[j] && helper(strs[i], strs[j])) {
    //                 list.add(strs[j]);
    //                 visited[j] = true;
    //             }
    //         }

    //         ans.add(list);
    //     }

    //     return ans;
    // }

     public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Sort the string to get the key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Add to the map
            // map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            //same as 
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
