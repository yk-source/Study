package study.day06;
/*
懒汉式单例模式
特点：只有调用获取实例的方法时才进行实例化
*/
public class Test {
    private static class Singleton {
        Object data;
        private static  Singleton singleton =null;

        public Singleton() {
        }

        public Object getData() {
            return data;
        }
        public void setData(Object data) {
            this.data = data;
        }
        public void hello() {
            System.out.println("hello");
        }
        public static Singleton getSingleton(){
            if(singleton==null){
                singleton = new Singleton();
            }
            return singleton;
        }
    }
    public static void main(String[] args) {
        //请用单例模式优化以下代码
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1==singleton2);
        singleton1.hello();
    }
}
