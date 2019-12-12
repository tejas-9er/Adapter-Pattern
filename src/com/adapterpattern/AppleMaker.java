package com.adapterpattern;

public class AppleMaker implements AdvancedMaker {
	
	@Override
	public void makeApple(String model, String os) {
		System.out.println("Making an Apple phone, model: " + model + ", with an " + os + " operating system.");
	}
	
	@Override
	public void makeHuawei(String model, String os) {
		// Do not implement
	}

	@Override
	public void makeSamsung(String model, String os) {
		// Do not implement
	}
}
