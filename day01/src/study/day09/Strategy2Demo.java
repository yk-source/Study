package study.day09;

public interface Strategy2Demo {
    enum Code {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN
    }
    class Strategy {
        public void sayCode(int i) {
            if(i==1) {
                System.out.println(Code.ONE);
            }else if(i==2){
                System.out.println(Code.TWO);
            }else if(i==3){
                System.out.println(Code.THREE);
            }else if(i==4){
                System.out.println(Code.FOUR);
            }else if(i==5){
                System.out.println(Code.FIVE);
            }else if(i==6){
                System.out.println(Code.SIX);
            }else if(i==7){
                System.out.println(Code.SEVEN);
            }
        }
    }
}
