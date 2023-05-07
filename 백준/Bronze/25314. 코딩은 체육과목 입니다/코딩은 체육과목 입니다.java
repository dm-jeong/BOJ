	import java.util.Scanner;

	
	public class Main {
	
		public static void main(String[] arg) {
			Scanner sc = new Scanner(System.in);
			
			int scInput1 = sc.nextInt();
			
			int counter = scInput1/4;
			
			for(int i=0; i<counter; i++) {
				System.out.print("long ");
			}
			System.out.println("int");
			sc.close();

		}
	}