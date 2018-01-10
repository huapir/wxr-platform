<%@ page pageEncoding="UTF-8"%>
<%@ include file="/view/common/tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
  <%@ include file="/view/common/meta.jsp"%>
  <title>APP管理</title>
</head>
<body class="layui-layout-body">
<div class="layui-layout">
    <div class="site-block">
	    <form class="layui-form light-form" id="queryForm">
	        <div class="l-f-item">
	            <div class="layui-inline">
	                <label class="layui-form-label l-f-label">关键字</label>
		            <div class="layui-input-block l-f-inupt-block">
		            <input type="text" name="keyword" id="keyword" class="layui-input l-f-inupt l-f-inupt-w3"
						   placeholder="请输入应用名称、AppID">
		            </div>
	            </div>
	            <div class="layui-inline">
	            	<div style="padding-left:20px;">
		            	<button type="button" class="layui-btn layui-btn-sm layui-btn-normal" id="query">查询</button>
		            	<button type="button" class="layui-btn layui-btn-sm layui-btn-primary" id="reset">清空</button>
	            	</div>
	            </div>
	        </div>
	    </form>
    </div>
    <div>
        <div class="grid-toolbar">
        	<span id="selectedText" style="margin-right:10px;font-size:12px;display:none;"><span>选中<span id="selectedNum" style="margin:0 4px;font-size:14px;">1</span>条</span><a id="selectedClean" style="margin-left:8px;color:#01AAED;">清除</a></span>
            <button type="button" class="layui-btn layui-btn-sm layui-btn-danger" code="remove" id="remove">删除</button>
	        <button type="button" class="layui-btn layui-btn-sm layui-btn-normal" code="export" id="export">导出</button>
	        <button type="button" class="layui-btn layui-btn-sm layui-btn-normal" code="add" id="add">新增</button>
        </div>
        <div id="datagrid" lay-filter="datagrid"></div>
    </div>
</div>
<%@ include file="/view/common/script.jsp"%>
<script src="${ctx}/static/wxr/platform/app/appmng.js"></script>
</body>
</html>
