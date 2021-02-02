import java.util.*;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return (totalDeposits - creditLimit);
    }
}

class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return (totalDeposits + fixedDepositAmount ); 
    }
}

public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
    	int total=0;
    	for(int i=0;i<cash.size();i++)
    		total+=cash.get(i);
    	return total;
    }
    public int getCash(){
    	return 0;
    }
    public static void main(String[] args) {
    	CurrentAccount current_Acc=new CurrentAccount();
    	int current_amount=current_Acc.getCash();
    	
    	SavingsAccount saving_Acc =new SavingsAccount();
    	int saving_amount=saving_Acc.getCash();
    	
    	ArrayList<Integer> cash=new ArrayList<Integer>(2);
    	cash.add(current_amount);
    	cash.add(saving_amount);
    	
    	Assignment2Q3 ans=new Assignment2Q3();
    	System.out.println("Tolat Cash Available in Bank: "+ans.totalCashInBank(cash));
    	
    }
}