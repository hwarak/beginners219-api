package com.beginus.beginners219.controller;
import java.util.List;

import com.beginus.beginners219.model.dto.BusinessInfo;
import com.beginus.beginners219.response.DefaultRes;
import com.beginus.beginners219.response.ResponseMessage;
import com.beginus.beginners219.response.StatusCode;
import com.beginus.beginners219.service.BusinessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/business")
public class BusinessController {
    private final BusinessService businessService;

    @GetMapping
    @ResponseBody
    public ResponseEntity getBusinessList() {

        List<BusinessInfo> list = businessService.getAllDataList();

        if (list.isEmpty()) {
            // 리스트가 비어있을 때 예외처리
            return new ResponseEntity(DefaultRes.res(StatusCode.NO_CONTENT, ResponseMessage.NO_CONTENT, list), HttpStatus.OK);
        }

        return new ResponseEntity(DefaultRes.res(StatusCode.OK, ResponseMessage.SEND_LIST, list), HttpStatus.OK);
    }
}