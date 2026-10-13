package in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	public String abc(Model m) {
		m.addAttribute("name", "My Name is Vinay");
		return "train";
	}
	@RequestMapping("/")
	public String abc2() {
		return "index";
	}
}
