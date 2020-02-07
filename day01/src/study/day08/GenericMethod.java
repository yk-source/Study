package study.day08;



public class GenericMethod {
    public <E> void method01(E e){
        System.out.println(e);
    }
    public static <M> void method02(M m){
        System.out.println(m);
    }

}
