package com.op;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class SimpleInterest {
	@RequestMapping(value="/si.html" , method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	 @RequestMapping(value="/submithome.html", method=RequestMethod.POST) 
	 public ModelAndView asdf(@RequestParam("principal") int p, @RequestParam("rate") int r,@RequestParam("time") int t) 
	 {
		 int k=(p*r*t)/100;
		 ModelAndView mv = new ModelAndView("SI");
		 mv.addObject("si",k);
		 return mv;
		 }
	 
}
 