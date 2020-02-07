package study.day14;

public class Fish implements Animal{
    @Override
    public void eat() {
        System.out.println("大鱼吃小鱼，小鱼吃虾米，虾米吃......吃水!?");
    }

    @Override
    public void run() {
        //我是鱼，我不会跑，但是又必须实现接口的方法，所以现在只好空着啦
    }

    @Override
    public void breathe() {
        System.out.println("吐泡泡呼吸法");
    }
}
