package S2;

import java.util.Objects;

public class Teacher extends Person implements Association{
    private String designation;
    private String department;
    public Teacher(){}
    public Teacher(String name,String id,String designation, String department){
        super(name,id);
        this.department=department;
        this.designation=designation;
    }

    @Override
    public void associate() {
        System.out.println("Associate method of teacher class");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(designation, teacher.designation) && Objects.equals(department, teacher.department)
                && this.id.equals(((Student) o).id)
                && this.name.equals(((Student) o).name);
    }

    @Override
    public String toString() {
        return "Designation = " + designation +
                "Department = " + department;
    }
}
