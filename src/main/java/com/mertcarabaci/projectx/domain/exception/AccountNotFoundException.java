package com.mertcarabaci.projectx.domain.exception;

import com.mertcarabaci.projectx.domain.enumType.AccountNotFoundErrorType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException(String accountUid, AccountNotFoundErrorType type) {
        super("Account not found " + type.getValue() + ": " + accountUid);
    }
}
