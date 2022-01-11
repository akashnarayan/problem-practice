package com.singleton;

public class MasterPage {

	//Lazy initialization
	private static MasterPage m;
	
	//This intialize a instance of master page while jvm starts.
	//private static MasterPage m=new MasterPage();
	
	private MasterPage() {
		System.out.println("Arggghhhhhhhh.......Start running, I am AWAKE !!");
	}
	
	
	public static synchronized MasterPage getMasterPage() {
		if(m==null) {
			System.out.println("This is a new instance");
			return new MasterPage();
		}else {
			System.out.println("This is a existing instance");
			return m;
		}
	}
	
	
	public static void useSingleton() {

		System.out.println("Trying to use existing singleton object/instance");
		
		getMasterPage();
	}
	
	
}
