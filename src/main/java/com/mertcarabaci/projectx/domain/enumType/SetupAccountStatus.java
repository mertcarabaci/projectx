package com.mertcarabaci.projectx.domain.enumType;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SetupAccountStatus {
    CREATED("Setup Successful!"),
    NICKNAME_USED("Nickname is already in use");

    private final String value;
}
