package utils;

public class Math 
{
	public static int factorial (int x)
	{
		if(x==1||x==0)
			return 1;
		else
			return factorial(x-1)*x;
	}
	public static int factorialLoop(int x)
	{
		int i,s=1;
		for(i=1;i<=x;i++)
			s*=i;
		return s;
	}
}