import java.util.Scanner;

public class Codeup14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		String dot = in.nextLine() ;
		String[] n = dot.split("\\.") ;
		String dot1 = n[0] ;
		int a = Integer.parseInt(dot1);
		String dot2 = n[1] ;
		int b = Integer.parseInt(dot2);
		String dot3 = n[2] ;
		int c = Integer.parseInt(dot3);
		System.out.printf("%04d.%02d.%02d",a,b,c) ;
	}

}
