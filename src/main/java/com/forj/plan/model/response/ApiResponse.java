package com.forj.plan.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {

    private ApiResponseHeader header;
    private T body;

    public ApiResponse success(T body){
        return ApiResponse.builder()
                .header(ApiResponseHeader.builder()
                        .isSuccess(true)
                        .status(200)
                        .build())
                .body(body)
                .build();
    }
}
