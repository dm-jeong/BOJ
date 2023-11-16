/*
 * BOJ-2741
 * 문제:
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 
 * 입력:
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 
 * 출력:
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// int 변수 생성 = 스캐너의 nextInt() 메서드로 정수를 입력받습니다.
		int temp = sc.nextInt();
		// 입력받은 문자열만큼 숫자를 출력합니다.
		for(int i = 1; i<=temp; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}
}