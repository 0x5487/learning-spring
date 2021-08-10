package com.example.demo.delivery.restful;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class APIExceptionHandler {

    // 這裡處理沒有被上一個方法處理的異常，通常在最後的方法處理最大的Exception，保證兜底
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> exceptionHandler(HttpServletRequest request, Exception ex) {
        Map<String, Object> error = new HashMap<>();
        error.put("status", 500);
        error.put("message", ex.toString());

        return ResponseEntity.status(500).body(error);
    }
}
