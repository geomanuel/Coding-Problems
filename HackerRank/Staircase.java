import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int steps = 1; steps <= n; steps++){
            int numSpaces = n - steps;

            for (int i = 0; i<numSpaces; i++){    //Print spaces first
                System.out.print(" ");
            }
            for (int i = 0; i<steps; i++){        //Print num steps
                System.out.print("#");
            }
                System.out.println();
        }

        
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
