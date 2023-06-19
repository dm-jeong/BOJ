import java.util.LinkedList;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int counter = sc.nextInt();
			
			LinkedList<Integer> a = new LinkedList<Integer>();
			LinkedList<Integer> b = new LinkedList<Integer>();
			
			int tempA;
			int tempB;
			
			for(int i=0; i<counter; i++) {
				tempA = sc.nextInt();
				a.add(tempA);
				
				tempB = sc.nextInt();
				b.add(tempB);
			}
			
			for(int j=0; j<counter; j++) {
				System.out.println("Case #"+(j+1)+": "+ (a.get(j)+b.get(j)));
				
			}
		}
}
