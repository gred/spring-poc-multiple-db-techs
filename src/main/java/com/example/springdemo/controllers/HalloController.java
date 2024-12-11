package com.example.springdemo.controllers;

import com.example.springdemo.model.User;
import com.example.springdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("hallo")
public class HalloController {
    private final UserRepository userRepository;

    @GetMapping
    public ResponseEntity<String> sayHallo(@RequestParam(value = "name", required = false) String name) {
        String reply = "Hallo Stranger!";
        User user = userRepository.findFirstUser().orElse(null);
        log.info("user {}", user);
        if(!StringUtils.isBlank(name)) {
            reply = "Hallo " + name + "!";
        }
        return ResponseEntity.ok(reply);
    }
}
