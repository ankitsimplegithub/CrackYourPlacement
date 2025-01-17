import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
       List<String> result = new ArrayList<>();
        int n = words.length;
        int index = 0;
        
        while (index < n) {
            int totalChars = words[index].length();
            int last = index + 1;

            // Find the range of words that can fit in the current line
            while (last < n && totalChars + words[last].length() + (last - index) <= maxWidth) {
                totalChars += words[last].length();
                last++;
            }

            StringBuilder line = new StringBuilder();
            int gaps = last - index - 1;

            // If it's the last line or a line with a single word
            if (last == n || gaps == 0) {
                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (line.length() < maxWidth) {
                        line.append(" ");
                    }
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int spaces = (maxWidth - totalChars) / gaps;
                int extraSpaces = (maxWidth - totalChars) % gaps;

                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) {
                        int spaceCount = spaces + (i - index < extraSpaces ? 1 : 0);
                        for (int j = 0; j < spaceCount; j++) {
                            line.append(" ");
                        }
                    }
                }
            }

            result.add(line.toString());
            index = last;
        }

        return result; 
    }
}