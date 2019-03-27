package dataAsgn1;

import java.util.*;

public class Q2 {
	

	public static void main(String[] args) {
		
		
		List<Character> stk=new ArrayList<Character>();  //O(1)
		
		Scanner sc=new Scanner(System.in);  //O(1)
		String in=new String(); //O(1)
		
		System.out.print("Please input the string: ");  //O(1)
		in=sc.nextLine(); //O(1)
		
		sc.close();
		System.out.println(in); //O(n)
		
		int top=-1;
		
		long start=System.currentTimeMillis();
		
		for(int i=0;i<in.length();i++) {  //O(n)
			
			if(in.charAt(i)=='{'||in.charAt(i)=='['||in.charAt(i)=='(') {
				stk.add(in.charAt(i));
				top++;
			}
			else if(in.charAt(i)=='}'||in.charAt(i)==']'||in.charAt(i)==')') {
				if(stk.isEmpty()) {
					System.out.println("Braces are unbalanced");
					return;
				}
				else {
					if(stk.get(top)=='{'&&in.charAt(i)=='}'||stk.get(top)=='['&&in.charAt(i)==']'||stk.get(top)=='('&&in.charAt(i)==')') {
						
						stk.remove(top);
						top--;
						
					}
						
				}
				
					
			}
			//else if(in.charAt(0)==' '||in.charAt(0)=='0'||in.charAt(0)=='1'||in.charAt(0)=='2'||in.charAt(0)=='3'||in.charAt(0)=='4'||in.charAt(0)=='5'||in.charAt(0)=='6'||in.charAt(0)=='7'||in.charAt(0)=='8'||in.charAt(0)=='9'||in.charAt(0)=='+'||in.charAt(0)=='-'||in.charAt(0)=='*'||in.charAt(0)=='/') {
			//	System.out.println("There are no braces");
			//	return;
			//}
			else if(in.charAt(i)==' '||in.charAt(i)=='0'||in.charAt(i)=='1'||in.charAt(i)=='2'||in.charAt(i)=='3'||in.charAt(i)=='4'||in.charAt(i)=='5'||in.charAt(i)=='6'||in.charAt(i)=='7'||in.charAt(i)=='8'||in.charAt(i)=='9'||in.charAt(i)=='+'||in.charAt(i)=='-'||in.charAt(i)=='*'||in.charAt(i)=='/') {
				continue;
			}
			
			else {
				System.out.println("String is not correct!!");
				return;
			}
		}
		
		
		if(stk.isEmpty())
			System.out.println("Braces are balanced!!");
		else
			System.out.println("Braces are unbalanced!!");
		
		
		long end=System.currentTimeMillis();
		
		System.out.println(end-start);
		
		
		//O(n) total 
	}

}
