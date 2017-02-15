package com.server.pojo;

import java.sql.Date;
/**
 * supplier 实体类
 *@author ZhangRuiLong
 */
public class Supplier
{
   /**
    * 供货商ID,主键
    */
   private String supplierid; 
   /**
    * 编码
    */
   private String suppliercode;   
   /**
    * 名称
    */
   private String suppliername;   
   /**
    * 联系人
    */
   private String suppliercontact;   
   /**
    * 联系电话
    */
   private String supplierphone;   
   /**
    * 地址
    */
   private String supplieraddress;   
   /**
    * 描述
    */
   private String supplierdetail;   
   /**
    * 状态
    */
   private String supplierstatue;   
   /**
    * 经销商ID
    */
   private String suppliercompany;   
   /**
    * 修改时间
    */
   private String supplierupdtime;   
   /**
    * 修改人
    */
   private String supplierupdor;   
   /**
    * 创建时间
    */
   private String suppliercretime;   
   /**
    * 创建人
    */
   private String suppliercreor;   
    //属性方法	    
     /**
	 *设置主键"供货商ID"属性
	 *@param supplierid 实体的Supplierid属性
	 */
	public void setSupplierid(String supplierid)
	{
		this.supplierid = supplierid;
	}
	
	/**
	 *获取主键"供货商ID"属性
	 */
	public String getSupplierid()
	{
		return this.supplierid;
	}

	/**
	 *设置"编码"属性
	 *@param suppliercode 实体的Suppliercode属性
	 */
	public void setSuppliercode(String suppliercode)
	{
		this.suppliercode = suppliercode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getSuppliercode()
	{
		return this.suppliercode;
	}	   

	/**
	 *设置"名称"属性
	 *@param suppliername 实体的Suppliername属性
	 */
	public void setSuppliername(String suppliername)
	{
		this.suppliername = suppliername;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getSuppliername()
	{
		return this.suppliername;
	}	   

	/**
	 *设置"联系人"属性
	 *@param suppliercontact 实体的Suppliercontact属性
	 */
	public void setSuppliercontact(String suppliercontact)
	{
		this.suppliercontact = suppliercontact;
	}
	
	/**
	 *获取"联系人"属性
	 */
	public String getSuppliercontact()
	{
		return this.suppliercontact;
	}	   

	/**
	 *设置"联系电话"属性
	 *@param supplierphone 实体的Supplierphone属性
	 */
	public void setSupplierphone(String supplierphone)
	{
		this.supplierphone = supplierphone;
	}
	
	/**
	 *获取"联系电话"属性
	 */
	public String getSupplierphone()
	{
		return this.supplierphone;
	}	   

	/**
	 *设置"地址"属性
	 *@param supplieraddress 实体的Supplieraddress属性
	 */
	public void setSupplieraddress(String supplieraddress)
	{
		this.supplieraddress = supplieraddress;
	}
	
	/**
	 *获取"地址"属性
	 */
	public String getSupplieraddress()
	{
		return this.supplieraddress;
	}	   

	/**
	 *设置"描述"属性
	 *@param supplierdetail 实体的Supplierdetail属性
	 */
	public void setSupplierdetail(String supplierdetail)
	{
		this.supplierdetail = supplierdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getSupplierdetail()
	{
		return this.supplierdetail;
	}	   

	/**
	 *设置"状态"属性
	 *@param supplierstatue 实体的Supplierstatue属性
	 */
	public void setSupplierstatue(String supplierstatue)
	{
		this.supplierstatue = supplierstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getSupplierstatue()
	{
		return this.supplierstatue;
	}	   

	/**
	 *设置"经销商ID"属性
	 *@param suppliercompany 实体的Suppliercompany属性
	 */
	public void setSuppliercompany(String suppliercompany)
	{
		this.suppliercompany = suppliercompany;
	}
	
	/**
	 *获取"经销商ID"属性
	 */
	public String getSuppliercompany()
	{
		return this.suppliercompany;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param supplierupdtime 实体的Supplierupdtime属性
	 */
	public void setSupplierupdtime(String supplierupdtime)
	{
		this.supplierupdtime = supplierupdtime;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getSupplierupdtime()
	{
		return this.supplierupdtime;
	}	   

	/**
	 *设置"修改人"属性
	 *@param supplierupdor 实体的Supplierupdor属性
	 */
	public void setSupplierupdor(String supplierupdor)
	{
		this.supplierupdor = supplierupdor;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getSupplierupdor()
	{
		return this.supplierupdor;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param suppliercretime 实体的Suppliercretime属性
	 */
	public void setSuppliercretime(String suppliercretime)
	{
		this.suppliercretime = suppliercretime;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getSuppliercretime()
	{
		return this.suppliercretime;
	}	   

	/**
	 *设置"创建人"属性
	 *@param suppliercreor 实体的Suppliercreor属性
	 */
	public void setSuppliercreor(String suppliercreor)
	{
		this.suppliercreor = suppliercreor;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getSuppliercreor()
	{
		return this.suppliercreor;
	}	   
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Supplier(
		String supplierid
	 	,String suppliercode
	 	,String suppliername
	 	,String suppliercontact
	 	,String supplierphone
	 	,String supplieraddress
	 	,String supplierdetail
	 	,String supplierstatue
	 	,String suppliercompany
	 	,String supplierupdtime
	 	,String supplierupdor
	 	,String suppliercretime
	 	,String suppliercreor
		 ){
		super();
		this.supplierid = supplierid;
	 	this.suppliercode = suppliercode;
	 	this.suppliername = suppliername;
	 	this.suppliercontact = suppliercontact;
	 	this.supplierphone = supplierphone;
	 	this.supplieraddress = supplieraddress;
	 	this.supplierdetail = supplierdetail;
	 	this.supplierstatue = supplierstatue;
	 	this.suppliercompany = suppliercompany;
	 	this.supplierupdtime = supplierupdtime;
	 	this.supplierupdor = supplierupdor;
	 	this.suppliercretime = suppliercretime;
	 	this.suppliercreor = suppliercreor;
	}
}

