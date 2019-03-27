package dataAsgn1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		
		
List<Character> stk=new ArrayList<Character>();
		
		Scanner sc=new Scanner(System.in);
		String in=new String();
		
		System.out.print("Please input the string: ");
		in=sc.nextLine();
		
		sc.close();
		System.out.println(in);
		
		int top=-1;
		
		long start=System.nanoTime(); //start time
		long end;
		//worst case is if the string is correct and long
		for(int i=0;i<in.length();i++) {
			
			if(in.charAt(i)=='0') {
				stk.add(in.charAt(i));
				top++;
			}
			else if(in.charAt(i)=='1') {
				if(stk.isEmpty()) {
					System.out.println("String is unbalanced");
					end=System.nanoTime();

					System.out.print("The time is ");
					System.out.println(end-start);
					return;
				}
				else {
					if(stk.get(top)=='0'&&in.charAt(i)=='1') {
						stk.remove(top);
						top--;
								
					}
						
				}		
			}
			
			else {
				System.out.println("String is not correct!!");
				end=System.nanoTime();

				System.out.print("The time is ");
				System.out.println(end-start);
				return;
			}
			
			
			try{
				if((stk.isEmpty())&&(in.charAt(i+1)=='0')) {//||(stk.isEmpty())&&(in.charAt(i+1)=='1')) {
				System.out.println("String is unbalanced!!");
				end=System.nanoTime();

				System.out.print("The time is ");
				System.out.println(end-start);
				return;
			}
			else {
				continue;
			}}
			catch(Exception e) {
			}
		}
		
		if(stk.isEmpty())
			System.out.println("String is balanced!!");
		else
			System.out.println("String is unbalanced!!");
		
		end=System.nanoTime(); //end time

		System.out.print("The time is ");
		System.out.println(end-start);
		
		//O(n) total
	}

}
