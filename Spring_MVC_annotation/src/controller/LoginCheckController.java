package controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.User;

@Controller
@Scope("prototype")
public class LoginCheckController {

	@RequestMapping(value="/loginCheck.do", method=RequestMethod.POST)
	public String loginCheck(User user, Model model){//Model可以用于将参数传递给下一个页面
		//方法1、传递一个实体对象：实体类属性名称必须跟发送过来的表单的各个表单项的name保持一致
		//方法2、可以任意传递一个HttpServletRequest、HttpServletResponse等等任意组合的参数，需要什么就添加什么
		if("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())){
			model.addAttribute("user", user.getUsername());
			return "success";
		}
		else{
			return "login";
		}
	}
}
