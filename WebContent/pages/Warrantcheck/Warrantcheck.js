Ext.onReady(function() {
	var Warrantcheckclassify = "warrantcheck";
	var Warrantchecktitle = "当前位置:业务管理》" + Warrantcheckclassify;
	var Warrantcheckaction = "WarrantcheckAction.do";
	var Warrantcheckfields = ['idwarrantcheck'
	        			    ,'warrantcheckstore' 
	        			    ,'warrantcheckgoods' 
	        			    ,'warrantchecknumorg' 
	        			    ,'warrantchecknumnow' 
	        			    ,'warrantcheckstatue' 
	        			    ,'warrantcheckdetail' 
	        			    ,'warrantcheckinswho' 
	        			    ,'warrantcheckinswhen' 
	        			    ,'warrantcheckupdwho' 
	        			    ,'warrantcheckupdwhen' 
	        			      ];// 全部字段
	var Warrantcheckkeycolumn = [ 'idwarrantcheck' ];// 主键
	var Warrantcheckstore = dataStore(Warrantcheckfields, basePath + Warrantcheckaction + "?method=selAll");// 定义Warrantcheckstore
	var WarrantcheckdataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'WarrantcheckdataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '',
				id : 'Warrantcheckidwarrantcheck',
				name : 'idwarrantcheck',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '仓库',
				id : 'Warrantcheckwarrantcheckstore',
				name : 'warrantcheckstore',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '商品',
				id : 'Warrantcheckwarrantcheckgoods',
				name : 'warrantcheckgoods',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '应有数量',
				id : 'Warrantcheckwarrantchecknumorg',
				name : 'warrantchecknumorg',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '现有数量',
				id : 'Warrantcheckwarrantchecknumnow',
				name : 'warrantchecknumnow',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '状态',
				id : 'Warrantcheckwarrantcheckstatue',
				name : 'warrantcheckstatue',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '描述',
				id : 'Warrantcheckwarrantcheckdetail',
				name : 'warrantcheckdetail',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建人',
				id : 'Warrantcheckwarrantcheckinswho',
				name : 'warrantcheckinswho',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建时间',
				id : 'Warrantcheckwarrantcheckinswhen',
				name : 'warrantcheckinswhen',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '更新人',
				id : 'Warrantcheckwarrantcheckupdwho',
				name : 'warrantcheckupdwho',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '更新时间',
				id : 'Warrantcheckwarrantcheckupdwhen',
				name : 'warrantcheckupdwhen',
				maxLength : 100
			} ]
		}
		]
	});
	
	//var Warrantcheckbbar = pagesizebar(Warrantcheckstore);//定义分页
	var Warrantcheckgrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Warrantchecktitle,
		store : Warrantcheckstore,
		//bbar : Warrantcheckbbar,
	    selModel: {
	        type: 'checkboxmodel'
	    },
	    plugins: {
	         ptype: 'cellediting',
	         clicksToEdit: 1
	    },
		columns : [{xtype: 'rownumberer',width:50}, 
		{// 改
			header : '',
			dataIndex : 'idwarrantcheck',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '仓库',
			dataIndex : 'warrantcheckstore',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '商品',
			dataIndex : 'warrantcheckgoods',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '应有数量',
			dataIndex : 'warrantchecknumorg',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '现有数量',
			dataIndex : 'warrantchecknumnow',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '状态',
			dataIndex : 'warrantcheckstatue',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '描述',
			dataIndex : 'warrantcheckdetail',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建人',
			dataIndex : 'warrantcheckinswho',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建时间',
			dataIndex : 'warrantcheckinswhen',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '更新人',
			dataIndex : 'warrantcheckupdwho',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '更新时间',
			dataIndex : 'warrantcheckupdwhen',
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
					WarrantcheckdataForm.form.reset();
					Ext.getCmp("Warrantcheckidwarrantcheck").setEditable (true);
					createTextWindow(basePath + Warrantcheckaction + "?method=insAll", "新增", WarrantcheckdataForm, Warrantcheckstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Warrantcheckgrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Warrantcheckaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Warrantcheckgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					WarrantcheckdataForm.form.reset();
					Ext.getCmp("Warrantcheckidwarrantcheck").setEditable (false);
					createTextWindow(basePath + Warrantcheckaction + "?method=updAll", "修改", WarrantcheckdataForm, Warrantcheckstore);
					WarrantcheckdataForm.form.loadRecord(selections[0]);
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
	        					var selections = Warrantcheckgrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Warrantcheckaction + "?method=delAll",selections,Warrantcheckstore,Warrantcheckkeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Warrantcheckaction + "?method=impAll","导入",Warrantcheckstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Warrantcheckaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryWarrantcheckaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Warrantcheckgrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Warrantcheckkeycolumn.length;i++){
	        						fid += selections[0].data[Warrantcheckkeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Warrantcheckclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Warrantcheckidwarrantcheck").setEditable (true);
    							createQueryWindow("筛选", WarrantcheckdataForm, Warrantcheckstore,Ext.getCmp("queryWarrantcheckaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryWarrantcheckaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							if ("" == Ext.getCmp("queryWarrantcheckaction").getValue()) {
								Warrantcheckstore.load({
									params : {
										json : queryjson
									}
								});
							} else {
								Warrantcheckstore.load({
									params : {
										json : queryjson,
										query : Ext.getCmp("queryWarrantcheckaction").getValue()
									}
								});
							}
						}
					}
				}
			}
		]
	});
	Warrantcheckgrid.region = 'center';
	Warrantcheckstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Warrantcheckgrid ]
	});
})
