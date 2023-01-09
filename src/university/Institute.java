package university;

import java.util.List;
import java.util.ArrayList;

public class Institute {
    private String name;
    private List<Faculty> faculties;

    public Institute(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }
    public Institute(String name, List<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", faculties=" + faculties +
                '}';
    }
}
