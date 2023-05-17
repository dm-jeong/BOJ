import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		int totalNumber = 0;
		int counter = 0;
		int temp = -1;
		int checkNumber = -1;
		
		totalNumber = sc.nextInt();
		
		for(int i=0; i<totalNumber; i++){
			list.add(0);
		}
		
		for(int j=0; j<totalNumber; j++) {
			temp = sc.nextInt();
			list.add(j, temp);			
		}
		
		checkNumber = sc.nextInt();
		
		for(int k=0; k<totalNumber; k++) {
			if(list.get(k) ==  checkNumber) {
				counter++;
			}
		}
		
		System.out.println(counter);
		
		sc.close(); // 스캐너 닫기
		
	}
}
