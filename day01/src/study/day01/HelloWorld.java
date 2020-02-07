package study.day01;
public class HelloWorld {
    public static void main(String[] args) {
     getSum();
    }
    public  static void getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("结果是："+sum);
    }
}
