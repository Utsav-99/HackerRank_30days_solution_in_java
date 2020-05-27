import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }

}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
      for(Node node = head; node != null; node = node.next){
            while (node.next != null && node.data == node.next.data){
                node.next = node.next.next;
            }
        }
        return head;

    }

    public static  Node insert(Node head,int data)
