public class pro47_a
{
	public static void main(String args[])
	{
		try
		{
			int data=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of code......");
	}
}
/*
output:-

F:\java>javac pro47_a.java

F:\java>java pro47_a
java.lang.ArithmeticException: / by zero
rest of code......
*/