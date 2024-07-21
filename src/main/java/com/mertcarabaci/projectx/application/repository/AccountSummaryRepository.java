package com.mertcarabaci.projectx.application.repository;

import com.mertcarabaci.projectx.domain.entity.AccountSummary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountSummaryRepository extends JpaRepository<AccountSummary, Long> {
    Optional<AccountSummary> findByAccountId(String accountUid);
    Boolean existsByAccountId(String accountId);
}
