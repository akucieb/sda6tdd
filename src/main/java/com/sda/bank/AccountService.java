package com.sda.bank;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private static int counterId = 0;
    private List<Account> accounts;

    public AccountService() {
        this.accounts = new ArrayList<>();
    }

    public int getNumberOfAccounts() {
        return accounts.size();
    }

    public boolean addAccount(Account account) {
        boolean result = false;

        if (account != null) {
            account.setId(counterId++);
            accounts.add(account);
            result = true;
        }
        return result;
    }
}
