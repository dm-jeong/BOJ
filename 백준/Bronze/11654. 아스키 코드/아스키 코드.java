/*
 * BOJ-11654
 * 문제:
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
 * 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * 
 * 입력:
 * 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * 
 * 출력:
 * 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// 캐릭터 변수 생성 = 스캐너의 다음 입력을 받는 메서드의 첫번째 글자를 리턴
		char temp = sc.next().charAt(0);
		// 캐릭터 변수를 정수값으로 변환하여 출력
		System.out.println((int) temp);
		
		sc.close();
	}
}