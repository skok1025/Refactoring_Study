package chapter_9;

public class Remove_Control_Flag {
	/**
	 * �� ���� �÷��� ����
	 *     - ���������� ���� �÷��� ������ �ϴ� ������ ���� ��, �� ������ break ���̳� return ���� ��ü
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
		// �˸� �۾�
	}
}
