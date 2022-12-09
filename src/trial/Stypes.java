package trial;

public class Stypes {
	public static void main(String[] args) {
		String firstname ="Nisha";
		String lastname ="Rengan";
		String fullname ="Nisha Rengan";
		System.out.println("Litreal String:");
		System.out.println("Address of firstname:"+System.identityHashCode(firstname));
		System.out.println("Address of lastname:"+System.identityHashCode(lastname));
		System.out.println("Address of fullname:"+System.identityHashCode(fullname));
		
		String n1=new String("Nisha");
		String n2 = new String("Rengan");
		String n3 = new String("Nisha Rengan");
		System.out.println("Non Literal String:");
		System.out.println("Memory of N1:"+System.identityHashCode(n1));
		System.out.println("Memory of N2:"+System.identityHashCode(n2));
		System.out.println("Memory of N3:"+System.identityHashCode(n3));
		
		
	}// q.no: 11.3 & 11.4

}
