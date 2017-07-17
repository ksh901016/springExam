package com.example.mvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mvc.model.Member;

@Controller
public class RootController {

	private static final Logger logger = LoggerFactory.getLogger(RootController.class);
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Locale locale, Model model){
		logger.info("Welcome home! The client locale is()", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,  DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate);
		return "home";
	}
	
	@RequestMapping("/board/confirmId")
	public String confirmId(HttpServletRequest request, Model model){
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/confirmId";
	}
	
	@RequestMapping("board/checkId")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model){
		model.addAttribute("identify", id);
		model.addAttribute("password", pw);
		
		return "board/checkId";
	}
	
	// ������(Ŀ�ǵ�)��ü �̿�
	@RequestMapping("member/join")
	public String joinData(Member member){
		// @ModelAttribute�� �̿��Ͽ� Ŀ�ǵ尴ü�� �̸��� ������ �� ����
		// @ModelAttribute("info") Momber member
		return "member/join";
	}
	
	// @PathVariable ������̼��� �̿��ϸ� ���(path)�� ������ �־� �Ķ���ͷ� �̿��� �� �ִ�.
	@RequestMapping("student/{studentId}")
	public String getStudent(@PathVariable String studentId, Model model){
		
		model.addAttribute("studentId", studentId);
		return "student/studentView";
	}
	
	
	// Spring redirect 
	// if("abc".equals(id)){ return "redirect:board/checkId" };
}
