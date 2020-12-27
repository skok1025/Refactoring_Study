package chapter_9;

public class Consolidate_Conditional_Expression {
	/**
	 * ※ 중복 조건식 통합
	 *     - 여러 조건 검사식이 결과가 같을 땐 하나의 조건문으로 합친 후 메서드로 뺴내자.
	 */
	
	int _seniority = 3;
	int _monthDisabled = 13;
	boolean _isPartTime = true;
	
	double disabilityAmount_asis() {
		if (_seniority < 2) {
			return 0;
		}
		
		if (_monthDisabled > 12) {
			return 0;
		}
		
		if (_isPartTime) {
			return 0;
		}
		// 장애인 공제액 산출
		return 100;
	}
	
	double disabilityAmount_tobe() {
		if (isNotEligibleForDisability()) {
			return 0;
		}
		// 장애인 공제액 산출
		return 100;
	}
	
	boolean isNotEligibleForDisability() {
		return ((_seniority < 2) || (_monthDisabled > 12) || (_isPartTime));
	}

}
