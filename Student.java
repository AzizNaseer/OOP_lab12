package S2;

import java.util.Objects;

public class Student extends Person implements Association{
    private int rollNo;
    private int semester;
    public Student(){}
    public Student(String name,String id, int rollNo, int semester){
        super(name,id);
        this.rollNo=rollNo;
        this.semester=semester;
    }

    @Override
    public void associate() {
        System.out.println("Associate method of student class");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && semester == student.semester && this.id.equals(((Student) o).id)
                && this.name.equals(((Student) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, semester);
    }

    @Override
    public String toString() {
        return "RollNo = " + rollNo +
                "Semester = " + semester;
    }
}
