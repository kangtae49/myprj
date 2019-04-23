package com.kt.www.common.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kt.www.demo.model.JResVO;

public class JsonBaseController {
	@ExceptionHandler(Exception.class)
	public @ResponseBody JResVO handleException() {
		JResVO jRes = new JResVO();
		jRes.setSuccess(false);
		return jRes;
	}
}
