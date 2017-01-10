package com.server.pojo;

import java.sql.Date;
/**
 * warrantcheck 实体类
 *@author ZhangRuiLong
 */
public class Warrantcheck
{
   /**
    * ,主键
    */
   private String idwarrantcheck; 
   /**
    * 仓库
    */
   private String warrantcheckstore;   
   /**
    * 商品
    */
   private String warrantcheckgoods;   
   /**
    * 应有数量
    */
   private String warrantchecknumorg;   
   /**
    * 现有数量
    */
   private String warrantchecknumnow;   
   /**
    * 状态
    */
   private String warrantcheckstatue;   
   /**
    * 描述
    */
   private String warrantcheckdetail;   
   /**
    * 创建人
    */
   private String warrantcheckinswho;   
   /**
    * 创建时间
    */
   private String warrantcheckinswhen;   
   /**
    * 更新人
    */
   private String warrantcheckupdwho;   
   /**
    * 更新时间
    */
   private String warrantcheckupdwhen;   
    //属性方法	    
     /**
	 *设置主键""属性
	 *@param idwarrantcheck 实体的Idwarrantcheck属性
	 */
	public void setIdwarrantcheck(String idwarrantcheck)
	{
		this.idwarrantcheck = idwarrantcheck;
	}
	
	/**
	 *获取主键""属性
	 */
	public String getIdwarrantcheck()
	{
		return this.idwarrantcheck;
	}

	/**
	 *设置"仓库"属性
	 *@param warrantcheckstore 实体的Warrantcheckstore属性
	 */
	public void setWarrantcheckstore(String warrantcheckstore)
	{
		this.warrantcheckstore = warrantcheckstore;
	}
	
	/**
	 *获取"仓库"属性
	 */
	public String getWarrantcheckstore()
	{
		return this.warrantcheckstore;
	}	   

	/**
	 *设置"商品"属性
	 *@param warrantcheckgoods 实体的Warrantcheckgoods属性
	 */
	public void setWarrantcheckgoods(String warrantcheckgoods)
	{
		this.warrantcheckgoods = warrantcheckgoods;
	}
	
	/**
	 *获取"商品"属性
	 */
	public String getWarrantcheckgoods()
	{
		return this.warrantcheckgoods;
	}	   

	/**
	 *设置"应有数量"属性
	 *@param warrantchecknumorg 实体的Warrantchecknumorg属性
	 */
	public void setWarrantchecknumorg(String warrantchecknumorg)
	{
		this.warrantchecknumorg = warrantchecknumorg;
	}
	
	/**
	 *获取"应有数量"属性
	 */
	public String getWarrantchecknumorg()
	{
		return this.warrantchecknumorg;
	}	   

	/**
	 *设置"现有数量"属性
	 *@param warrantchecknumnow 实体的Warrantchecknumnow属性
	 */
	public void setWarrantchecknumnow(String warrantchecknumnow)
	{
		this.warrantchecknumnow = warrantchecknumnow;
	}
	
	/**
	 *获取"现有数量"属性
	 */
	public String getWarrantchecknumnow()
	{
		return this.warrantchecknumnow;
	}	   

	/**
	 *设置"状态"属性
	 *@param warrantcheckstatue 实体的Warrantcheckstatue属性
	 */
	public void setWarrantcheckstatue(String warrantcheckstatue)
	{
		this.warrantcheckstatue = warrantcheckstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getWarrantcheckstatue()
	{
		return this.warrantcheckstatue;
	}	   

	/**
	 *设置"描述"属性
	 *@param warrantcheckdetail 实体的Warrantcheckdetail属性
	 */
	public void setWarrantcheckdetail(String warrantcheckdetail)
	{
		this.warrantcheckdetail = warrantcheckdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getWarrantcheckdetail()
	{
		return this.warrantcheckdetail;
	}	   

	/**
	 *设置"创建人"属性
	 *@param warrantcheckinswho 实体的Warrantcheckinswho属性
	 */
	public void setWarrantcheckinswho(String warrantcheckinswho)
	{
		this.warrantcheckinswho = warrantcheckinswho;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getWarrantcheckinswho()
	{
		return this.warrantcheckinswho;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param warrantcheckinswhen 实体的Warrantcheckinswhen属性
	 */
	public void setWarrantcheckinswhen(String warrantcheckinswhen)
	{
		this.warrantcheckinswhen = warrantcheckinswhen;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getWarrantcheckinswhen()
	{
		return this.warrantcheckinswhen;
	}	   

	/**
	 *设置"更新人"属性
	 *@param warrantcheckupdwho 实体的Warrantcheckupdwho属性
	 */
	public void setWarrantcheckupdwho(String warrantcheckupdwho)
	{
		this.warrantcheckupdwho = warrantcheckupdwho;
	}
	
	/**
	 *获取"更新人"属性
	 */
	public String getWarrantcheckupdwho()
	{
		return this.warrantcheckupdwho;
	}	   

	/**
	 *设置"更新时间"属性
	 *@param warrantcheckupdwhen 实体的Warrantcheckupdwhen属性
	 */
	public void setWarrantcheckupdwhen(String warrantcheckupdwhen)
	{
		this.warrantcheckupdwhen = warrantcheckupdwhen;
	}
	
	/**
	 *获取"更新时间"属性
	 */
	public String getWarrantcheckupdwhen()
	{
		return this.warrantcheckupdwhen;
	}	   
	public Warrantcheck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warrantcheck(
		String idwarrantcheck
	 	,String warrantcheckstore
	 	,String warrantcheckgoods
	 	,String warrantchecknumorg
	 	,String warrantchecknumnow
	 	,String warrantcheckstatue
	 	,String warrantcheckdetail
	 	,String warrantcheckinswho
	 	,String warrantcheckinswhen
	 	,String warrantcheckupdwho
	 	,String warrantcheckupdwhen
		 ){
		super();
		this.idwarrantcheck = idwarrantcheck;
	 	this.warrantcheckstore = warrantcheckstore;
	 	this.warrantcheckgoods = warrantcheckgoods;
	 	this.warrantchecknumorg = warrantchecknumorg;
	 	this.warrantchecknumnow = warrantchecknumnow;
	 	this.warrantcheckstatue = warrantcheckstatue;
	 	this.warrantcheckdetail = warrantcheckdetail;
	 	this.warrantcheckinswho = warrantcheckinswho;
	 	this.warrantcheckinswhen = warrantcheckinswhen;
	 	this.warrantcheckupdwho = warrantcheckupdwho;
	 	this.warrantcheckupdwhen = warrantcheckupdwhen;
	}
}

