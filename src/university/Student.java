package university;

public class Student {
    private String name;
    private String surname;
    private int gradebookNumber;
    private int GPA;

    public Student(String name, String surname, int gradebookNumber, int GPA) {
        this.name = name;
        this.surname = surname;
        this.gradebookNumber = gradebookNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGradebookNumber() {
        return gradebookNumber;
    }

    public void setGradebookNumber(int gradebookNumber) {
        this.gradebookNumber = gradebookNumber;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gradebookNumber=" + gradebookNumber +
                ", GPA=" + GPA +
                '}';
    }
}
