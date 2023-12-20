package model.exceptions;

import java.io.Serial;

public class WithdrawAmountException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public WithdrawAmountException(String msg) {
        super(msg);
    }
}
