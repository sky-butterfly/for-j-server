package com.forj.plan.service;

import com.forj.plan.entity.Days;
import com.forj.plan.entity.Plans;
import com.forj.plan.entity.Times;
import com.forj.plan.model.response.CurrentPlanResponse;
import com.forj.plan.model.response.DayResponse;
import com.forj.plan.model.response.PlanResponse;
import com.forj.plan.model.response.TimeResponse;
import com.forj.plan.repository.PlansRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PlanService {

    private final PlansRepository plansRepository;

    public CurrentPlanResponse getCurrentPlan(String memberName) {

        Plans plan = plansRepository.getPlanByMemberName(memberName);

        return CurrentPlanResponse.builder()
                .type(plan.getType())
                .build();
    }

    public PlanResponse getPlans(Long planId) {

        Plans plans = plansRepository.findById(planId)
                .orElseThrow(() -> new NoSuchElementException("Plan Id does not exist. plan id : " + planId));

        LocalDateTime current = LocalDateTime.now();

        Days days = plans.getDays().stream()
                .filter(d -> current.getDayOfMonth() == d.getDayDate().getDayOfMonth())
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Day does not exist. plan id : " + planId));

        List<TimeResponse> timeResponses = days.getTimes().stream()
                .map(t -> TimeResponse.builder()
                        .id(t.getId())
                        .startTime(t.getStartTime())
                        .endTime(t.getEndTime())
                        .contents(t.getContents())
                        .build())
                .collect(Collectors.toList());

        return PlanResponse.builder()
                .id(plans.getId())
                .name(plans.getName())
                .isCurrent(plans.isCurrent())
                .type(plans.getType())
                .dayResponse(DayResponse.builder()
                        .id(days.getId())
                        .dayNum(days.getDayNum())
                        .dayDate(days.getDayDate())
                        .build())
                .timeResponse(timeResponses)
                .build();
    }
}
