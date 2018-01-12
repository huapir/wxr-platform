package cn.lb.wxr.platform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("wxr/platform/")
public class PlatformViewController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void toIndex() {
		logger.info("index====================444");
	}
	
	@RequestMapping(value = "app/appmng", method = RequestMethod.GET)
	public void toAppmng() {}
}
