package com.forj.plan.repository;

import com.forj.plan.entity.Plans;

public interface PlansCustomRepository {

    public Plans getPlansByUserName(String userName);
}
