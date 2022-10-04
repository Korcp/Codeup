
import java.util.Scanner;

public class Coudeup29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String n=in.nextLine();
		int a=Integer.parseInt(n,16);
		String a8=Integer.toOctalString(a);
		System.out.println(a8);
	}

}
