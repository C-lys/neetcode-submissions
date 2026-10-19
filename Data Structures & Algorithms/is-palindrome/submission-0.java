class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "");
        
        char[] str = clean.toLowerCase().toCharArray(); 
        int start = 0;
        int end = clean.length() - 1;
        while (start < end) {
            if (str[start] != str[end]) {
            
            return false;
            }

        start++;
        end--; 
        }
            return true;
        }
        
    }

