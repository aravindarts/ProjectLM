package com.projectLM.inventorycontrol.controller;


import com.projectLM.config.LMResponse;
import com.projectLM.config.MetaConfig;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductMasterController {


    @GetMapping(path = "/version")
    public LMResponse version(){
        return new LMResponse(MetaConfig.OK,"v1","Success");
    }


}
