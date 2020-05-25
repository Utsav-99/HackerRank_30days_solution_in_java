import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int intVariable = scan.nextInt(); double doubleVariable = scan.nextDouble(); scan.nextLine(); String strVariable = scan.nextLine(); System.out.println(i+intVariable); System.out.println(d+doubleVariable); System.out.println(s+strVariable);

        scan.close();
    }
}
