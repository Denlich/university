package university;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            Institute kpi = new Institute("KPI");

            Faculty fiot = new Faculty("FIOT");
            fiot.getStudents().add(new Student("Denys", "Mykhailovych", 265, 91));
            fiot.getStudents().add(new Student("Ivan", "Ivanov", 10923, 83));
            fiot.getStudents().add(new Student("Taras", "Melnyk", 59832, 99));
            fiot.getStudents().add(new Student("Tymofii", "Melnyk", 57832, 76));

            Faculty ipsa = new Faculty("IPSA");
            ipsa.getStudents().add(new Student("Andrii", "Nevmerzhytski", 87432, 95));
            ipsa.getStudents().add(new Student("Bob", "Squarepants", 8732, 100));
            ipsa.getStudents().add(new Student("Joe", "Jonson", 1293, 98));
            ipsa.getStudents().add(new Student("Johnson", "Notjonsonuk", 1593, 75));
            ipsa.getStudents().add(new Student("Joe", "Notbidden", 1993, 86));

            Faculty tef = new Faculty("TEF");
            tef.getStudents().add(new Student("Veronika", "Lishchinska", 4387, 93));
            tef.getStudents().add(new Student("Yaroslav", "Thewsse", 3578, 100));
            tef.getStudents().add(new Student("Illa", "Melnyk", 2357, 60));
            tef.getStudents().add(null);

            kpi.getFaculties().add(fiot);
            kpi.getFaculties().add(ipsa);
            kpi.getFaculties().add(tef);

            System.out.println(amountOfStudents(kpi));
            System.out.println(theBiggestFaculty(kpi));
            System.out.println(excellentStudents(kpi));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int amountOfStudents(Institute institute) {
        int amount = 0;

        for (Iterator<Faculty> i = institute.getFaculties().iterator(); i.hasNext();) {
            Faculty f = i.next();

            for (Iterator<Student> j = f.getStudents().iterator(); j.hasNext();) {
                Student s = j.next();
                amount++;
            }

            for (Student s : f.getStudents()) {
                amount++;
            }
        }

        return amount;
    }

    public static Faculty theBiggestFaculty(Institute institute) {
        Faculty biggest = new Faculty("Buffer");

        for (Faculty f : institute.getFaculties()) {
            if (biggest.getStudents().size() < f.getStudents().size()) {
                biggest = f;
            }
        }

        return biggest;
    }

    public static ArrayList<Student> excellentStudents(Institute institute) {
        ArrayList<Student> excellentStudents = new ArrayList<>();

        for (Iterator i = institute.getFaculties().iterator(); i.hasNext();) {
            Object faculty = i.next();
            Faculty currentFaculty = (Faculty) faculty;

            for (Iterator j = currentFaculty.getStudents().iterator(); j.hasNext();) {
                Object student = j.next();
                Student currentStudent = (Student) student;

                if (currentStudent.getGPA() >= 95) {
                    excellentStudents.add(currentStudent);
                }
            }
        }

        return excellentStudents;
    }
}
