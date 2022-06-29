class pro31
{
	public static void main(String args[])
	{
		test.test2 T=new test.test2();
		T.display();
	}
}

class test
{
	static int a;
	
	static class test2
	{
		void display()
		{
			System.out.println("value of a(1):- "+a);
			a++;
			System.out.println("value of a(2):- "+a);
		}	
	}
}

/*
output:-
F:\java>javac pro31.java

F:\java>java pro31
value of a(1):- 0
value of a(2):- 1
*/