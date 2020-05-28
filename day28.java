import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        List<String> list = new ArrayList<String>();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int a0 = 0; a0 < N; a0++) {
            String firstName = scanner.next();
            String emailID = scanner.next();
            String regExPattern = "[a-z].@gmail.com";
            Pattern p = Pattern.compile(regExPattern);
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (String string : list) {
            System.out.println(string);
        }
        scanner.close();
    }
}
