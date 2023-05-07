import java.util.Scanner;

	public class Main {
	
		public static void main(String[] arg) {
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	        for(int i=1; i<=9; i++)
	        {
	        	System.out.println(input + " * " + i + " = " + input*i);
	        }
	        
	        sc.close();
		}
	}