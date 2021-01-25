import java.util.*;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double SI=(principalAmount*interestRate*time)/100;
    	return SI;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double CI=principalAmount*Math.pow(1.0+interestRate/100.0, time)-principalAmount;
    	return CI;
    }
}
public class Assignment1Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double p,r,Si,Ci;
		int t;
		System.out.println("Enter Amount: ");
		p=sc.nextDouble();
		System.out.println("Enter Rate: ");
		r=sc.nextDouble();
		System.out.println("Enter Time: ");
		t=sc.nextInt();
		SiCi ob=new SiCi();
		Si=ob.simpleInterest(p, t, r);
		Ci=ob.compoundInterest(p, t, r);
		System.out.println("Simple Interest: "+Si);
		System.out.println("Compound Interest:"+ Ci);
		
		

	}

}
