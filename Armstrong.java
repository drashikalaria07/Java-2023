import java.util.*;
class Armstromg
{
    public static void main (String args[])
    {
        
        int num ;
        int sum = 0 ;
        int temp;
        int remainder;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        num = sc.nextInt();
        temp =num;
        while (temp != 0)
        {
            int r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }
        if (num == sum)
        {
            System.out.println("number  is armstrong . ");
        }else
        {
            System.out.println("number is not  armstrong . ");
        }
        sc.close();
    }
}