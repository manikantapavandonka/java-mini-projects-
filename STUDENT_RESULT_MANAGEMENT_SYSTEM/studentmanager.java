package STUDENT_RESULT_MANAGEMENT_SYSTEM;

import java.util.Scanner;

public class studentmanager {
    public static void main(String[] args) {
        // user input--------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String studentName = sc.nextLine();
        System.out.println("Enter Student Id:");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course Name:");
        String courseName = sc.nextLine();
        System.out.println("Enter Total Marks");
        double totalMarks = sc.nextDouble();

        StudentResult stud = new StudentResult(studentName, studentId, courseName, totalMarks);

        int choice;
        do {
            System.out.println("Show Results Menu");
            System.out.println("1.Add more subject marks");
            System.out.println("2.Calculate grade");
            System.out.println("3.View total marks");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Marks");
                    double marks = sc.nextDouble();
                    stud.addMarks(marks);
                    break;
                case 2:
                    stud.calculateGrade();
                    break;
                case 3:
                    stud.viewupdate();
                    break;
                case 4:
                    System.out.println("Final Details:");
                    stud.viewDetails();
                    System.out.println("Thank You! Result Processing Completed.");
                    break;
                default:
                    System.out.println("invalid  option!");
            }
        } while (choice != 4);

        sc.close();
    }
}
