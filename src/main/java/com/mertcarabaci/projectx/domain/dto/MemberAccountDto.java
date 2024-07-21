package com.mertcarabaci.projectx.domain.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberAccountDto {

    String email;
    String phone;
    String password;

}
