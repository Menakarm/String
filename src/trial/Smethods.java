package trial;

public class Smethods {
	public static void main(String[] args) {
		String lin= "Greens Technology";
		   int a=lin.lastIndexOf('o');
		   System.out.println(a);
		   
		   String in="SeleniumAutomationtool";
		   int b=in.indexOf('o');
		   System.out.println(b);
		   
		   String name="Velmurugan";
		   int c=name.indexOf('n');
		   System.out.println(c);
		   
		   String course="j a v a p r o g r a m";
		   int d= course.lastIndexOf(' ');
		   System.out.println(d);
		   
		   String phno="9884896424";
		   int e=phno.indexOf('2');
		   System.out.println(e);
		   
	//Q.NO : 2	
		    String s1 = "menaka";
		    for (int i=0;i<s1.length();i++) {
		    	int count=0;
		    	char v = s1.charAt(i);
				if(v=='a'|| v=='e'|| v=='i'||v=='o'||v=='u') {
					count=count+i;
					System.out.println("Index of vowels:"+count);
		    		
		    	}



		   
		    }
	}
}