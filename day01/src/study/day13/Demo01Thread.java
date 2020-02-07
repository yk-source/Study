package study.day13;

public class Demo01Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("李元坤");
        mt.start();
        System.out.println(mt.getName());


        /*for (int i = 0; i <20 ; i++) {
            System.out.println("main->"+i);
        }*/
    }
}
