package study.day16;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Person {
    public static void main(String[] args) {
        Person[] arr = {
              new Person("李元坤",20),
              new Person("夏文浩",21),
              new Person("詹彦哲",22),
              new Person("戴岷君",20)
        };
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        Arrays.sort(arr,(Person o1,Person o2)->{
            return  o1.getAge()-o2.getAge();
        });
        for (Person p : arr){
            System.out.println(p);
        }
    }
}
