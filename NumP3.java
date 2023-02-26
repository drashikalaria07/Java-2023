class NumP3
{    
    public static void main(String args[])   
    {    
        int i, j, row = 6 ,number;         
        for (i=0; i<row; i++)   
        {     
            number = 1;  
            for (j=row-i; j>1; j--)   
            {   
                System.out.print(" "); 
            }    
            for (j=0; j<=i; j++ )   
            {  
                number++;        
                System.out.print(number+ " "); 
               
            }     
            System.out.println();   
        }   
    }   
}  