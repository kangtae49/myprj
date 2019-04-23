package com.kt.www.demo.web;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kt.www.common.web.BaseController;

@Controller
public class DemoController extends BaseController{
	@RequestMapping(value = "/jsonTestView", method = RequestMethod.GET)
	public String tiles(Locale locale, Model model) {
		
		return "DEFAULT.body/jsonTestView";
	}

}
