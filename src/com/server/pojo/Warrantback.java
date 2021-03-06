package com.server.pojo;

import java.sql.Date;
/**
 * warrantback 实体类
 *@author ZhangRuiLong
 */
public class Warrantback
{
   /**
    * ID,主键
    */
   private String idwarrantback; 
   /**
    * 仓库
    */
   private String warrantbackstore;   
   /**
    * 商品
    */
   private String warrantbackgoods;   
   /**
    * 数量
    */
   private String warrantbacknum;   
   /**
    * 退货人
    */
   private String warrantbackwho;   
   /**
    * 状态
    */
   private String warrantbackstatue;   
   /**
    * 描述
    */
   private String warrantbackdetail;   
   /**
    * 创建人
    */
   private String warrantbackinswho;   
   /**
    * 创建时间
    */
   private String warrantbackinswhen;   
   /**
    * 修改人
    */
   private String warrantbackupdwho;   
   /**
    * 修改时间
    */
   private String warrantbackupdwhen;   
    //属性方法	    
     /**
	 *设置主键"ID"属性
	 *@param idwarrantback 实体的Idwarrantback属性
	 */
	public void setIdwarrantback(String idwarrantback)
	{
		this.idwarrantback = idwarrantback;
	}
	
	/**
	 *获取主键"ID"属性
	 */
	public String getIdwarrantback()
	{
		return this.idwarrantback;
	}

	/**
	 *设置"仓库"属性
	 *@param warrantbackstore 实体的Warrantbackstore属性
	 */
	public void setWarrantbackstore(String warrantbackstore)
	{
		this.warrantbackstore = warrantbackstore;
	}
	
	/**
	 *获取"仓库"属性
	 */
	public String getWarrantbackstore()
	{
		return this.warrantbackstore;
	}	   

	/**
	 *设置"商品"属性
	 *@param warrantbackgoods 实体的Warrantbackgoods属性
	 */
	public void setWarrantbackgoods(String warrantbackgoods)
	{
		this.warrantbackgoods = warrantbackgoods;
	}
	
	/**
	 *获取"商品"属性
	 */
	public String getWarrantbackgoods()
	{
		return this.warrantbackgoods;
	}	   

	/**
	 *设置"数量"属性
	 *@param warrantbacknum 实体的Warrantbacknum属性
	 */
	public void setWarrantbacknum(String warrantbacknum)
	{
		this.warrantbacknum = warrantbacknum;
	}
	
	/**
	 *获取"数量"属性
	 */
	public String getWarrantbacknum()
	{
		return this.warrantbacknum;
	}	   

	/**
	 *设置"退货人"属性
	 *@param warrantbackwho 实体的Warrantbackwho属性
	 */
	public void setWarrantbackwho(String warrantbackwho)
	{
		this.warrantbackwho = warrantbackwho;
	}
	
	/**
	 *获取"退货人"属性
	 */
	public String getWarrantbackwho()
	{
		return this.warrantbackwho;
	}	   

	/**
	 *设置"状态"属性
	 *@param warrantbackstatue 实体的Warrantbackstatue属性
	 */
	public void setWarrantbackstatue(String warrantbackstatue)
	{
		this.warrantbackstatue = warrantbackstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getWarrantbackstatue()
	{
		return this.warrantbackstatue;
	}	   

	/**
	 *设置"描述"属性
	 *@param warrantbackdetail 实体的Warrantbackdetail属性
	 */
	public void setWarrantbackdetail(String warrantbackdetail)
	{
		this.warrantbackdetail = warrantbackdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getWarrantbackdetail()
	{
		return this.warrantbackdetail;
	}	   

	/**
	 *设置"创建人"属性
	 *@param warrantbackinswho 实体的Warrantbackinswho属性
	 */
	public void setWarrantbackinswho(String warrantbackinswho)
	{
		this.warrantbackinswho = warrantbackinswho;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getWarrantbackinswho()
	{
		return this.warrantbackinswho;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param warrantbackinswhen 实体的Warrantbackinswhen属性
	 */
	public void setWarrantbackinswhen(String warrantbackinswhen)
	{
		this.warrantbackinswhen = warrantbackinswhen;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getWarrantbackinswhen()
	{
		return this.warrantbackinswhen;
	}	   

	/**
	 *设置"修改人"属性
	 *@param warrantbackupdwho 实体的Warrantbackupdwho属性
	 */
	public void setWarrantbackupdwho(String warrantbackupdwho)
	{
		this.warrantbackupdwho = warrantbackupdwho;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getWarrantbackupdwho()
	{
		return this.warrantbackupdwho;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param warrantbackupdwhen 实体的Warrantbackupdwhen属性
	 */
	public void setWarrantbackupdwhen(String warrantbackupdwhen)
	{
		this.warrantbackupdwhen = warrantbackupdwhen;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getWarrantbackupdwhen()
	{
		return this.warrantbackupdwhen;
	}	   
	public Warrantback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warrantback(
		String idwarrantback
	 	,String warrantbackstore
	 	,String warrantbackgoods
	 	,String warrantbacknum
	 	,String warrantbackwho
	 	,String warrantbackstatue
	 	,String warrantbackdetail
	 	,String warrantbackinswho
	 	,String warrantbackinswhen
	 	,String warrantbackupdwho
	 	,String warrantbackupdwhen
		 ){
		super();
		this.idwarrantback = idwarrantback;
	 	this.warrantbackstore = warrantbackstore;
	 	this.warrantbackgoods = warrantbackgoods;
	 	this.warrantbacknum = warrantbacknum;
	 	this.warrantbackwho = warrantbackwho;
	 	this.warrantbackstatue = warrantbackstatue;
	 	this.warrantbackdetail = warrantbackdetail;
	 	this.warrantbackinswho = warrantbackinswho;
	 	this.warrantbackinswhen = warrantbackinswhen;
	 	this.warrantbackupdwho = warrantbackupdwho;
	 	this.warrantbackupdwhen = warrantbackupdwhen;
	}
}

