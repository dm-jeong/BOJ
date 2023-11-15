/*
 * BOJ-2743
 * 문제:
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 * 
 * 입력:
 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 * 
 * 출력:
 * 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// String 변수 생성 = 스캐너의 nextLine() 메서드로 한줄을 입력받습니다.
		String temp = sc.nextLine();
		// 입력받은 문자열의 길이를 출력합니다.
		System.out.println(temp.length());
		
		sc.close();
	}
}