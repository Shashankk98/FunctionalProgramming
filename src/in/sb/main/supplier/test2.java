package in.sb.main.supplier;

import java.util.function.Supplier;

public class test2 {
	
	public static void main(String[] args) {
		
		Supplier<String> ob = () ->
								{
									String[] names= {"Shashank", "Onkar", "Pranjali", "Manoj","Madhura"};
									
									int i = (int)(Math.random()*5);
									
									return names[i];
								};
		
		System.out.println(ob.get());
	}

}
