package in.sb.main.predicate;

interface i1
{
	public boolean checkEven(int no);
	
}

class t implements i1
{
	@Override
	public boolean checkEven(int no) {
		
		return no%2==0;
	}
	
}

public class test1 
{
	
	public static void main(String[] args) 
	{
		i1 i = new t();
		System.out.println(i.checkEven(12));
		
	}
	

}
