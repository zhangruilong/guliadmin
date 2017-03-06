package com.server.pojo;

import java.sql.Date;
/**
 * warrantout 实体类
 *@author ZhangRuiLong
 */
public class Warrantout
{
   /**
    * ID,主键
    */
   private String idwarrantout; 
   /**
    * 经销商ID
    */
   private String warrantoutcompany;   
   /**
    * 仓库
    */
   private String warrantoutstore;   
   /**
    * 商品
    */
   private String warrantoutgoods;   
   /**
    * 数量
    */
   private String warrantoutnum;   
   /**
    * 状态
    */
   private String warrantoutstatue;   
   /**
    * 描述
    */
   private String warrantoutdetail;   
   /**
    * 领货人
    */
   private String warrantoutwho;   
   /**
    * 创建时间
    */
   private String warrantoutinswhen;   
   /**
    * 创建人
    */
   private String warrantoutinswho;   
   /**
    * 修改时间
    */
   private String warrantoutupdwhen;   
   /**
    * 修改人
    */
   private String warrantoutupdwho;   
   /**
    * 商品编码
    */
   private String warrantoutgcode;   
   /**
    * 商品名称
    */
   private String warrantoutgname;   
   /**
    * 规格
    */
   private String warrantoutgunits;   
   /**
    * 其他类别
    */
   private String warrantoutgtype;   
   /**
    * 小类
    */
   private String warrantoutggclass;   
   /**
    * 单位
    */
   private String warrantoutgunit;   
   /**
    * 重量
    */
   private String warrantoutgweight;   
   /**
    * 订单备注
    */
   private String warrantoutordnote;   
   /**
    * 销售单价
    */
   private String warrantoutprice;   
   /**
    * 销售金额
    */
   private String warrantoutmoney;   
    //属性方法	    
     /**
	 *设置主键"ID"属性
	 *@param idwarrantout 实体的Idwarrantout属性
	 */
	public void setIdwarrantout(String idwarrantout)
	{
		this.idwarrantout = idwarrantout;
	}
	
	/**
	 *获取主键"ID"属性
	 */
	public String getIdwarrantout()
	{
		return this.idwarrantout;
	}

	/**
	 *设置"经销商ID"属性
	 *@param warrantoutcompany 实体的Warrantoutcompany属性
	 */
	public void setWarrantoutcompany(String warrantoutcompany)
	{
		this.warrantoutcompany = warrantoutcompany;
	}
	
	/**
	 *获取"经销商ID"属性
	 */
	public String getWarrantoutcompany()
	{
		return this.warrantoutcompany;
	}	   

	/**
	 *设置"仓库"属性
	 *@param warrantoutstore 实体的Warrantoutstore属性
	 */
	public void setWarrantoutstore(String warrantoutstore)
	{
		this.warrantoutstore = warrantoutstore;
	}
	
	/**
	 *获取"仓库"属性
	 */
	public String getWarrantoutstore()
	{
		return this.warrantoutstore;
	}	   

	/**
	 *设置"商品"属性
	 *@param warrantoutgoods 实体的Warrantoutgoods属性
	 */
	public void setWarrantoutgoods(String warrantoutgoods)
	{
		this.warrantoutgoods = warrantoutgoods;
	}
	
	/**
	 *获取"商品"属性
	 */
	public String getWarrantoutgoods()
	{
		return this.warrantoutgoods;
	}	   

	/**
	 *设置"数量"属性
	 *@param warrantoutnum 实体的Warrantoutnum属性
	 */
	public void setWarrantoutnum(String warrantoutnum)
	{
		this.warrantoutnum = warrantoutnum;
	}
	
	/**
	 *获取"数量"属性
	 */
	public String getWarrantoutnum()
	{
		return this.warrantoutnum;
	}	   

	/**
	 *设置"状态"属性
	 *@param warrantoutstatue 实体的Warrantoutstatue属性
	 */
	public void setWarrantoutstatue(String warrantoutstatue)
	{
		this.warrantoutstatue = warrantoutstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getWarrantoutstatue()
	{
		return this.warrantoutstatue;
	}	   

	/**
	 *设置"描述"属性
	 *@param warrantoutdetail 实体的Warrantoutdetail属性
	 */
	public void setWarrantoutdetail(String warrantoutdetail)
	{
		this.warrantoutdetail = warrantoutdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getWarrantoutdetail()
	{
		return this.warrantoutdetail;
	}	   

	/**
	 *设置"领货人"属性
	 *@param warrantoutwho 实体的Warrantoutwho属性
	 */
	public void setWarrantoutwho(String warrantoutwho)
	{
		this.warrantoutwho = warrantoutwho;
	}
	
	/**
	 *获取"领货人"属性
	 */
	public String getWarrantoutwho()
	{
		return this.warrantoutwho;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param warrantoutinswhen 实体的Warrantoutinswhen属性
	 */
	public void setWarrantoutinswhen(String warrantoutinswhen)
	{
		this.warrantoutinswhen = warrantoutinswhen;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getWarrantoutinswhen()
	{
		return this.warrantoutinswhen;
	}	   

	/**
	 *设置"创建人"属性
	 *@param warrantoutinswho 实体的Warrantoutinswho属性
	 */
	public void setWarrantoutinswho(String warrantoutinswho)
	{
		this.warrantoutinswho = warrantoutinswho;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getWarrantoutinswho()
	{
		return this.warrantoutinswho;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param warrantoutupdwhen 实体的Warrantoutupdwhen属性
	 */
	public void setWarrantoutupdwhen(String warrantoutupdwhen)
	{
		this.warrantoutupdwhen = warrantoutupdwhen;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getWarrantoutupdwhen()
	{
		return this.warrantoutupdwhen;
	}	   

	/**
	 *设置"修改人"属性
	 *@param warrantoutupdwho 实体的Warrantoutupdwho属性
	 */
	public void setWarrantoutupdwho(String warrantoutupdwho)
	{
		this.warrantoutupdwho = warrantoutupdwho;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getWarrantoutupdwho()
	{
		return this.warrantoutupdwho;
	}	   

	/**
	 *设置"商品编码"属性
	 *@param warrantoutgcode 实体的Warrantoutgcode属性
	 */
	public void setWarrantoutgcode(String warrantoutgcode)
	{
		this.warrantoutgcode = warrantoutgcode;
	}
	
	/**
	 *获取"商品编码"属性
	 */
	public String getWarrantoutgcode()
	{
		return this.warrantoutgcode;
	}	   

	/**
	 *设置"商品名称"属性
	 *@param warrantoutgname 实体的Warrantoutgname属性
	 */
	public void setWarrantoutgname(String warrantoutgname)
	{
		this.warrantoutgname = warrantoutgname;
	}
	
	/**
	 *获取"商品名称"属性
	 */
	public String getWarrantoutgname()
	{
		return this.warrantoutgname;
	}	   

	/**
	 *设置"规格"属性
	 *@param warrantoutgunits 实体的Warrantoutgunits属性
	 */
	public void setWarrantoutgunits(String warrantoutgunits)
	{
		this.warrantoutgunits = warrantoutgunits;
	}
	
	/**
	 *获取"规格"属性
	 */
	public String getWarrantoutgunits()
	{
		return this.warrantoutgunits;
	}	   

	/**
	 *设置"其他类别"属性
	 *@param warrantoutgtype 实体的Warrantoutgtype属性
	 */
	public void setWarrantoutgtype(String warrantoutgtype)
	{
		this.warrantoutgtype = warrantoutgtype;
	}
	
	/**
	 *获取"其他类别"属性
	 */
	public String getWarrantoutgtype()
	{
		return this.warrantoutgtype;
	}	   

	/**
	 *设置"小类"属性
	 *@param warrantoutggclass 实体的Warrantoutggclass属性
	 */
	public void setWarrantoutggclass(String warrantoutggclass)
	{
		this.warrantoutggclass = warrantoutggclass;
	}
	
	/**
	 *获取"小类"属性
	 */
	public String getWarrantoutggclass()
	{
		return this.warrantoutggclass;
	}	   

	/**
	 *设置"单位"属性
	 *@param warrantoutgunit 实体的Warrantoutgunit属性
	 */
	public void setWarrantoutgunit(String warrantoutgunit)
	{
		this.warrantoutgunit = warrantoutgunit;
	}
	
	/**
	 *获取"单位"属性
	 */
	public String getWarrantoutgunit()
	{
		return this.warrantoutgunit;
	}	   

	/**
	 *设置"重量"属性
	 *@param warrantoutgweight 实体的Warrantoutgweight属性
	 */
	public void setWarrantoutgweight(String warrantoutgweight)
	{
		this.warrantoutgweight = warrantoutgweight;
	}
	
	/**
	 *获取"重量"属性
	 */
	public String getWarrantoutgweight()
	{
		return this.warrantoutgweight;
	}	   

	/**
	 *设置"订单备注"属性
	 *@param warrantoutordnote 实体的Warrantoutordnote属性
	 */
	public void setWarrantoutordnote(String warrantoutordnote)
	{
		this.warrantoutordnote = warrantoutordnote;
	}
	
	/**
	 *获取"订单备注"属性
	 */
	public String getWarrantoutordnote()
	{
		return this.warrantoutordnote;
	}	   

	/**
	 *设置"销售单价"属性
	 *@param warrantoutprice 实体的Warrantoutprice属性
	 */
	public void setWarrantoutprice(String warrantoutprice)
	{
		this.warrantoutprice = warrantoutprice;
	}
	
	/**
	 *获取"销售单价"属性
	 */
	public String getWarrantoutprice()
	{
		return this.warrantoutprice;
	}	   

	/**
	 *设置"销售金额"属性
	 *@param warrantoutmoney 实体的Warrantoutmoney属性
	 */
	public void setWarrantoutmoney(String warrantoutmoney)
	{
		this.warrantoutmoney = warrantoutmoney;
	}
	
	/**
	 *获取"销售金额"属性
	 */
	public String getWarrantoutmoney()
	{
		return this.warrantoutmoney;
	}	   
	public Warrantout() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warrantout(
		String idwarrantout
	 	,String warrantoutcompany
	 	,String warrantoutstore
	 	,String warrantoutgoods
	 	,String warrantoutnum
	 	,String warrantoutstatue
	 	,String warrantoutdetail
	 	,String warrantoutwho
	 	,String warrantoutinswhen
	 	,String warrantoutinswho
	 	,String warrantoutupdwhen
	 	,String warrantoutupdwho
	 	,String warrantoutgcode
	 	,String warrantoutgname
	 	,String warrantoutgunits
	 	,String warrantoutgtype
	 	,String warrantoutggclass
	 	,String warrantoutgunit
	 	,String warrantoutgweight
	 	,String warrantoutordnote
	 	,String warrantoutprice
	 	,String warrantoutmoney
		 ){
		super();
		this.idwarrantout = idwarrantout;
	 	this.warrantoutcompany = warrantoutcompany;
	 	this.warrantoutstore = warrantoutstore;
	 	this.warrantoutgoods = warrantoutgoods;
	 	this.warrantoutnum = warrantoutnum;
	 	this.warrantoutstatue = warrantoutstatue;
	 	this.warrantoutdetail = warrantoutdetail;
	 	this.warrantoutwho = warrantoutwho;
	 	this.warrantoutinswhen = warrantoutinswhen;
	 	this.warrantoutinswho = warrantoutinswho;
	 	this.warrantoutupdwhen = warrantoutupdwhen;
	 	this.warrantoutupdwho = warrantoutupdwho;
	 	this.warrantoutgcode = warrantoutgcode;
	 	this.warrantoutgname = warrantoutgname;
	 	this.warrantoutgunits = warrantoutgunits;
	 	this.warrantoutgtype = warrantoutgtype;
	 	this.warrantoutggclass = warrantoutggclass;
	 	this.warrantoutgunit = warrantoutgunit;
	 	this.warrantoutgweight = warrantoutgweight;
	 	this.warrantoutordnote = warrantoutordnote;
	 	this.warrantoutprice = warrantoutprice;
	 	this.warrantoutmoney = warrantoutmoney;
	}
}

