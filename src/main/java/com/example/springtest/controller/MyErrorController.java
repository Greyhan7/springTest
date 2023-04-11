package com.example.springtest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {

    // 챗GPT가 작성해줌
    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ResponseEntity<Object> error(HttpServletRequest request) {
        String message = "Unknown error";
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
        if (exception != null) {
            message = exception.getMessage();
            status = HttpStatus.BAD_REQUEST; // 예외에 따라 다른 HTTP 상태코드를 지정할 수 있습니다.
        }

        return new ResponseEntity<>(message, status);
    }


}
