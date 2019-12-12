package com.adapterpattern;

public class HuaweiMaker implements AdvancedMaker{
	
	@Override
	public void makeHuawei(String model, String os) {
		System.out.println("Making a Huawei phone, model: " + model + ", with an " + os + " operating system.");
		
	}

	@Override
	public void makeSamsung(String model, String os) {
		// Do not implement
	}

	@Override
	public void makeApple(String model, String os) {
		// Do not implement
		
	}
}
