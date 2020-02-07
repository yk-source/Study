package study.day01;
public class ThreadDemo implements Runnable{
    public void run() {
        for(int i=0;i<10;i++) {
            String name= Thread.currentThread().getName();
            System.out.println(name+":"+(i+1)+"号病人在看病！");
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    }
  class ThreadDemo1  {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        Thread th = new Thread(td, "特需号");
        th.setPriority(10);
        th.start();
        for (int i = 0; i < 50; i++) {
            if (i == 10) {
                try {
                    th.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //String name = Thread.currentThread().getName();
            System.out.println("普通号"+":"+(i+1)+ "号病人在看病！");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}