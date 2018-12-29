package com.fruitrepo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FruitController {

	@RequestMapping(value="/getFruits", method=RequestMethod.GET)
	public String getFruits() {
		System.out.println("_______________________________");
		System.out.println("Inside Fruit repo");
		System.out.println("_______________________________");
		return "I like mango and pineapple";
	}
}
