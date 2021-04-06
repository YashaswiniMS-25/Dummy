package com.wolken.wolkenapp.led;

import com.wolken.wolkenapp.iswich.ISwich;

public class ledimplementation implements ISwich {

	@Override
	public void sOn() {
		// TODO Auto-generated method stub
		System.out.println("Led light is turned on");
		
	}

	@Override
	public void sOff() {
		// TODO Auto-generated method stub
		System.out.println("led light is turned off");
		
	}
	

}
