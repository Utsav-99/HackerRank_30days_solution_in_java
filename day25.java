import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);

  int T = sc.nextInt();
  for (int tc = 0; tc < T; tc++) {
   int n = sc.nextInt();
   System.out.println(isPrime(n) ? "Prime" : "Not prime");
  }

  sc.close();
 }

 static boolean isPrime(int n) {
  if (n < 2) {
   return false;
  }

  for (int i = 2; i * i <= n; i++) {
   if (n % i == 0) {
    return false;
   }
  }
    return true;
    }
}
