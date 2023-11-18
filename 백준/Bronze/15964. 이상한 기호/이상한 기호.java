/* BOJ-15964
 * 연산자의 기호는 ＠으로, A＠B = (A+B)×(A-B)으로 정의내리기로 했다.
 * 
 * 입력:
 * 첫째 줄에 A, B가 주어진다. (1 ≤ A, B ≤ 100,000)
 * 
 * 출력:
 * 첫째 줄에 A＠B의 결과를 출력한다.
 * 
 * 예제 입력:
 * 4 3
 * 예제 출력:
 * 7
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		숫자 2개를 입력받기 위한 변수 선언
		int first = sc.nextInt();
		int second = sc.nextInt();
		
//		계산하여 출력
		System.out.println((first + second)*(first-second) );
		
		sc.close();
	}
}