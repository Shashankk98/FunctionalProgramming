package in.sb.main.predicate;

interface i2
{
	public boolean checkEven(int no);
}

public class test2 
{
	
	public static void main(String[] args) 
	{
		i2 i = no ->  no%2 == 0;
		System.out.println(i.checkEven(9));
		
	}
	

}
