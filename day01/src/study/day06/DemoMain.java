package study.day06;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        //Mouse mouse = new Mouse();
        USB usbMouse = new Mouse();
        computer.usbDevice(usbMouse);
        Keyboard keyboard = new Keyboard();
        computer.usbDevice(keyboard);//向上转型
        //使用子类对象，匿名对象，也可以
//        computer.usbDevice(new Keyboard());
        computer.powerOff();
    }
}
