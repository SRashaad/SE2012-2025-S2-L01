import java.util.*;

public class Welcome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String first,last;
		
		System.out.print("Enter Your First Name:");
		first = sc.nextLine();
		System.out.print("Enter Your Last Name:");
		last= sc.nextLine();
		System.out.println("Welcome to the Second Year "+first+" "+last);
		
		
	}
}