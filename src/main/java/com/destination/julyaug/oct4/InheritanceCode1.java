package com.destination.julyaug.oct4;

class Parent{
	private static int accno;
	private static int pin;
	void setData() {
		accno=111;
		pin=222;
	}
}
class Child1 extends Parent{
	void setData() {
		accno=123;
		pin=345;
	}
}
public class InheritanceCode1 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.setData();
		Child1 c1 = new Child1();
		c1.setData();
		
		System.out.println(p1.accno);
		System.out.println(p1.pin);
		System.out.println(c1.accno);
		System.out.println(c1.pin);
	}
}
