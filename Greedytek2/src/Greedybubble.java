
public class Greedybubble {
	
	static double k[] = { 1,5,8,11,12};
	//static void dnBubble( int a[]) 
	
			
			
	
	static int ggt(int a , int b)
	{
		if(a==0 || b==0)
		{
			
			return a;
		}
	
		if(a>b)
		{
			a=ggt(a-b,b);
			
		}
		else
		{
			a=ggt(a,b-a);
			
		}
	
		return a;
	}
	static void greedy(double k[]) 
	{   double [] y = new double[k.length];
		double l[] = new double[k.length];
		for(int i = 0; i<k.length; i++)
		{
			l[i] = k[i]/(i+1);
			y[i] = i+1;
			System.out.println(l[i]);
		}
		int z = 5;
		
		for(double i = l.length -1; i>=1; i--)
		{
			
			for(int j =1; j<=i; j++)
				
				
			{
				
				if(l[j-1] < l[j]) 
				{
					
				double temp2 = y[j];
				y[j] = y[j-1];
				y[j-1] = temp2;
					
				double temp = l[j];
				l[j] = l[j-1];
				l[j-1] = temp;
				}
			}
		}
		
		for(int i=0; i<k.length; i++)
		{
			
			if(z>=y[i] && y[0] !=z && z!=0)
			{
			  z = (int) (z - y[i]);
			  System.out.println(y[i]);			
			}
			
		
			
		
		}
		
		
		
	  }
	
	
	
/*	static void dBubble(int a[])
	{
		
		for(int i =0; i<a.length-1; i++)
		{
			
			for(int j = a.length-2; j>= i; j--)
			{
				if(a[j] < a[j+1]) 
				{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
			}
			
			
		}*/
		
	
	static int recur(int n)
	{
		int z = 0;
		if(n>1)
		{
			z = z+1;
			recur(n/2);
		}
		return z;
	}
	
	static int recur2(int x)
	{
		
		
		if(x==null)
		{
			return null;
		}
		
		if(x.left == null)
		{
			x = x.left
			recur2(x);
			
			
		}
			return x;
	}
	
	public static void main(String args[])
	{
		
		 //greedy(k);
		System.out.println(recur(3,4));
		 
		 
		 //dnBubble(k);
		//System.out.println(k[0] + " " + k[1] + " " + k[2] + " " + k[3] + " " + k[4] + " ");
		
	}
	
	
	
	

}
