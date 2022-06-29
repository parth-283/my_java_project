import java.io.*;
class pro35
{
	public static void main(String args[])
	{
		rectangle R = new  rectangle();
		R.l=10;
		R.w=20;
		R.show();
		
		triangle T = new triangle();
		T.w=10;
		T.h=30;
		T.show();
		
		square S = new square();
		S.l=10;
		S.show();
	}
}
class rectangle
{
	int r,l,w;
	public void show()
	{
		System.out.println("value of l:- "+l);
		System.out.println("value of w:- "+w);
		r=l*w;
		System.out.println("area of rectangle:- "+r);
	}
}
class triangle
{
	int t,w,h;
	public void show()
	{
		System.out.println("\nvalue of w:- "+w);
		System.out.println("value of h:- "+h);
		t=(w*h)/2;
		System.out.println("area of triangle:- "+t);
	}
}
class square
{
	int s,l;
	public void show()
	{
		System.out.println("\nvalue of l:- "+l);
		s=l*l;
		System.out.println("area of square:- "+s);
	}
}
/*
output:-
F:\java>javac pro35.java

F:\java>java pro35
value of l:- 10
value of w:- 20
area of rectangle:- 200

value of w:- 10
value of h:- 30
area of triangle:- 150

value of l:- 10
area of square:- 100
*/