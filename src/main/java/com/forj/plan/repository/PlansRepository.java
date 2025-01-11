package com.forj.plan.repository;

import com.forj.plan.entity.Plans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlansRepository extends JpaRepository<Plans, Long>, PlansCustomRepository {
    List<Plans> findAllByMemberId(Long memberId);
}
