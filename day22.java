import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	public static int getHeight(Node root){
      //Write your code here
      if(root ==null)
return -1;
int left=getHeight(root.left);
int right=getHeight(root.right);
return Math.max(left, right) + 1;
    }

	public static Node insert(Node root,int data){
