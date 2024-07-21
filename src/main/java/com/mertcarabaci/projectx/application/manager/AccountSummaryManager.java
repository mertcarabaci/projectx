package com.mertcarabaci.projectx.application.manager;

import com.mertcarabaci.projectx.application.service.AccountSummaryService;
import com.mertcarabaci.projectx.domain.dto.AccountSummaryDto;
import com.mertcarabaci.projectx.domain.response.AccountSummaryResponse;
import org.springframework.stereotype.Service;

@Service
public class AccountSummaryManager {

    private final AccountSummaryService accountSummaryService;

    public AccountSummaryManager(AccountSummaryService accountSummaryService) {
        this.accountSummaryService = accountSummaryService;
    }

    public AccountSummaryResponse retrieveAccountSummary(String accountUid) {
        AccountSummaryDto accountSummaryDto = accountSummaryService.retrieveAccountSummary(accountUid);

        return AccountSummaryResponse.builder()
                .accountSummary(accountSummaryDto).build();
    }
}
