package com.mertcarabaci.projectx.application.manager;

import com.mertcarabaci.projectx.application.service.MemberService;
import com.mertcarabaci.projectx.domain.dto.AccountSummaryDto;
import com.mertcarabaci.projectx.domain.dto.MemberAccountDto;
import com.mertcarabaci.projectx.domain.enumType.CreateAccountStatus;
import com.mertcarabaci.projectx.domain.enumType.SetupAccountStatus;
import com.mertcarabaci.projectx.domain.exception.AlreadyExistsException;
import com.mertcarabaci.projectx.domain.request.CreateMemberRequest;
import com.mertcarabaci.projectx.domain.request.SetupAccountRequest;
import com.mertcarabaci.projectx.domain.response.CreateMemberResponse;
import com.mertcarabaci.projectx.domain.response.SetupAccountResponse;
import com.mertcarabaci.projectx.utils.converter.AccountSummaryDtoConverter;
import com.mertcarabaci.projectx.utils.converter.MemberAccountDtoConverter;
import org.springframework.stereotype.Service;

@Service
public class MemberManager {

    private final MemberService memberService;

    public MemberManager(MemberService memberService) {
        this.memberService = memberService;
    }

    public CreateMemberResponse createAccount(CreateMemberRequest memberRequest) {
        MemberAccountDto member = MemberAccountDtoConverter.convert(memberRequest);
        try {
            String accountUid = memberService.createAccount(member);
            return CreateMemberResponse.builder()
                    .accountUid(accountUid)
                    .status(CreateAccountStatus.CREATED)
                    .build();
        } catch (AlreadyExistsException e) {
            return CreateMemberResponse.builder()
                    .status(CreateAccountStatus.ALREADY_EXISTS)
                    .build();
        }
    }

    public SetupAccountResponse setupAccount(String accountUid, SetupAccountRequest setupAccountRequest) {
        AccountSummaryDto member = AccountSummaryDtoConverter.convert(accountUid, setupAccountRequest);

        try {
            memberService.setupAccount(member);
            return SetupAccountResponse.builder()
                    .status(SetupAccountStatus.CREATED)
                    .build();
        } catch (AlreadyExistsException e) {
            return SetupAccountResponse.builder()
                    .status(SetupAccountStatus.NICKNAME_USED)
                    .build();
        }

    }
}
