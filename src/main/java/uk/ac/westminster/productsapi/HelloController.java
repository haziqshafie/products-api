package uk.ac.westminster.productsapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello spring boot!";
    }
    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot!";
    }
    @GetMapping("/status")
    public String status(){
        return "API running - " + LocalDate.now().toString();
    }



}
