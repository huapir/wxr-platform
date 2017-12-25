package cn.lb.wxr.platform.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lb.wxr.platform.service.IDemoService;

@Controller
public class DemoController {
	
	@Resource
	private IDemoService demoService;

	/**
     * 跳转至webapp/WEB-INF/view/index.jsp页面
     * @return
     */
    @RequestMapping(value = "/wxr/demo/list",method = RequestMethod.GET)
    @ResponseBody
    public String list(Integer pageIndex, Integer pageSize){
    	demoService.list(pageIndex, pageSize);
        return "wxr/index";
    }
}
