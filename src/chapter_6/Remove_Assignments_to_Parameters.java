package chapter_6;

public class Remove_Assignments_to_Parameters {
	// �� �Ű������� �� ���� ����
	// 		�Ű������� ���� �����ϴ� �ڵ尡 ���� ��
	//		�Ű����� ��� �ӽú����� ����ϰ� ��������.
	
	int discount_asis(int inputVal, int quantity, int yearToDate) {
		if (inputVal > 50) inputVal -= 2; // �� ���� �뵵�� �ϰ����� ����. (inputVal �� �Է°��� ��Ÿ���� �����ε�.. ����� �ع����ٴ�) 
		if (quantity > 100) inputVal -= 1;
		if (yearToDate > 10000) inputVal -= 4;
		
		return inputVal;
	}
	
	int discount_tobe(int inputVal, int quantity, int yearToDate) {
		int result = inputVal;
		
		if (inputVal > 50) result -= 2;
		if (quantity > 100) result -= 1;
		if (yearToDate > 10000) result -= 4;
		
		return result;
	}

}
