package chapter_9;

public class Replace_Nested_Conditional_with_Guard_Clauses {

	/**
	 * �� ���� ���� ���ǹ��� ���� ���� ��ȯ - �޼��忡 ���ǹ��� �־ �������� ���� ��θ� �ľ��ϱ� ���� �� ��� Ư���� ��쿡 ���� ����
	 * �̿�����.
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
