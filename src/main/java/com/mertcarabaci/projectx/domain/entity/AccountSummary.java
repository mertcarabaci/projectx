package com.mertcarabaci.projectx.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account_summary", schema="account")
public class AccountSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "account_id", nullable = false, unique = true)
    String accountId;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "nickname",  nullable = false, unique = true)
    String nickname;

    @Column(name = "profile_photo")
    String profilePhoto;

    @Column(name = "pin1_url")
    String pin1Url;

    @Column(name = "pin2_url")
    String pin2Url;

    @Column(name = "pin3_url")
    String pin3Url;

}
