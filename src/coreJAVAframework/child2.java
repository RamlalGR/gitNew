package coreJAVAframework;

public class child2 extends child3 {
	
	int a; //a - class variable
	public child2(int i) //i - instance variable of child2 - receive data from child1 through object
	{   
		super(i); //sending data received to its parent class (child3) constructor and invokes it
		this.a=i;  //assigning value passed to this class variable
	}

	public int increment()
	{
		return ++a;		
	}
	
	public int decrement()
	{
		return --a;
	}
}
