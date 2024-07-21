package com.mertcarabaci.projectx.utils.converter;

import com.mertcarabaci.projectx.domain.dto.MemberAccountDto;
import com.mertcarabaci.projectx.domain.request.CreateMemberRequest;

public class MemberAccountDtoConverter {

    public static MemberAccountDto convert(CreateMemberRequest memberRequest) {
        MemberAccountDto memberAccountDto = new MemberAccountDto();

        memberAccountDto.setEmail(memberRequest.getEmail());
        memberAccountDto.setPhone(memberRequest.getPhone());
        memberAccountDto.setPassword(memberRequest.getPassword());

        return memberAccountDto;
    }
}