package decompose_conditional.after;

import java.util.Date;

public class DC_example {
    private static final Date SUMMER_START = new Date();
    private static final Date SUMMER_END = new Date();

    private int winterRate;
    private int summerRate;
    private int winterServiceCharge;

    // 이렇게 함으로써의 장점은, 긴 조건문일 때 좋고, 메서드로 따로 빼므로써 '용도'를 확실히 알 수 있게 하는 장점이 있다.
    void method(Date date, int quantity) {
        int charge;

        if (notSummer(date)) {
            charge = winterCharge(quantity);
        } else {
            charge = summerCharge(quantity);
        }
    }

    private int summerCharge(int quantity) {
        return quantity * summerRate;
    }

    private int winterCharge(int quantity) {
        return quantity * winterRate + winterServiceCharge;
    }

    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }
}