$(function () {
	var _tableIns = loadTable('datagrid');
	
	$('#query').click(function() {
		_tableIns.reload({
			where:{
				keyword: $('#keyword').val()
			}
		});
	});
	
	$('#reset').click(function() {
		$('#keyword').val('');
	});
});

function loadTable(tableId) {
	var tableIns = ligutils.table({
		id:tableId
	    ,elem: '#datagrid'
	    ,url: ctx + '/wxr/platform/app/list' //数据接口
	    ,cols: [[ //表头
	      {type: 'checkbox', width:50}
	      ,{width:70, title:'操作', align:'center', toolbar: '#tpl_gridbar'}
	      ,{field: 'name', title: '名称', width:120}
	      ,{field: 'appID', title: 'appID', width:120}
	      ,{field: 'appsecret', title: 'appsecret', width:120}
	      ,{field: 'description', title: '描述', width:120}
	    ]]
		,done: function() {
			// 完成数据渲染
		}
	    ,toolEvent: function(obj) {
		  }
		,checkboxEvent: function(obj) {
		}
	});
	return tableIns;
}