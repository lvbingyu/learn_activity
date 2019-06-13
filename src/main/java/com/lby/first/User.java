package com.lby.first;

public class User {
	private String name;
	private int age;

	public User() {
		System.out.println("--------对象创建--------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void initUser() {
		System.out.println("--------对象初始化--------");
	}

	public void destroyUser() {
		System.out.println("--------对象销毁--------");
	}

	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
