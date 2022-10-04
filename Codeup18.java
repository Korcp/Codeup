import java.util.Scanner;

public class Codeup18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String n=in.nextLine();
		String[] dot=n.split("\\.");
		String n1=dot[0];
		int a=Integer.parseInt(n1);
		String n2=dot[1];
		int b=Integer.parseInt(n2);
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
