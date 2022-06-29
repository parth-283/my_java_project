
class OuterClass
{
    
    static int outer_x = 10;   
    int outer_y = 20;     

    private static int outer_private = 30;

    static class NestedClass
    {
        void display()
        {            
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_private = " + outer_private);
             
          
        }
    }
}
 

public class nestedclassdemo
{
    public static void main(String[] args)
    {
        
        OuterClass.NestedClass NO = new OuterClass.NestedClass();
         
       NO.display();
         
    }
}