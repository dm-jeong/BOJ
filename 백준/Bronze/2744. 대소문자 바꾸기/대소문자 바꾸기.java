/* BOJ-2744
 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 * 
 * 입력:
 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 * 
 * 출력:
 * 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
			
//		ASCII 테이블을 활용한 char 출력
		for(int i =0; i<temp.length(); i++)
		{
			if(65 <= temp.charAt(i) && temp.charAt(i)<=90) {
				System.out.print( (char) (temp.charAt(i)+32));
			}
			else if( 97 <= temp.charAt(i) && temp.charAt(i)<= 122) {
				System.out.print( (char) (temp.charAt(i)-32));
			}
		}
		
		sc.close();
	}
}