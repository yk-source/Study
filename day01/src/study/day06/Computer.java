package study.day06;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本开机");
    }
    public void powerOff(){
        System.out.println("笔记本关机");
    }
    public void usbDevice(USB usb){
        usb.open();
        if(usb instanceof  Mouse){
            Mouse mouse = (Mouse) usb ;
            mouse.click();
        }else if (usb instanceof  Keyboard){
            Keyboard keyboard = new Keyboard();
            keyboard.type();
        }
        usb.close();
    }
}
