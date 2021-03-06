package com.anshuman.irapi.account.controller;

import com.anshuman.irapi.account.model.Account;
import com.anshuman.irapi.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAccounts() {
        return new ResponseEntity<>(accountService.getAllAccounts(),HttpStatus.OK);
    }

    @GetMapping("/accounts/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(accountService.getAccountById(id).get(),HttpStatus.OK);
    }

    @PostMapping("/accounts")
    public ResponseEntity<Account> addAccount(@RequestBody Account account) {
        return new ResponseEntity<>(accountService.saveAccount(account), HttpStatus.CREATED);
    }

//    @GetMapping("/test")
//    public ResponseEntity<Account> getFunction() {
////        String test = "All Good";
//        Account acc = accountService.getAccountById(1L);
//        System.out.println(acc.getInstrument().getName());
//        System.out.println(acc.getAccountNumber());
////        test = acc.getInstrument().getName();
//        return new ResponseEntity<>(acc,HttpStatus.OK);
//    }

}
