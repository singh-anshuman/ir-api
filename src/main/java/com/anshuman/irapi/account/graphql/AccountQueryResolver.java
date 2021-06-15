package com.anshuman.irapi.account.graphql;

import com.anshuman.irapi.account.model.Account;
import com.anshuman.irapi.account.service.AccountService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private AccountService accountService;

    public List<Account> getAccounts() {
        return accountService.getAllAccounts();
    }

    public Account getAccountById(Long id) {
        Account account = accountService.getAccountById(id).get();
        return account;
    }

}
