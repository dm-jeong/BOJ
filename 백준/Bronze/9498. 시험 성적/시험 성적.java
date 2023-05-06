import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int scInput1 = sc.nextInt();
		
		if(scInput1 >=90){
			System.out.println("A");
		} else if(scInput1 >= 80 && scInput1 <=89){
			System.out.println("B");
		} else if(scInput1 >= 70 && scInput1 <=79){
			System.out.println("C");
		} else if(scInput1 >= 60 && scInput1 <=69){
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		sc.close();
	}
}