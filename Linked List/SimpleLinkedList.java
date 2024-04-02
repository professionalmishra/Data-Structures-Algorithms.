#here we just started with linked list
#we created a class Node and just taken 3 objects and just printed that to know about the linked list works..

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }}
    class SimpleLinkedList{
        public static void main(String[] args) {
            Node head =new Node(10);
            Node temp1=new Node(20);
            Node temp2=new Node(30);
            head.next = temp1;
            temp1.next = temp2;
            Node current =head;
            while(current!=null){
                System.out.println(current.data);
                current =current.next;
               
            }
        }
    }
