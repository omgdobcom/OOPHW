package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students one = new Students("Sergey", "Artimovich", 33);
        Students two = new Students("Masha", "Basova", 35);
        Students three = new Students("Sergey", "Lebedev", 8);


        List<Students> numberGroup = new ArrayList<>();
        numberGroup.add(one);
        numberGroup.add(two);
        numberGroup.add(three);
        System.out.println(numberGroup);

        one.compareTo(one);


        for (Students student : numberGroup) {
            System.out.println("Name: " + student.getName());
            }

        Iterator<Students> iterator = numberGroup.iterator();
        while (iterator.hasNext()) {
            Students students = iterator.next();
            System.out.println("Name: " + students.getName());
        }
        System.out.println(numberGroup);
        Collections.sort(numberGroup);

        System.out.println(numberGroup);


    }
}
