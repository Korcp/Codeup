import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			String bar = in.nextLine();
			String[] n=bar.split("\\-");
			String bar1=n[0];
			int a =Integer.parseInt(bar1);
			String bar2 =n[1];
			int b =Integer.parseInt(bar2);
			System.out.printf("%06d%06d",a,b);
	}

}
