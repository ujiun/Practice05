package com.javaex.ex01;

public class Member {
	//필드
	private String id;
	private String name;
	private int point;
	
	//생성자
	public Member() {		
	}
			
	public Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}



	//메소드 - gs
		
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getId() {
		return id;
	}	
	
	public String getName() {
		return name;
	}
	
	public int getPoint() {
		return point;
	}
	
	//메소드 - 일반
	
	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id + "), " + point + "점");
	}
	
}
