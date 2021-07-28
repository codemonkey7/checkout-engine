package com.tasks.checkout.controllers;

import com.tasks.checkout.engine.ICheckoutService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckoutController {

    // Possibly need a bean for this instead
	private ICheckoutService checkoutService;

    @RequestMapping("/total")
	public String getTotal(@RequestBody String purchases) {
		calculateTotal();
		return "Hello";
	}

	private void calculateTotal() {
		checkoutService.init();
	}
    
}
