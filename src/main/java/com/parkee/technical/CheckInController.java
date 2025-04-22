package com.parkee.technical;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class CheckInController {
    
    @RequestMapping("/checkin")
    public String checkIn() {
        return "Hello, this is the check-in endpoint!";
    }
    @RequestMapping("/checkout")
    public String checkOut() {
        return "Hello, this is the check-out endpoint!";
    }
}
