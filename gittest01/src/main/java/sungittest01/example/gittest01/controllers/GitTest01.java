package sungittest01.example.gittest01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/test")
@Slf4j
public class GitTest01 {
    @GetMapping("/t01")
    public String test02() {
        return "greeting01";
    }
}
