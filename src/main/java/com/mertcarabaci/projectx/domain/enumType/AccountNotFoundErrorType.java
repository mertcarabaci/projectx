package com.mertcarabaci.projectx.domain.enumType;

import lombok.Getter;

@Getter
public enum AccountNotFoundErrorType {
    ACCOUNT_ID("uid"),
    EMAIL("email"),
    PHONE("phone");

    private final String value;

    AccountNotFoundErrorType(String value) {
        this.value = value;
    }

}
