package coreJAVAframework;

import org.testng.annotations.Test;

public class child1 extends parent {

@Test
public void test() 
{

	doThis();
	int a=3;
	child2 obj = new child2(a); //creating object of child2 class with parameter and invokes its constructor
	System.out.println(obj.increment()); //no values passed then output will be null - passing value through constructor
	System.out.println(obj.decrement()); //no values passed then output will be null - passing value through constructor

	//we can avoid creating multiple object of each class, instead execute as below
	System.out.println(obj.multiply2()); //executing child3 method through child2 using inheritance
	

}
	
}
