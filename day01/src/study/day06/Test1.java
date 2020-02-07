package study.day06;
/*
饿汉式单例模式
特点：类加载时就实例化对象
*/
public class Test1 {
    private static class Singleton {
        Object data;
        private static  Singleton singleton = new Singleton();

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
            return singleton;
        }
    }
    public static void main(String[] args) {
        //请用单例模式优化以下代码
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        Singleton singleton3 = Singleton.getSingleton();
        System.out.println(singleton2==singleton3);
        singleton1.hello();
    }
}
