import java.util.*;
class Prac3
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int OOPU, DS, CAMP, DSGT, OS, PP;
        float percentage , total;
        System.out.println("enter the mark of OOPU :");
        OOPU = sc.nextInt();
        System.out.println("enter the mark of DS :");
        DS = sc.nextInt();
        System.out.println("enter the mark of CAMP :");
        CAMP = sc.nextInt();
        System.out.println("enter the mark of DSGT :");
        DSGT = sc.nextInt();
        System.out.println("enter the mark of OS :");
        OS = sc.nextInt();
        System.out.println("enter the mark of PP :");
        PP = sc.nextInt();

        total = (float)(OOPU+DS+CAMP+DSGT+OS+PP);
        System.out.println("total is :" + total);
        percentage = (float)(OOPU+DS+CAMP+DSGT+OS+PP) / 6 ;
        System.out.println("percentage is :" +percentage);
    }
}