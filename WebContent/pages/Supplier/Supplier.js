Ext.onReady(function() {
	var Supplierclassify = "supplier";
	var Suppliertitle = "当前位置:业务管理》" + Supplierclassify;
	var Supplieraction = "SupplierAction.do";
	var Supplierfields = ['supplierid'
	        			    ,'suppliercode' 
	        			    ,'suppliername' 
	        			    ,'suppliercontact' 
	        			    ,'supplierphone' 
	        			    ,'supplieraddress' 
	        			    ,'supplierdetail' 
	        			    ,'supplierstatue' 
	        			    ,'suppliercompany' 
	        			    ,'supplierupdtime' 
	        			    ,'supplierupdor' 
	        			    ,'suppliercretime' 
	        			    ,'suppliercreor' 
	        			      ];// 全部字段
	var Supplierkeycolumn = [ 'supplierid' ];// 主键
	var Supplierstore = dataStore(Supplierfields, basePath + Supplieraction + "?method=selAll");// 定义Supplierstore
	var SupplierdataForm = Ext.create('Ext.form.Panel', {// 定义新增和修改的FormPanel
		id:'SupplierdataForm',
		labelAlign : 'right',
		frame : true,
		layout : 'column',
		items : [ {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '供货商ID',
				id : 'Suppliersupplierid',
				name : 'supplierid',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '编码',
				id : 'Suppliersuppliercode',
				name : 'suppliercode',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '名称',
				id : 'Suppliersuppliername',
				name : 'suppliername',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '联系人',
				id : 'Suppliersuppliercontact',
				name : 'suppliercontact',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '联系电话',
				id : 'Suppliersupplierphone',
				name : 'supplierphone',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '地址',
				id : 'Suppliersupplieraddress',
				name : 'supplieraddress',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '描述',
				id : 'Suppliersupplierdetail',
				name : 'supplierdetail',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '状态',
				id : 'Suppliersupplierstatue',
				name : 'supplierstatue',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '经销商ID',
				id : 'Suppliersuppliercompany',
				name : 'suppliercompany',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '修改时间',
				id : 'Suppliersupplierupdtime',
				name : 'supplierupdtime',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '修改人',
				id : 'Suppliersupplierupdor',
				name : 'supplierupdor',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建时间',
				id : 'Suppliersuppliercretime',
				name : 'suppliercretime',
				maxLength : 100
			} ]
		}
		, {
			columnWidth : 1,
			layout : 'form',
			items : [ {
				xtype : 'textfield',
				fieldLabel : '创建人',
				id : 'Suppliersuppliercreor',
				name : 'suppliercreor',
				maxLength : 100
			} ]
		}
		]
	});
	
	//var Supplierbbar = pagesizebar(Supplierstore);//定义分页
	var Suppliergrid =  Ext.create('Ext.grid.Panel', {
		height : document.documentElement.clientHeight - 4,
		width : '100%',
		//title : Suppliertitle,
		store : Supplierstore,
		//bbar : Supplierbbar,
	    selModel: {
	        type: 'checkboxmodel'
	    },
	    plugins: {
	         ptype: 'cellediting',
	         clicksToEdit: 1
	    },
		columns : [{xtype: 'rownumberer',width:50}, 
		{// 改
			header : '供货商ID',
			dataIndex : 'supplierid',
			sortable : true, 
			editor: {
                xtype: 'textfield',
                editable: false
            }
		}
		, {
			header : '编码',
			dataIndex : 'suppliercode',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '名称',
			dataIndex : 'suppliername',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '联系人',
			dataIndex : 'suppliercontact',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '联系电话',
			dataIndex : 'supplierphone',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '地址',
			dataIndex : 'supplieraddress',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '描述',
			dataIndex : 'supplierdetail',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '状态',
			dataIndex : 'supplierstatue',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '经销商ID',
			dataIndex : 'suppliercompany',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '修改时间',
			dataIndex : 'supplierupdtime',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '修改人',
			dataIndex : 'supplierupdor',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建时间',
			dataIndex : 'suppliercretime',
			sortable : true,  
			editor: {
                xtype: 'textfield'
            }
		}
		, {
			header : '创建人',
			dataIndex : 'suppliercreor',
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
					SupplierdataForm.form.reset();
					Ext.getCmp("Suppliersupplierid").setEditable (true);
					createTextWindow(basePath + Supplieraction + "?method=insAll", "新增", SupplierdataForm, Supplierstore);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "保存",
				iconCls : 'ok',
				handler : function() {
					var selections = Suppliergrid.getSelection();
					if (Ext.isEmpty(selections)) {
						Ext.Msg.alert('提示', '请至少选择一条数据！');
						return;
					}
					commonSave(basePath + Supplieraction + "?method=updAll",selections);
				}
			},'-',{
				text : Ext.os.deviceType === 'Phone' ? null : "修改",
				iconCls : 'edit',
				handler : function() {
					var selections = Suppliergrid.getSelection();
					if (selections.length != 1) {
						Ext.Msg.alert('提示', '请选择一条数据！', function() {
						});
						return;
					}
					SupplierdataForm.form.reset();
					Ext.getCmp("Suppliersupplierid").setEditable (false);
					createTextWindow(basePath + Supplieraction + "?method=updAll", "修改", SupplierdataForm, Supplierstore);
					SupplierdataForm.form.loadRecord(selections[0]);
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
	        					var selections = Suppliergrid.getSelection();
	        					if (Ext.isEmpty(selections)) {
	        						Ext.Msg.alert('提示', '请至少选择一条数据！');
	        						return;
	        					}
	        					commonDelete(basePath + Supplieraction + "?method=delAll",selections,Supplierstore,Supplierkeycolumn);
	        				}
	                    },{
	                    	text : "导入",
	        				iconCls : 'imp',
	        				handler : function() {
	        					commonImp(basePath + Supplieraction + "?method=impAll","导入",Supplierstore);
	        				}
	                    },{
	                    	text : "导出",
	        				iconCls : 'exp',
	        				handler : function() {
	        					Ext.Msg.confirm('请确认', '<b>提示:</b>请确认要导出当前数据？', function(btn, text) {
	        						if (btn == 'yes') {
	        							window.location.href = basePath + Supplieraction + "?method=expAll&json="+queryjson+"&query="+Ext.getCmp("querySupplieraction").getValue(); 
	        						}
	        					});
	        				}
	                    },{
	                    	text : "附件",
	        				iconCls : 'attach',
	        				handler : function() {
	        					var selections = Suppliergrid.getSelection();
	        					if (selections.length != 1) {
	        						Ext.Msg.alert('提示', '请选择一条数据！', function() {
	        						});
	        						return;
	        					}
	        					var fid = '';
	        					for (var i=0;i<Supplierkeycolumn.length;i++){
	        						fid += selections[0].data[Supplierkeycolumn[i]] + ","
	        					}
	        					commonAttach(fid, Supplierclassify);
	        				}
	                    },{
	        				text : "筛选",
    						iconCls : 'select',
    						handler : function() {
    							Ext.getCmp("Suppliersupplierid").setEditable (true);
    							createQueryWindow("筛选", SupplierdataForm, Supplierstore,Ext.getCmp("querySupplieraction").getValue());
    						}
    					}]
	                }
	            }
			},'->',{
				xtype : 'textfield',
				id : 'querySupplieraction',
				name : 'query',
				emptyText : '模糊匹配',
				width : 100,
				enableKeyEvents : true,
				listeners : {
					specialkey : function(field, e) {
						if (e.getKey() == Ext.EventObject.ENTER) {
							if ("" == Ext.getCmp("querySupplieraction").getValue()) {
								Supplierstore.load({
									params : {
										json : queryjson
									}
								});
							} else {
								Supplierstore.load({
									params : {
										json : queryjson,
										query : Ext.getCmp("querySupplieraction").getValue()
									}
								});
							}
						}
					}
				}
			}
		]
	});
	Suppliergrid.region = 'center';
	Supplierstore.load();//加载数据
	var win = new Ext.Viewport({//只能有一个viewport
		resizable : true,
		layout : 'border',
		bodyStyle : 'padding:0px;',
		items : [ Suppliergrid ]
	});
})
