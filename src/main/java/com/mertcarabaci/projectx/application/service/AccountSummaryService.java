package com.mertcarabaci.projectx.application.service;

import com.mertcarabaci.projectx.application.repository.AccountSummaryRepository;
import com.mertcarabaci.projectx.domain.dto.AccountSummaryDto;
import com.mertcarabaci.projectx.domain.entity.AccountSummary;
import com.mertcarabaci.projectx.domain.enumType.AccountNotFoundErrorType;
import com.mertcarabaci.projectx.domain.exception.AccountNotFoundException;
import com.mertcarabaci.projectx.utils.converter.AccountSummaryDtoConverter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountSummaryService {

    private final AccountSummaryRepository accountSummaryRepository;

    public AccountSummaryService(AccountSummaryRepository accountSummaryRepository) {
        this.accountSummaryRepository = accountSummaryRepository;
    }

    public AccountSummaryDto retrieveAccountSummary(String accountUid) {
        Optional<AccountSummary> accountSummary = accountSummaryRepository.findByAccountId(accountUid);

        if (accountSummary.isEmpty()) {
            throw new AccountNotFoundException(accountUid, AccountNotFoundErrorType.ACCOUNT_ID);
        }

        return AccountSummaryDtoConverter.convert(accountSummary.get());
    }
}
