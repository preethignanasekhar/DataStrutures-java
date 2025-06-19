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
    Node node;
    Node head;
    Node tail;
    int size=0;
    public void insertAtFist(int data){
        Node NewNode=new Node(data);
        if(head==null){
            head=tail=NewNode;
        }
        else{
        NewNode.next=head;
        head.prev=NewNode;
        head=NewNode;
        }
        size++;
    }
    public void insertAtEnd(int data){
        Node NewNode=new Node(data);
        if(head==null){
        insertAtFist(data);
        }
        else{
        tail.next=NewNode;
        NewNode.prev=tail;
        tail=NewNode;
        }
        size++;
    }
    public void insertAtSpe(int data,int pos){
        Node NewNode=new Node(data);
        if(pos==0){
        insertAtFist(data);   
        }
        else if(pos==size){
        insertAtEnd(data);
        }
        else{
        Node temp=head;

            for(int i=1;i<pos;i++){
                temp=temp.next;
            }
            NewNode.next=temp.next;
            NewNode.prev=temp;
            temp.next.prev=NewNode;
            temp.next=NewNode;
            
        }
    size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            System.out.print(temp.data+" <-->");
            temp=temp.next;
        }
        System.out.println("null");
        
    }
    public void deletAtFist(){
        if(head==null) return;
        else if(head==tail) head=tail=null;
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
    public void deletAtEnd(){
        if(head==null) deletAtFist();
        else if(head==tail) head=tail=null;
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    public void deletAtSpe(int pos){
        if(pos==0) deletAtFist();
        else if(pos==size) deletAtEnd();
        else{
            Node temp=head;
            for(int i=1;i<pos;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.next.prev=temp;
        }
    }
    
    
}
class Main{
    public static void main(String []args){
        DLL ope=new DLL();
        ope.insertAtFist(20);
        ope.insertAtEnd(30);
        ope.insertAtSpe(40,0);
        ope.insertAtFist(70);
        ope.insertAtEnd(35);
        ope.insertAtSpe(22,3);
        ope.display();
        ope.deletAtFist();
        ope.deletAtSpe(1);
        ope.deletAtEnd();
        ope.display();
    }
}
