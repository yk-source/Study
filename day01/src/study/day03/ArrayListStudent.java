package study.day03;

import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        Student stu1=new Student("李元坤",21);
        Student stu2=new Student("夏文浩",22);
        Student stu3=new Student("詹彦哲",22);
        Student stu4=new Student("戴岷君",21);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("姓名："+stu.getName()+",年龄："+stu.getAge());
        }
    }
}
