package chapter_9;

public class Replace_Nested_Conditional_with_Guard_Clauses {

	/**
	 * ※ 여러 겹의 조건문을 감시 절로 전환 - 메서드에 조건문이 있어서 정상적인 실행 경로를 파악하기 힘들 땐 모든 특수한 경우에 감시 절을
	 * 이용하자.
	 */

	boolean _isDead = false;
	boolean _isSeparated = false;
	boolean _isRetired = true;

	double getPayAmount_asis() {
		double result;

		if (_isDead) {
			result = deadAmount();
		} else {
			if (_isSeparated) {
				result = separatedAmount();
			} else {
				if (_isRetired) {
					result = retiredAmount();
				} else {
					result = normalPayAmount();
				}
			}
		}
		return result;
	}

	double getPayAmount_tobe() {
		double result;

		if (_isDead) {
			return deadAmount();
		}

		if (_isSeparated) {
			return separatedAmount();
		}

		if (_isRetired) {
			return retiredAmount();
		}
		result = normalPayAmount();
		
		return result;
	}

	double deadAmount() {
		return 100;
	}

	double separatedAmount() {
		return 90;
	}

	double retiredAmount() {
		return 80;
	}

	double normalPayAmount() {
		return 50;
	}
}
