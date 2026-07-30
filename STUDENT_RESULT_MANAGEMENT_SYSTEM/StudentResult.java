package STUDENT_RESULT_MANAGEMENT_SYSTEM;

public class StudentResult {
    // variables--------------------------------
    private String studentName;
    private int studentId;
    private String courseName;
    private double totalMarks;

    // constructor----------------------------------
    public StudentResult(String studentName, int studentId, String courseName, double totalMarks) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.courseName = courseName;
        this.totalMarks = totalMarks;
        System.out.println("student record created successfully");
    }

    // getters-------------------------------------------
    public String studentname() {
        return studentName;
    }

    public int studentId() {
        return studentId;
    }

    public String courseName() {
        return courseName;
    }

    // setter---------------------------------------------
    public void studentName(String name) {
        studentName = name;
    }

    public void studentId(int id) {
        studentId = id;
    }

    public void courseName(String course) {
        courseName = course;
    }

    // methods----------------------------------------
    public void addMarks(double marks) {
        if (marks <= 0) {
            System.out.println("invalid marks entered");
        } else {
            totalMarks += marks;
            System.out.println("Marks entered successfully");
            System.out.println("updated marks :" + totalMarks);

        }
    }

    public void calculateGrade() {
        if (totalMarks >= 90) {
            System.err.println("Grade A");
        } else if (totalMarks >= 80 && totalMarks < 90) {
            System.out.println("Grade B");
        } else if (totalMarks >= 70 && totalMarks < 80) {
            System.out.println("Grade C");
        } else if (totalMarks >= 60 && totalMarks < 70) {
            System.out.println("Grade D");
        } else if (totalMarks < 60) {
            System.out.println("Fail");
        } else {
            System.out.println("No Marks Available To Caluclate Grade");
        }
    }

    public void viewDetails() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentId);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Total Marks  : " + totalMarks);
    }

    void viewupdate() {
        System.out.println("Total Marks" + totalMarks);
    }
}
