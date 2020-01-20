import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the fairRations function below.
    static Object fairRations(int[] B) {

        /*if (B.length == 2 && (B[0] % 2 != B[1] % 2)) {
            System.out.println("NO");
            return "NO";
        }

        //If length of array is odd and every number inside is odd then impossible
        boolean allOdd = true;
        for (int i = 0; i<B.length; i++){
            if (B[i] % 2 == 0){
            allOdd = false;
            break;
            }
        }
        */
        int sum = 0;
        for (int i = 0; i < B.length; i++){
            sum += B[i];
        }


        if (sum % 2 == 1){
            return "NO";
        }

        int numBread = 0;
        
        for (int i = 0; i < B.length; i++){
            //If number is even, move on
            if (B[i] % 2 == 0) continue;

            B[i+1]++;
            B[i]++;
            numBread += 2;
            
        }

        return numBread;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] B = new int[N];

        String[] BItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }

        Object result = fairRations(B);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
