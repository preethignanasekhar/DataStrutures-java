class Stack{
    int a[]=new int[5];
    int data;
    int top=-1;
    public void push(int data){
        if(top==a.length){
            System.out.println("stack is full");
        }
        else{
            top++;
            a[top]=data;
        }
    }

    public void pop(){
        if(top==-1){
            System.out.print("stack is empty");
        }
        else{
            top--;
        }
    }
    
    
    public void peak(){
        if(top==-1){
            System.out.print("stack is empty");
        }
        else{
            System.out.println("top is "+a[top]);
        }
    }
    
    public void display(){
        for(int i=top ; i>=0; i--){
            System.out.println( a[i]);
        }
    }




}
public class Main
{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
	    s.pop();
	    s.peak();
		s.display();
		
	}
}
		
