package in.sb.main.Function;

import java.util.function.Function;

public class test2 
{
	public static void main(String[] args) {
		
		Function<String, Integer> ob = str -> str.length();
		
		System.out.println(ob.apply("Shashank"));
		System.out.println(ob.apply("abc"));
	}

}
