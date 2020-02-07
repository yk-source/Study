package study.day08;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("李元坤",21);
        Person p2 = new Person("李元坤",21);
        Person p3 = new Person("李元坤",20);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}
