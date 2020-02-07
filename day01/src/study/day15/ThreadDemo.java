package study.day15;

class ThreadCommunication {
    //为true时表示有值可取，为false时表示需要放入新值
     boolean valueSet = false;
     //使用synchronized修饰getA（）方法，确保当前实例在某一时刻只有一种状态
     synchronized void getA() {
    	 //如果没有值，等待线程取值
        try {
            while (valueSet == true) {
                wait();
            }
            for (int i=0; i<5; i++) {
                System.out.println("备份数据库A");
            }
            //将valueSet的值设为ture，确保备份数据库A首先执行
            valueSet = true;
            notify();//通知等待线程进行取值操作
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     synchronized void getB() {
        try {
            while (valueSet == false) {
                wait();
            }
            for (int i=0; i<5; i++) {
                System.out.println("备份数据库B");
            }
            valueSet = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class DatabaseA extends Thread {
	 ThreadCommunication tc;
	 DatabaseA(ThreadCommunication tc) {
        this.tc = tc;
    }
    public void run() {
        tc.getA();
    }
}
class DatabaseB extends Thread {
	 ThreadCommunication tc;
	 DatabaseB(ThreadCommunication tc) {
        this.tc = tc;
    }
    public void run() {
        tc.getB();
    }
}
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
    	ThreadCommunication tc = new ThreadCommunication();
        for (int i=0; i<8; i++) {
        	DatabaseB db = new DatabaseB(tc);
            db.start();
            DatabaseA da = new DatabaseA(tc);
            da.start();
        }
    }
}