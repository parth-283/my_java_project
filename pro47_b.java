class pro47_b
{
	static void fun()
    	{
        	try
        	{
            		throw new NullPointerException("demo");
       		}
        	catch(NullPointerException e)
        	{
           		System.out.println("Caught inside fun().");
   			throw e; 
        	}
    	}
 
   	public static void main(String args[])
    	{
        	try
        	{
            		fun();
        	}
        	catch(NullPointerException e)
        	{
            		System.out.println("Caught in main.");
        	}
    	}
}

/*
output:-
F:\java>javac pro47_b.java

F:\java>java pro47_b
Caught inside fun().
Caught in main.
*/