package com.acme.cli;

public abstract class AccountAbstract {
    // crud
    abstract boolean createAccount(Account account);
    abstract Account readAccount(String accountId);
    abstract boolean updateAccount(Account account);
    abstract boolean deleteAccount(String accountId);

    abstract boolean withdraw();
    abstract boolean withdrawDialog();
    abstract boolean deposit();
    abstract boolean depositDialog();
    abstract boolean transfer();
    abstract boolean trasnferDialog();
    abstract Account getAccountsOfUser();
    abstract boolean chargeOverdraft();

}
