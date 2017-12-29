package cn.lb.wxr.platform.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wisteria.core.constant.CodeConsts;
import org.wisteria.web.APIResult;
import org.wisteria.web.mvc.model.PageResult;

import cn.lb.wxr.platform.model.PlatformApp;
import cn.lb.wxr.platform.service.IAppService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@RequestMapping("wxr/app/")
public class AppController {

	@Resource
	private IAppService appService;
	
	@ApiOperation("新增微信公众号应用信息")
	@RequestMapping(value = "add", method = RequestMethod.POST)
	@ResponseBody
	public APIResult<Boolean> add(
			@ApiParam(name = "name", value = "app名称", required = true)
			@RequestParam(value = "name")
			String name,
			@ApiParam(name = "appID", value = "微信公众号appID", required = true)
			@RequestParam(value = "appID")
			String appID,
			@ApiParam(name = "appsecret", value = "微信公众号appsecret", required = true)
			@RequestParam(value = "appsecret")
			String appsecret,
			@ApiParam(name = "description", value = "app描述", required = true)
			@RequestParam(value = "description")
			String description) {
		PlatformApp record = new PlatformApp();
		record.setName(name);
		record.setAppID(appID);
		record.setAppsecret(appsecret);
		record.setDescription(description);
		record.setActivated(CodeConsts.UNACTIVATED);
		return APIResult.success(appService.add(record));
	}
	
	@ApiOperation("分页查询微信公众号应用信息")
	@RequestMapping(value = "list", method = RequestMethod.GET)
	@ResponseBody
	public APIResult<PageResult<PlatformApp>> query(
			@ApiParam(name = "name", value = "app名称")
			@RequestParam(value = "name", required = false)
			String name,
			
			@ApiParam(name = "appID", value = "微信公众号appID")
			@RequestParam(value = "appID", required = false)
			String appID,
			
			@ApiParam(name = "pageNumber", value = "页号, 从1开始, 默认为1")
            @RequestParam(value = "pageNumber", required = false, defaultValue = "1") int pageNum,

            @ApiParam(name = "pageSize", value = "每页行数, 默认为10")
            @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize
	) {
		PlatformApp record = new PlatformApp();
		record.setName(name);
		record.setAppID(appID);
		return APIResult.success(appService.queryByPage(record, pageNum, pageSize));
	}
	
}
