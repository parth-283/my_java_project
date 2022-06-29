class value
{
	int a,b,sum;
	public void show()
	{
		System.out.println("value is a:- "+a);
		System.out.println("value is b:- "+b);
		sum=a+b;
		System.out.println("sum of two values:- "+sum);
	}	
}
class pro28
{
	public static void main(String args[])
	{
		value s=new value();
		s.a=10;
		s.b=20;	
		s.show();
	}
}


/*
output:-
F:\java>javac pro28.java

F:\java>java pro28
value is a:- 10
value is b:- 20
sum of two values:- 30

*/