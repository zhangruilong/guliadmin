Ext.onReady(function() {
	var Collectclassify = "收藏";
	var Collecttitle = "当前位置:业务管理》" + Collectclassify;
	var Collectaction = "CollectAction.do";
	var Collectfields = ['collectid'
	        			    ,'collectgoods' 
	        			    ,'collectcustomer' 
	        			    ,'collectdetail' 
	        			    ,'createtime' 
	        			      ];// 全部字段
	var Collectkeycolumn = [ 'collectid' ];// 主键
	var Collectstore = dataStore(Collectfields, basePath + Collectaction + "?method=selAll");// 定义Collectstore
	var CollectdataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'CollectdataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '收藏ID',
				id : 'Collectcollectid',
				name : 'collectid',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '商品ID',
				id : 'Collectcollectgoods',
				name : 'collectgoods',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '客户ID',
				id : 'Collectcollectcustomer',
				name : 'collectcustomer',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '描述',
				id : 'Collectcollectdetail',
				name : 'collectdetail',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建时间',
				id : 'Collectcreatetime',
				name : 'createtime',
				maxLength : 100
			} ]
		}
		]
	});
	
	//var Collectbbar = pagesizebar(Collectstore);//定义分页
	var Collectgrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Collecttitle,
		store : Collectstore,
		//bbar : Collectbbar,
	    selModel: {
	        type: 'checkboxmodel'
	    },
	    plugins: {
	         ptype: 'cellediting',
	         clicksToEdit: 1
	    },
		columns : [{xtype: 'rownumberer',width:50}, 
		{// 改
			header : '收藏ID',
			dataIndex : 'collectid',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '商品ID',
			dataIndex : 'collectgoods',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '客户ID',
			dataIndex : 'collectcustomer',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '描述',
			dataIndex : 'collectdetail',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建时间',
			dataIndex : 'createtime',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		],
		tbar : [{
				text : Ext.os.deviceType === 'Phone' ? null : "新增",
				iconCls : 'add',
				handler : function() {
					CollectdataForm.form.reset();
					Ext.getCmp("Collectcollectid").setEditable (true);
					createTextWindow(basePath + Collectaction + "?method=insAll", "新增", CollectdataForm, Collectstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Collectgrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Collectaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Collectgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					CollectdataForm.form.reset();
					Ext.getCmp("Collectcollectid").setEditable (false);
					createTextWindow(basePath + Collectaction + "?method=updAll", "修改", CollectdataForm, Collectstore);
					CollectdataForm.form.loadRecord(selections[0]);
				}
			},'-',{
	            text: '操作',
	            menu: {
	                xtype: 'menu',
	                items: {
	                    xtype: 'buttongroup',
	                    columns: 3,
	                    items: [{
	                    	text : "删除",
	        				iconCls : 'delete',
	        				handler : function() {
	        					var selections = Collectgrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Collectaction + "?method=delAll",selections,Collectstore,Collectkeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Collectaction + "?method=impAll","导入",Collectstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Collectaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryCollectaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Collectgrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Collectkeycolumn.length;i++){
	        						fid += selections[0].data[Collectkeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Collectclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Collectcollectid").setEditable (true);
    							createQueryWindow("筛选", CollectdataForm, Collectstore,Ext.getCmp("queryCollectaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryCollectaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							if ("" == Ext.getCmp("queryCollectaction").getValue()) {
								Collectstore.load({
									params : {
										json : queryjson
									}
								});
							} else {
								Collectstore.load({
									params : {
										json : queryjson,
										query : Ext.getCmp("queryCollectaction").getValue()
									}
								});
							}
						}
					}
				}
			}
		]
	});
	Collectgrid.region = 'center';
	Collectstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Collectgrid ]
	});
})
