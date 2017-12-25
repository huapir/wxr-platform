package cn.lb.wxr.platform.dao;

import org.apache.ibatis.annotations.Mapper;
import org.wisteria.web.mvc.base.BaseMapper;

import cn.lb.wxr.platform.model.PlatformApp;

@Mapper
public interface AppMapper extends BaseMapper<PlatformApp> {

}
