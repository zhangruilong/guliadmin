package com.server.pojo;

import java.sql.Date;
/**
 * indexarea 实体类
 *@author ZhangRuiLong
 */
public class Indexarea
{
   /**
    * ,主键
    */
   private String indexareaid; 
   /**
    * 
    */
   private String indexareacode;   
   /**
    * 
    */
   private String indexareaname;   
   /**
    * 
    */
   private String indexareadetail;   
   /**
    * 
    */
   private String indexareastatue;   
   /**
    * 
    */
   private String indexareacompany;   
   /**
    * 
    */
   private String indexareaorder;   
   /**
    * 
    */
   private String indexareaimage;   
   /**
    * 
    */
   private String indexareaurl;   
    //属性方法	    
     /**
	 *设置主键""属性
	 *@param indexareaid 实体的Indexareaid属性
	 */
	public void setIndexareaid(String indexareaid)
	{
		this.indexareaid = indexareaid;
	}
	
	/**
	 *获取主键""属性
	 */
	public String getIndexareaid()
	{
		return this.indexareaid;
	}

	/**
	 *设置""属性
	 *@param indexareacode 实体的Indexareacode属性
	 */
	public void setIndexareacode(String indexareacode)
	{
		this.indexareacode = indexareacode;
	}
	
	/**
	 *获取""属性
	 */
	public String getIndexareacode()
	{
		return this.indexareacode;
	}	   

	/**
	 *设置""属性
	 *@param indexareaname 实体的Indexareaname属性
	 */
	public void setIndexareaname(String indexareaname)
	{
		this.indexareaname = indexareaname;
	}
	
	/**
	 *获取""属性
	 */
	public String getIndexareaname()
	{
		return this.indexareaname;
	}	   

	/**
	 *设置""属性
	 *@param indexareadetail 实体的Indexareadetail属性
	 */
	public void setIndexareadetail(String indexareadetail)
	{
		this.indexareadetail = indexareadetail;
	}
	
	/**
	 *获取""属性
	 */
	public String getIndexareadetail()
	{
		return this.indexareadetail;
	}	   

	/**
	 *设置""属性
	 *@param indexareastatue 实体的Indexareastatue属性
	 */
	public void setIndexareastatue(String indexareastatue)
	{
		this.indexareastatue = indexareastatue;
	}
	
	/**
	 *获取""属性
	 */
	public String getIndexareastatue()
	{
		return this.indexareastatue;
	}	   

	/**
	 *设置""属性
	 *@param indexareacompany 实体的Indexareacompany属性
	 */
	public void setIndexareacompany(String indexareacompany)
	{
		this.indexareacompany = indexareacompany;
	}
	
	/**
	 *获取""属性
	 */
	public String getIndexareacompany()
	{
		return this.indexareacompany;
	}	   

	/**
	 *设置""属性
	 *@param indexareaorder 实体的Indexareaorder属性
	 */
	public void setIndexareaorder(String indexareaorder)
	{
		this.indexareaorder = indexareaorder;
	}
	
	/**
	 *获取""属性
	 */
	public String getIndexareaorder()
	{
		return this.indexareaorder;
	}	   

	/**
	 *设置""属性
	 *@param indexareaimage 实体的Indexareaimage属性
	 */
	public void setIndexareaimage(String indexareaimage)
	{
		this.indexareaimage = indexareaimage;
	}
	
	/**
	 *获取""属性
	 */
	public String getIndexareaimage()
	{
		return this.indexareaimage;
	}	   

	/**
	 *设置""属性
	 *@param indexareaurl 实体的Indexareaurl属性
	 */
	public void setIndexareaurl(String indexareaurl)
	{
		this.indexareaurl = indexareaurl;
	}
	
	/**
	 *获取""属性
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

