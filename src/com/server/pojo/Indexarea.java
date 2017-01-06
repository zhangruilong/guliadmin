package com.server.pojo;

import java.sql.Date;
/**
 * 微信首页区表 实体类
 *@author ZhangRuiLong
 */
public class Indexarea
{
   /**
    * id,主键
    */
   private String indexareaid; 
   /**
    * 编码
    */
   private String indexareacode;   
   /**
    * 名称
    */
   private String indexareaname;   
   /**
    * 描述
    */
   private String indexareadetail;   
   /**
    * 状态
    */
   private String indexareastatue;   
   /**
    * 供应商id
    */
   private String indexareacompany;   
   /**
    * 顺序
    */
   private String indexareaorder;   
   /**
    * 图片
    */
   private String indexareaimage;   
   /**
    * 路径
    */
   private String indexareaurl;   
    //属性方法	    
     /**
	 *设置主键"id"属性
	 *@param indexareaid 实体的Indexareaid属性
	 */
	public void setIndexareaid(String indexareaid)
	{
		this.indexareaid = indexareaid;
	}
	
	/**
	 *获取主键"id"属性
	 */
	public String getIndexareaid()
	{
		return this.indexareaid;
	}

	/**
	 *设置"编码"属性
	 *@param indexareacode 实体的Indexareacode属性
	 */
	public void setIndexareacode(String indexareacode)
	{
		this.indexareacode = indexareacode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getIndexareacode()
	{
		return this.indexareacode;
	}	   

	/**
	 *设置"名称"属性
	 *@param indexareaname 实体的Indexareaname属性
	 */
	public void setIndexareaname(String indexareaname)
	{
		this.indexareaname = indexareaname;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getIndexareaname()
	{
		return this.indexareaname;
	}	   

	/**
	 *设置"描述"属性
	 *@param indexareadetail 实体的Indexareadetail属性
	 */
	public void setIndexareadetail(String indexareadetail)
	{
		this.indexareadetail = indexareadetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getIndexareadetail()
	{
		return this.indexareadetail;
	}	   

	/**
	 *设置"状态"属性
	 *@param indexareastatue 实体的Indexareastatue属性
	 */
	public void setIndexareastatue(String indexareastatue)
	{
		this.indexareastatue = indexareastatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getIndexareastatue()
	{
		return this.indexareastatue;
	}	   

	/**
	 *设置"供应商id"属性
	 *@param indexareacompany 实体的Indexareacompany属性
	 */
	public void setIndexareacompany(String indexareacompany)
	{
		this.indexareacompany = indexareacompany;
	}
	
	/**
	 *获取"供应商id"属性
	 */
	public String getIndexareacompany()
	{
		return this.indexareacompany;
	}	   

	/**
	 *设置"顺序"属性
	 *@param indexareaorder 实体的Indexareaorder属性
	 */
	public void setIndexareaorder(String indexareaorder)
	{
		this.indexareaorder = indexareaorder;
	}
	
	/**
	 *获取"顺序"属性
	 */
	public String getIndexareaorder()
	{
		return this.indexareaorder;
	}	   

	/**
	 *设置"图片"属性
	 *@param indexareaimage 实体的Indexareaimage属性
	 */
	public void setIndexareaimage(String indexareaimage)
	{
		this.indexareaimage = indexareaimage;
	}
	
	/**
	 *获取"图片"属性
	 */
	public String getIndexareaimage()
	{
		return this.indexareaimage;
	}	   

	/**
	 *设置"路径"属性
	 *@param indexareaurl 实体的Indexareaurl属性
	 */
	public void setIndexareaurl(String indexareaurl)
	{
		this.indexareaurl = indexareaurl;
	}
	
	/**
	 *获取"路径"属性
	 */
	public String getIndexareaurl()
	{
		return this.indexareaurl;
	}	   
	public Indexarea() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Indexarea(
		String indexareaid
	 	,String indexareacode
	 	,String indexareaname
	 	,String indexareadetail
	 	,String indexareastatue
	 	,String indexareacompany
	 	,String indexareaorder
	 	,String indexareaimage
	 	,String indexareaurl
		 ){
		super();
		this.indexareaid = indexareaid;
	 	this.indexareacode = indexareacode;
	 	this.indexareaname = indexareaname;
	 	this.indexareadetail = indexareadetail;
	 	this.indexareastatue = indexareastatue;
	 	this.indexareacompany = indexareacompany;
	 	this.indexareaorder = indexareaorder;
	 	this.indexareaimage = indexareaimage;
	 	this.indexareaurl = indexareaurl;
	}
}

