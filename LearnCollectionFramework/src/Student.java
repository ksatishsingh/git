import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int rollno;
    private String stream;


    public Student(int id, String name, int rollno, String stream) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.stream = stream;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Student student = (Student) that;
        return id == student.id && rollno == student.rollno && Objects.equals(name, student.name) && stream.equals(student.stream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rollno, stream);
    }

}
