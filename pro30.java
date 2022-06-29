class pro30
{
	public static void main(String args[])
	{
		test T = new test();
		T.Showdata();
	}
}
class test
{
	int a=12;
	static int b=12;

		
	test()
	{
		System.out.println("value of a&b:- "+a+"&"+b);
		b++;
	}
	public void Showdata()
	{
		System.out.println("value of a:- "+a);
		System.out.println("value of b:- "+b);
	}
}

/*
output:-
F:\java>javac pro30.java

F:\java>java pro30
value of a&b:- 12&12
value of a:- 12
value of b:- 13
*/