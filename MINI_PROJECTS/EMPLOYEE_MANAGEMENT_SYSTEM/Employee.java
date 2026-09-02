package EMPLOYEE_MANAGEMENT_SYSTEM;

public class Employee {
    // variables--------------------------
    private int id;
    private String name;
    private String department;
    private String designation;
    double salary;
    double bonus;
    double tax;
    double finalsalary;

    // constructor------------------------------------
    Employee(int id, String name, String department, String designation, double salary) {
        if (id > 0) {
            this.id = id;
        } else {
            this.id = 0;
            System.out.println("invalid id number");
        }
        this.name = name;
        this.department = department;
        this.designation = designation;
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
            System.out.println("Invalid Salary");
        }
        System.out.println("Account Created Succesfully");
    }

    // methods------------------------------------------
    public void calculateBonus() {
        if (salary >= 100000) {
            bonus = salary * 20 / 100;
        } else if (salary >= 50000) {
            bonus = salary * 15 / 100;
        } else if (salary >= 30000) {
            bonus = salary * 10 / 100;
        } else if (salary < 30000) {
            bonus = salary * 5 / 100;
        } else {
            System.out.println("No Bonus");
        }
        System.out.println("Bonus :" + bonus);
    }

    public void caluclatetax() {
        if (salary >= 100000) {
            tax = salary / 100 * 15;
        } else if (salary > 50000) {
            tax = salary / 100 * 10;
        } else if (salary > 30000) {
            tax = salary / 100 * 5;
        } else {
            System.out.println("no tax");
        }
        System.out.println("Tax :" + tax);
    }

    public void CaluclateFinalSalary() {
        finalsalary = salary + bonus - tax;
        System.out.println("Final Salary :" + finalsalary);
    }

    public void DisplayEmployeeDetails() {
        System.out.println("---------------------------------------------");
        System.out.println("Employee Details");
        System.out.println("---------------------------------------------");
        System.out.println("Employee Id :" + id);
        System.out.println("Employee Name :" + name);
        System.out.println("Department :" + department);
        System.out.println("Designation :" + designation);
        System.out.println("");
        System.out.println("Basic Salary :" + salary);
        System.out.println("Bonus :" + bonus);
        System.out.println("Tax :" + tax);
        System.out.println("");
        System.out.println("final salary:" + finalsalary);
        System.out.println("");
        System.out.println("-----------------------------------------------");
    }
}
