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
public class HomeController {
	
	@Autowired
	private MessageService service;
	
	@GetMapping(value="/home")
    public String getGreetings(@ModelAttribute("newMessage")MessageForm newMessage, Model model) {
    	model.addAttribute("greetings", service.getMessageList());
    	return "home";
    }
	
	
	@PostMapping(value="/home")
    public String postGreetings(@ModelAttribute("newMessage")MessageForm inputParam, Model model) {
		service.getMessageList().add(inputParam.getText());
    	model.addAttribute("greetings", service.getMessageList());
    	inputParam.setText("");
    	return "home";
    }

}
