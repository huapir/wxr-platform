<%@ page pageEncoding="UTF-8"%>
<%@ include file="/view/common/tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
  <%@ include file="/view/common/meta.jsp"%>
  <title>微信公众号开发平台</title>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">微信公众号开发平台</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          花皮
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">退出</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item"><a href="">APP管理</a></li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;">
    	<iframe src="${ctx }/wxr/platform/app/appmng" 
    		style="border:0px;width:100%;padding:0;margin:0;" scrolling="no">
    	</iframe>
    </div>
    
  </div>
  
</div>

<%@ include file="/view/common/script.jsp"%>
<script type="text/javascript">
$(function() {
});
</script>
</body>
</html>
