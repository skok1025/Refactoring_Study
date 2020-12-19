package chapter_6;

public class Replace_Temp_with_Query {
	// ※ 임시변수를 메서드 호출로 전환
	//   	수식의 결과를 저장하는 임시변수가 있을 땐,
	//   	그 수식을 빼내어 매서드로 만든 후, 임시변수 참조부분을 매서드로 교체
	//   	새로만든 매서드는 다른 매서드에서도 호출가능
	
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
