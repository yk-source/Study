package study.day10;

import java.util.Random;

public class Test {

    private enum Code {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN
    }

    private static class Strategy1 {

        private Code code = Code.ONE;

        public Code getCode() {
            return code;
        }
    }

    private static class Strategy2 {
        private Code code = Code.TWO;

        public Code getCode() {
            return code;
        }
    }

    private static class Strategy3 {
        private Code code = Code.THREE;

        public Code getCode() {
            return code;
        }
    }

    private static class Strategy4 {
        private Code code = Code.FOUR;

        public Code getCode() {
            return code;
        }
    }

    private static class Strategy5 {
        private Code code = Code.FIVE;

        public Code getCode() {
            return code;
        }
    }

    private static class Strategy6 {
        private Code code = Code.SIX;

        public Code getCode() {
            return code;
        }
    }

    private static class Strategy7 {
        private Code code = Code.SEVEN;

        public Code getCode() {
            return code;
        }
    }

    /**
     * 请用委派模式完成以下代码
     */
 /*   public static Code getResult(int result) {

    }*/

    /**
     * 要求结果：
     * 1->Code.ONE
     * 2->Code.TWO
     * 3->Code.THREE
     * ......
     * 7->Code.SEVEN
     */
    public static void main(String[] args) {
        Random random = new Random();
        //生成1~7的随机数
        int result = random.nextInt(7) + 1;
        //System.out.println(getResult(result));
    }
}
