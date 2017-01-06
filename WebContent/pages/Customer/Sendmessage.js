function commonSend(selections){
	Ext.Msg.prompt('请确认', '<b>提示:</b>请确认要发送当前选择的条目？', function(btn, text) {
		if (btn == 'ok') {
			var url = 'http://zapi.253.com/msg/HttpBatchSendSM';
			var mobile = '13656179712';
			for (var i = 0; i < selections.length; i++) {
				if(selections[i].data["customerphone"].length==11)
					mobile += ',' + selections[i].data["customerphone"]
			}
			$.ajax({
				url : url,
				type : "POST",
				data:{
					account: 'S2b5PQwac',
					pswd: 'Shanghaiyulian88',
					needstatus: true,
					msg: text,
					mobile: mobile
				},
				success:function(resp){
				},
				error:function(resp){
				}
			});
//			var url = 'http://www.jitmarketing.cn:10001/Geteway.ashx?request={"Action":"SendMessage","Parameters":{"Sign":"谷粒网","SMSContent":"'+text+'","MobileNO":"';
//			for (var i = 0; i < selections.length; i++) {
//				$.ajax({
//					url : url+selections[i].data["customerphone"]+'"}}',
//					type:"GET",
//					data:{
//					},
//					success:function(resp){
//					},
//					error:function(resp){
//					}
//				});
//			};
		}
	});
}