package com.dentalclinic.demo.service;

import com.dentalclinic.demo.entity.AccountEntity;
import com.dentalclinic.demo.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public List<AccountEntity> getAccount() {
        return accountRepository.findAll();
    }
}
