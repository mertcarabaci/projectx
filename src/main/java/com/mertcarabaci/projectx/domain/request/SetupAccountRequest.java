package com.mertcarabaci.projectx.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SetupAccountRequest {
    String nickname;
    String name;
    String profilePhotoUrl;
}
