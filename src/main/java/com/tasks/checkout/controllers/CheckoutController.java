package com.tasks.checkout.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckoutController {

    @RequestMapping("/total")
	public String getTotal(@RequestBody String purchases) {
		return "Hello";
	}
    
}
