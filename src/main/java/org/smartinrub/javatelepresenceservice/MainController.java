package org.smartinrub.javatelepresenceservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/java")
    public String hello() {
        return "Hello from Java Service";
    }

    @GetMapping("/golang")
    public String callGoService() {
        return restTemplate.getForObject("http://golang-telepresence-service/golang", String.class);
    }
}
