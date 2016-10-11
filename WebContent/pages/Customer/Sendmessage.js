function commonSend(selections){
	Ext.Msg.prompt('请确认', '<b>提示:</b>请确认要发送当前选择的条目？', function(btn, text) {
		if (btn == 'ok') {
			var url = 'http://www.jitmarketing.cn:10001/Geteway.ashx?request={"Action":"SendMessage","Parameters":{"Sign":"谷粒网","SMSContent":"'+text+'","MobileNO":"';
			for (var i = 0; i < selections.length; i++) {
				$.ajax({
					url : url+selections[i].data["customerphone"]+'"}}',
					type:"GET",
					data:{
					},
					success:function(resp){
					},
					error:function(resp){
					}
				});
//				Ext.Ajax.request({
////					url : url+selections[i].data["customerphone"]+'"}}',
//					url : url+'13656179712'+'"}}',
//					method : 'GET',
//					params : {
//					},
//					success : function(response) {
//						var resp = Ext.decode(response.responseText); 
//						Ext.Msg.alert('提示', resp.msg, function(){
//						});
//					},
//					failure : function(response) {
//						Ext.Msg.alert('提示', '网络出现问题，请稍后再试');
//					}
//				});
			};
		}
	});
}