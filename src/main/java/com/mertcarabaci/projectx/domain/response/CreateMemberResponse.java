package com.mertcarabaci.projectx.domain.response;

import com.mertcarabaci.projectx.domain.enumType.CreateAccountStatus;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateMemberResponse {
    String accountUid;
    CreateAccountStatus status;
}
