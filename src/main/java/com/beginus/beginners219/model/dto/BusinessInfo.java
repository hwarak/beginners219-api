package com.beginus.beginners219.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BusinessInfo {
    private int business_id;
    private String business_title;
    private String business_address;
    private int business_category_id;
    private String business_hours_weekdays;
    private String business_hours_holiday;
    private String business_hours_notice;
    private String business_insta_url;
    private String business_blog_url;
    private String business_hompage_url;
    private String business_phone_number;
    private double business_longitude;
    private double business_latitude;

}