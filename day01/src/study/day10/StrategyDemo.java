package study.day10;
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
    class Strategy{
        private Code code1 = Code.ONE;
        private Code code2 = Code.TWO;
        private Code code3 = Code.THREE;
        private Code code4 = Code.FOUR;
        private Code code5 = Code.FIVE;
        private Code code6 = Code.SIX;
        private Code code7 = Code.SEVEN;
        public Code getCode1() {
            return code1;
        }
        public Code getCode2() {
            return code2;
        }
        public Code getCode3() {
            return code3;
        }
        public Code getCode4() {
            return code4;
        }
        public Code getCode5() {
            return code5;
        }
        public Code getCode6() {
            return code6;
        }
        public Code getCode7() {
            return code7;
        }


    }
    Code getResult(int result);
}
