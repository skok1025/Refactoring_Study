package chapter_9;

import java.util.Date;

public class Decompose_Conditional {
	Date SUMMER_START = new Date("2020-07-01");
	Date SUMMER_END = new Date("2020-09-31");
	
	/**
	 * �� ���ǹ� �ɰ���
	 *  - if ���� ������ �޼���� ������
	 *  - then ���� else ���� ������ �ż���� ������
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
