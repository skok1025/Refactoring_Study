package chapter_6;

import java.util.Arrays;
import java.util.List;

public class Substitute_Algorithm {
	// �� �˰��� ��ȯ
	// 		�˰����� �� �и��� ������ ��ü�ؾ� �� ��,
	//		�ش� �޼ҵ��� ������ ���ο� �˰������� �ٲ���.
	
	String foundPerson_asis(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				return "Don";
			}
			if (people[i].equals("John")) {
				return "John";
			}
			if (people[i].equals("Kent")) {
				return "Kent";
			}
		}
		return "";
	}
	
	String foundPerson_tobe(String[] people) {
		List candidates = Arrays.asList(new String[] {"Don", "John", "Kent"});
		for (int i = 0; i < people.length; i++) {
			if (candidates.contains(people[i])) {
				return people[i];
			}
		}
		return "";
	}
	

}
