package study.day02;


public class DemoStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("李元坤");
        stu1.setAge(21);
        System.out.println("姓名:"+stu1.getName()+",年龄:"+stu1.getAge());
    }
}
