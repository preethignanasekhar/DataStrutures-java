import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LL{
    Node node;
    Node head;
    Node tail;
    Node temp;
    Node next;
    int size=0;
    public void insertAtFist(int data){
    Node NewNode= new Node(data);
    if(head==null){
        head=tail=NewNode;
    }
    else{
        NewNode.next=head;
    head=NewNode;
  
        
    }
      size++;
    } 
    public void insertAtEnd(int data){
    Node NewNode=new Node(data);
    if(head==null){
     insertAtFist(data);
     return;
    }
    tail.next=NewNode;
    tail=NewNode;
    size++;
    }
    public void insertAtSep(int data,int pos){
    Node NewNode=new Node(data);
    temp=head;
    for(int i=0;i<pos-1;i++){
      temp=temp.next;  
    }
    NewNode.next=temp.next;
    temp.next=NewNode;
    }
    public void display(){
    temp=head;
    while(temp!=null){ 
    System.out.print(temp.data+"->");
    temp=temp.next;
    }
    System.out.print("null");
    System.out.println();
    }
    
    
    
    public void deleteAtFist(){
    head=head.next;
    size--;
    } 
    public void deleteAtEnd(){
    if(head==null) return;
    else if(head.next==null){
        head=tail=null;
    }
    else{
    temp=head;
    while(temp.next!=tail){
        temp=temp.next;
    }
    temp.next=null;
    tail=temp;
     }
    }
    public void deleteAtSep(int pos){
    if(pos==0){
    deleteAtFist();    
    }
    else if(pos==size-1){
    deleteAtEnd();   
    }
    else{
    temp=head;
    for(int i=0;i<pos-1;i++){
      temp=temp.next;  
    }
    temp.next=temp.next.next;
    }
    size--;
    }
    
    
    
    
    
}
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        LL insert= new LL();
        int n=s.nextInt();
        
        insert.insertAtEnd(n);
        insert.insertAtFist(10);
        insert.insertAtFist(30);
        insert.insertAtFist(100);
        insert.insertAtFist(200);
        insert.insertAtFist(300);
        insert.insertAtSep(50,1);
        insert.insertAtEnd(201);
        insert.insertAtEnd(211);
        insert.insertAtSep(110,4);
        insert.display();
        insert.deleteAtFist();
        insert.deleteAtEnd();
        insert.deleteAtSep(2);
        insert.display();
        
    }
}
