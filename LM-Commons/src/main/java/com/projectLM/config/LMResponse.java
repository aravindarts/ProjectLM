package com.projectLM.config;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class LMResponse {

    private int responseCode;
    private Object data;
    private String message;
}
