package LinkedList;

import java.util.Scanner;

public class Implementation {
    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }   
    }
    public static void main(String[] args) {
        
        Implementation list=new Implementation();
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        Node head = list.new Node(b);
        
        for(int i=0;i<5;i++){
            int a=sc.nextInt();
            Node newNode = list.new Node(a);
        }

    }
    
}