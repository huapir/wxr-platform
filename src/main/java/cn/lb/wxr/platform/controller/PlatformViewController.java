package cn.lb.wxr.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("wxr/platform/")
public class PlatformViewController {

	@RequestMapping("app/appmng")
	public void toAppmng() {}
}
