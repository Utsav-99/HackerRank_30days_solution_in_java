import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node n = new Node(data);
        Node temp = head;
        if (head == null) {
            head = n;
            return head;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
        return head;
    }

	public static void display(Node head) {
