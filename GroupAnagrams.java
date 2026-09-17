package Demo;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] words = {
        		"eat",
        		"tea",
        		"ate",
        		"bat",
        		"tan",
        		"nat",
            
           
        };

        List<List<String>> result = groupAnagrams(words);

        System.out.println(result);
    }
}