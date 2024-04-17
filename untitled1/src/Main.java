import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentGroup sg = new StudentGroup();
        sg.nazwa = "grupa1";

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj imię studenta:");
            String fname = sc.next();
            System.out.println("Podaj nazwisko studenta:");
            String lname = sc.next();
            System.out.println("Podaj email studenta:");
            String email = sc.next();

            Student student = new Student();
            student.fname = fname;
            student.lname = lname;
            student.email = email;

            sg.dodajStudenta(student);
        }
    }
};