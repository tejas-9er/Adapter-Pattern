package com.adapterpattern;

public class MakerAdapter implements Maker{
	
	AdvancedMaker advancedMaker;

    public MakerAdapter(String company) {
        if(company.equalsIgnoreCase("Huawei")) {
            advancedMaker = new HuaweiMaker();
        } else if(company.equalsIgnoreCase("Samsung")) {
            advancedMaker = new SamsungMaker();
        } else if(company.equalsIgnoreCase("Apple")) {
            advancedMaker = new AppleMaker();
        }
    }

    @Override
    public void make(String company, String model, String os) {
        if(company.equalsIgnoreCase("Huawei")) {
            advancedMaker.makeHuawei(model, os);
        } else if(company.equalsIgnoreCase("Samsung")) {
            advancedMaker.makeSamsung(model, os);
        } else if(company.equalsIgnoreCase("Apple")) {
            advancedMaker.makeApple(model, os);
        }
    }
}
