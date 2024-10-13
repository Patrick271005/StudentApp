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
        firstStudent.setName(studentName);//this one is fine
        firstStudent.setEmail(studentEmail);
        firstStudent.setCourse(studentCourse);



//second Student

        System.out.println("Please enter Second Student email");
        String studentEmail2= sc.nextLine();
        System.out.println("Please enter Second Student course");
        String studentCourse2=sc.nextLine();

        Student secondStudent =new Student("Shane");
        secondStudent.setEmail(studentEmail2);
        secondStudent.setCourse(studentCourse2);



//third Student

        Student thirdStudent =new Student("David" ,"David@atu.ie","Sport Science");

        System.out.println( firstStudent.toString());
        System.out.println( secondStudent.toString());
        System.out.println( thirdStudent.toString());

    }
}