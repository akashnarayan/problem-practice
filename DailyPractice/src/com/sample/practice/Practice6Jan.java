package com.sample.practice;

import java.io.Closeable;
import java.util.function.Function;

/**
 * 1. There can be a method with the name of constructor
 * 2. There can't be static or return type at the constructor.
 * 3. 
 **/
public class Practice6Jan {
	
	Practice6Jan(){
		System.out.println("Inside the constructor");
	}
	
	public static int Practice6Jan() {
		System.out.println("Inside the method");
		return 0;
	}
	
	public static void main(String[] args) {
		try (Demo d = new Demo(); Demo1 d1 = new Demo1()) {
            int x = 10 / 0;
            d.show();
            d1.show1();
        }
		catch (Exception e) {
            System.out.println(e);
        }
		
	}
	
	public String someMethod(String s, Function<Integer, String> lambda){
		return lambda.apply(new Integer(0));
	}
	
	

}

class Demo implements Closeable {
    void show() { System.out.println("inside show"); }
    public void close()
    {
        System.out.println("close from demo");
    }
}
  
// custom resource 2
class Demo1 implements Closeable {
    void show1() { System.out.println("inside show1"); }
    public void close()
    {
        System.out.println("close from demo1");
    }
}
