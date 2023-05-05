import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int scInput1 = sc.nextInt();
		int scInput2 = sc.nextInt();
		
		if(scInput1>scInput2)
		{
			System.out.println(">");
		}
		else if(scInput1<scInput2)
		{
			System.out.println("<");
		}
		else
		{
			System.out.println("==");
		}

		sc.close();
	}
}