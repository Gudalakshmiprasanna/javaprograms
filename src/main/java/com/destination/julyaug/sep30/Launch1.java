package com.destination.julyaug.sep30;

class Dog
{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	//generic setter
		void setData(String name, int age,String color, int cost, String breed) {
			name = name;
			age = age;
			color = color;
			cost = cost;
			breed = breed;
		}
	
	//Specific Setters
		void setName(String name) {
			name = name;
		}
		void setAge(int age) {
			age = age;
		}
		void setColor(String color) {
			color = color;
		}
		void setCost(int cost) {
			cost = cost;
		}
		void setBreed(String breed) {
			breed = breed;
		}
		//Specific Getters
		String getName() {
			return name;
		}
		int getAge() {
			return age;
		}
		String getColor() {
			return color;
		}
		int getCost() {
			return cost;
		}
		String getBreed() {
			return breed;
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

public class Launch1 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setData("Tommy", 4, "Brown", 7000, "GR");
		d.getData();
		
		Dog d1 = new Dog();
		d1.setName("RockY");
		d1.setAge(5);
		d1.setColor("yellow");
		d1.setBreed("pug");
		d1.setCost(9000);
		System.out.println("========================");
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println(d1.getBreed());
	}
}
