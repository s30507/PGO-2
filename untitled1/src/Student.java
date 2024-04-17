public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public double[] grades;
    public double obliczSrednia() {
        if (grades == null) {
            throw new IllegalArgumentException("Student nie ma ocen");
        }
        if (grades.length >= (20)) {
            throw new IllegalArgumentException("Student ma więcej niż 20 ocen");
        }
        double srednia = 0;
        for (int i = 0; i < grades.length; i++) {
            srednia += grades[i];
        }
        srednia /= grades.length;
        return srednia ;
    }
}