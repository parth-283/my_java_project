package stores;  
public class stores
{  
	public static void main(String args[])
	{  
		System.out.println("***Welcome to store***");  

		System.out.println("\nitem_no\t\titem_name\tstock_availible\t\tcost");
   		stock obj = new stock(1,"pencil",30,450);
		obj.display();
		


		sales S1 = new sales();
		System.out.println("\nqty_sold= "+S1.qty_sold);
	}  
 
}
class stock
{
		int item_no,stock_availible,cost;
		String item_name;
	
		stock(int no,String name,int stock,int cost)
		{
			
			this.item_no = no;
			this.item_name = name;
			this.stock_availible = stock;
			this.cost = cost;
		
		}
		void display()
		{
			System.out.println(item_no+"\t\t"+item_name+"\t\t"+stock_availible+"\t\t\t"+cost);
		}

}

class sales extends stores
{
	
}

