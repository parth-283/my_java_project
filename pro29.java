class pro29
{
	public static void main(String args[])
	{
		test T = new test();
		T.langth=25;
		T.width=15;	
		T.putdata();
	
	}

}
class test
{
		int langth,width;

	void getdata(int A,int B)
		{
			langth=A;
			width=B;
		}
	void putdata()
		{
		System.out.println("langth is:- "+langth);
		System.out.println("width is:- "+width);
		}		
}

/*
output:-
F:\java>javac pro29.java

F:\java>java pro29
langth is:- 25
width is:- 15
*/