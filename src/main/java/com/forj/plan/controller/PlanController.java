package com.forj.plan.controller;


import com.forj.plan.model.response.ApiResponse;
import com.forj.plan.model.response.CurrentPlanResponse;
import com.forj.plan.model.response.PlanResponse;
import com.forj.plan.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/plans")
@RestController
public class PlanController {

    private final PlanService planService;

    @GetMapping("/current")
    public ApiResponse<CurrentPlanResponse> getCurrentPlan(@RequestParam("memberName") String memberName){
        CurrentPlanResponse response = planService.getCurrentPlan(memberName);
        return new ApiResponse<>().success(response);
    }

    @GetMapping("/planId/{planId}")
    public ApiResponse<PlanResponse> getPlans(@PathVariable(name = "planId") Long planId) {
        return new ApiResponse<>().success(planService.getPlans(planId));
    }

}
