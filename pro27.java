class pro27
{
	public static void main(String args[])
	{
		value b=new value();
		b.a=10;	
		b.show();
	}
}
class value
{
	int a;
	public void show()
	{
		System.out.println("value is a:- "+a);
	}	
}
/*
output:-

F:\java>javac pro27.java

F:\java>java pro27
value is a:- 10

*/