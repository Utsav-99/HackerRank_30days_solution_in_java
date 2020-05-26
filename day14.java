import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

 Difference(int [] elements){
        this.elements = elements ;
    }
    public void computeDifference(){
        int diff = 0 ,maximumDifference1  = 0;
           for(int i = 0 ; i < elements.length ; i++){
               for(int j = i+1 ; j < elements.length ; j++){
                   diff = Math.abs(elements[i] - elements[j]);
                   if(maximumDifference1 < diff){
                       maximumDifference1 = diff ;
                   }
               }
           }
            maximumDifference = maximumDifference1;
    }

	// Add your code here


} // End of Difference class
