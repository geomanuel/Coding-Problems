class Solution {
    public int myAtoi(String str) {
        int index = 0;
        Character current = ' ';
        double num = 0;
        int numVal = 0;
        boolean negative = false;
        
        for (int i = 0 ; i < str.length(); i++){
            current = str.charAt(i);
            numVal = current.charValue();
            if ((numVal >= 48 && numVal <= 57) || current == '-' || current == '+') {
                index = i;
                break; //If digit or - found, stop
            }
            else if (current == ' ') continue;
            else return 0;
        }
        if (index == str.length() - 1 && current == ' ') return 0; //If after exiting for loop, i               //has reached the end of the string then it is all white space.
           
        if (current == '-'){
            index++;
            negative = true;
        }
        else if (current == '+') index++;
        
        while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9'){
            num = num * 10 + (str.charAt(index) - '0');
            index++;
        }
        if (negative) num = -num;
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return (int) num;
    }
}