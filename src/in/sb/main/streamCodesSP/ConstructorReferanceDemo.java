package in.sb.main.streamCodesSP;

interface i6
{
	void m1();
}

class Z
{
	Z()
	{
		System.out.println("This is Constructor referance call !!! ");
	}
}



public class ConstructorReferanceDemo 
{
	public static void main(String[] args) 
	{
		i6 i = Z :: new;
		i.m1();
		
	}

}
