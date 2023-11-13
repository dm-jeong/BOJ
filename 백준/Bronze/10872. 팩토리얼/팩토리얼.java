/* BOJ-10872
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * 예제 입력:
 * 10
 * 예제 출력:
 * 3628800
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long temp = sc.nextLong();
		
		System.out.println(facto(temp));		
	}
	
	// 재귀함수를 활용한 factorial 메서드
	public static long facto(long a) {
		if(a< 1) {
			return 1;
		}
		return a * facto(a-1);
	}
}