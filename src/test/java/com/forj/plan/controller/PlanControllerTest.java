package com.forj.plan.controller;

import com.forj.plan.enums.PlanType;
import com.forj.plan.model.response.CurrentPlanResponse;
import com.forj.plan.model.response.DayResponse;
import com.forj.plan.model.response.PlanResponse;
import com.forj.plan.repository.PlansRepository;
import com.forj.plan.service.PlanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PlanController.class)
public class PlanControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private PlanService planService;

    @MockBean
    private PlansRepository plansRepository;

    @Test
    public void 여행중인_plan_가져온다() throws Exception {

        String memberName = "관리자";
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("memberName", memberName);

        // given
        CurrentPlanResponse response = CurrentPlanResponse.builder().type(PlanType.A).build();
        BDDMockito.given(planService.getCurrentPlan(memberName)).willReturn(response);

        // when
        mvc.perform(get("/plans/current").params(params))
                .andExpect(status().isOk())
                .andDo(print());

        // then
        BDDMockito.verify(planService).getCurrentPlan(memberName);
    }

    @Test
    public void plan_목록_가져온다() throws Exception {

        Long planId = 1L;

        // given
        PlanResponse response = PlanResponse.builder()
                .id(1L)
                .name("첫 계획")
                .type(PlanType.A)
                .isCurrent(true)
                .dayResponse(DayResponse.builder()
                        .dayDate(LocalDateTime.now())
                        .dayNum(2)
                        .id(2L)
                        .build())
                .timeResponse(List.of())
                .build();
        BDDMockito.given(planService.getPlans(planId)).willReturn(response);

        // when
        mvc.perform(get("/plans/planId/1"))
                .andExpect(status().isOk())
                .andDo(print());

        // then
        BDDMockito.verify(planService).getPlans(planId);
    }
}