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
	public String loginCheck(User user, Model model){//Model�������ڽ��������ݸ���һ��ҳ��
		//����1������һ��ʵ�����ʵ�����������Ʊ�������͹����ı��ĸ��������name����һ��
		//����2���������⴫��һ��HttpServletRequest��HttpServletResponse�ȵ�������ϵĲ�������Ҫʲô�����ʲô
		if("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())){
			model.addAttribute("user", user.getUsername());
			return "success";
		}
		else{
			return "login";
		}
	}
}
