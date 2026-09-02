package EMPLOYEE_MANAGEMENT_SYSTEM;

import java.util.Scanner;

public class Emp_Manager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id:");
        int id = sc.nextInt();
        System.out.println("Enter User Name:");
        String name = sc.next();
        System.out.println("Enter Department Name:");
        String department = sc.next();
        sc.nextLine();
        System.out.println("Enter Designation");
        String designation = sc.nextLine();
        System.out.println("Enter Employee Salary:");
        double salary = sc.nextDouble();
        Employee obj = new Employee(id, name, department, designation, salary);
        int choice;
        do {
            System.out.println("Choose Options below:");
            System.out.println("1.Bonus");
            System.out.println("2.Tax");
            System.out.println("3.Final Salary");
            System.out.println("4.Employee Details");
            System.out.println("5.Exit");

            System.out.println("Enter the Options:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.calculateBonus();
                    break;
                case 2:
                    obj.caluclatetax();
                    break;
                case 3:
                    obj.CaluclateFinalSalary();
                    break;
                case 4:
                    obj.DisplayEmployeeDetails();
                    break;
                case 5:
                    System.out.println("Exit: thank you");
                    break;
                default:
                    System.out.println("invalid options");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}
