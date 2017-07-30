package controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginCheckController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		HashMap<String, Object> map = new HashMap<String, Object>();
		if("admin".equals(name) && "123456".equals(pwd)){
			map.put("user", name);
			return new ModelAndView("success", map);
		}
		return new ModelAndView("login");
	}

}
