package chapter_6;

public class Inline_Temp {
	// �� �ӽú��� ���� ���� ����
	// 		������ ������ ���Թ޴� �ӽú����� ���� �ٸ� �����丵 ��� ������ ���� �� 
    //		�� �ӽú����� �����ϴ� �κ��� ���� �������� ġȯ

	boolean getPriceOver_asis() {
		double basePrice = getPrice();
		return (basePrice > 1000);
	}
	
	boolean getPriceOver_tobe() {
		return (getPrice() > 1000);
	}
	
	int getPrice() { 
		return 10000;
	}
	
}
