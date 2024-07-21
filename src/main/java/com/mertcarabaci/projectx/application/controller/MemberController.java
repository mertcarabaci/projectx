package com.mertcarabaci.projectx.application.controller;

import com.mertcarabaci.projectx.application.manager.MemberManager;
import com.mertcarabaci.projectx.domain.request.CreateMemberRequest;
import com.mertcarabaci.projectx.domain.request.SetupAccountRequest;
import com.mertcarabaci.projectx.domain.response.CreateMemberResponse;
import com.mertcarabaci.projectx.domain.response.SetupAccountResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    private final MemberManager memberManager;

    public MemberController(MemberManager memberManager) {
        this.memberManager = memberManager;
    }

    @PostMapping("v1/account")
    public CreateMemberResponse createAccount(@RequestBody CreateMemberRequest createMemberRequest) {
        return memberManager.createAccount(createMemberRequest);
    }

    @PostMapping("v1/account/{accountUid}")
    public SetupAccountResponse setupAccount(@PathVariable String accountUid, @RequestBody SetupAccountRequest setupAccountRequest) {
        return memberManager.setupAccount(accountUid, setupAccountRequest);
    }

}
