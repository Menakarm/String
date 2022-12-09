package trial;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name1= s.nextLine();
		System.out.println("Enter Your Name;");
		String name2=s.nextLine();
		boolean a= name1.equals(name2);
		System.out.println(a);
	    
				
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Name1:");
		String n1=s1.nextLine();
		System.out.println("Enter Name2:");
		String n2=s1.nextLine();
		boolean b=n1.equals(n2);
		System.out.println(b);
		s1.close();
		s.close();
	}
 
}//q.no :10