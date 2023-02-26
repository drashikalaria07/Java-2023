import java.util.Scanner;
class Prac7
{
    public static void main (String args[])
    {
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st integer :");
        int a = input.nextInt();
        System.out.println("enter 2nd integer :");
        int b = input.nextInt();

        if( a < b )
        {
            temp=a;
            a = b;
            b= temp;
        }
        System.out.println("enter 3rd integer :");
        int c = input.nextInt();
        if ( c > b )
        {
            if( c > a)
            {
                temp =c;
                c=b;
                b=a;
                a=temp;
            }else
            {
                temp=c;
                c=b;
                b=temp;
            }
        }

        System.out.println("decreasing order : " + a + "" + b + "" + c );   
    }
}

