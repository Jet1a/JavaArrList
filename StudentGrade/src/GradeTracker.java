import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class GradeTracker {
    private List<Student> students;

    public GradeTracker() {
        students = new ArrayList<>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void removeStudents(String studentId) {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
        }
    }

    public void listStudent() {
        for (Student student : students) {
            System.out.println("Student name: " + student.getName());
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Student Grade: " + student.getGrades());
            System.out.println();
        }
    }

    public double calculateAverageGrade(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                List<Double> grades = student.getGrades();
                if (grades.isEmpty()) {
                    return 0.0;
                }
                double sum = 0.0;
                for (double grade : grades) {
                    sum += grade;
                }
                return sum / grades.size();
            }
        }
        return -1.0; // Return -1 if student not found
    }

}
