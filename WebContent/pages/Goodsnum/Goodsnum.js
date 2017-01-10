Ext.onReady(function() {
	var Goodsnumclassify = "goodsnum";
	var Goodsnumtitle = "当前位置:业务管理》" + Goodsnumclassify;
	var Goodsnumaction = "GoodsnumAction.do";
	var Goodsnumfields = ['idgoodsnum'
	        			    ,'goodsnumgoods' 
	        			    ,'goodsnumnum' 
	        			    ,'goodsnumstore' 
	        			      ];// 全部字段
	var Goodsnumkeycolumn = [ 'idgoodsnum' ];// 主键
	var Goodsnumstore = dataStore(Goodsnumfields, basePath + Goodsnumaction + "?method=selAll");// 定义Goodsnumstore
	var GoodsnumdataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'GoodsnumdataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : 'ID',
				id : 'Goodsnumidgoodsnum',
				name : 'idgoodsnum',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '商品',
				id : 'Goodsnumgoodsnumgoods',
				name : 'goodsnumgoods',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '数量',
				id : 'Goodsnumgoodsnumnum',
				name : 'goodsnumnum',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '仓库',
				id : 'Goodsnumgoodsnumstore',
				name : 'goodsnumstore',
				maxLength : 100
			} ]
		}
		]
	});
	
	//var Goodsnumbbar = pagesizebar(Goodsnumstore);//定义分页
	var Goodsnumgrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Goodsnumtitle,
		store : Goodsnumstore,
		//bbar : Goodsnumbbar,
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
			dataIndex : 'idgoodsnum',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '商品',
			dataIndex : 'goodsnumgoods',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '数量',
			dataIndex : 'goodsnumnum',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '仓库',
			dataIndex : 'goodsnumstore',
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
					GoodsnumdataForm.form.reset();
					Ext.getCmp("Goodsnumidgoodsnum").setEditable (true);
					createTextWindow(basePath + Goodsnumaction + "?method=insAll", "新增", GoodsnumdataForm, Goodsnumstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Goodsnumgrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Goodsnumaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Goodsnumgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					GoodsnumdataForm.form.reset();
					Ext.getCmp("Goodsnumidgoodsnum").setEditable (false);
					createTextWindow(basePath + Goodsnumaction + "?method=updAll", "修改", GoodsnumdataForm, Goodsnumstore);
					GoodsnumdataForm.form.loadRecord(selections[0]);
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
	        					var selections = Goodsnumgrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Goodsnumaction + "?method=delAll",selections,Goodsnumstore,Goodsnumkeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Goodsnumaction + "?method=impAll","导入",Goodsnumstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Goodsnumaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryGoodsnumaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Goodsnumgrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Goodsnumkeycolumn.length;i++){
	        						fid += selections[0].data[Goodsnumkeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Goodsnumclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Goodsnumidgoodsnum").setEditable (true);
    							createQueryWindow("筛选", GoodsnumdataForm, Goodsnumstore,Ext.getCmp("queryGoodsnumaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryGoodsnumaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							if ("" == Ext.getCmp("queryGoodsnumaction").getValue()) {
								Goodsnumstore.load({
									params : {
										json : queryjson
									}
								});
							} else {
								Goodsnumstore.load({
									params : {
										json : queryjson,
										query : Ext.getCmp("queryGoodsnumaction").getValue()
									}
								});
							}
						}
					}
				}
			}
		]
	});
	Goodsnumgrid.region = 'center';
	Goodsnumstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Goodsnumgrid ]
	});
})
