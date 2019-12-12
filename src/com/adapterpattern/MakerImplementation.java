package com.adapterpattern;

public class MakerImplementation implements Maker{
	
	MakerAdapter makerAdapter;

    @Override
    public void make(String company, String model, String os) {
        if(company.equalsIgnoreCase("Huawei") || company.equalsIgnoreCase("Samsung") || company.equalsIgnoreCase("Apple")) {
            makerAdapter = new MakerAdapter(company);
            makerAdapter.make(company, model, os);
        } else {
            System.out.println("We are currently not making any " + company +" phones.");
        }
    }
}
