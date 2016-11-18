package com.server.pojo;

import java.sql.Date;
/**
 * 促销品 实体类
 *@author ZhangRuiLong
 */
public class Timegoods
{
   /**
    * 促销品ID,主键
    */
   private String timegoodsid; 
   /**
    * 经销商ID
    */
   private String timegoodscompany;   
   /**
    * 编码
    */
   private String timegoodscode;   
   /**
    * 名称
    */
   private String timegoodsname;   
   /**
    * 描述
    */
   private String timegoodsdetail;   
   /**
    * 规格
    */
   private String timegoodsunits;   
   /**
    * 单位
    */
   private String timegoodsunit;   
   /**
    * 原价
    */
   private Float timegoodsprice;   
   /**
    * 现价
    */
   private Float timegoodsorgprice;   
   /**
    * 限量
    */
   private Integer timegoodsnum;   
   /**
    * 小类名称
    */
   private String timegoodsclass;   
   /**
    * 图片
    */
   private String timegoodsimage;   
   /**
    * 状态
    */
   private String timegoodsstatue;   
   /**
    * 创建时间
    */
   private String createtime;   
   /**
    * 创建人
    */
   private String creator;   
   /**
    * 全部限量
    */
   private Integer allnum;   
   /**
    * 剩余数量
    */
   private Integer surplusnum;   
   /**
    * 顺序
    */
   private Integer timegoodsseq;   
   /**
    * 客户范围
    */
   private String timegoodsscope;   
   /**
    * 重量
    */
   private String timegoodsweight;   
   /**
    * 品牌
    */
   private String timegoodsbrand;   
    //属性方法	    
     /**
	 *设置主键"促销品ID"属性
	 *@param timegoodsid 实体的Timegoodsid属性
	 */
	public void setTimegoodsid(String timegoodsid)
	{
		this.timegoodsid = timegoodsid;
	}
	
	/**
	 *获取主键"促销品ID"属性
	 */
	public String getTimegoodsid()
	{
		return this.timegoodsid;
	}

	/**
	 *设置"经销商ID"属性
	 *@param timegoodscompany 实体的Timegoodscompany属性
	 */
	public void setTimegoodscompany(String timegoodscompany)
	{
		this.timegoodscompany = timegoodscompany;
	}
	
	/**
	 *获取"经销商ID"属性
	 */
	public String getTimegoodscompany()
	{
		return this.timegoodscompany;
	}	   

	/**
	 *设置"编码"属性
	 *@param timegoodscode 实体的Timegoodscode属性
	 */
	public void setTimegoodscode(String timegoodscode)
	{
		this.timegoodscode = timegoodscode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getTimegoodscode()
	{
		return this.timegoodscode;
	}	   

	/**
	 *设置"名称"属性
	 *@param timegoodsname 实体的Timegoodsname属性
	 */
	public void setTimegoodsname(String timegoodsname)
	{
		this.timegoodsname = timegoodsname;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getTimegoodsname()
	{
		return this.timegoodsname;
	}	   

	/**
	 *设置"描述"属性
	 *@param timegoodsdetail 实体的Timegoodsdetail属性
	 */
	public void setTimegoodsdetail(String timegoodsdetail)
	{
		this.timegoodsdetail = timegoodsdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getTimegoodsdetail()
	{
		return this.timegoodsdetail;
	}	   

	/**
	 *设置"规格"属性
	 *@param timegoodsunits 实体的Timegoodsunits属性
	 */
	public void setTimegoodsunits(String timegoodsunits)
	{
		this.timegoodsunits = timegoodsunits;
	}
	
	/**
	 *获取"规格"属性
	 */
	public String getTimegoodsunits()
	{
		return this.timegoodsunits;
	}	   

	/**
	 *设置"单位"属性
	 *@param timegoodsunit 实体的Timegoodsunit属性
	 */
	public void setTimegoodsunit(String timegoodsunit)
	{
		this.timegoodsunit = timegoodsunit;
	}
	
	/**
	 *获取"单位"属性
	 */
	public String getTimegoodsunit()
	{
		return this.timegoodsunit;
	}	   

	/**
	 *设置"原价"属性
	 *@param timegoodsprice 实体的Timegoodsprice属性
	 */
	public void setTimegoodsprice(Float timegoodsprice)
	{
		this.timegoodsprice = timegoodsprice;
	}
	
	/**
	 *获取"原价"属性
	 */
	public Float getTimegoodsprice()
	{
		return this.timegoodsprice;
	}	   

	/**
	 *设置"现价"属性
	 *@param timegoodsorgprice 实体的Timegoodsorgprice属性
	 */
	public void setTimegoodsorgprice(Float timegoodsorgprice)
	{
		this.timegoodsorgprice = timegoodsorgprice;
	}
	
	/**
	 *获取"现价"属性
	 */
	public Float getTimegoodsorgprice()
	{
		return this.timegoodsorgprice;
	}	   

	/**
	 *设置"限量"属性
	 *@param timegoodsnum 实体的Timegoodsnum属性
	 */
	public void setTimegoodsnum(Integer timegoodsnum)
	{
		this.timegoodsnum = timegoodsnum;
	}
	
	/**
	 *获取"限量"属性
	 */
	public Integer getTimegoodsnum()
	{
		return this.timegoodsnum;
	}	   

	/**
	 *设置"小类名称"属性
	 *@param timegoodsclass 实体的Timegoodsclass属性
	 */
	public void setTimegoodsclass(String timegoodsclass)
	{
		this.timegoodsclass = timegoodsclass;
	}
	
	/**
	 *获取"小类名称"属性
	 */
	public String getTimegoodsclass()
	{
		return this.timegoodsclass;
	}	   

	/**
	 *设置"图片"属性
	 *@param timegoodsimage 实体的Timegoodsimage属性
	 */
	public void setTimegoodsimage(String timegoodsimage)
	{
		this.timegoodsimage = timegoodsimage;
	}
	
	/**
	 *获取"图片"属性
	 */
	public String getTimegoodsimage()
	{
		return this.timegoodsimage;
	}	   

	/**
	 *设置"状态"属性
	 *@param timegoodsstatue 实体的Timegoodsstatue属性
	 */
	public void setTimegoodsstatue(String timegoodsstatue)
	{
		this.timegoodsstatue = timegoodsstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getTimegoodsstatue()
	{
		return this.timegoodsstatue;
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
	 *设置"创建人"属性
	 *@param creator 实体的Creator属性
	 */
	public void setCreator(String creator)
	{
		this.creator = creator;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getCreator()
	{
		return this.creator;
	}	   

	/**
	 *设置"全部限量"属性
	 *@param allnum 实体的Allnum属性
	 */
	public void setAllnum(Integer allnum)
	{
		this.allnum = allnum;
	}
	
	/**
	 *获取"全部限量"属性
	 */
	public Integer getAllnum()
	{
		return this.allnum;
	}	   

	/**
	 *设置"剩余数量"属性
	 *@param surplusnum 实体的Surplusnum属性
	 */
	public void setSurplusnum(Integer surplusnum)
	{
		this.surplusnum = surplusnum;
	}
	
	/**
	 *获取"剩余数量"属性
	 */
	public Integer getSurplusnum()
	{
		return this.surplusnum;
	}	   

	/**
	 *设置"顺序"属性
	 *@param timegoodsseq 实体的Timegoodsseq属性
	 */
	public void setTimegoodsseq(Integer timegoodsseq)
	{
		this.timegoodsseq = timegoodsseq;
	}
	
	/**
	 *获取"顺序"属性
	 */
	public Integer getTimegoodsseq()
	{
		return this.timegoodsseq;
	}	   

	/**
	 *设置"客户范围"属性
	 *@param timegoodsscope 实体的Timegoodsscope属性
	 */
	public void setTimegoodsscope(String timegoodsscope)
	{
		this.timegoodsscope = timegoodsscope;
	}
	
	/**
	 *获取"客户范围"属性
	 */
	public String getTimegoodsscope()
	{
		return this.timegoodsscope;
	}	   

	/**
	 *设置"重量"属性
	 *@param timegoodsweight 实体的Timegoodsweight属性
	 */
	public void setTimegoodsweight(String timegoodsweight)
	{
		this.timegoodsweight = timegoodsweight;
	}
	
	/**
	 *获取"重量"属性
	 */
	public String getTimegoodsweight()
	{
		return this.timegoodsweight;
	}	   

	/**
	 *设置"品牌"属性
	 *@param timegoodsbrand 实体的Timegoodsbrand属性
	 */
	public void setTimegoodsbrand(String timegoodsbrand)
	{
		this.timegoodsbrand = timegoodsbrand;
	}
	
	/**
	 *获取"品牌"属性
	 */
	public String getTimegoodsbrand()
	{
		return this.timegoodsbrand;
	}	   
	public Timegoods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Timegoods(
		String timegoodsid
	 	,String timegoodscompany
	 	,String timegoodscode
	 	,String timegoodsname
	 	,String timegoodsdetail
	 	,String timegoodsunits
	 	,String timegoodsunit
	 	,Float timegoodsprice
	 	,Float timegoodsorgprice
	 	,Integer timegoodsnum
	 	,String timegoodsclass
	 	,String timegoodsimage
	 	,String timegoodsstatue
	 	,String createtime
	 	,String creator
	 	,Integer allnum
	 	,Integer surplusnum
	 	,Integer timegoodsseq
	 	,String timegoodsscope
	 	,String timegoodsweight
	 	,String timegoodsbrand
		 ){
		super();
		this.timegoodsid = timegoodsid;
	 	this.timegoodscompany = timegoodscompany;
	 	this.timegoodscode = timegoodscode;
	 	this.timegoodsname = timegoodsname;
	 	this.timegoodsdetail = timegoodsdetail;
	 	this.timegoodsunits = timegoodsunits;
	 	this.timegoodsunit = timegoodsunit;
	 	this.timegoodsprice = timegoodsprice;
	 	this.timegoodsorgprice = timegoodsorgprice;
	 	this.timegoodsnum = timegoodsnum;
	 	this.timegoodsclass = timegoodsclass;
	 	this.timegoodsimage = timegoodsimage;
	 	this.timegoodsstatue = timegoodsstatue;
	 	this.createtime = createtime;
	 	this.creator = creator;
	 	this.allnum = allnum;
	 	this.surplusnum = surplusnum;
	 	this.timegoodsseq = timegoodsseq;
	 	this.timegoodsscope = timegoodsscope;
	 	this.timegoodsweight = timegoodsweight;
	 	this.timegoodsbrand = timegoodsbrand;
	}
}

