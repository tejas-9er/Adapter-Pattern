package com.adapterpattern;

public class Driver {

	public static void main(String[] args) {
        MakerImplementation makerImpl = new MakerImplementation();
        
        makerImpl.make("Huawei", "View 20", "android");
        makerImpl.make("Samsung", "Note 10", "android");
        makerImpl.make("Samsung", "Duos", "android");
        makerImpl.make("Apple", "iPhone XS", "ios");
        makerImpl.make("RedMi", "Note 3", "Snap Dragon");
    }

}
