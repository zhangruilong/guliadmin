Ext.onReady(function() {
	var Goodsclassclassify = "大小类";
	var Goodsclasstitle = "当前位置:业务管理》" + Goodsclassclassify;
	var Goodsclassaction = "GoodsclassAction.do";
	var Goodsclassfields = ['goodsclassid'
	        			    ,'goodsclasscode' 
	        			    ,'goodsclassname' 
	        			    ,'goodsclassparent' 
	        			    ,'goodsclassdetail' 
	        			    ,'goodsclassstatue' 
	        			    ,'goodsclasscity' 
	        			    ,'goodsclassorder' 
	        			    ,'goodsclasscompany' 
	        			      ];// 全部字段
	var Goodsclasskeycolumn = [ 'goodsclassid' ];// 主键
	var Goodsclassstore = dataStore(Goodsclassfields, basePath + Goodsclassaction + "?method=selAll");// 定义Goodsclassstore
	var GoodsclassdataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'GoodsclassdataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '大小类ID',
				id : 'Goodsclassgoodsclassid',
				name : 'goodsclassid',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '编码',
				id : 'Goodsclassgoodsclasscode',
				name : 'goodsclasscode',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '名称',
				id : 'Goodsclassgoodsclassname',
				name : 'goodsclassname',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '父类',
				id : 'Goodsclassgoodsclassparent',
				name : 'goodsclassparent',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '图标',
				id : 'Goodsclassgoodsclassdetail',
				name : 'goodsclassdetail',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '状态',
				id : 'Goodsclassgoodsclassstatue',
				name : 'goodsclassstatue',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '城市(用逗号分开)',
				id : 'Goodsclassgoodsclasscity',
				name : 'goodsclasscity',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '顺序',
				id : 'Goodsclassgoodsclassorder',
				name : 'goodsclassorder',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '经销商(用逗号分开)',
				id : 'Goodsclassgoodsclasscompany',
				name : 'goodsclasscompany',
				maxLength : 100
			} ]
		}
		]
	});
	
	//var Goodsclassbbar = pagesizebar(Goodsclassstore);//定义分页
	var Goodsclassgrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Goodsclasstitle,
		store : Goodsclassstore,
		//bbar : Goodsclassbbar,
	    selModel: {
	        type: 'checkboxmodel'
	    },
	    plugins: {
	         ptype: 'cellediting',
	         clicksToEdit: 1
	    },
		columns : [{xtype: 'rownumberer',width:50}, 
		{// 改
			header : '大小类ID',
			dataIndex : 'goodsclassid',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '编码',
			dataIndex : 'goodsclasscode',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '名称',
			dataIndex : 'goodsclassname',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '父类',
			dataIndex : 'goodsclassparent',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '图标',
			dataIndex : 'goodsclassdetail',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '状态',
			dataIndex : 'goodsclassstatue',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '城市(用逗号分开)',
			dataIndex : 'goodsclasscity',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '顺序',
			dataIndex : 'goodsclassorder',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '经销商(用逗号分开)',
			dataIndex : 'goodsclasscompany',
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
					GoodsclassdataForm.form.reset();
					Ext.getCmp("Goodsclassgoodsclassid").setEditable (true);
					createTextWindow(basePath + Goodsclassaction + "?method=insAll", "新增", GoodsclassdataForm, Goodsclassstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Goodsclassgrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Goodsclassaction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Goodsclassgrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					GoodsclassdataForm.form.reset();
					Ext.getCmp("Goodsclassgoodsclassid").setEditable (false);
					createTextWindow(basePath + Goodsclassaction + "?method=updAll", "修改", GoodsclassdataForm, Goodsclassstore);
					GoodsclassdataForm.form.loadRecord(selections[0]);
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
	        					var selections = Goodsclassgrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Goodsclassaction + "?method=delAll",selections,Goodsclassstore,Goodsclasskeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Goodsclassaction + "?method=impAll","导入",Goodsclassstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Goodsclassaction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("queryGoodsclassaction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Goodsclassgrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Goodsclasskeycolumn.length;i++){
	        						fid += selections[0].data[Goodsclasskeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Goodsclassclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Goodsclassgoodsclassid").setEditable (true);
    							createQueryWindow("筛选", GoodsclassdataForm, Goodsclassstore,Ext.getCmp("queryGoodsclassaction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'queryGoodsclassaction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							if ("" == Ext.getCmp("queryGoodsclassaction").getValue()) {
								Goodsclassstore.load({
									params : {
										json : queryjson
									}
								});
							} else {
								Goodsclassstore.load({
									params : {
										json : queryjson,
										query : Ext.getCmp("queryGoodsclassaction").getValue()
									}
								});
							}
						}
					}
				}
			}
		]
	});
	Goodsclassgrid.region = 'center';
	Goodsclassstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Goodsclassgrid ]
	});
})
