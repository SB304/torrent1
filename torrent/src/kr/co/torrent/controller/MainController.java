package kr.co.torrent.controller;

import org.springframework.web.Controller;
import org.springframework.web.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/main.do")
	public String main(){
		return "/main";
	}
}
