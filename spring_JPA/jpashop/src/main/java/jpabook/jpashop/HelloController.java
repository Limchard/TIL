package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String hello(Model model){
		model.addAttribute("data","hello!!");
		return "hello"; // return : 화면 이름입니다.
		// return "hello.html"; .html 이 자동으로 붙는 것이다.

		// Model : model 에 실어서 view 에 넘길 수 있다.
	}
}
