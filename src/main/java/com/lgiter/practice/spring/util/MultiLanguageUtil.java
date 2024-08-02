package com.lgiter.practice.spring.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: lixiaolong
 * Date: 2024/1/25
 * Desc:
 */
public class MultiLanguageUtil {

    public static HttpServletRequest getHttpServletRequest(){
        RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
        if (requestAttributes != null){
            Object o = requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
            if (o != null && o instanceof HttpServletRequest){
                HttpServletRequest request = (HttpServletRequest) o;
                return request;
            }
        }
        return null;
    }

    public static String getLanguageByStandardHeader() {
        HttpServletRequest request = getHttpServletRequest();
        if (request != null){
            String header = request.getHeader("Accept-Language");
            return header;
        }
        return null;
    }

}
