package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Friend[] friendArray = new Friend[3];
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	Scanner sc = new Scanner(System.in);
    	
    	for(int i=0; i<friendArray.length; i++) {
    		
    		Friend friend = new Friend();
    		System.out.print("이름:");
    		friend.setName(sc.nextLine());
    		
    		System.out.print("핸드폰:");
    		friend.setHp(sc.nextLine());
    		
    		System.out.print("학교:");
    		friend.setSchool(sc.nextLine());
    		
    		friendArray[i] = friend;
    		System.out.println("--------------------------");
    		
    	}
        
        for(int i=0; i<friendArray.length; i++) {
        	friendArray[i].showInfo();
        }
       

       
    }

}
