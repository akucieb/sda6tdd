package com.sda.bank;

public class Account {
    private int userId;
    private int amount;

    public Account() {
    }

    public Account(int userId, int amount) {
        this.userId = userId;
        this.amount = amount;
    }

    public long getUserId() {
        return userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
