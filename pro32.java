import java.io.*;
class pro32
{
	public static void main(String args[])
	{
		test T = new test();
		System.out.println("value of a:- "+T.a);
		
		test T1 = new test(32, 23);
		System.out.println("value of b&c:- "+T1.b+"&"+T1.c);
		
	}
}
class test
{
	int a=10;
	test()
	{
		System.out.println("\ndefault constractor");	
	}
	int b,c;
	test(int b,int c)
	{
		System.out.println("\nparamererized constractor");	
		this.b = b;
		this.c = c;
	}
}

/*
output:-
F:\java>javac pro32.java

F:\java>java pro32

default constractor
value of a:- 10

paramererized constractor
value of b&c:- 32&23

*/