import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int rtday = in.nextInt();
        int rtmonth = in.nextInt();
        int rtyear = in.nextInt();
        int dueday = in.nextInt();
        int duemonth = in.nextInt();
        int dueyear = in.nextInt();
        int fine = 0;
        if(rtyear > dueyear)
            fine = 10000;
        else if(rtyear == dueyear){
            if(rtmonth > duemonth)
                fine = 500 * (rtmonth - duemonth);
            else if(rtmonth == duemonth){
                if(rtday > dueday)
                    fine = 15 * (rtday - dueday);
            }
        }
        System.out.println(fine);
    }
}
