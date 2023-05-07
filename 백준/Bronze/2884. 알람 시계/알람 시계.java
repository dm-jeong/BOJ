	import java.util.Scanner;

	
	public class Main {
	
		public static void main(String[] arg) {
			Scanner sc = new Scanner(System.in);
			
			int hour = sc.nextInt();
			int min = sc.nextInt();
						
			if(min >=45) {
				min -= 45;
			}else if(hour > 0 && min <45) {
				hour -= 1;
				min -= 45;
				min = 60 - (-min);
			}else if(hour == 0 && min < 45) {
				hour = 23;
				min -= 45;
				min = 60 - (-min);
			}
			
			System.out.println(hour + " "+ min);
			
			
			sc.close();

		}
	}