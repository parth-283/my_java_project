class pro26
{
	 public static void main(String args[])
	{
		System.out.println("(1)");
		String s;
		int a=42;

		StringBuffer sb=new StringBuffer(40);
		s=sb.append("a=").append(a).append("!").toString();
		System.out.println("append:- "+s);

		System.out.println("(2)");
		StringBuffer d=new StringBuffer("hello");
		System.out.println("buffer:- "+0);
		System.out.println("capacity:- "+d.capacity());

		System.out.println("(3)");
		StringBuffer D=new StringBuffer("this is a test");
		System.out.println("string:- "+D);
		D.delete(4,7);
		System.out.println("delete:- "+D);

		System.out.println("(4)");
		StringBuffer I=new StringBuffer("i  java!!..");
		System.out.println("string:- "+I);
		I.insert(2,"like");
		System.out.println(I);

		System.out.println("(5)");
		StringBuffer C=new StringBuffer("hello");
		System.out.println("string:- "+C);
		System.out.println("charAt(1) before:- "+C.charAt(1));
		
		System.out.println("(6)");
		StringBuffer L=new StringBuffer("hello");
		System.out.println("length:- "+L.length());
	
		System.out.println("(7)");
 		StringBuffer R=new StringBuffer("hii,how are you....!!");
		System.out.println("String is:- "+R);
		R.reverse();
		System.out.println("reverse string:-"+R);
	}
}
/*
output:-
F:\java>javac pro26.java

F:\java>java pro26
(1)
append:- a=42!
(2)
buffer:- 0
capacity:- 21
(3)
string:- this is a test
delete:- this a test
(4)
string:- i  java!!..
i like java!!..
(5)
string:- hello
charAt(1) before:- e
(6)
length:- 5
(7)
String is:- hii,how are you....!!
reverse string:-!!....uoy era woh,iih
*/










