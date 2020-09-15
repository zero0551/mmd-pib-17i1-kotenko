import java.util.ArrayList;

public class University {
    public static void main (String[] args){

        Students students = new Students("Петя",7, "1A");
        Students students1 = new Students("Витя",7, "1A");
        Students students2 = new Students("Кирилл",7, "1A");
        Students students3 = new Students("Катя",7, "1A");
        Students students4 = new Students("Егор",7, "1A");
        Students students5 = new Students("Дима",7, "1A");


        System.out.println(students.getAge() + " " + students.getName() + " " + students.getSchoolClass());

        ArrayList<String> list = new ArrayList<>();
        list.add(0, "Золотая медаль по учебе ");
        students.setList(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(0, "Золотая медаль ");
        students1.setList(list1);

        for (String perem : students.list) {
            System.out.println(perem);
        }
        System.out.println(students1.getAge() + " " + students1.getName() + " " + students1.getSchoolClass());
        for (String perem : students1.list) {
            System.out.println(perem);
        }
    }
}
