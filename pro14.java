class pro14
{
	public static void main(String args[])
	{
		
		int marks=Integer.parseInt(args[0]);

		System.out.println("java marks="+marks);
		
		if(marks>36)
		{	
			System.out.println("student is pass");
		}
		else
		{
			System.out.println("student is fail");
		}
	}
}