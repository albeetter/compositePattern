package src;
public class UniversityClient {
    public static void main(String[] args) {
        // 1. Create Students
        Student s1 = new Student("Alice Johnson", "S1001", 1500.00);
        Student s2 = new Student("Bob Smith", "S1002", 1500.00);
        Student s3 = new Student("Charlie Brown", "S1003", 2000.00);
        Student s4 = new Student("Diana Prince", "S1004", 2000.00);

        // 2. Create Teachers
        Teacher t1 = new Teacher("Dr. Alan Turing", "Algorithms", 80000.00);
        Teacher t2 = new Teacher("Dr. Ada Lovelace", "Programming", 85000.00);
        Teacher t3 = new Teacher("Dr. John Nash", "Economics", 75000.00);

        // 3. Create Departments and add Teachers & Students
        Department compSciDept = new Department("Department of Computer Science");
        compSciDept.addUnit(t1);
        compSciDept.addUnit(t2);
        compSciDept.addUnit(s1);
        compSciDept.addUnit(s2);

        Department businessDept = new Department("Department of Business Administration");
        businessDept.addUnit(t3);
        businessDept.addUnit(s3);
        businessDept.addUnit(s4);

        // 4. Create Colleges and add Departments
        College engineeringCollege = new College("College of Engineering and Technology");
        engineeringCollege.addUnit(compSciDept);

        College businessCollege = new College("College of Business");
        businessCollege.addUnit(businessDept);

        // 5. Create the University (A higher-level College entity) and add Colleges
        College university = new College("New Era University");
        university.addUnit(engineeringCollege);
        university.addUnit(businessCollege);

        // --- Execute Required Tasks ---

        System.out.println("==========================================");
        System.out.println("       NEU ORGANIZATIONAL STRUCTURE       ");
        System.out.println("==========================================");
        // Display Details
        university.displayDetails("");

        System.out.println("\n==========================================");
        System.out.println("     NEW ERA UNIVERSITY STATISTICS       ");
        System.out.println("==========================================");
        
        // Calculate and display total number of students
        System.out.println("Total Students in University: " + university.getStudentCount());
        
        // Calculate and display total budget
        // Budget = (Sum of Teacher Salaries) - (Sum of Student Tuitions)
        // Expected: (80k + 85k + 75k) - (1.5k + 1.5k + 2k + 2k) = 240,000 - 7,000 = 233,000
        System.out.println("Total Budget for University: $" + university.getBudget());
        
        System.out.println("\n--- Department Specific Stats ---");
        System.out.println("Computer Science Dept Students: " + compSciDept.getStudentCount());
        System.out.println("Computer Science Dept Budget: $" + compSciDept.getBudget());
    }
}