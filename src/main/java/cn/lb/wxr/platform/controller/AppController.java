package cn.lb.wxr.platform.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wisteria.core.constant.CodeConsts;
import org.wisteria.web.APIResult;
import org.wisteria.web.mvc.model.PageResult;

import cn.lb.wxr.platform.dto.APIPageResult;
import cn.lb.wxr.platform.model.PlatformApp;
import cn.lb.wxr.platform.service.IAppService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@RequestMapping("wxr/platform/app")
public class AppController {

	@Resource
	private IAppService appService;
	
	@ApiOperation("新增微信公众号应用信息")
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public APIResult<Boolean> add(
			@ApiParam(name = "name", value = "app名称", required = true)
			@RequestParam(value = "name", required = true)
			String name,
			@ApiParam(name = "appID", value = "微信公众号appID", required = true)
			@RequestParam(value = "appID", required = true)
			String appID,
			@ApiParam(name = "appsecret", value = "微信公众号appsecret", required = true)
			@RequestParam(value = "appsecret", required = true)
			String appsecret,
			@ApiParam(name = "description", value = "app描述", required = false)
			@RequestParam(value = "description", required = false)
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
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public APIPageResult<List<PlatformApp>> list(
			@ApiParam(name = "keyword", value = "关键字")
			@RequestParam(value = "keyword", required = false)
			String keyword,
			
			@ApiParam(name = "name", value = "app名称")
			@RequestParam(value = "name", required = false)
			String name,
			
			@ApiParam(name = "appID", value = "微信公众号appID")
			@RequestParam(value = "appID", required = false)
			String appID,
			
			@ApiParam(name = "pageIndex", value = "页号, 从1开始, 默认为1")
            @RequestParam(value = "pageIndex", required = false, defaultValue = "1") int pageIndex,

            @ApiParam(name = "pageSize", value = "每页行数, 默认为10")
            @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize
	) {
		PlatformApp record = new PlatformApp();
		record.setKeyword(keyword);
		record.setName(name);
		record.setAppID(appID);
		PageResult<PlatformApp> result = appService.queryByPage(record, pageIndex, pageSize);
		return APIPageResult.success(result);
	}
	
	@ApiOperation("删除微信公众号应用信息")
	@RequestMapping(value = "/", method = RequestMethod.DELETE)
	@ResponseBody
	public APIResult<Boolean> remove(
			@ApiParam(name = "id", value = "微信公众号id，多个以逗号,分隔", required = true)
			@RequestParam(value = "id", required = true)
			Integer[] id
	) {
		return APIResult.success(appService.remove(id));
	}
	
	@ApiOperation("修改微信公众号应用信息")
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	@ResponseBody
	public APIResult<Boolean> modify(
			@ApiParam(name = "id", value = "微信公众号id", required = true)
			@RequestParam(value = "id", required = true)
			Integer id,
			@ApiParam(name = "name", value = "app名称", required = true)
			@RequestParam(value = "name", required = true)
			String name,
			@ApiParam(name = "appID", value = "微信公众号appID", required = true)
			@RequestParam(value = "appID", required = true)
			String appID,
			@ApiParam(name = "appsecret", value = "微信公众号appsecret", required = true)
			@RequestParam(value = "appsecret", required = true)
			String appsecret,
			@ApiParam(name = "activated", value = "激活状态", required = true)
			@RequestParam(value = "activated", required = true)
			Integer activated,
			@ApiParam(name = "description", value = "app描述", required = false)
			@RequestParam(value = "description", required = false)
			String description) {
		PlatformApp record = new PlatformApp();
		record.setId(id);
		record.setName(name);
		record.setAppID(appID);
		record.setAppsecret(appsecret);
		record.setDescription(description);
		record.setActivated(activated);
		return APIResult.success(appService.modify(record));
	}
	
	@ApiOperation("查询公众号应用信息")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public APIResult<PlatformApp> remove(
			@ApiParam(name = "id", value = "微信公众号id", required = true)
			@PathVariable("id")
			Integer id
	) {
		return APIResult.success(appService.query(id));
	}
	
}
