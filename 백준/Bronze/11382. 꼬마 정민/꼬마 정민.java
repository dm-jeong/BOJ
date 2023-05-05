import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		long scInput1 = sc.nextLong();
		long scInput2 = sc.nextLong();
		long scInput3 = sc.nextLong();

		System.out.println(scInput1+scInput2+scInput3);
			
		sc.close();
	}
}