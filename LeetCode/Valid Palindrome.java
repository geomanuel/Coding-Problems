class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) return true;
        
        Stack<Character> stack = new Stack<Character>();
        
        if (s.length() % 2 == 0){
            if (s.charAt(i) <)
            for (int i = 0; i < s.length()/2; i++){
                stack.add(s.charAt(i));            
            }
            for (int i = s.length()/2; i < s.length(); i++){
                if (s.charAt(i) != stack.pop()) return false;
            }
        }
        else {
            for (int i = 0; i < s.length()/2 + 1; i++){
                stack.add(s.charAt(i));            
            }
            for (int i = s.length()/2 + 1; i < s.length(); i++){
                if (s.charAt(i) != stack.pop()) return false;
            }
        }
        return true;
    }
}