package com.softline.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softline.domain.Member;

/**
 * @author softlinecode@gmail.com
 */
@Controller
@RequestMapping("/member")
public class SingInController {
	@RequestMapping(value = "/singin", method = RequestMethod.GET)
	public String singin(ModelMap model) {
		model.addAttribute("message", "Sing In");
		Member member = new Member();
		model.addAttribute("blocked", member.blocked());
		return "singin";
	}
}
