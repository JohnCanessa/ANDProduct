import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * 
 */
public class Solution {

  /**
   * Complete the andProduct function below.
   */

  static long andProduct(long a, long b) {

    // **** ****
    long result = 0;

    // **** compute difference between numbers ****
    long diff = b - a;

    // **** determine highest power of 2 in the difference ****
    int n = 0;
    for (; Math.pow(2.0, n) < diff; n++) {
    }

    // **** generate mask ****
    long mask = 0xffffffffffffffffL;
    mask <<= n;

    // **** generate result ****
    result = b & a & mask;

    // **** return result ****
    return result;
  }

  // **** open scanner ****
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    // **** ****
    // BufferedWriter bufferedWriter = new BufferedWriter(new
    // FileWriter(System.getenv("OUTPUT_PATH")));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    // **** ****
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    // *** ****
    for (int nItr = 0; nItr < n; nItr++) {

      // **** ****
      String[] ab = scanner.nextLine().split(" ");
      long a = Long.parseLong(ab[0]);
      long b = Long.parseLong(ab[1]);

      // **** ****
      long result = andProduct(a, b);

      // **** ****
      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();
    }

    // **** close buffered writer ****
    bufferedWriter.close();

    // **** close scanner ****
    scanner.close();
  }
}