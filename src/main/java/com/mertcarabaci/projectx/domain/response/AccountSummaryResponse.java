package com.mertcarabaci.projectx.domain.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mertcarabaci.projectx.domain.dto.AccountSummaryDto;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountSummaryResponse {

    @JsonDeserialize
    AccountSummaryDto accountSummary;
}
