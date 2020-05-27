import java.util.*;

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/

    // Write your code here
     public static <Element> void printArray(Element[] array) {
        for (Element element : array) {
            System.out.println(element);
        }

    }

}
