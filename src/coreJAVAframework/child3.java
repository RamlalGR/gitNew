package coreJAVAframework;

public class child3 {
	
	int a;
	
	public child3(int i) { //i - instance variable of child3 - receive data from child2 through super keyword
		// TODO Auto-generated constructor stub
		this.a=i; //assigning value to its class variable
	}

	public int multiply2()
	{
		return a*2;
	}
	
	public int multiply3()
	{
		return a*3;
	}

}
