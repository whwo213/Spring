package com.springapp.mvc.controller;

import com.springapp.mvc.service.MemberService;
import com.springapp.mvc.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	private MemberService memberService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model,MemberVo memberVo) {
		return "hello";
	}

	@RequestMapping(value = "aaaa" , method = RequestMethod.GET)
	public String memberList(MemberVo memberVo,
							 ModelMap model){

		model.addAttribute("test","request");

		List<MemberVo> list = memberService.memberList();
		model.addAttribute("list", list);
		return "hello";
	}
}