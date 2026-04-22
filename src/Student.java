package src;
public class Student implements EducationalUnit {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getStudentCount() {
        return 1; // A student counts as 1 student
    }

    @Override
    public double getBudget() {
        return -tuitionFee; // Tuition is income, so it reduces the overall required budget
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Student: " + name + " | ID: " + studentId + " | Tuition: $" + tuitionFee);
    }
}