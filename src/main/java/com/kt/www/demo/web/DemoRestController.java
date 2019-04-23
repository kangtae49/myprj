package com.kt.www.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kt.www.common.web.JsonBaseController;
import com.kt.www.demo.model.DemoVO;
import com.kt.www.demo.model.JResVO;

@Controller
public class DemoRestController extends JsonBaseController {

	@RequestMapping(value = "/json", method = RequestMethod.POST)
	public ModelAndView json(@RequestBody DemoVO demo) {
		ModelAndView mav= new ModelAndView();
		//DemoVO demo = new DemoVO();
		mav.addObject("demo", demo);
		mav.setViewName("jsonView");
		return mav;
	}
	
	@RequestMapping(value = "/json2", method = RequestMethod.GET)
	public ModelAndView json2() {
		ModelAndView mav= new ModelAndView();
		DemoVO demo = new DemoVO();
		mav.addObject("demo", demo);
		mav.setViewName("jsonView");
		return mav;
	}
	
	@RequestMapping(value = "/json3", method = RequestMethod.POST)
	public @ResponseBody JResVO json3(@RequestBody DemoVO demo)  {
		JResVO jRes = new JResVO();
		if (true) {
			throw new RuntimeException();
		}
		jRes.setResult(demo);
		return jRes;
	}
}
