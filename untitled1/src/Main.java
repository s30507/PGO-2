import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continueWhile = true;
        StudentGroup sg = new StudentGroup();
        sg.nazwa = "grupa1";

        while(continueWhile) {
            Scanner sc = new Scanner(System.in);

            Student student = new Student();
            System.out.println("Podaj imię studenta:");
            student.fname = sc.next();
            System.out.println("Podaj nazwisko studenta:");
            student.lname = sc.next();
            System.out.println("Podaj email studenta:");
            student.email = sc.next();

            sg.dodajStudenta(student);

            System.out.println("Chcesz kontynuować, T jeśli tak, co kolwiek jeśli nie");
            String decision = sc.next();

            if(decision.equals("T") == false){
                continueWhile = false;
            }
        }
    }
};