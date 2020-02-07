package study.day13;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
  /*      for (int i = 0; i <20 ; i++) {
            System.out.println("Thread->"+i);
        }*/
    }
}
