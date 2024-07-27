package com.forj.plan.repository;

import static com.forj.plan.entity.QPlans.plans;
import static com.forj.plan.entity.QUsers.users;

import com.forj.plan.entity.Plans;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class PlansCustomRepositoryImpl implements PlansCustomRepository{

    private final JPAQueryFactory queryFactory;

    @Override
    public Plans getPlansByUserName(String userName){
        return queryFactory.selectFrom(plans)
                .innerJoin(users).on(plans.usersId.eq(users.id))
                .where(users.name.eq(userName))
                .fetchOne();
    }
}
