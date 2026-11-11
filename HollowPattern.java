import java.util.*;
public class HollowPattern{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of n = ");
        int n=sc.nextInt();
        hollowPattern(n);
        
    }
    public static void hollowPattern(int n)
    {
    
        //number of rows
        for(int i = 1;i<=n;i++)
        {
            //columns
            for(int j = 1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}