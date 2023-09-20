import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("ID001", "Alice Box", 10));
        studentsList.add(new Student("ID002", "Holland Jake", 11));
        studentsList.add(new Student("ID003", "John Doe", 12));
        studentsList.add(new Student("ID004", "Carl Jacob", 10));


        for (Student student : studentsList) {
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Name: " + student.getName());
            System.out.println("Grade: " + student.getGrade());
            System.out.println();
        }
        System.out.println("Students in Grade 10: ");
        for (Student student: studentsList) {
            if(student.getGrade() == 10){
                System.out.println("Student ID: " + student.getStudentId());
                System.out.println("Name: " + student.getName());
                System.out.println("Grade: " + student.getGrade());
                System.out.println();
            }
        }
        System.out.println("Students who ID001:");
        for (Student student: studentsList) {
            if (student.getStudentId().equalsIgnoreCase("ID001")){
                System.out.println("Name: " + student.getName());
                System.out.println("Grade: " + student.getGrade());
                System.out.println();
            }
        }
    }
}