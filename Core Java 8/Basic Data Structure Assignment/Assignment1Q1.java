import java.util.*;

class ArmstrongOrNot{
	int numDigit(int a) {
		int i=0;
		while(a!=0)
		{
			i++;
			a=a/10;
		}
		return i;	
	}
	int pow(int a,int b)
	{
		if(b==0)
			return 1;
		if(b%2==0)
			return pow(a,b/2)*pow(a,b/2);
		return a*pow(a,b/2)*pow(a,b/2);
	}
	public boolean armstrongCheck(int num) {
		int x=numDigit(num);
		int temp=num, sum=0;
		while(temp>0)
		{
			int l=temp%10;
			sum=sum+pow(l,x);
			temp=temp/10;
		}
		return(sum==num);
		
	}
}
public class Assignment1Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArmstrongOrNot ob=new ArmstrongOrNot();
		int n=sc.nextInt();
		boolean f=ob.armstrongCheck(n);
        if(f==true) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
	}

}
