package com.beginus.beginners219.controller;
import java.util.List;

import com.beginus.beginners219.model.dto.BusinessInfo;
import com.beginus.beginners219.service.BusinessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
public class BusinessController {
    private final BusinessService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public List<BusinessInfo> test() {

        return testService.getAllDataList();
    }
}