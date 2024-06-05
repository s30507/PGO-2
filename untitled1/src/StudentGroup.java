import java.util.ArrayList;

public class StudentGroup {

    public StudentGroup(){
    }
    public String nazwa;

    public ArrayList<Student> students = new ArrayList<>();

    public void dodajStudenta(Student student) {
        if (students.size() > 15) {
            throw new IllegalStateException("Maksymalna liczba osób w grupie to 15");
        }
        if (czyIstnieje(student)) {
            throw new IllegalStateException("Student został już dodany");
        }

        students.add(student);
    }
    public Boolean czyIstnieje(Student student) {
        for (int i = 0; i < students.size(); i++) {
                if (student.email.equals(students.get(i).email)) {
                    return true;
                }
        }

        return false;
    }
}
