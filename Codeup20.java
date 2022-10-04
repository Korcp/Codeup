import java.util.Scanner;

public class Codeup20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int n5=a/10000;
		int n4=(a/1000)%10;
		int n3=(a/100)%10;
		int n2=(a/10)%10;
		int n1=(a)%10;
 		System.out.println("["+n5*10000+"]");
 		System.out.println("["+n4*1000+"]");
 		System.out.println("["+n3*100+"]");
 		System.out.println("["+n2*10+"]");
 		System.out.println("["+n1+"]");
		
		
	}

}
