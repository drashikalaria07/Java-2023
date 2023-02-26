public class RevPyramid 
{
    public static void main(String[] args) 
    {
        int i,j,k, row=8;
        for(i=0; i<=row-1; i++)
        {
            for(j=0; j<=1 ; j++)
            {
                System.out.print(" ");
            }
            for(k=0 ; k<=row-1-i ; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}