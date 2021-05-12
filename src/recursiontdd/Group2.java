package recursiontdd;

import java.io.*;


public class Group2 {
    public static int sumDigits(int n) {
      
      // Base case
      if (n / 10 == 0) { // If there is only 1 digit
        return n;
      }

      // Recursive case
      return sumDigits(n / 10) + (n % 10);
    }
}