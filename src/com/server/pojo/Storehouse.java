package com.server.pojo;

import java.sql.Date;
/**
 * storehouse 实体类
 *@author ZhangRuiLong
 */
public class Storehouse
{
   /**
    * 仓库ID,主键
    */
   private String storehouseid; 
   /**
    * 编码
    */
   private String storehousecode;   
   /**
    * 名称
    */
   private String storehousename;   
   /**
    * 描述
    */
   private String storehousedetail;   
   /**
    * 状态
    */
   private String storehousestatue;   
   /**
    * 经销商ID
    */
   private String storehousecompany;   
   /**
    * 修改时间
    */
   private String storehouseupdtime;   
   /**
    * 修改人
    */
   private String storehouseupdor;   
   /**
    * 创建时间
    */
   private String storehousecretime;   
   /**
    * 创建人
    */
   private String storehousecreor;   
   /**
    * 仓库地址
    */
   private String storehouseaddress;   
    //属性方法	    
     /**
	 *设置主键"仓库ID"属性
	 *@param storehouseid 实体的Storehouseid属性
	 */
	public void setStorehouseid(String storehouseid)
	{
		this.storehouseid = storehouseid;
	}
	
	/**
	 *获取主键"仓库ID"属性
	 */
	public String getStorehouseid()
	{
		return this.storehouseid;
	}

	/**
	 *设置"编码"属性
	 *@param storehousecode 实体的Storehousecode属性
	 */
	public void setStorehousecode(String storehousecode)
	{
		this.storehousecode = storehousecode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getStorehousecode()
	{
		return this.storehousecode;
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

	/**
	 *设置"描述"属性
	 *@param storehousedetail 实体的Storehousedetail属性
	 */
	public void setStorehousedetail(String storehousedetail)
	{
		this.storehousedetail = storehousedetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getStorehousedetail()
	{
		return this.storehousedetail;
	}	   

	/**
	 *设置"状态"属性
	 *@param storehousestatue 实体的Storehousestatue属性
	 */
	public void setStorehousestatue(String storehousestatue)
	{
		this.storehousestatue = storehousestatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getStorehousestatue()
	{
		return this.storehousestatue;
	}	   

	/**
	 *设置"经销商ID"属性
	 *@param storehousecompany 实体的Storehousecompany属性
	 */
	public void setStorehousecompany(String storehousecompany)
	{
		this.storehousecompany = storehousecompany;
	}
	
	/**
	 *获取"经销商ID"属性
	 */
	public String getStorehousecompany()
	{
		return this.storehousecompany;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param storehouseupdtime 实体的Storehouseupdtime属性
	 */
	public void setStorehouseupdtime(String storehouseupdtime)
	{
		this.storehouseupdtime = storehouseupdtime;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getStorehouseupdtime()
	{
		return this.storehouseupdtime;
	}	   

	/**
	 *设置"修改人"属性
	 *@param storehouseupdor 实体的Storehouseupdor属性
	 */
	public void setStorehouseupdor(String storehouseupdor)
	{
		this.storehouseupdor = storehouseupdor;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getStorehouseupdor()
	{
		return this.storehouseupdor;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param storehousecretime 实体的Storehousecretime属性
	 */
	public void setStorehousecretime(String storehousecretime)
	{
		this.storehousecretime = storehousecretime;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getStorehousecretime()
	{
		return this.storehousecretime;
	}	   

	/**
	 *设置"创建人"属性
	 *@param storehousecreor 实体的Storehousecreor属性
	 */
	public void setStorehousecreor(String storehousecreor)
	{
		this.storehousecreor = storehousecreor;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getStorehousecreor()
	{
		return this.storehousecreor;
	}	   

	/**
	 *设置"仓库地址"属性
	 *@param storehouseaddress 实体的Storehouseaddress属性
	 */
	public void setStorehouseaddress(String storehouseaddress)
	{
		this.storehouseaddress = storehouseaddress;
	}
	
	/**
	 *获取"仓库地址"属性
	 */
	public String getStorehouseaddress()
	{
		return this.storehouseaddress;
	}	   
	public Storehouse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Storehouse(
		String storehouseid
	 	,String storehousecode
	 	,String storehousename
	 	,String storehousedetail
	 	,String storehousestatue
	 	,String storehousecompany
	 	,String storehouseupdtime
	 	,String storehouseupdor
	 	,String storehousecretime
	 	,String storehousecreor
	 	,String storehouseaddress
		 ){
		super();
		this.storehouseid = storehouseid;
	 	this.storehousecode = storehousecode;
	 	this.storehousename = storehousename;
	 	this.storehousedetail = storehousedetail;
	 	this.storehousestatue = storehousestatue;
	 	this.storehousecompany = storehousecompany;
	 	this.storehouseupdtime = storehouseupdtime;
	 	this.storehouseupdor = storehouseupdor;
	 	this.storehousecretime = storehousecretime;
	 	this.storehousecreor = storehousecreor;
	 	this.storehouseaddress = storehouseaddress;
	}
}

