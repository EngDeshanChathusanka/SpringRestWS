package com.rest.component;

import com.rest.Account;

public class DBManager {

    public static Account getAccount(String name) {
        Account account = new Account();
        account.setName(name);
        account.setBranch("DefaultBranch");
        account.setBank("DefaultBank");
        account.setAccountNo("DefaultAccountNo");
        return account;
    }
}
