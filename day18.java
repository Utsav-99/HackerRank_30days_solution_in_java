import java.io.*;
import java.util.*;

public class Solution {
    LinkedList queue;
    Stack stack;

    public Solution() {
        queue = new LinkedList();
        stack = new Stack();
    }

    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    public void enqueueCharacter(char ch) {
        queue.addLast(ch);
    }

    public char popCharacter() {
        return (char) stack.pop();
    }

    public char dequeueCharacter() {
        return (char) queue.remove(0);
    // Write your code here.
    }

    public static void main(String[] args) {
