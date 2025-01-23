package in.sb.main.predicate;

import java.util.function.Predicate;

public class testUsingPredicate3 
{	
	public static void main(String[] args) 
	{
		Predicate<String> p1 = pass ->  pass.length() > 6;
		Predicate<String> p2 = pass ->  pass.equals("admin@123");

//		System.out.println(ob.test("abc"));
//		System.out.println(ob.test("shashank"));
		
		Predicate p = p1.and(p2);
		
		System.out.println(p.test("admin@"));
		
	}
	

}
