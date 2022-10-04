import java.util.Scanner;

public class Codeup22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		String[] dot=a.split("\\.");
		String a1=dot[0];
		int n1=Integer.parseInt(a1);
		String a2=dot[1];
		int n2=Integer.parseInt(a2);
		String a3=dot[2];
		int n3=Integer.parseInt(a3);
		
		System.out.println(a3+"-"+a2+"-"+a1);
	}

}
