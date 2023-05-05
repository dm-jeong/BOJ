import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		//곱할 수 2개
		int scInput1 = sc.nextInt();
		int scInput2 = sc.nextInt();
		
		int scAnswer = scInput1 * scInput2;

		
		int[] scModulo = {0,0,0};
		
		for(int j = 0; j<=2; j++)
		{
			
			scModulo[j] = (scInput2%10) * scInput1;
			scInput2 /= 10;
		}
		
		System.out.println(scModulo[0]);
		System.out.println(scModulo[1]);
		System.out.println(scModulo[2]);
		System.out.println(scAnswer);
			
		sc.close();
	}
}