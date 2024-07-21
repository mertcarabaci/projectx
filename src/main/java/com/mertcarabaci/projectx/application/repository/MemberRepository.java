package com.mertcarabaci.projectx.application.repository;

import com.mertcarabaci.projectx.domain.entity.AccountSummary;
import com.mertcarabaci.projectx.domain.entity.MemberInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberInfo, Long> {

    @Query(value = "SELECT m.accountId FROM MemberInfo AS m " +
            "WHERE m.email=:email")
    Optional<String> findAccountIdByEmail(@Param("email") String email);

    Boolean existsByEmailOrPhone(String email, String phone);
}
