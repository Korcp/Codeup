import java.util.Scanner;

public class Codeup42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=1;
		for(int i=1; i<=b; i++) {
			c=c*2;
		}
		System.out.println(a*c);
	}

}
