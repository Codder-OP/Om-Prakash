import java.util.*;

class ArmstrongNumBetweenRange{
    public ArrayList<Integer> armstrongNumbersInRange(int min , int max){
    	ArrayList<Integer> ar=new ArrayList<Integer>();
    	for(int i=min;i<=max;i++)
    	{
    		int temp=i, sum=0;
    		while(temp!=0)
    		{
    			int l=temp%10;
    			sum=sum+(l*l*l);
    			temp=temp/10;
    			
    		}
    		if(sum==i)
    			ar.add(i);
    	}
    	//Integer[] numbers=new Integer[ar.size()];
    	//numbers=ar.toArray(numbers);
    	
    	return ar;
    	
    }
}
public class Assignment1Q2 {

	public static void main(String[] args) {
		int min=100, max=999;
		ArmstrongNumBetweenRange ob = new ArmstrongNumBetweenRange();
		ArrayList<Integer> ar=ob.armstrongNumbersInRange(min, max);
		for(int i=0;i<ar.size();i++)
			System.out.print(ar.get(i)+" ");

	}

}
