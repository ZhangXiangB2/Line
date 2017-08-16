package com.line.page;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class GamePageController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String home(HttpSession session) {
		return "index";
	}
	
}
