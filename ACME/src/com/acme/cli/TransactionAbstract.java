package com.acme.cli;

public abstract class TransactionAbstract {
    // crud
    abstract boolean createAccount(Transaction transaction);
    abstract Transaction readAccount(String accountId);
    abstract boolean updateAccount(Transaction transaction);
    abstract boolean deleteAccount(String accountId);

    abstract boolean logWithdraw();
    abstract boolean logDeposit();
    abstract boolean logTransfer();
    abstract boolean logOverdraft();
}
