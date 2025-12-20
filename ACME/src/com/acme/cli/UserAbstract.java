package com.acme.cli;

public abstract class UserAbstract {// crud
    abstract boolean createAccount(User user);
    abstract User readAccount(String accountId);
    abstract boolean updateAccount(User user);
    abstract boolean deleteAccount(String accountId);

    abstract boolean login();
    abstract boolean register();
    abstract String encryptPassword();
    abstract String decryptPassword();
    abstract boolean lock();
    abstract boolean checkLockOneMinute();

}
