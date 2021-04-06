package com.wolken.wolkenapp;

import java.util.Scanner;

import com.wolken.wolkenapp.factory.LightFactory;
import com.wolken.wolkenapp.iswich.ISwich;

public class LightUtil {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the type");
		String type=scanner.next();
		ISwich iswich=LightFactory.getLight(type);
		if(iswich!=null) {
			iswich.sOn();
			iswich.sOff();
		}
		
		
		

	}

}
