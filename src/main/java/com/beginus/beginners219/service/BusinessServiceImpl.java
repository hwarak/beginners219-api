package com.beginus.beginners219.service;
import java.util.List;

import com.beginus.beginners219.model.dao.BusinessMapper;
import com.beginus.beginners219.model.dto.BusinessInfo;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BusinessServiceImpl implements BusinessService {
    private final BusinessMapper testMapper;

    @Override
    public List<BusinessInfo> getAllDataList() {
        return testMapper.getAllDataList();
    }
}