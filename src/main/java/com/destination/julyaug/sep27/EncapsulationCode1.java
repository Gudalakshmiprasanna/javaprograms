package com.destination.julyaug.sep27;

class Dog{
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;
	
	//generic setter
	void setData(String a, int b,String c, int d, String e) {
		name = a;
		age = b;
		color = c;
		cost = d;
		breed = e;
	}
	
	//generic getter
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
}
public class EncapsulationCode1 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setData("tommy", 4, "Black", 7000, "pug");
		d1.getData();
	}
}
