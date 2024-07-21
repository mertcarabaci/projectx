package com.mertcarabaci.projectx.domain.enumType;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CreateAccountStatus {
    CREATED("Created Successfully!"),
    ALREADY_EXISTS("Member is already exists");

    private final String value;
}
