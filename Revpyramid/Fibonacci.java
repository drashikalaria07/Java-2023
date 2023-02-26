import java.util.*;
class Fibonacci
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n , a= 0,b=0 , c = 1;
        System.out.print("enter the value of n :");
        n = sc.nextInt();
        for (int i=1; i <= n; i++)
        {
            a =b;
            b=c;
            c= a + b ;
            System.out.print(a + " ");
        }
    }
}