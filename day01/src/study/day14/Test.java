package study.day14;

public class Test {
    public static void main(String[] args) {
        Fish fa = new FishAdapter();
        fa.eat();
        fa.run();
        fa.breathe();
    }
}