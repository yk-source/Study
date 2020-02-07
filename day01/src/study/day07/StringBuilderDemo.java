package study.day07;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();
        //StringBuilder bu1 = bu.append("abc");
        bu.append("abc");
        bu.append(2);
        bu.append('中');
        System.out.println(bu);



    }
}
