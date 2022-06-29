class pro33
{
	static int a;
	static void p()
	{
		a++;
		if(a<=5)
		{
			System.out.println("value of a:- "+a);
			p();
		}
	}
	public static void main(String[] args)
	{
		p();
	}
}
/*
output:-
F:\java>javac pro33.java

F:\java>java pro33
value of a:- 1
value of a:- 2
value of a:- 3
value of a:- 4
value of a:- 5
*/