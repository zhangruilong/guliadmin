package com.server.pojo;

import java.sql.Date;
/**
 * goodsnumview 实体类
 *@author ZhangRuiLong
 */
public class Goodsnumview
{
   /**
    * ID,主键
    */
   private String idgoodsnum; 
   /**
    * 商品ID
    */
   private String goodsnumgoods;   
   /**
    * 商品编号
    */
   private String goodscode;   
   /**
    * 商品名称
    */
   private String goodsname;   
   /**
    * 规格
    */
   private String goodsunits;   
   /**
    * 数量
    */
   private String goodsnumnum;   
   /**
    * 名称
    */
   private String storehousename;   
   /**
    * 仓库
    */
   private String goodsnumstore;   
   /**
    * 商品ID
    */
   private String goodsid;   
   /**
    * 经销商ID
    */
   private String goodscompany;   
   /**
    * 创建时间
    */
   private String createtime;   
    //属性方法	    
     /**
	 *设置主键"ID"属性
	 *@param idgoodsnum 实体的Idgoodsnum属性
	 */
	public void setIdgoodsnum(String idgoodsnum)
	{
		this.idgoodsnum = idgoodsnum;
	}
	
	/**
	 *获取主键"ID"属性
	 */
	public String getIdgoodsnum()
	{
		return this.idgoodsnum;
	}

	/**
	 *设置"商品ID"属性
	 *@param goodsnumgoods 实体的Goodsnumgoods属性
	 */
	public void setGoodsnumgoods(String goodsnumgoods)
	{
		this.goodsnumgoods = goodsnumgoods;
	}
	
	/**
	 *获取"商品ID"属性
	 */
	public String getGoodsnumgoods()
	{
		return this.goodsnumgoods;
	}	   

	/**
	 *设置"数量"属性
	 *@param goodsnumnum 实体的Goodsnumnum属性
	 */
	public void setGoodsnumnum(String goodsnumnum)
	{
		this.goodsnumnum = goodsnumnum;
	}
	
	/**
	 *获取"数量"属性
	 */
	public String getGoodsnumnum()
	{
		return this.goodsnumnum;
	}	   

	/**
	 *设置"仓库"属性
	 *@param goodsnumstore 实体的Goodsnumstore属性
	 */
	public void setGoodsnumstore(String goodsnumstore)
	{
		this.goodsnumstore = goodsnumstore;
	}
	
	/**
	 *获取"仓库"属性
	 */
	public String getGoodsnumstore()
	{
		return this.goodsnumstore;
	}	   

	/**
	 *设置"商品ID"属性
	 *@param goodsid 实体的Goodsid属性
	 */
	public void setGoodsid(String goodsid)
	{
		this.goodsid = goodsid;
	}
	
	/**
	 *获取"商品ID"属性
	 */
	public String getGoodsid()
	{
		return this.goodsid;
	}	   

	/**
	 *设置"经销商ID"属性
	 *@param goodscompany 实体的Goodscompany属性
	 */
	public void setGoodscompany(String goodscompany)
	{
		this.goodscompany = goodscompany;
	}
	
	/**
	 *获取"经销商ID"属性
	 */
	public String getGoodscompany()
	{
		return this.goodscompany;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param createtime 实体的Createtime属性
	 */
	public void setCreatetime(String createtime)
	{
		this.createtime = createtime;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getCreatetime()
	{
		return this.createtime;
	}	   

	/**
	 *设置"商品编号"属性
	 *@param goodscode 实体的Goodscode属性
	 */
	public void setGoodscode(String goodscode)
	{
		this.goodscode = goodscode;
	}
	
	/**
	 *获取"商品编号"属性
	 */
	public String getGoodscode()
	{
		return this.goodscode;
	}	   

	/**
	 *设置"商品名称"属性
	 *@param goodsname 实体的Goodsname属性
	 */
	public void setGoodsname(String goodsname)
	{
		this.goodsname = goodsname;
	}
	
	/**
	 *获取"商品名称"属性
	 */
	public String getGoodsname()
	{
		return this.goodsname;
	}	   

	/**
	 *设置"规格"属性
	 *@param goodsunits 实体的Goodsunits属性
	 */
	public void setGoodsunits(String goodsunits)
	{
		this.goodsunits = goodsunits;
	}
	
	/**
	 *获取"规格"属性
	 */
	public String getGoodsunits()
	{
		return this.goodsunits;
	}	   

	/**
	 *设置"名称"属性
	 *@param storehousename 实体的Storehousename属性
	 */
	public void setStorehousename(String storehousename)
	{
		this.storehousename = storehousename;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getStorehousename()
	{
		return this.storehousename;
	}	   
	public Goodsnumview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goodsnumview(
		String idgoodsnum
	 	,String goodsnumgoods
	 	,String goodsnumnum
	 	,String goodsnumstore
	 	,String goodsid
	 	,String goodscompany
	 	,String createtime
	 	,String goodscode
	 	,String goodsname
	 	,String goodsunits
	 	,String storehousename
		 ){
		super();
		this.idgoodsnum = idgoodsnum;
	 	this.goodsnumgoods = goodsnumgoods;
	 	this.goodsnumnum = goodsnumnum;
	 	this.goodsnumstore = goodsnumstore;
	 	this.goodsid = goodsid;
	 	this.goodscompany = goodscompany;
	 	this.createtime = createtime;
	 	this.goodscode = goodscode;
	 	this.goodsname = goodsname;
	 	this.goodsunits = goodsunits;
	 	this.storehousename = storehousename;
	}
}

