package com.example.mvc_basics001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.mvc_basics001.MessageService;
import com.example.mvc_basics001.model.MessageForm;

@Controller
public class AnimalController {
	
	@Autowired
	private MessageService service;
	
	@PostMapping(value="/animal")
	public String postAnimals(@ModelAttribute("messageForm")MessageForm inputParam, Model model) {
		service.getMessageList().add(inputParam.getText()+","+inputParam.getAdjective());
    	model.addAttribute("greetings", service.getMessageList());
    	inputParam.setText("");
    	inputParam.setAdjective("");
    	return "home";
	}
	
	@GetMapping(value="/animal")
    public String getGreetings(@ModelAttribute("messageForm")MessageForm newMessage, Model model) {
    	model.addAttribute("greetings", service.getMessageList());
    	return "home";
    }
	

}
