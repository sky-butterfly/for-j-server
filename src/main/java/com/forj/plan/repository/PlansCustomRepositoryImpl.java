package com.forj.plan.repository;

import static com.forj.plan.entity.QPlans.plans;
import static com.forj.plan.entity.QMember.member;

import com.forj.plan.entity.Plans;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class PlansCustomRepositoryImpl implements PlansCustomRepository{

    private final JPAQueryFactory queryFactory;

    @Override
    public Plans getPlanByMemberName(String memberName){
        return queryFactory.selectFrom(plans)
                .innerJoin(member).on(plans.memberId.eq(member.id).and(plans.isCurrent.isTrue()))
                .where(member.name.eq(memberName))
                .fetchOne();
    }
}
