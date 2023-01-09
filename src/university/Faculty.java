package university;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public Faculty(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
