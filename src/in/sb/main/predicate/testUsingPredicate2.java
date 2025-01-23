package in.sb.main.predicate;

import java.util.function.Predicate;

public class testUsingPredicate2 
{	
	public static void main(String[] args) 
	{
		Predicate<String> ob = str ->  str.length() > 6;

		System.out.println(ob.test("abc"));
		System.out.println(ob.test("shashank"));
		
	}
	

}
