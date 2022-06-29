class r
{
	public static void main(String srgd[])
	{
		int n=7;
		int x=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==1||i==n/2+1||(i<=n/2&&j==n/2+1)||j==x)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			if(i>n/2)
			{
				x++;
			}
			System.out.println();
		}
	}
}