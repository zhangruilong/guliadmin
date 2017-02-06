package com.server.pojo;

import java.sql.Date;
/**
 * scantview 实体类
 *@author ZhangRuiLong
 */
public class Scantview
{
   /**
    * 标品ID,主键
    */
   private String scantid; 
   /**
    * 编码
    */
   private String scantcode;   
   /**
    * 名称
    */
   private String scantname;   
   /**
    * 描述
    */
   private String scantdetail;   
   /**
    * 规格
    */
   private String scantunits;   
   /**
    * 小类ID
    */
   private String scantclass;   
   /**
    * 图片
    */
   private String scantimage;   
   /**
    * 品牌
    */
   private String scantbrand;   
   /**
    * 种类
    */
   private String scanttype;   
   /**
    * 状态
    */
   private String scantstatue;   
   /**
    * 大小类ID
    */
   private String goodsclassid;   
   /**
    * 编码
    */
   private String goodsclasscode;   
   /**
    * 名称
    */
   private String goodsclassname;   
   /**
    * 父类
    */
   private String goodsclassparent;   
   /**
    * 图标
    */
   private String goodsclassdetail;   
   /**
    * 状态
    */
   private String goodsclassstatue;   
   /**
    * 城市(用逗号分开)
    */
   private String goodsclasscity;   
   /**
    * 顺序
    */
   private String goodsclassorder;   
   /**
    * 经销商(用逗号分开)
    */
   private String goodsclasscompany;   
    //属性方法	    
     /**
	 *设置主键"标品ID"属性
	 *@param scantid 实体的Scantid属性
	 */
	public void setScantid(String scantid)
	{
		this.scantid = scantid;
	}
	
	/**
	 *获取主键"标品ID"属性
	 */
	public String getScantid()
	{
		return this.scantid;
	}

	/**
	 *设置"编码"属性
	 *@param scantcode 实体的Scantcode属性
	 */
	public void setScantcode(String scantcode)
	{
		this.scantcode = scantcode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getScantcode()
	{
		return this.scantcode;
	}	   

	/**
	 *设置"名称"属性
	 *@param scantname 实体的Scantname属性
	 */
	public void setScantname(String scantname)
	{
		this.scantname = scantname;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getScantname()
	{
		return this.scantname;
	}	   

	/**
	 *设置"描述"属性
	 *@param scantdetail 实体的Scantdetail属性
	 */
	public void setScantdetail(String scantdetail)
	{
		this.scantdetail = scantdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getScantdetail()
	{
		return this.scantdetail;
	}	   

	/**
	 *设置"规格"属性
	 *@param scantunits 实体的Scantunits属性
	 */
	public void setScantunits(String scantunits)
	{
		this.scantunits = scantunits;
	}
	
	/**
	 *获取"规格"属性
	 */
	public String getScantunits()
	{
		return this.scantunits;
	}	   

	/**
	 *设置"小类ID"属性
	 *@param scantclass 实体的Scantclass属性
	 */
	public void setScantclass(String scantclass)
	{
		this.scantclass = scantclass;
	}
	
	/**
	 *获取"小类ID"属性
	 */
	public String getScantclass()
	{
		return this.scantclass;
	}	   

	/**
	 *设置"图片"属性
	 *@param scantimage 实体的Scantimage属性
	 */
	public void setScantimage(String scantimage)
	{
		this.scantimage = scantimage;
	}
	
	/**
	 *获取"图片"属性
	 */
	public String getScantimage()
	{
		return this.scantimage;
	}	   

	/**
	 *设置"品牌"属性
	 *@param scantbrand 实体的Scantbrand属性
	 */
	public void setScantbrand(String scantbrand)
	{
		this.scantbrand = scantbrand;
	}
	
	/**
	 *获取"品牌"属性
	 */
	public String getScantbrand()
	{
		return this.scantbrand;
	}	   

	/**
	 *设置"种类"属性
	 *@param scanttype 实体的Scanttype属性
	 */
	public void setScanttype(String scanttype)
	{
		this.scanttype = scanttype;
	}
	
	/**
	 *获取"种类"属性
	 */
	public String getScanttype()
	{
		return this.scanttype;
	}	   

	/**
	 *设置"状态"属性
	 *@param scantstatue 实体的Scantstatue属性
	 */
	public void setScantstatue(String scantstatue)
	{
		this.scantstatue = scantstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getScantstatue()
	{
		return this.scantstatue;
	}	   

	/**
	 *设置"大小类ID"属性
	 *@param goodsclassid 实体的Goodsclassid属性
	 */
	public void setGoodsclassid(String goodsclassid)
	{
		this.goodsclassid = goodsclassid;
	}
	
	/**
	 *获取"大小类ID"属性
	 */
	public String getGoodsclassid()
	{
		return this.goodsclassid;
	}	   

	/**
	 *设置"编码"属性
	 *@param goodsclasscode 实体的Goodsclasscode属性
	 */
	public void setGoodsclasscode(String goodsclasscode)
	{
		this.goodsclasscode = goodsclasscode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getGoodsclasscode()
	{
		return this.goodsclasscode;
	}	   

	/**
	 *设置"名称"属性
	 *@param goodsclassname 实体的Goodsclassname属性
	 */
	public void setGoodsclassname(String goodsclassname)
	{
		this.goodsclassname = goodsclassname;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getGoodsclassname()
	{
		return this.goodsclassname;
	}	   

	/**
	 *设置"父类"属性
	 *@param goodsclassparent 实体的Goodsclassparent属性
	 */
	public void setGoodsclassparent(String goodsclassparent)
	{
		this.goodsclassparent = goodsclassparent;
	}
	
	/**
	 *获取"父类"属性
	 */
	public String getGoodsclassparent()
	{
		return this.goodsclassparent;
	}	   

	/**
	 *设置"图标"属性
	 *@param goodsclassdetail 实体的Goodsclassdetail属性
	 */
	public void setGoodsclassdetail(String goodsclassdetail)
	{
		this.goodsclassdetail = goodsclassdetail;
	}
	
	/**
	 *获取"图标"属性
	 */
	public String getGoodsclassdetail()
	{
		return this.goodsclassdetail;
	}	   

	/**
	 *设置"状态"属性
	 *@param goodsclassstatue 实体的Goodsclassstatue属性
	 */
	public void setGoodsclassstatue(String goodsclassstatue)
	{
		this.goodsclassstatue = goodsclassstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getGoodsclassstatue()
	{
		return this.goodsclassstatue;
	}	   

	/**
	 *设置"城市(用逗号分开)"属性
	 *@param goodsclasscity 实体的Goodsclasscity属性
	 */
	public void setGoodsclasscity(String goodsclasscity)
	{
		this.goodsclasscity = goodsclasscity;
	}
	
	/**
	 *获取"城市(用逗号分开)"属性
	 */
	public String getGoodsclasscity()
	{
		return this.goodsclasscity;
	}	   

	/**
	 *设置"顺序"属性
	 *@param goodsclassorder 实体的Goodsclassorder属性
	 */
	public void setGoodsclassorder(String goodsclassorder)
	{
		this.goodsclassorder = goodsclassorder;
	}
	
	/**
	 *获取"顺序"属性
	 */
	public String getGoodsclassorder()
	{
		return this.goodsclassorder;
	}	   

	/**
	 *设置"经销商(用逗号分开)"属性
	 *@param goodsclasscompany 实体的Goodsclasscompany属性
	 */
	public void setGoodsclasscompany(String goodsclasscompany)
	{
		this.goodsclasscompany = goodsclasscompany;
	}
	
	/**
	 *获取"经销商(用逗号分开)"属性
	 */
	public String getGoodsclasscompany()
	{
		return this.goodsclasscompany;
	}	   
	public Scantview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Scantview(
		String scantid
	 	,String scantcode
	 	,String scantname
	 	,String scantdetail
	 	,String scantunits
	 	,String scantclass
	 	,String scantimage
	 	,String scantbrand
	 	,String scanttype
	 	,String scantstatue
	 	,String goodsclassid
	 	,String goodsclasscode
	 	,String goodsclassname
	 	,String goodsclassparent
	 	,String goodsclassdetail
	 	,String goodsclassstatue
	 	,String goodsclasscity
	 	,String goodsclassorder
	 	,String goodsclasscompany
		 ){
		super();
		this.scantid = scantid;
	 	this.scantcode = scantcode;
	 	this.scantname = scantname;
	 	this.scantdetail = scantdetail;
	 	this.scantunits = scantunits;
	 	this.scantclass = scantclass;
	 	this.scantimage = scantimage;
	 	this.scantbrand = scantbrand;
	 	this.scanttype = scanttype;
	 	this.scantstatue = scantstatue;
	 	this.goodsclassid = goodsclassid;
	 	this.goodsclasscode = goodsclasscode;
	 	this.goodsclassname = goodsclassname;
	 	this.goodsclassparent = goodsclassparent;
	 	this.goodsclassdetail = goodsclassdetail;
	 	this.goodsclassstatue = goodsclassstatue;
	 	this.goodsclasscity = goodsclasscity;
	 	this.goodsclassorder = goodsclassorder;
	 	this.goodsclasscompany = goodsclasscompany;
	}
}

