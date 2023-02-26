// to convert rupees to dollar. (70 rupees = 1 dollar.)



import java.util.Scanner;
class Prac2
{
    public static void main (String args[])
    {
        float rupees;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rupees :");
        rupees = in.nextInt();
        float dollars = rupees / 70;
        System.out.println("dollars" + dollars );
    }
}