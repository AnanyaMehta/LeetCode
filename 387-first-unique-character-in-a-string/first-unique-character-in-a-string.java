import java.util.HashMap;

class Solution {
    public static int firstUniqChar(String s) {
        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // First pass: Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Second pass: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;  // Return the index of the first non-repeating character
            }
        }
        
        return -1;  // If no non-repeating character is found
    }
}