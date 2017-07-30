package controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Scope("prototype")
public class LoginController {

	@RequestMapping(method=RequestMethod.GET, value="/login.do")
	public String execute(){
		return "login";//∑µªÿ ”Õº√˚
	}
}
