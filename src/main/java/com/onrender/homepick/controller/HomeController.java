
package com.onrender.homepick.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// shift + alt + o : import 정리
@RestController
public class HomeController {

    // 브라우저 화면에 "Hello World" 텍스트 그대로 출력
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}