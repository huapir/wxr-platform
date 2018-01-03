package cn.lb.wxr.platform.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.wisteria.web.mvc.base.AbstractBaseServiceImpl;
import org.wisteria.web.mvc.base.BaseMapper;

import cn.lb.wxr.platform.dao.AppMapper;
import cn.lb.wxr.platform.model.PlatformApp;
import cn.lb.wxr.platform.service.IAppService;

@Service
public class AppServiceImpl extends AbstractBaseServiceImpl<PlatformApp, Integer> implements IAppService {

	@Resource
	private AppMapper appMapper;

	@Override
	public BaseMapper<PlatformApp, Integer> getBaseMapper() {
		return appMapper;
	}

}
