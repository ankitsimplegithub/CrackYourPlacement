class Solution {
    public String minWindow(String s, String t) {
         int n = s.length(), total = t.length();
        int b = 0, e = 0, res = Integer.MAX_VALUE, mini = 0;
        int[] mp = new int[128];
        for (char ch : t.toCharArray()) {
            mp[ch]++;
        }
        while (e < n) {
            mp[s.charAt(e)]--;
            if (mp[s.charAt(e)] >= 0)
                total--;
            while (total == 0 && b <= e) { // decreasing window
                if (res > e - b + 1) {
                    res = e - b + 1;
                    mini = b;
                }
                mp[s.charAt(b)]++;
                if (mp[s.charAt(b)] > 0)
                    total++;
                b++;
            }
            e++;
        }
        return (res == Integer.MAX_VALUE) ? "" : s.substring(mini, mini + res);
    }
}