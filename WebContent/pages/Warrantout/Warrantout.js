Ext.onReady(function() {
	var Warrantoutclassify = "warrantout";
	var Warrantouttitle = "当前位置:业务管理》" + Warrantoutclassify;
	var Warrantoutaction = "WarrantoutAction.do";
	var Warrantoutfields = ['idwarrantout'
	        			    ,'warrantoutstore' 
	        			    ,'warrantoutgoods' 
	        			    ,'warrantoutnum' 
	        			    ,'warrantoutstatue' 
	        			    ,'warrantoutdetail' 
	        			    ,'warrantoutwho' 
	        			    ,'warrantoutinswhen' 
	        			    ,'warrantoutinswho' 
	        			    ,'warrantoutupdwhen' 
	        			    ,'warrantoutupdwho' 
	        			      ];// 全部字段
	var Warrantoutkeycolumn = [ 'idwarrantout' ];// 主键
	var Warrantoutstore = dataStore(Warrantoutfields, basePath + Warrantoutaction + "?method=selAll");// 定义Warrantoutstore
	var WarrantoutdataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'WarrantoutdataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'ID',
				id : 'Warrantoutidwarrantout',
				name : 'idwarrantout',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '仓库',
				id : 'Warrantoutwarrantoutstore',
				name : 'warrantoutstore',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '商品',
				id : 'Warrantoutwarrantoutgoods',
				name : 'warrantoutgoods',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '数量',
				id : 'Warrantoutwarrantoutnum',
				name : 'warrantoutnum',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '状态',
				id : 'Warrantoutwarrantoutstatue',
				name : 'warrantoutstatue',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '描述',
				id : 'Warrantoutwarrantoutdetail',
				name : 'warrantoutdetail',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '领货人',
				id : 'Warrantoutwarrantoutwho',
				name : 'warrantoutwho',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建时间',
				id : 'Warrantoutwarrantoutinswhen',
				name : 'warrantoutinswhen',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建人',
				id : 'Warrantoutwarrantoutinswho',
				name : 'warrantoutinswho',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '更新时间',
				id : 'Warrantoutwarrantoutupdwhen',
				name : 'warrantoutupdwhen',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '更新人',
				id : 'Warrantoutwarrantoutupdwho',
				name : 'warrantoutupdwho',
				maxLength : 100
			} ]
		}
		]
	});
	
	//var Warrantoutbbar = pagesizebar(Warrantoutstore);//定义分页
	var Warrantoutgrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Warrantouttitle,
		store : Warrantoutstore,
		//bbar : Warrantoutbbar,
	    selModel: {
	        type: 'checkboxmodel'
	    },
	    plugins: {
	         ptype: 'cellediting',
	         clicksToEdit: 1
	    },
		columns : [{xtype: 'rownumberer',width:50}, 
		{// 改
			header : 'ID',
			dataIndex : 'idwarrantout',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '仓库',
			dataIndex : 'warrantoutstore',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '商品',
			dataIndex : 'warrantoutgoods',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '数量',
			dataIndex : 'warrantoutnum',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '状态',
			dataIndex : 'warrantoutstatue',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '描述',
			dataIndex : 'warrantoutdetail',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '领货人',
			dataIndex : 'warrantoutwho',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建时间',
			dataIndex : 'warrantoutinswhen',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建人',
			dataIndex : 'warrantoutinswho',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '更新时间',
			dataIndex : 'warrantoutupdwhen',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '更新人',
			dataIndex : 'warrantoutupdwho',
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
					WarrantoutdataForm.form.reset();
					Ext.getCmp("Warrantoutidwarrantout").setEditable (true);
					createTextWindow(basePath + Warrantoutaction + "?method=insAll", "新增", WarrantoutdataForm, Warrantoutstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Warrantoutgrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Warrantoutaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Warrantoutgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					WarrantoutdataForm.form.reset();
					Ext.getCmp("Warrantoutidwarrantout").setEditable (false);
					createTextWindow(basePath + Warrantoutaction + "?method=updAll", "修改", WarrantoutdataForm, Warrantoutstore);
					WarrantoutdataForm.form.loadRecord(selections[0]);
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
	        					var selections = Warrantoutgrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Warrantoutaction + "?method=delAll",selections,Warrantoutstore,Warrantoutkeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Warrantoutaction + "?method=impAll","导入",Warrantoutstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Warrantoutaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryWarrantoutaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Warrantoutgrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Warrantoutkeycolumn.length;i++){
	        						fid += selections[0].data[Warrantoutkeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Warrantoutclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Warrantoutidwarrantout").setEditable (true);
    							createQueryWindow("筛选", WarrantoutdataForm, Warrantoutstore,Ext.getCmp("queryWarrantoutaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryWarrantoutaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							if ("" == Ext.getCmp("queryWarrantoutaction").getValue()) {
								Warrantoutstore.load({
									params : {
										json : queryjson
									}
								});
							} else {
								Warrantoutstore.load({
									params : {
										json : queryjson,
										query : Ext.getCmp("queryWarrantoutaction").getValue()
									}
								});
							}
						}
					}
				}
			}
		]
	});
	Warrantoutgrid.region = 'center';
	Warrantoutstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Warrantoutgrid ]
	});
})
