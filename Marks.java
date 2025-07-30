    import java.util.Scanner;

public class Marks{
    public static Scanner sc = new Scanner(System.in);
    public static int studentID,subjectID,n,a,count;
    public static int marks[][];

    public  static void addMarks(){

        System.out.println("Enter Student ID: ");
            studentID = sc.nextInt();

        System.out.println("Enter Mathematics Marks: ");
        marks[studentID][0] = sc.nextInt();
        System.out.println("Enter Chemistry Marks: ");
        marks[studentID][1] = sc.nextInt();
        System.out.println("Enter Physics Marks: ");
        marks[studentID][2] = sc.nextInt();


    }

    public static void updateMarks(){

        System.out.println("Enter Student ID: ");
            studentID = sc.nextInt();
        System.out.println("Mathematics = 0\nChemistry = 1\nPhysics = 2 ");
        System.out.println("Enter Subject ID to change marks: ");
            subjectID = sc.nextInt();
        System.out.println("Enter marks to update: ");
            marks[studentID][subjectID] = sc.nextInt();

    }
        
    public static void average_s(){
        // System.out.println("Enter Student ID: ");
        //     studentID = sc.nextInt();
        System.out.println("Enter Subject ID to check the average");
            subjectID = sc.nextInt();
        int t = 0;
        for(int i=0; i<n;i++){
            t += marks[i][subjectID];

        }

        int sAverage = t/n;

        System.out.println("Subject average :"+ sAverage);

    }

    public static void average(){

        System.out.println("Enter Student ID: ");
        studentID = sc.nextInt();

        // int t=0,s=3;
        // for(int i=0; i<s;i++){
        //     t += marks[studentID][s];

        // }

        int avg = total(studentID)/3;

        System.out.println("Average of student "+studentID+" is "+avg);
    }

    public static int total(int studentID){

        return marks[studentID][0]+ marks[studentID][1]+ marks[studentID][2];
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
            System.out.println("6)Exit");
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
                 int x = total(studentID);
                 System.out.println("Total marks is : "+x);
                    break;
            
                default:
                System.out.println("Invalid option\nEnter a valid option");
                    break;
            }


        }while(option != 6);

        
    }


}   