package com.server.pojo;

import java.sql.Date;
/**
 * 订单详细 实体类
 *@author ZhangRuiLong
 */
public class Orderd
{
   /**
    * 订单详细ID,主键
    */
   private String orderdid; 
   /**
    * 订单ID
    */
   private String orderdorderm;   
   /**
    * 商品编码
    */
   private String orderdcode;   
   /**
    * 商品类型
    */
   private String orderdtype;   
   /**
    * 名称
    */
   private String orderdname;   
   /**
    * 描述
    */
   private String orderddetail;   
   /**
    * 规格
    */
   private String orderdunits;   
   /**
    * 价格
    */
   private Float orderdprice;   
   /**
    * 单位
    */
   private String orderdunit;   
   /**
    * 小类
    */
   private String orderdclass;   
   /**
    * 数量
    */
   private Integer orderdnum;   
   /**
    * 下单金额
    */
   private Float orderdmoney;   
   /**
    * 实际金额
    */
   private Float orderdrightmoney;   
   /**
    * 重量
    */
   private String orderdweight;   
   /**
    * 商品id
    */
   private String orderdgoods;   
   /**
    * 订单备注
    */
   private String orderdnote;   
   /**
    * 订单商品品牌
    */
   private String orderdbrand;   
    //属性方法	    
     /**
	 *设置主键"订单详细ID"属性
	 *@param orderdid 实体的Orderdid属性
	 */
	public void setOrderdid(String orderdid)
	{
		this.orderdid = orderdid;
	}
	
	/**
	 *获取主键"订单详细ID"属性
	 */
	public String getOrderdid()
	{
		return this.orderdid;
	}

	/**
	 *设置"订单ID"属性
	 *@param orderdorderm 实体的Orderdorderm属性
	 */
	public void setOrderdorderm(String orderdorderm)
	{
		this.orderdorderm = orderdorderm;
	}
	
	/**
	 *获取"订单ID"属性
	 */
	public String getOrderdorderm()
	{
		return this.orderdorderm;
	}	   

	/**
	 *设置"商品编码"属性
	 *@param orderdcode 实体的Orderdcode属性
	 */
	public void setOrderdcode(String orderdcode)
	{
		this.orderdcode = orderdcode;
	}
	
	/**
	 *获取"商品编码"属性
	 */
	public String getOrderdcode()
	{
		return this.orderdcode;
	}	   

	/**
	 *设置"商品类型"属性
	 *@param orderdtype 实体的Orderdtype属性
	 */
	public void setOrderdtype(String orderdtype)
	{
		this.orderdtype = orderdtype;
	}
	
	/**
	 *获取"商品类型"属性
	 */
	public String getOrderdtype()
	{
		return this.orderdtype;
	}	   

	/**
	 *设置"名称"属性
	 *@param orderdname 实体的Orderdname属性
	 */
	public void setOrderdname(String orderdname)
	{
		this.orderdname = orderdname;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getOrderdname()
	{
		return this.orderdname;
	}	   

	/**
	 *设置"描述"属性
	 *@param orderddetail 实体的Orderddetail属性
	 */
	public void setOrderddetail(String orderddetail)
	{
		this.orderddetail = orderddetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getOrderddetail()
	{
		return this.orderddetail;
	}	   

	/**
	 *设置"规格"属性
	 *@param orderdunits 实体的Orderdunits属性
	 */
	public void setOrderdunits(String orderdunits)
	{
		this.orderdunits = orderdunits;
	}
	
	/**
	 *获取"规格"属性
	 */
	public String getOrderdunits()
	{
		return this.orderdunits;
	}	   

	/**
	 *设置"价格"属性
	 *@param orderdprice 实体的Orderdprice属性
	 */
	public void setOrderdprice(Float orderdprice)
	{
		this.orderdprice = orderdprice;
	}
	
	/**
	 *获取"价格"属性
	 */
	public Float getOrderdprice()
	{
		return this.orderdprice;
	}	   

	/**
	 *设置"单位"属性
	 *@param orderdunit 实体的Orderdunit属性
	 */
	public void setOrderdunit(String orderdunit)
	{
		this.orderdunit = orderdunit;
	}
	
	/**
	 *获取"单位"属性
	 */
	public String getOrderdunit()
	{
		return this.orderdunit;
	}	   

	/**
	 *设置"小类"属性
	 *@param orderdclass 实体的Orderdclass属性
	 */
	public void setOrderdclass(String orderdclass)
	{
		this.orderdclass = orderdclass;
	}
	
	/**
	 *获取"小类"属性
	 */
	public String getOrderdclass()
	{
		return this.orderdclass;
	}	   

	/**
	 *设置"数量"属性
	 *@param orderdnum 实体的Orderdnum属性
	 */
	public void setOrderdnum(Integer orderdnum)
	{
		this.orderdnum = orderdnum;
	}
	
	/**
	 *获取"数量"属性
	 */
	public Integer getOrderdnum()
	{
		return this.orderdnum;
	}	   

	/**
	 *设置"下单金额"属性
	 *@param orderdmoney 实体的Orderdmoney属性
	 */
	public void setOrderdmoney(Float orderdmoney)
	{
		this.orderdmoney = orderdmoney;
	}
	
	/**
	 *获取"下单金额"属性
	 */
	public Float getOrderdmoney()
	{
		return this.orderdmoney;
	}	   

	/**
	 *设置"实际金额"属性
	 *@param orderdrightmoney 实体的Orderdrightmoney属性
	 */
	public void setOrderdrightmoney(Float orderdrightmoney)
	{
		this.orderdrightmoney = orderdrightmoney;
	}
	
	/**
	 *获取"实际金额"属性
	 */
	public Float getOrderdrightmoney()
	{
		return this.orderdrightmoney;
	}	   

	/**
	 *设置"重量"属性
	 *@param orderdweight 实体的Orderdweight属性
	 */
	public void setOrderdweight(String orderdweight)
	{
		this.orderdweight = orderdweight;
	}
	
	/**
	 *获取"重量"属性
	 */
	public String getOrderdweight()
	{
		return this.orderdweight;
	}	   

	/**
	 *设置"商品id"属性
	 *@param orderdgoods 实体的Orderdgoods属性
	 */
	public void setOrderdgoods(String orderdgoods)
	{
		this.orderdgoods = orderdgoods;
	}
	
	/**
	 *获取"商品id"属性
	 */
	public String getOrderdgoods()
	{
		return this.orderdgoods;
	}	   

	/**
	 *设置"订单备注"属性
	 *@param orderdnote 实体的Orderdnote属性
	 */
	public void setOrderdnote(String orderdnote)
	{
		this.orderdnote = orderdnote;
	}
	
	/**
	 *获取"订单备注"属性
	 */
	public String getOrderdnote()
	{
		return this.orderdnote;
	}	   

	/**
	 *设置"订单商品品牌"属性
	 *@param orderdbrand 实体的Orderdbrand属性
	 */
	public void setOrderdbrand(String orderdbrand)
	{
		this.orderdbrand = orderdbrand;
	}
	
	/**
	 *获取"订单商品品牌"属性
	 */
	public String getOrderdbrand()
	{
		return this.orderdbrand;
	}	   
	public Orderd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orderd(
		String orderdid
	 	,String orderdorderm
	 	,String orderdcode
	 	,String orderdtype
	 	,String orderdname
	 	,String orderddetail
	 	,String orderdunits
	 	,Float orderdprice
	 	,String orderdunit
	 	,String orderdclass
	 	,Integer orderdnum
	 	,Float orderdmoney
	 	,Float orderdrightmoney
	 	,String orderdweight
	 	,String orderdgoods
	 	,String orderdnote
	 	,String orderdbrand
		 ){
		super();
		this.orderdid = orderdid;
	 	this.orderdorderm = orderdorderm;
	 	this.orderdcode = orderdcode;
	 	this.orderdtype = orderdtype;
	 	this.orderdname = orderdname;
	 	this.orderddetail = orderddetail;
	 	this.orderdunits = orderdunits;
	 	this.orderdprice = orderdprice;
	 	this.orderdunit = orderdunit;
	 	this.orderdclass = orderdclass;
	 	this.orderdnum = orderdnum;
	 	this.orderdmoney = orderdmoney;
	 	this.orderdrightmoney = orderdrightmoney;
	 	this.orderdweight = orderdweight;
	 	this.orderdgoods = orderdgoods;
	 	this.orderdnote = orderdnote;
	 	this.orderdbrand = orderdbrand;
	}
}

