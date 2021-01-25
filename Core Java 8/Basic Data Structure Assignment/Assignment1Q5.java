import java.util.*;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double result=0.0;
    	if(ctc<=180000) {
    		result=0.0;
    	}
    	else if(ctc>=181001 && ctc<=300000) {
    		result=10.0*ctc/100.0;
    	}
    	else if(ctc>=300001 && ctc<=500000) {
    		result=20.0*ctc/100.0;
    	}
    	else if(ctc>=500001 && ctc<=1000000) {
    		result=30.0*ctc/100.0;
    	}
    	return result;
    }
}
public class Assignment1Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TaxAmount ob=new TaxAmount();
		int ctc;
		System.out.println("Enter CTC: ");
		ctc=sc.nextInt();
		double tax=ob.calculateTaxAmount(ctc);
		System.out.println("Taxable Amount: "+tax);
	}

}
