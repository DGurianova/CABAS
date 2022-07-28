package com.cabas.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AreaToAreaCodeService {

    private static Map<String, String> area = new HashMap<>();
    private static Map<String, String> areaCode = new HashMap<>();

    static {
        area.put("Western Area", "WA");
        area.put("Eastern Area", "SA");
        area.put("Southern Area", "SA");
        area.put("Northern Area", "NA");
        areaCode.put("WA", "Western Area");
        areaCode.put("SA", "Eastern Area");
        areaCode.put("SA", "Southern Area");
        areaCode.put("NA", "Northern Area");
    }

    public static String convertToArea(String areaCodeToConvert) {
        return areaCode.get(areaCodeToConvert);
    }

    public static String convertToAreaCode(String areaToConvert) {
        return area.get(areaToConvert);
    }
}
