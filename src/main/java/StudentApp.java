import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //prompt user for details

        System.out.println("Please enter your name ");
        Scanner sc= new Scanner(System.in);
        String studentName=sc.nextLine();
        System.out.println("Please enter your email");
        String studentEmail= sc.nextLine();
        System.out.println("Please enter your course");
        String studentCourse=sc.nextLine();


        //first Student
        Student firstStudent =new Student();
        firstStudent.setName(studentName);
        firstStudent.setEmail(studentEmail);
        firstStudent.setCourse(studentCourse);



        //second Student
        System.out.println("Please enter Second Student name ");

        String studentName2= sc.nextLine();
        System.out.println("Please enter your email");
        String studentEmail2= sc.nextLine();
        System.out.println("Please enter your course");
        String studentCourse2=sc.nextLine();

        Student secondStudent =new Student();
        secondStudent.setName(studentName2);
        secondStudent.setEmail(studentEmail2);
        secondStudent.setCourse(studentCourse2);



        //third Student
        System.out.println("Please enter third Student name ");
        String studentName3= sc.nextLine();
        System.out.println("Please enter your email");
        String studentEmail3= sc.nextLine();
        System.out.println("Please enter your course");
        String studentCourse3=sc.nextLine();

        Student thirdStudent =new Student();
        thirdStudent.setName(studentName3);
        thirdStudent.setEmail(studentEmail3);
        thirdStudent.setCourse(studentCourse3);


        System.out.println( firstStudent.toString());
        System.out.println( secondStudent.toString());
        System.out.println( thirdStudent.toString());

    }
}
