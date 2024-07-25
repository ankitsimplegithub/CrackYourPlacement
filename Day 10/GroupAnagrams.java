import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> st = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int k = 0;
        
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s1 = new String(ch);
            
            if (!map.containsKey(s1)) {
                map.put(s1, k);
                List<String> newList = new ArrayList<>();
                newList.add(str);
                st.add(newList);
                k++;
            } else {
                st.get(map.get(s1)).add(str);
            }
        }
        return st; 
    }
}
