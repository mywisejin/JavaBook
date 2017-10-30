package jpub.java.junit;

/**
 * 인사말을 결정하는 클래스
 *
 * @author jpub
 */
public class Greeting {
	/**
	 * 인사말을 취득한다
	 *
	 * @param hour 시간
	 * @return 시간대에 따른 인사말
	 */
	public String getMessage(int hour) {
		String message;
		if (hour >= 17 || hour < 5) {
			message = " 수고가 많습니다";
		} else if (hour < 11) {
			message = " 좋은 아침입니다";
		} else {
			message = " 안녕하세요";
		}
		return message;
	}

}