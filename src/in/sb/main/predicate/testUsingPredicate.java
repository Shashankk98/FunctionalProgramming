package in.sb.main.predicate;

import java.util.function.Predicate;

public class testUsingPredicate 
{	
	public static void main(String[] args) 
	{
		Predicate<Integer> i = no ->  no%2 == 0;
		System.out.println(i.test(8));
	}
	

}
