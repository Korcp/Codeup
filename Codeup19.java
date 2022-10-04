import java.util.Scanner;

public class Codeup19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			String a=in.nextLine();
			int len=a.length();
			for(int i=0;i<len;i++) {
				System.out.printf("\'%c\'\n",a.charAt(i));
			}
	}

}
