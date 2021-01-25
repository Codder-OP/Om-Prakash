import java.util.*;

class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
    	String s="";
    	if(user.equals(userId) && pass.equals(password))
    		s="Match";
    	else
    		s="Missmatch";
    	return s;
    	
    }

}
public class Assignment1Q6 {

	public static void main(String[] args) {
		int cnt=3;
		Scanner sc =new Scanner(System.in);
		Login ob =new Login();
		while(cnt>0)
		{
			cnt=cnt-1;
			String user,pass;
			System.out.println("Enter userId");
			user=sc.nextLine();
			System.out.println("Enter password");
			pass=sc.nextLine();
			String s=ob.loginUser(user, pass);
			if(s=="Match") {
				System.out.println("Welcome Ajay");
				System.exit(0);
			}
			else if(s=="Missmatch" && cnt==0) {
				System.out.println("You have entered wrong credentials 3 times");
			}
			else
				System.out.println("You have entered wrong credentials ,please enter the right credentials.");
			
		}
		System.out.println("Contact Admin");

	}

}
