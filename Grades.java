    import java.util.Scanner;


public class Grades{
    public static Scanner sc = new Scanner(System.in);
    public static int studentID,subjectID,n,a,count;
    public static int marks[][];

    public  static void addMarks(){

        System.out.println("Enter Student ID: ");
            studentID = sc.nextInt();
            a = studentID-1;
        System.out.println("Enter Mathematics Marks: ");
        marks[a][0] = sc.nextInt();
        System.out.println("Enter Chemistry Marks: ");
        marks[a][1] = sc.nextInt();
        System.out.println("Enter Physics Marks: ");
        marks[a][2] = sc.nextInt();


    }

    public static void updateMarks(){

        System.out.println("Enter Student ID: ");
            studentID = sc.nextInt();
            a = studentID-1;
        System.out.println("Mathematics = 1 || Chemistry = 2  ||  Physics = 3 ");
        System.out.println("Enter Subject ID to change marks: ");
            subjectID = sc.nextInt();
        System.out.println("Enter marks to update: ");
            marks[a][subjectID-1] = sc.nextInt();

    }
        
    public static void average_s(){
        // System.out.println("Enter Student ID: ");
        //     studentID = sc.nextInt();
        System.out.println("Mathematics = 1 || Chemistry = 2  ||  Physics = 3 ");
        System.out.println("Enter Subject ID to check the average");
            subjectID = sc.nextInt();
        double t = 0;
        for(int i=0; i<n;i++){
            t += marks[i][subjectID-1];

        }

        double sAverage = t/n;

        System.out.println("Subject average :"+ sAverage);

    }

    public static void average(){

        System.out.println("Enter Student ID: ");
        studentID = sc.nextInt();
        a = studentID-1;
        

        // int t=0,s=3;
        // for(int i=0; i<s;i++){
        //     t += marks[studentID][s];

        // }

        double avg = (double) total(a)/3;

        System.out.println("Average of student "+a+" is "+avg);
    }

    public static int total(int a){

        return marks[a][0]+ marks[a][1]+ marks[a][2];
    }

    public static String grad(int score){

            if(score >= 90)
                return "Grade A";
            else if(score >= 80)
                return "Grade B";
            else if(score >= 70)
                return "Grade C";
            else if(score >= 60)
                return "Grade D";
            else if(score < 60)
                return "Fail";
            return null; //else
        }

    public static void grades(){

        System.out.printf("%-10s %-15s %-10s %-10s\n","Student ID","Mathematics","Chemistry","Physics");
        // System.out.println("Student ID\t"+"Mathematics\t"+"Chemistry\t"+"Physics");
        
        for(int i=0;i<n;i++){

            String m = grad(marks[i][0]);
            String c = grad(marks[i][1]);
            String p = grad(marks[i][2]);

            System.out.printf("%-10s %-15s %-10s %-10s\n",i+1,m,c,p);
            // System.out.println(studentID +"\t\t"+m+"\t\t"+c+"\t"+p);

        }
            
        

    }


     public static void main(String[] args){
        

        System.out.println("Enter number of students");
        n = sc.nextInt();
        marks = new int[n][3];

        // Marks obj = new Marks();
        int option = 0;
        do{
            System.out.println("====MENU===");
            System.out.println("1)Add students marks");
            System.out.println("2)Update student marks");
            System.out.println("3)Check subject average");
            System.out.println("4)Check student average");
            System.out.println("5)Get student total marks");
            System.out.println("6)Get grades summary");
            System.out.println("7)Exit");
            System.out.println("====***===");
            System.out.println("\nEnter option");
            option = sc.nextInt();


            switch (option) {
                case 1:
                    addMarks();
                    break;
                
                case 2:
                    updateMarks();
                    break;
                
                case 3:
                    average_s();
                    break;

                case 4:
                    average();
                    break;
                case 5:
                    System.out.println("Enter Student ID: ");
                    studentID = sc.nextInt();
                    a = studentID-1;
                 int x = total(a);
                 System.out.println("Total marks is : "+x);
                    break;

                case 6:
                    grades();
                    break;
                case 7:
                    System.out.println("Exiting... ");
                    break;
            
                default:
                System.out.println("Invalid option!!! Enter a valid option");
                    break;
            }


        }while(option != 7);

        
    }


}   