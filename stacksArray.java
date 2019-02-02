import java.util.*;
import java.lang.*;
public class Q1 {
	
	int top=-1;
	int Arr[]=new int[5];
	
	public static void main(String args[]) {
		
		Q1 obj = new Q1();
		if(obj.IsEmpty())
			System.out.println("Empty");
		else
			System.out.println("Not Empty") ;
		
		System.out.println("Size is "+obj.Size());
		
		obj.push(12);
		System.out.println("Current top valuere is "+obj.Top());
		obj.push(113);
		System.out.println("Current top valuere is "+obj.Top());
		obj.push(1);
		System.out.println("Current top valuere is "+obj.Top());
		obj.push(9);
		System.out.println("Current top valuere is "+obj.Top());
		obj.push(20);
		System.out.println("Current top valuere is "+obj.Top());
		
		if(obj.IsEmpty())
			System.out.println("Empty");
		else
			System.out.println("Not Empty") ;
		
		System.out.println("Size is "+obj.Size());
		
		try{obj.push(23); //extra push
		}
		catch(Exception e){
			System.out.println("Can't push its full!!");
		}
		
		obj.pop();
		System.out.println("Current top valuere is "+obj.Top());
		obj.pop();
		System.out.println("Current top valuere is "+obj.Top());
		obj.pop();
		System.out.println("Current top valuere is "+obj.Top());
		obj.pop();
		System.out.println("Current top valuere is "+obj.Top());
		
		System.out.println("Size is "+obj.Size());
		
		obj.pop();
		
		try{obj.pop(); //extra pop
		}
		catch(Exception e){
			System.out.println("Can't pop nothing inside!!");
		}
		
		
		
		
		
	}
	
	void push(int x) {
		
		if(Size()==Arr.length) {
			System.out.println("Array is Full!!");
			
		}
		Arr[++top]=x;
		
		
	}
	
	void pop() {
		if(IsEmpty()) {
			System.out.println("Array is Empty!!");
		}
		top--;
	}

	int Top(){
		
		return Arr[top];
	}
	
	boolean IsEmpty() {
		
		if(top==-1) {
			System.out.println("Array is Empty");
			return true;
		}
		else
			return false;
	}
	
	int Size() {
		
		return top;
		
		
	}
}