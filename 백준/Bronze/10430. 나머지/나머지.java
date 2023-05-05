import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int sc1 = sc.nextInt();
		int sc2 = sc.nextInt();
		int sc3 = sc.nextInt();
		System.out.println((sc1+sc2)%sc3);
		System.out.println(((sc1%sc3)+(sc2%sc3))%sc3);
		System.out.println((sc1*sc2)%sc3);
		System.out.println(((sc1%sc3)*(sc2%sc3))%sc3);
		
		sc.close();
	}
}