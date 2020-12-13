package chapter_6;

import java.util.ArrayList;
import java.util.List;

public class PrintDetails {
	
	void printOwing() {
		
		printBanner();
		
		// ���� ���� ��� (�ش�κ� �޼ҵ� ����)
//		System.out.println("name: NAME");
//		System.out.println("amount: " + amount);
		
		double outstanding = getOutstanding();
		// (�޼ҵ� ���� ����)
		printDetails(outstanding);
	}
	
	double getOutstanding() {
		double result = 0.0;
		Object[] orderList = {
				new Order(123),
				new Order(111)
		};
		
		for (Object order : orderList) {
			Order temp = (Order)order;
			result += temp.getAmount();
		}
		
		return result;
	}
	
	void printDetails(double outstanding) {
		System.out.println("name: NAME");
		System.out.println("amount: " + outstanding);
	}
	
	void printBanner() {
		System.out.println("******************");
		System.out.println("*****���ܻ�*****");
		System.out.println("******************");
	}

}
