package study.day08;

public class GenericClass {
    public static void main(String[] args) {
        GenericDemo<Integer> in = new GenericDemo<>();
        in.setName(123);
        Integer name = in.getName();
        System.out.println(name);
        System.out.println("============");
        GenericDemo<String> str = new GenericDemo<>();
        str.setName("李元坤");
        String name1 = str.getName();
        System.out.println(name1);
    }
}
