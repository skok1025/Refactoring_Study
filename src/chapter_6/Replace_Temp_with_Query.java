package chapter_6;

public class Replace_Temp_with_Query {
	// �� �ӽú����� �޼��� ȣ��� ��ȯ
	//   	������ ����� �����ϴ� �ӽú����� ���� ��,
	//   	�� ������ ������ �ż���� ���� ��, �ӽú��� �����κ��� �ż���� ��ü
	//   	���θ��� �ż���� �ٸ� �ż��忡���� ȣ�Ⱑ��
	
	int _quantity = 5;
	int _itemPrice = 1000;
	
	public double asis() {
		double basePrice = _quantity * _itemPrice;
		
		if (basePrice > 1000) {
			return basePrice * 0.95; 
		} else {
			return basePrice * 0.98;
		}
	}
	
	public double tobe() {
		if (getBasePrice() > 1000) {
			return getBasePrice() * 0.95; 
		} else {
			return getBasePrice() * 0.98;
		}
	}
	
	double getBasePrice() {
		return _quantity * _itemPrice;
	}
}
