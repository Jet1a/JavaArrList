public class Main {
    public static void main(String[] args) {
        GradeTracker tracker = new GradeTracker();

        // Create student objects and add them to the tracker
        Student student1 = new Student("12345", "Alice");
        Student student2 = new Student("67890", "Bob");

        tracker.addStudents(student1);
        tracker.addStudents(student2);

        // Add grades to students
        student1.addGrade(95.0);
        student1.addGrade(85.0);
        student2.addGrade(90.0);

        // List all students and their grades
        tracker.listStudent();

        // Calculate average grade for a specific student
        String studentId = "12345";
        double averageGrade = tracker.calculateAverageGrade(studentId);
        if (averageGrade >= 0) {
            System.out.println("Average Grade for Student ID " + studentId + ": " + averageGrade);
        } else {
            System.out.println("Student not found.");
        }
        System.out.println();

        // Remove a student
        String studentToRemove = "12345";
        tracker.removeStudents(studentToRemove);

        // List students again after removal
        tracker.listStudent();
    }
}