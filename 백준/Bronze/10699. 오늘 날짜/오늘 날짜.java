/* BOJ-10699
 * 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
 * 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Date 객체 생성
		Date date = new Date();
		
		// 날짜를 출력하기 위한 포맷인 SimpleDateFromat 객체 생성
		SimpleDateFormat currentHour = new SimpleDateFormat("YYYY-MM-dd");
		
		// currentHour의 메서드에 date를 파라미터로 전달
		System.out.println(currentHour.format(date));
	}
}