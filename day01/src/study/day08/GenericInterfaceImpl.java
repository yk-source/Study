package study.day08;

public class GenericInterfaceImpl implements GenericInterface<String>{

    @Override
    public void method(String e) {
        System.out.println(e);
    }
}
