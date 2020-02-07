package study.day08;

public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method01(10);
        gm.method01("abc");
        GenericMethod.method02("李元坤");

    }
}
