package study.day08;

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        GenericInterfaceImpl str = new GenericInterfaceImpl();
        str.method("李元坤");
        GenericInterfaceImpl2<String> str1 = new GenericInterfaceImpl2<>();
        str1.method("abc");
    }
}
