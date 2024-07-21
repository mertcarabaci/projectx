package com.mertcarabaci.projectx.application.service;

import com.mertcarabaci.projectx.application.repository.AccountSummaryRepository;
import com.mertcarabaci.projectx.application.repository.MemberRepository;
import com.mertcarabaci.projectx.domain.dto.AccountSummaryDto;
import com.mertcarabaci.projectx.domain.dto.MemberAccountDto;
import com.mertcarabaci.projectx.domain.entity.AccountSummary;
import com.mertcarabaci.projectx.domain.entity.MemberInfo;
import com.mertcarabaci.projectx.domain.enumType.AccountNotFoundErrorType;
import com.mertcarabaci.projectx.domain.exception.AccountNotFoundException;
import com.mertcarabaci.projectx.domain.exception.AlreadyExistsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final AccountSummaryRepository accountSummaryRepository;

    public MemberService(MemberRepository memberRepository, AccountSummaryRepository accountSummaryRepository) {
        this.memberRepository = memberRepository;
        this.accountSummaryRepository = accountSummaryRepository;
    }

    public String createAccount(MemberAccountDto member) {
        MemberInfo memberInfo = MemberInfo.builder()
                .email(member.getEmail())
                .phone(member.getPhone())
                .password(member.getPassword())
                .build();

        if (memberRepository.existsByEmailOrPhone(member.getEmail(), member.getPhone())) {
            throw new AlreadyExistsException();
        }

        memberRepository.save(memberInfo);
        return retrieveAccountId(member.getEmail());
    }

    public void setupAccount(AccountSummaryDto account) {
        AccountSummary accountSummary = AccountSummary.builder()
                .accountId(account.getAccountUid())
                .name(account.getName())
                .nickname(account.getNickname())
                .profilePhoto(account.getProfilePhotoUrl())
                .build();

        if (accountSummaryRepository.existsByAccountId(account.getAccountUid())) {
            throw new AlreadyExistsException();
        }

        accountSummaryRepository.save(accountSummary);
    }

    private String retrieveAccountId(String email) {
        Optional<String> accountUid = memberRepository.findAccountIdByEmail(email);

        if(accountUid.isEmpty()) {
            throw new AccountNotFoundException(email, AccountNotFoundErrorType.EMAIL);
        }
        return accountUid.get();
    }
}
