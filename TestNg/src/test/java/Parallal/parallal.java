package Parallal;

import org.testng.annotations.Test;

public class parallal {

	@Test(priority = 1)
	public void A() {
	System.out.println("A meethod will Executed");	
	}
	@Test(priority = 2)
    public void B() {
    	System.out.println("B meethod will Executed");
	}
	@Test(priority = 3)
    public void C() {
    	System.out.println("c meethod will Executed");
    }
}
