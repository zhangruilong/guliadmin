Ext.onReady(function() {
	var Warrantinclassify = "warrantin";
	var Warrantintitle = "当前位置:业务管理》" + Warrantinclassify;
	var Warrantinaction = "WarrantinAction.do";
	var Warrantinfields = ['idwarrantin'
	        			    ,'warrantinstore' 
	        			    ,'warrantinfrom' 
	        			    ,'warrantingoods' 
	        			    ,'warrantinprice' 
	        			    ,'warrantinnum' 
	        			    ,'warrantinwho' 
	        			    ,'warrantinstatue' 
	        			    ,'warrantindetail' 
	        			    ,'warrantininswhen' 
	        			    ,'warrantininswho' 
	        			    ,'warrantinupdwhen' 
	        			    ,'warrantinupdwho' 
	        			      ];// 全部字段
	var Warrantinkeycolumn = [ 'idwarrantin' ];// 主键
	var Warrantinstore = dataStore(Warrantinfields, basePath + Warrantinaction + "?method=selAll");// 定义Warrantinstore
	var WarrantindataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'WarrantindataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'ID',
				id : 'Warrantinidwarrantin',
				name : 'idwarrantin',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '仓库',
				id : 'Warrantinwarrantinstore',
				name : 'warrantinstore',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '供货单位',
				id : 'Warrantinwarrantinfrom',
				name : 'warrantinfrom',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '商品',
				id : 'Warrantinwarrantingoods',
				name : 'warrantingoods',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '进货价',
				id : 'Warrantinwarrantinprice',
				name : 'warrantinprice',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '数量',
				id : 'Warrantinwarrantinnum',
				name : 'warrantinnum',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '检验员',
				id : 'Warrantinwarrantinwho',
				name : 'warrantinwho',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '状态',
				id : 'Warrantinwarrantinstatue',
				name : 'warrantinstatue',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '备注',
				id : 'Warrantinwarrantindetail',
				name : 'warrantindetail',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建时间',
				id : 'Warrantinwarrantininswhen',
				name : 'warrantininswhen',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建人',
				id : 'Warrantinwarrantininswho',
				name : 'warrantininswho',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '更新时间',
				id : 'Warrantinwarrantinupdwhen',
				name : 'warrantinupdwhen',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '更新人',
				id : 'Warrantinwarrantinupdwho',
				name : 'warrantinupdwho',
				maxLength : 100
			} ]
		}
		]
	});
	
	//var Warrantinbbar = pagesizebar(Warrantinstore);//定义分页
	var Warrantingrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Warrantintitle,
		store : Warrantinstore,
		//bbar : Warrantinbbar,
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
			dataIndex : 'idwarrantin',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '仓库',
			dataIndex : 'warrantinstore',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '供货单位',
			dataIndex : 'warrantinfrom',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '商品',
			dataIndex : 'warrantingoods',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '进货价',
			dataIndex : 'warrantinprice',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '数量',
			dataIndex : 'warrantinnum',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '检验员',
			dataIndex : 'warrantinwho',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '状态',
			dataIndex : 'warrantinstatue',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '备注',
			dataIndex : 'warrantindetail',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建时间',
			dataIndex : 'warrantininswhen',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建人',
			dataIndex : 'warrantininswho',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '更新时间',
			dataIndex : 'warrantinupdwhen',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '更新人',
			dataIndex : 'warrantinupdwho',
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
					WarrantindataForm.form.reset();
					Ext.getCmp("Warrantinidwarrantin").setEditable (true);
					createTextWindow(basePath + Warrantinaction + "?method=insAll", "新增", WarrantindataForm, Warrantinstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Warrantingrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Warrantinaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Warrantingrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					WarrantindataForm.form.reset();
					Ext.getCmp("Warrantinidwarrantin").setEditable (false);
					createTextWindow(basePath + Warrantinaction + "?method=updAll", "修改", WarrantindataForm, Warrantinstore);
					WarrantindataForm.form.loadRecord(selections[0]);
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
	        					var selections = Warrantingrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Warrantinaction + "?method=delAll",selections,Warrantinstore,Warrantinkeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Warrantinaction + "?method=impAll","导入",Warrantinstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Warrantinaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryWarrantinaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Warrantingrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Warrantinkeycolumn.length;i++){
	        						fid += selections[0].data[Warrantinkeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Warrantinclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Warrantinidwarrantin").setEditable (true);
    							createQueryWindow("筛选", WarrantindataForm, Warrantinstore,Ext.getCmp("queryWarrantinaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryWarrantinaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							if ("" == Ext.getCmp("queryWarrantinaction").getValue()) {
								Warrantinstore.load({
									params : {
										json : queryjson
									}
								});
							} else {
								Warrantinstore.load({
									params : {
										json : queryjson,
										query : Ext.getCmp("queryWarrantinaction").getValue()
									}
								});
							}
						}
					}
				}
			}
		]
	});
	Warrantingrid.region = 'center';
	Warrantinstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Warrantingrid ]
	});
})
