package chapter_9;

public class Consolidate_Conditional_Expression {
	/**
	 * �� �ߺ� ���ǽ� ����
	 *     - ���� ���� �˻���� ����� ���� �� �ϳ��� ���ǹ����� ��ģ �� �޼���� ������.
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
		// ����� ������ ����
		return 100;
	}
	
	double disabilityAmount_tobe() {
		if (isNotEligibleForDisability()) {
			return 0;
		}
		// ����� ������ ����
		return 100;
	}
	
	boolean isNotEligibleForDisability() {
		return ((_seniority < 2) || (_monthDisabled > 12) || (_isPartTime));
	}

}
