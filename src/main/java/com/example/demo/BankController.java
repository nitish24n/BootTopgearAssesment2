package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {

	// Assignment 2 - Part 1
	@RequestMapping("/branches/{bank}")
	public String branches(@PathVariable(value = "bank") String bank, Model model) {
		model.addAttribute("name", bank);
		return "branches";
	}

	// Assignment 2 - Part 2
	@RequestMapping("/services/{bank}")
	public String services(@PathVariable(value = "bank") String bank, Model model) {
		model.addAttribute("name", bank);
		return "services";
	}

	// Assignment 2 - Part 2
	@RequestMapping("/health")
	public String status(Model model) {
		String status[] = {"UP","DOWN"};
		Random random = new Random();
		int index = random.nextInt(2);
		model.addAttribute("status", status[index]);
		return "status";
	}

}
