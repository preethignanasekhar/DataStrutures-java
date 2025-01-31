class Queue{
    int a[]=new int[5];
    int data;
    int front=-1;
    int rear=-1;
    public void enqueue(int data){
        if(front==a.length){
            System.out.println(" queue is full");
        }
        else{
            if (front==-1){
                front=0;
            }
            rear++;
            a[rear]=data;
        }
    }

    public void dequeue(){
        if(front==a.length-1){
            System.out.print("queue is empty");
        }
        else if(front==-1&&rear==-1){
            System.out.print("queue is empty");
        }
        else{
            front++;
        }
    }
    
    public void display(){
        for(int i=front ; i<=rear; i++){
            System.out.println( a[i]);
        }
    }




}
public class Main
{
	public static void main(String[] args) {
		Queue s=new Queue();
		s.enqueue(10);
		s.enqueue(20);
		s.enqueue(30);
		s.enqueue(40);
	    s.dequeue();
	    s.dequeue();
	    s.display();
		
	}
}
