package cn.lb.wxr.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("wxr/platform/")
public class PlatformViewController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void toIndex() {}
	
	@RequestMapping(value = "app/appmng", method = RequestMethod.GET)
	public void toAppmng() {}
}
