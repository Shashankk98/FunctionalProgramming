package in.sb.main.Function;

import java.util.function.Function;

public class test1 
{
	public static void main(String[] args) {
		
		Function<Integer, Integer> ob = sal -> sal * 12;
		
		System.out.println(ob.apply(20000) + " LPA");
	}

}
