public class StudentGroup {

    public StudentGroup(){
        Student pustyStudent = new Student();
        pustyStudent.fname = "";
        pustyStudent.lname = "";
        pustyStudent.email = "";
        for (int i = 0; i < students.length; i++) {
            students[i] = pustyStudent;
        }
    }
    public String nazwa;

    public Student[] students = new Student[15];

    int index = 0;

    public void dodajStudenta(Student student) {
        if (students.length > 15) {
            throw new IllegalStateException("Maksymalna liczba osób w grupie to 15");
        }
        if (czyIstnieje(student)) {
            throw new IllegalStateException("Student został już dodany");
        }

        students[index] = student;
        index++;
    }
    public Boolean czyIstnieje(Student student) {
        Boolean istnieje = false;

        for (int i = 0; i < students.length; i++) {
                if (student.email.equals(students[i].email)) {
                    istnieje = true;
                }
        }

        return istnieje;
    }
}
