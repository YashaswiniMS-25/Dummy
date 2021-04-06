package com.wolken.wolkenapp.factory;

import com.wolken.wolkenapp.iswich.ISwich;
import com.wolken.wolkenapp.led.ledimplementation;
import com.wolken.wolkenapp.tube.tubeLightImplementation;

public class LightFactory{

public static ISwich getLight(String s){
	if(s.equalsIgnoreCase("tubelight")) {
			return new tubeLightImplementation();
	}
    else if(s.equalsIgnoreCase("ledlight")) {
    	return new ledimplementation();
    }
    else
    	System.out.println("not found");
	return null;

}
}
