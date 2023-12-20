package model.entities;

import model.exceptions.WithdrawAmountException;

public final class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    public Account() {}

    public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withDraw(Double amount) throws WithdrawAmountException {
        if (amount > withDrawLimit) {
            throw new WithdrawAmountException("withdraw error: your withdraw amount exceeded the withdraw limit");
        } else if (amount > balance) {
            throw new WithdrawAmountException("withdraw error: withdraw amount is more than these account balance");
        } else {
            this.balance -= amount;
        }
    }
}
