package io.plainid.invicesdemo.controllers;

import io.plainid.invicesdemo.model.Account;
import io.plainid.invicesdemo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;
    @GetMapping
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable int id) {
        return accountRepository.findById(id);
    }
}
