package com.forj.plan.service;

import com.forj.plan.entity.Plans;
import com.forj.plan.model.response.CurrentPlanResponse;
import com.forj.plan.model.response.PlanResponse;
import com.forj.plan.repository.PlansRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PlanService {

    private final PlansRepository plansRepository;

    public CurrentPlanResponse getCurrentPlan(String userName) {

        Plans plans = plansRepository.getPlansByUserName(userName);

        return CurrentPlanResponse.builder()
                .type(plans.getType())
                .build();
    }

    public List<PlanResponse> getPlans(Long userId) {

        List<Plans> plans = plansRepository.findAllByUsersId(userId);

        return plans.stream()
                .map(PlanResponse::of)
                .collect(Collectors.toList());
    }
}
