import java.util.*;

public class Marks{

	int total(int a, int b, int c){
		return a+b+c;
}
	static void addStdMrks(){
		System.out.println("Enter StudentID");
		studentID = sc.nextInt();
		marks[studentID][3];
			for(int i=0; i<3; i++){
				System.out.println("Enter Mathematics marks");
				marks[studentID][0] = sc.nextInt();
				System.out.println("Enter Chemistry marks");
				marks[studentID][1] = sc.nextInt();
				System.out.println("Enter Physics marks");
				marks[studentID][2] = sc.nextInt();
			}
		}
	static void Update(){
		System.out.println("Enter StudentID:");
		studentID = sc.nextInt();
		System.out.println("Enter SubjectID:");
		subjectID = sc.nextInt();
		System.out.println("Enter Marks:");
		a = sc.nextInt();
		marks[studentID][subjectID] = a;			
}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int studentID, n,a;
		int subjectID;
		int marks[studentID][3];
		
		System.out.println("Enter number of student :");
		n = sc.nextInt();
		
		do{		
		System.out.println("1)Add student marks");
		
		
		}
	}
}