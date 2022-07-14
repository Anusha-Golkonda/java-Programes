package helloworld;

public class Prime {

	public static void main(String[] args) {
		int n,i,count=0;
		Scanner sc= new Scanner();
		sc=n.nextInt(System.in);
		if(n==0||n==1) {
			System.out.println(" n is not a prime number");
		}
		else {
		for(i=1;i<=n;i++)
		{
			if(n%i==0) {
				count++;
			}
		}
		}
		if (count==2) {
			System.out.println(" n is a prime number");
		}
		else {
			System.out.println(" n is not a prime number");	
		}
			
		}

	}


