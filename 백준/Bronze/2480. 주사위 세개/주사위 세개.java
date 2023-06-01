import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int prize = 0;
		
		if(dice1 == dice2 && dice2 == dice3) {
			prize = 10000+ dice1*1000;
			System.out.println(prize);
		} else if(dice1 == dice2 || dice1 == dice3){
			prize = 1000 + dice1*100;
			System.out.println(prize);
		} else if(dice2 == dice1 || dice2 == dice3) {
			prize = 1000 + dice2*100;
			System.out.println(prize);
		} else {
			System.out.println(biggest(dice1, dice2, dice3));
		}
		
		sc.close();
	}
	public static int biggest(int dice1, int dice2, int dice3) {
		Integer arr[] = {dice1, dice2, dice3};
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		return arr[0]*100;
	}
}
