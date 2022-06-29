import java.io.*;
  
class Geek
{
   
    int a,b;
 
    Geek(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}
  
class condemo
{
    public static void main (String[] args)
    {
        Geek geek1 = new Geek(2, 1);
        System.out.println("a=" + geek1.name +
                           " and GeekId :" + geek1.id);
    }
}