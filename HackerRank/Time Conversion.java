import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        int hour = Integer.parseInt(s.substring(0,2));
        char timeOfDay = s.charAt(8);
        String output = null;

        if (timeOfDay == 'A'){
            if (hour == 12){
                output = "00" + s.substring(2,8);
            }
            else output = s.substring(0,8);
        }

        else if (timeOfDay == 'P'){
            if (hour != 12) hour += 12;
            output = hour + s.substring(2,8);
        }
        return output;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
