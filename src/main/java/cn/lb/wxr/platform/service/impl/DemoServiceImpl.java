package cn.lb.wxr.platform.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.lb.wxr.platform.dao.DemoMapper;
import cn.lb.wxr.platform.service.IDemoService;

@Service
public class DemoServiceImpl implements IDemoService {
	
	@Resource
	private DemoMapper demoMapper;

	public void list(Integer pageIndex, Integer pageSize) {
		demoMapper.selectList();
	}

}
