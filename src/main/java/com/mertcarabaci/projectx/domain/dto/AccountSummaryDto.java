package com.mertcarabaci.projectx.domain.dto;

import com.mertcarabaci.projectx.utils.common.NoNullList;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountSummaryDto {

    String accountUid;
    String name;
    String nickname;
    String profilePhotoUrl;
    NoNullList<String> pinUrls;
}
