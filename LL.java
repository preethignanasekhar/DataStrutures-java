class Node{
int data;
Node next;
Node(int data){
this.data=data;
this.next=null;
}
}

class LinkedList{
Node head,tail;
public void insertAtEnd(int data){
Node newnode=new Node(data);
if(head==null){ 
   head=newnode;
   tail=newnode;
}
else{
   tail.next=newnode;
   tail=newnode;
}
}
public void insertAtBegin(int data){
   Node newnode=new Node(data);
   newnode.next=head; //Element add Beginnig
   head=newnode;
}
public void display()
{
   Node temp=head;
   while(temp!=null){ //display lis
      System.out.println(temp.data);
      temp=temp.next;
   }
}
   public void specificPosition(int pos,int data){
   Node newnode=new Node(data);
   Node temp=head; //Insert at Specific Position
   for(int i=0;i<pos-1;i++){
   temp=temp.next;
}
   newnode.next=temp.next;
   temp.next=newnode;
}
}
class Main{
public static void main(String args[]){
   LinkedList link=new LinkedList();
   link.insertAtEnd(100);
   link.insertAtEnd(200);
   link.insertAtEnd(300);
   link.insertAtEnd(400);
   link.insertAtBegin(500);
   link.specificPosition(2,350);
   link.display();
}
}

