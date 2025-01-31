
class Node{
   int data;
   Node next;
   Node prev;
   Node(int data){
       this.data=data;
       this.next=null;
       this.prev=null;
       
   }
}
class DLL{
    Node head,tail;
    
    public void insertAtBegine(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=tail=newnode;
        
    }
    else{
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    }
    
    public void insertAtEnd(int data){
        Node newnode=new Node(data);
        if(tail==null){
            head=tail=newnode;
            
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    
    public void deleteAtBegin(){
        if(head==null){
            System.out.print("list is empty");
            return;
            
        }
        if(head==tail){
            head=tail=null;
        }
            else{
                head=head.next;
                head.prev=null;
            }
        }
        
    public void deleteAtEnd(){
        if(head==null){
            System.out.print("list is empty");
            return;
            
        }
        if(head==tail){
            head=tail=null;
        }
            else{
                tail=tail.prev;
                tail.prev=null;
            }
        }
        
    public void insertSpecific(int pos,int data){
        Node newnode=new Node(data);
        Node temp=head;
        for(int i=1;i<pos-1&&temp!=null;i++){
            temp=temp.next;
            temp.next=newnode;
        }
    }
    
    
    public void display(){
        
    Node temp=head;
    if(temp==null){
        System.out.println("list is empty");
        
    }
    
    while(temp!=null){
        System.out.print(temp.data);
    if(temp.next!=null){
        System.out.print("<->");
        }
    temp=temp.next;
    }
    
    }
    
}

public  class Main{
    public static void main(String[] args){
        DLL doubly=new DLL();
        doubly.insertAtBegine(100);
        
        doubly.insertAtBegine(300);
        doubly.insertAtBegine(700);
        doubly.insertAtBegine(800);
        doubly.insertAtEnd(200);
        doubly.insertSpecific(2,600);
        doubly.deleteAtBegin();
        doubly.deleteAtEnd();
        doubly.display();
    }
} 