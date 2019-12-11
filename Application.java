package main;

import collections.*;

public class Application {

	public static void main(String[] args) {
		SimpleList sList = new SimpleList();
		sList.add(10);
		sList.add(20);
		sList.add(30);
		sList.add(40);
		sList.add(50);
		System.out.println("The list has " + sList.getLenght() + " elements");
		sList.print();
		System.out.println("The value of the element with the given index - " + sList.get(4));
	}
}
