package com.anshuman.irapi.account.graphql;

import com.anshuman.irapi.account.model.Account;
import com.anshuman.irapi.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountMutationResolver {

    @Autowired
    private AccountService accountService;

    public Account addAccount(Account account) {
        return accountService.saveAccount(account);
    }

}
