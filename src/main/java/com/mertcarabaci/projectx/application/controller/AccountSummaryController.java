package com.mertcarabaci.projectx.application.controller;

import com.mertcarabaci.projectx.application.manager.AccountSummaryManager;
import com.mertcarabaci.projectx.domain.response.AccountSummaryResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountSummaryController {

    private final AccountSummaryManager accountSummaryManager;

    public AccountSummaryController(AccountSummaryManager accountSummaryManager) {
        this.accountSummaryManager = accountSummaryManager;
    }

    @GetMapping("v1/account/{accountUid}/summary")
    public AccountSummaryResponse retrieveAccountSummary(@PathVariable String accountUid) {
        return accountSummaryManager.retrieveAccountSummary(accountUid);
    }
}
