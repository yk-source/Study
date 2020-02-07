package study.day09;

public interface StrategyDemo {
    enum Code {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN
    }

    class Strategy1 {
        public void sayCode() {
            System.out.println(Code.ONE);
        }
    }

    class Strategy2 {
        public void sayCode() {
            System.out.println(Code.TWO);
        }
    }

    class Strategy3 {
        public void sayCode() {
            System.out.println(Code.THREE);
        }
    }

    class Strategy4 {
        public void sayCode() {
            System.out.println(Code.FOUR);
        }
    }

    class Strategy5 {
        public void sayCode() {
            System.out.println(Code.FIVE);
        }
    }

    class Strategy6 {
        public void sayCode() {
            System.out.println(Code.SIX);
        }
    }

    class Strategy7 {
        public void sayCode() {
            System.out.println(Code.SEVEN);
        }
    }
}
