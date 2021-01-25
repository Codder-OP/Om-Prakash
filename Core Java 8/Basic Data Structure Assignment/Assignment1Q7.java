import java.util.*;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]==toCheckValue)
    			return true;
    	}
    	return false;
    }
}
public class Assignment1Q7 {

	public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        SearchArray ob=new SearchArray();
        boolean f=ob.searchArray(arr, valueToCheck);
        if(f)
        	System.out.println("Present");
        else
        	System.out.println("Not Present");
        	

	}

}
