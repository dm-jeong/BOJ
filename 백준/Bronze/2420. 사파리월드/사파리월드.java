/* BOJ-2420
 * 첫째 줄에 두 도메인의 유명도 N과 M이 주어진다. (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
 * 첫째 줄에 두 유명도의 차이 (|N-M|)을 출력한다.
 * 예제 입력:
 * -2 5
 * 예제 출력:
 * 7
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 한 줄 입력 받음
		String temp = sc.nextLine();
		// 공백을 기준으로 문자열을 나눠서 배열에 담아줌
		String arr[] = temp.split(" ");
		
		// -2_000_000_000의 값을 받기 위해 long으로 선언
		long first = Long.parseLong(arr[0]);
		long second = Long.parseLong(arr[1]);
		
		// 절대값을 출력하는 API: Math.abs(long a)
		System.out.println(Math.abs(first-second));
	}
}