package com.mertcarabaci.projectx.domain.response;

import com.mertcarabaci.projectx.domain.enumType.CreateAccountStatus;
import com.mertcarabaci.projectx.domain.enumType.SetupAccountStatus;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SetupAccountResponse {
    SetupAccountStatus status;
}
