package com.mertcarabaci.projectx.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "member_info", schema="account")
public class MemberInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "account_id", nullable = false, unique = true)
    String accountId;

    @Column(name = "email",  nullable = false, unique = true)
    String email;

    @Column(name = "phone", nullable = false, unique = true)
    String phone;

    @Column(name = "password", nullable = false, unique = true)
    String password;

}
