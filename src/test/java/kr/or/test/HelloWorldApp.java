package kr.or.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloWorldApp {

	public static void main(String[] args) {
		// 위 main() 메소드는 자바프로그램의 실행 진입지점입니다.
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HHmmss");
		Date reg_date = new Date();
		for(int cnt=0;cnt<=10;cnt++) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(reg_date);
			cal.add(Calendar.SECOND, cnt); //cnt초 더하기
			System.out.println(format.format(cal.getTime()));
		}
		
		System.out.println("헬로우 월드!");
		String testNull = null;
		String testEmpty = "";
		System.out.println("null출력-"+testNull+"/");
		System.out.println("empty출력-"+testEmpty+"/");
		//System.out.println("testNull.isEmpty메소드값 출력"+testNull.isEmpty()); 에러발생
		System.out.println("testEmpty.isEmpty메소드값 출력"+testEmpty.isEmpty());
	}
}
