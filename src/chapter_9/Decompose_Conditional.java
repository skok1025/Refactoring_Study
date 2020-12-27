package chapter_9;

import java.util.Date;

public class Decompose_Conditional {
	Date SUMMER_START = new Date("2020-07-01");
	Date SUMMER_END = new Date("2020-09-31");
	
	/**
	 * ※ 조건문 쪼개기
	 *  - if 절을 별도의 메서드로 빼내자
	 *  - then 절과 else 절을 각각의 매세드로 빼내자
	 */

	public void as_is() {
		Date date = new Date();
		
		if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
			// NOT SUMMER CODE
		} else {
			// SUMMER CODE
		}
	}
	
	public void to_be() {
		Date date = new Date();
		
		if (notSummer(date)) {
			winterCode();
		} else {
			summerCode();
		}
	}
	
	private boolean notSummer(Date date) {
		return date.before(SUMMER_START) || date.after(SUMMER_END);
	}
	
	private double summerCode() {
		// SUMMER CODE
		return 1;
	}
	
	private double winterCode() {
		// NOT SUMMER CODE
		return 2;
	}
	
}
