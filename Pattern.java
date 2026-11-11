import java.util.*;
public class Pattern {
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of n = ");
		int n=sc.nextInt();
		System.out.println("1.Hollow pattern\t2. Number Triangular\t3.Number Increasing Pyramid\t4.Number Increasing Reverse Pyramid");
		int choice = sc.nextInt();
		System.out.println();
		
		switch(choice)
	{
	case 1 : hollowPattern(n);
	break;
	case 2 : numberTriangular(n);
	break;
	case 3: numIncreasingPyramid(n);
	break;
	case 4: numIncreasingReversePyramid(n);
	break;
	}

	}
	
	public static void hollowPattern(int n)
		{

			//number of rows
			for(int i = 1; i<=n; i++)
			{
				//columns
				for(int j = 1; j<=n; j++)
				{
					if(i==1 || i==n || j==1 || j==n)
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
		
	public static void numberTriangular(int n)
	{
	    for(int i=1;i<=n;i++)
	    {
	        for(int j = 1;j<=n-i;j++)
	        {
	            System.out.print(" ");
	        }
	        for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
	    }
	}
	
	public static void numIncreasingPyramid(int n)
	{
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print(i+" ");
	        }
	        System.out.println(" ");
	    }
	}
	
	public static void numIncreasingReversePyramid(int n)
	{
	      for(int i=n;i>=1;i--)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print(j+" ");
	        }
	        System.out.println(" ");
	    }
	}
}