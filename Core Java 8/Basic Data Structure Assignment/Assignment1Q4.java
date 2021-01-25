import java.util.*;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	if((subject1Marks<60 && subject2Marks<60) || (subject2Marks<60 && subject3Marks<60) || (subject1Marks<60 && subject3Marks<60))
    		return "failed";
    	else if((subject1Marks<60 && subject2Marks>60 && subject3Marks>60) || (subject2Marks<60 && subject1Marks>60 && subject3Marks>60) || (subject3Marks<60 && subject1Marks>60 && subject2Marks>60))
    		return "promoted";
    	else
    		return "passed";
    }
}
public class Assignment1Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ResultDeclaration ob=new ResultDeclaration();
		double a1,a2,a3;
		System.out.println("Subject 1 marks: ");
		a1=sc.nextDouble();
		System.out.println("Subject 2 marks: ");
		a2=sc.nextDouble();
		System.out.println("Subject 3 marks: ");
		a3=sc.nextDouble();		
		String s=ob.declareResults(a1, a2, a3);
		System.out.println(s);
	}

}
