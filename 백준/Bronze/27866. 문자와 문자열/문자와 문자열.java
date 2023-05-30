import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] array= str.split("");
		int strChecker= 0;
		
		try {
			strChecker = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("배열에 접근 불가");
		}
		
		
		System.out.println(array[strChecker-1]);
	
	}	
}
