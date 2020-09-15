import java.util.ArrayList;

public class Students {
    private String name;
    private int age;
    private String schoolClass;

    ArrayList<String> list = new ArrayList<>();

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public Students(String name, int age, String schoolClass) {
        this.name = name;
        this.age = age;
        this.schoolClass = schoolClass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchoolClass() {
        return schoolClass;
    }
}
