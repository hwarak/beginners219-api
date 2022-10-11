package com.beginus.beginners219.model.dao;
import java.util.List;

import com.beginus.beginners219.model.dto.BusinessInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BusinessMapper {
    List<BusinessInfo> getAllDataList();
}