package study.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoSort {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("李元坤",20));
        people.add(new Person("夏文浩",21));
        people.add(new Person("詹彦哲",22));
        people.add(new Person("戴岷君",19));
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(people);
    }

}
