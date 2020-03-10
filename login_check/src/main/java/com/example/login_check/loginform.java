package com.example.login_check;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginform {
  Logger log=LoggerFactory.getLogger(this.getClass());
  @GetMapping("/greeting")
  public String greetingForm(Model model) {
	 log.info("user hit the greeting method");
    model.addAttribute("greeting", new Greeting());
    return "greeting";
  }

  @PostMapping("/greeting")
  public String greetingSubmit(@ModelAttribute Greeting greeting) {
	 log.info("user tries to enter another form");
    return "result";
    
  }

}