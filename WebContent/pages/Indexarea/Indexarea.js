Ext.onReady(function() {
	var Indexareaclassify = "微信首页区表";
	var Indexareatitle = "当前位置:业务管理》" + Indexareaclassify;
	var Indexareaaction = "IndexareaAction.do";
	var Indexareafields = ['indexareaid'
	        			    ,'indexareacode' 
	        			    ,'indexareaname' 
	        			    ,'indexareadetail' 
	        			    ,'indexareastatue' 
	        			    ,'indexareacompany' 
	        			    ,'indexareaorder' 
	        			    ,'indexareaimage' 
	        			    ,'indexareaurl' 
	        			      ];// 全部字段
	var Indexareakeycolumn = [ 'indexareaid' ];// 主键
	var Indexareastore = dataStore(Indexareafields, basePath + Indexareaaction + "?method=selAll");// 定义Indexareastore
	var IndexareadataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'IndexareadataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'id',
				id : 'Indexareaindexareaid',
				name : 'indexareaid',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '编码',
				id : 'Indexareaindexareacode',
				name : 'indexareacode',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '名称',
				id : 'Indexareaindexareaname',
				name : 'indexareaname',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '描述',
				id : 'Indexareaindexareadetail',
				name : 'indexareadetail',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '状态',
				id : 'Indexareaindexareastatue',
				name : 'indexareastatue',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '供应商id',
				id : 'Indexareaindexareacompany',
				name : 'indexareacompany',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '顺序',
				id : 'Indexareaindexareaorder',
				name : 'indexareaorder',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '图片',
				id : 'Indexareaindexareaimage',
				name : 'indexareaimage',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '路径',
				id : 'Indexareaindexareaurl',
				name : 'indexareaurl',
				maxLength : 100
			} ]
		}
		]
	});
	
	//var Indexareabbar = pagesizebar(Indexareastore);//定义分页
	var Indexareagrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Indexareatitle,
		store : Indexareastore,
		//bbar : Indexareabbar,
	    selModel: {
	        type: 'checkboxmodel'
	    },
	    plugins: {
	         ptype: 'cellediting',
	         clicksToEdit: 1
	    },
		columns : [{xtype: 'rownumberer',width:50}, 
		{// 改
			header : 'id',
			dataIndex : 'indexareaid',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '编码',
			dataIndex : 'indexareacode',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '名称',
			dataIndex : 'indexareaname',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '描述',
			dataIndex : 'indexareadetail',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '状态',
			dataIndex : 'indexareastatue',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '供应商id',
			dataIndex : 'indexareacompany',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '顺序',
			dataIndex : 'indexareaorder',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '图片',
			dataIndex : 'indexareaimage',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '路径',
			dataIndex : 'indexareaurl',
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
					IndexareadataForm.form.reset();
					Ext.getCmp("Indexareaindexareaid").setEditable (true);
					createTextWindow(basePath + Indexareaaction + "?method=insAll", "新增", IndexareadataForm, Indexareastore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Indexareagrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Indexareaaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Indexareagrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					IndexareadataForm.form.reset();
					Ext.getCmp("Indexareaindexareaid").setEditable (false);
					createTextWindow(basePath + Indexareaaction + "?method=updAll", "修改", IndexareadataForm, Indexareastore);
					IndexareadataForm.form.loadRecord(selections[0]);
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
	        					var selections = Indexareagrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Indexareaaction + "?method=delAll",selections,Indexareastore,Indexareakeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Indexareaaction + "?method=impAll","导入",Indexareastore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Indexareaaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryIndexareaaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Indexareagrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Indexareakeycolumn.length;i++){
	        						fid += selections[0].data[Indexareakeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Indexareaclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Indexareaindexareaid").setEditable (true);
    							createQueryWindow("筛选", IndexareadataForm, Indexareastore,Ext.getCmp("queryIndexareaaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryIndexareaaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							if ("" == Ext.getCmp("queryIndexareaaction").getValue()) {
								Indexareastore.load({
									params : {
										json : queryjson
									}
								});
							} else {
								Indexareastore.load({
									params : {
										json : queryjson,
										query : Ext.getCmp("queryIndexareaaction").getValue()
									}
								});
							}
						}
					}
				}
			}
		]
	});
	Indexareagrid.region = 'center';
	Indexareastore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Indexareagrid ]
	});
})
