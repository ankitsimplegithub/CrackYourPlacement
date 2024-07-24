import java.util.*;


class Solution {
    List<String> combinations;
    int n;
    public List<String> generateParenthesis(int n) {
        this.combinations = new ArrayList<>();
        this.n = n;
        backtrack(new StringBuilder(), 0, 0);
        return combinations;
    }
    public void backtrack(StringBuilder curr, int left, int right) {
        if (curr.length() == 2 * n) {
            combinations.add(curr.toString());
            return;
        }
        if (left < n) {
            curr.append("(");
            backtrack(curr, left + 1, right);
            curr.deleteCharAt(curr.length() - 1);
        }
        if (right < left) {
            curr.append(")");
            backtrack(curr, left, right + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
