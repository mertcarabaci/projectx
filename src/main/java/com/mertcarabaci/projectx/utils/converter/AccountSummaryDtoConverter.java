package com.mertcarabaci.projectx.utils.converter;

import com.mertcarabaci.projectx.domain.dto.AccountSummaryDto;
import com.mertcarabaci.projectx.domain.entity.AccountSummary;
import com.mertcarabaci.projectx.domain.request.SetupAccountRequest;
import com.mertcarabaci.projectx.utils.common.NoNullList;

public class AccountSummaryDtoConverter {

    public static AccountSummaryDto convert(AccountSummary accountSummary) {
        AccountSummaryDto accountSummaryDto = new AccountSummaryDto();

        accountSummaryDto.setAccountUid(accountSummary.getAccountId());
        accountSummaryDto.setName(accountSummary.getName());
        accountSummaryDto.setNickname(accountSummary.getNickname());
        accountSummaryDto.setProfilePhotoUrl(accountSummary.getProfilePhoto());

        NoNullList<String> pins = new NoNullList<>();
        pins.addIfNotNull(accountSummary.getPin1Url());
        pins.addIfNotNull(accountSummary.getPin2Url());
        pins.addIfNotNull(accountSummary.getPin3Url());

        accountSummaryDto.setPinUrls(pins);

        return accountSummaryDto;
    }

    public static AccountSummaryDto convert(String accountUid, SetupAccountRequest setupAccountRequest) {
        AccountSummaryDto accountSummaryDto = new AccountSummaryDto();

        accountSummaryDto.setAccountUid(accountUid);
        accountSummaryDto.setName(setupAccountRequest.getName());
        accountSummaryDto.setNickname(setupAccountRequest.getNickname());
        accountSummaryDto.setProfilePhotoUrl(setupAccountRequest.getProfilePhotoUrl());

        return accountSummaryDto;
    }
}
