	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] arg) {
			Scanner sc = new Scanner(System.in);
			
			int scInput1 = sc.nextInt();
			
			if((scInput1 % 4 == 0 && scInput1 %100 != 0) || scInput1%400 == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
	
			
			sc.close();
		}
	}