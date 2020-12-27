package chapter_9;

public class Remove_Control_Flag {
	/**
	 * ※ 제어 플래그 제거
	 *     - 논리연산자의 제어 플래그 역할을 하는 변수가 있을 때, 그 변수를 break 문이나 return 으로 교체
	 */

	void checkSecurity_asis(String[] people) {
		boolean found = false;
		for (int i=0; i < people.length; i++) {
			if (!found) {
				if (people[i].equals("Don")) {
					sendAlert();
					found = true;
				}
				if (people[i].equals("John")) {
					sendAlert();
					found = true;
				}
				
			}
		}
	}
	
	void checkSecurity_tobe(String[] people) {
		
		for (int i=0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				sendAlert();
				break;
			}
			if (people[i].equals("John")) {
				sendAlert();
				break;
			}	
		}
	}
	
	void sendAlert() {
		// 알림 작업
	}
}
