package cn.lb.wxr.platform.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.wisteria.web.APIResult;

import cn.lb.wxr.platform.service.IAppService;

@Controller
public class AppController {

	@Resource
	private IAppService appService;
	
	public APIResult<String> add() {
		appService.add(null);
		return APIResult.success();
	}
	
}
