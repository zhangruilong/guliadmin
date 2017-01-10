Ext.onReady(function() {
	var Warrantbackclassify = "warrantback";
	var Warrantbacktitle = "当前位置:业务管理》" + Warrantbackclassify;
	var Warrantbackaction = "WarrantbackAction.do";
	var Warrantbackfields = ['idwarrantback'
	        			    ,'warrantbackstore' 
	        			    ,'warrantbackgoods' 
	        			    ,'warrantbacknum' 
	        			    ,'warrantbackwho' 
	        			    ,'warrantbackstatue' 
	        			    ,'warrantbackdetail' 
	        			    ,'warrantbackinswho' 
	        			    ,'warrantbackinswhen' 
	        			    ,'warrantbackupdwho' 
	        			    ,'warrantbackupdwhen' 
	        			      ];// 全部字段
	var Warrantbackkeycolumn = [ 'idwarrantback' ];// 主键
	var Warrantbackstore = dataStore(Warrantbackfields, basePath + Warrantbackaction + "?method=selAll");// 定义Warrantbackstore
	var WarrantbackdataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'WarrantbackdataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'ID',
				id : 'Warrantbackidwarrantback',
				name : 'idwarrantback',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '仓库',
				id : 'Warrantbackwarrantbackstore',
				name : 'warrantbackstore',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '商品',
				id : 'Warrantbackwarrantbackgoods',
				name : 'warrantbackgoods',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '数量',
				id : 'Warrantbackwarrantbacknum',
				name : 'warrantbacknum',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '退货人',
				id : 'Warrantbackwarrantbackwho',
				name : 'warrantbackwho',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '状态',
				id : 'Warrantbackwarrantbackstatue',
				name : 'warrantbackstatue',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '描述',
				id : 'Warrantbackwarrantbackdetail',
				name : 'warrantbackdetail',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建人',
				id : 'Warrantbackwarrantbackinswho',
				name : 'warrantbackinswho',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建时间',
				id : 'Warrantbackwarrantbackinswhen',
				name : 'warrantbackinswhen',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '更新时间',
				id : 'Warrantbackwarrantbackupdwho',
				name : 'warrantbackupdwho',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '更新时间',
				id : 'Warrantbackwarrantbackupdwhen',
				name : 'warrantbackupdwhen',
				maxLength : 100
			} ]
		}
		]
	});
	
	//var Warrantbackbbar = pagesizebar(Warrantbackstore);//定义分页
	var Warrantbackgrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Warrantbacktitle,
		store : Warrantbackstore,
		//bbar : Warrantbackbbar,
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
			dataIndex : 'idwarrantback',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '仓库',
			dataIndex : 'warrantbackstore',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '商品',
			dataIndex : 'warrantbackgoods',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '数量',
			dataIndex : 'warrantbacknum',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '退货人',
			dataIndex : 'warrantbackwho',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '状态',
			dataIndex : 'warrantbackstatue',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '描述',
			dataIndex : 'warrantbackdetail',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建人',
			dataIndex : 'warrantbackinswho',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建时间',
			dataIndex : 'warrantbackinswhen',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '更新时间',
			dataIndex : 'warrantbackupdwho',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '更新时间',
			dataIndex : 'warrantbackupdwhen',
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
					WarrantbackdataForm.form.reset();
					Ext.getCmp("Warrantbackidwarrantback").setEditable (true);
					createTextWindow(basePath + Warrantbackaction + "?method=insAll", "新增", WarrantbackdataForm, Warrantbackstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Warrantbackgrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Warrantbackaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Warrantbackgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					WarrantbackdataForm.form.reset();
					Ext.getCmp("Warrantbackidwarrantback").setEditable (false);
					createTextWindow(basePath + Warrantbackaction + "?method=updAll", "修改", WarrantbackdataForm, Warrantbackstore);
					WarrantbackdataForm.form.loadRecord(selections[0]);
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
	        					var selections = Warrantbackgrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Warrantbackaction + "?method=delAll",selections,Warrantbackstore,Warrantbackkeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Warrantbackaction + "?method=impAll","导入",Warrantbackstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Warrantbackaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryWarrantbackaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Warrantbackgrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Warrantbackkeycolumn.length;i++){
	        						fid += selections[0].data[Warrantbackkeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Warrantbackclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Warrantbackidwarrantback").setEditable (true);
    							createQueryWindow("筛选", WarrantbackdataForm, Warrantbackstore,Ext.getCmp("queryWarrantbackaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryWarrantbackaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							if ("" == Ext.getCmp("queryWarrantbackaction").getValue()) {
								Warrantbackstore.load({
									params : {
										json : queryjson
									}
								});
							} else {
								Warrantbackstore.load({
									params : {
										json : queryjson,
										query : Ext.getCmp("queryWarrantbackaction").getValue()
									}
								});
							}
						}
					}
				}
			}
		]
	});
	Warrantbackgrid.region = 'center';
	Warrantbackstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Warrantbackgrid ]
	});
})
