class pro36 extends test
{ 
		
   	public void disp2()
  	{
		int a=10;
		System.out.println("value of a:- "+a);
		
  	}
  	
	public static void main(String args[])
	{
      	 	pro36 obj = new pro36();
       		obj.disp2();
       		obj.disp();

  	}
}

abstract class test
{
	
  	 public void disp()
	{
    		int b=20;
		System.out.println("value of b:- "+b);
  	}
   	abstract public void disp2();
}



/*
output:-
F:\java>javac pro36.java

F:\java>java pro36
value of a:- 10
value of b:- 20
*/