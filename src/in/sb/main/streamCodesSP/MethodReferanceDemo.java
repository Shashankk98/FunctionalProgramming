package in.sb.main.streamCodesSP;
/*
	Method Referance
		1. Methos referance is used to refer the method of the functional interface
		2. Types of Method Referance:
				i.Referance to an instance method
				ii. Referance to a static method



 */

@FunctionalInterface
interface i1
{
	//void m1();
	void m3();
}

class A
{
	//i.Referance to an instance method
	void m2()
	{
		System.out.println("m2 Method of class A");
	}
	
	//ii. Referance to a static method
	
	static void M3()
	{
		System.out.println("This is a static method referance call !!! ");
	}
	
}

public class MethodReferanceDemo 
{
	public static void main(String[] args) 
	{
/*
		A ob = new A();
		i1 i = ob :: m2;
		i.m1();
*/
		
		i1 i = A :: M3;
		i.m3();
		
	}

}
