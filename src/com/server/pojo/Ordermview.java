package com.server.pojo;

import java.sql.Date;
/**
 * ordermview 实体类
 *@author ZhangRuiLong
 */
public class Ordermview
{
   /**
    * 订单ID,主键
    */
   private String ordermid; 
   /**
    * 客户ID
    */
   private String ordermcustomer;   
   /**
    * 经销商ID
    */
   private String ordermcompany;   
   /**
    * 编码
    */
   private String ordermcode;   
   /**
    * 种类数
    */
   private String ordermnum;   
   /**
    * 下单金额
    */
   private Float ordermmoney;   
   /**
    * 实际金额
    */
   private Float ordermrightmoney;   
   /**
    * 支付方式
    */
   private String ordermway;   
   /**
    * 状态
    */
   private String ordermstatue;   
   /**
    * 备注
    */
   private String ordermdetail;   
   /**
    * 下单时间
    */
   private String ordermtime;   
   /**
    * 联系人
    */
   private String ordermconnect;   
   /**
    * 手机
    */
   private String ordermphone;   
   /**
    * 地址
    */
   private String ordermaddress;   
   /**
    * 修改时间
    */
   private String updtime;   
   /**
    * 修改人
    */
   private String updor;   
   /**
    * 业务员ID
    */
   private String ordermemp;   
   /**
    * 客户名称
    */
   private String ordermcusshop;   
   /**
    * 客户等级
    */
   private String ordermcuslevel;   
   /**
    * 客户类型
    */
   private String ordermcustype;   
   /**
    * 打印次数
    */
   private String ordermprinttimes;   
   /**
    * 店铺
    */
   private String companyshop;   
   /**
    * 手机
    */
   private String companyphone;   
   /**
    * 描述
    */
   private String companydetail;   
   /**
    * openid
    */
   private String openid;   
   /**
    * 店铺
    */
   private String customershop;   
    //属性方法	    
     /**
	 *设置主键"订单ID"属性
	 *@param ordermid 实体的Ordermid属性
	 */
	public void setOrdermid(String ordermid)
	{
		this.ordermid = ordermid;
	}
	
	/**
	 *获取主键"订单ID"属性
	 */
	public String getOrdermid()
	{
		return this.ordermid;
	}

	/**
	 *设置"客户ID"属性
	 *@param ordermcustomer 实体的Ordermcustomer属性
	 */
	public void setOrdermcustomer(String ordermcustomer)
	{
		this.ordermcustomer = ordermcustomer;
	}
	
	/**
	 *获取"客户ID"属性
	 */
	public String getOrdermcustomer()
	{
		return this.ordermcustomer;
	}	   

	/**
	 *设置"经销商ID"属性
	 *@param ordermcompany 实体的Ordermcompany属性
	 */
	public void setOrdermcompany(String ordermcompany)
	{
		this.ordermcompany = ordermcompany;
	}
	
	/**
	 *获取"经销商ID"属性
	 */
	public String getOrdermcompany()
	{
		return this.ordermcompany;
	}	   

	/**
	 *设置"编码"属性
	 *@param ordermcode 实体的Ordermcode属性
	 */
	public void setOrdermcode(String ordermcode)
	{
		this.ordermcode = ordermcode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getOrdermcode()
	{
		return this.ordermcode;
	}	   

	/**
	 *设置"种类数"属性
	 *@param ordermnum 实体的Ordermnum属性
	 */
	public void setOrdermnum(String ordermnum)
	{
		this.ordermnum = ordermnum;
	}
	
	/**
	 *获取"种类数"属性
	 */
	public String getOrdermnum()
	{
		return this.ordermnum;
	}	   

	/**
	 *设置"下单金额"属性
	 *@param ordermmoney 实体的Ordermmoney属性
	 */
	public void setOrdermmoney(Float ordermmoney)
	{
		this.ordermmoney = ordermmoney;
	}
	
	/**
	 *获取"下单金额"属性
	 */
	public Float getOrdermmoney()
	{
		return this.ordermmoney;
	}	   

	/**
	 *设置"实际金额"属性
	 *@param ordermrightmoney 实体的Ordermrightmoney属性
	 */
	public void setOrdermrightmoney(Float ordermrightmoney)
	{
		this.ordermrightmoney = ordermrightmoney;
	}
	
	/**
	 *获取"实际金额"属性
	 */
	public Float getOrdermrightmoney()
	{
		return this.ordermrightmoney;
	}	   

	/**
	 *设置"支付方式"属性
	 *@param ordermway 实体的Ordermway属性
	 */
	public void setOrdermway(String ordermway)
	{
		this.ordermway = ordermway;
	}
	
	/**
	 *获取"支付方式"属性
	 */
	public String getOrdermway()
	{
		return this.ordermway;
	}	   

	/**
	 *设置"状态"属性
	 *@param ordermstatue 实体的Ordermstatue属性
	 */
	public void setOrdermstatue(String ordermstatue)
	{
		this.ordermstatue = ordermstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getOrdermstatue()
	{
		return this.ordermstatue;
	}	   

	/**
	 *设置"备注"属性
	 *@param ordermdetail 实体的Ordermdetail属性
	 */
	public void setOrdermdetail(String ordermdetail)
	{
		this.ordermdetail = ordermdetail;
	}
	
	/**
	 *获取"备注"属性
	 */
	public String getOrdermdetail()
	{
		return this.ordermdetail;
	}	   

	/**
	 *设置"下单时间"属性
	 *@param ordermtime 实体的Ordermtime属性
	 */
	public void setOrdermtime(String ordermtime)
	{
		this.ordermtime = ordermtime;
	}
	
	/**
	 *获取"下单时间"属性
	 */
	public String getOrdermtime()
	{
		return this.ordermtime;
	}	   

	/**
	 *设置"联系人"属性
	 *@param ordermconnect 实体的Ordermconnect属性
	 */
	public void setOrdermconnect(String ordermconnect)
	{
		this.ordermconnect = ordermconnect;
	}
	
	/**
	 *获取"联系人"属性
	 */
	public String getOrdermconnect()
	{
		return this.ordermconnect;
	}	   

	/**
	 *设置"手机"属性
	 *@param ordermphone 实体的Ordermphone属性
	 */
	public void setOrdermphone(String ordermphone)
	{
		this.ordermphone = ordermphone;
	}
	
	/**
	 *获取"手机"属性
	 */
	public String getOrdermphone()
	{
		return this.ordermphone;
	}	   

	/**
	 *设置"地址"属性
	 *@param ordermaddress 实体的Ordermaddress属性
	 */
	public void setOrdermaddress(String ordermaddress)
	{
		this.ordermaddress = ordermaddress;
	}
	
	/**
	 *获取"地址"属性
	 */
	public String getOrdermaddress()
	{
		return this.ordermaddress;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param updtime 实体的Updtime属性
	 */
	public void setUpdtime(String updtime)
	{
		this.updtime = updtime;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getUpdtime()
	{
		return this.updtime;
	}	   

	/**
	 *设置"修改人"属性
	 *@param updor 实体的Updor属性
	 */
	public void setUpdor(String updor)
	{
		this.updor = updor;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getUpdor()
	{
		return this.updor;
	}	   

	/**
	 *设置"业务员ID"属性
	 *@param ordermemp 实体的Ordermemp属性
	 */
	public void setOrdermemp(String ordermemp)
	{
		this.ordermemp = ordermemp;
	}
	
	/**
	 *获取"业务员ID"属性
	 */
	public String getOrdermemp()
	{
		return this.ordermemp;
	}	   

	/**
	 *设置"客户名称"属性
	 *@param ordermcusshop 实体的Ordermcusshop属性
	 */
	public void setOrdermcusshop(String ordermcusshop)
	{
		this.ordermcusshop = ordermcusshop;
	}
	
	/**
	 *获取"客户名称"属性
	 */
	public String getOrdermcusshop()
	{
		return this.ordermcusshop;
	}	   

	/**
	 *设置"客户等级"属性
	 *@param ordermcuslevel 实体的Ordermcuslevel属性
	 */
	public void setOrdermcuslevel(String ordermcuslevel)
	{
		this.ordermcuslevel = ordermcuslevel;
	}
	
	/**
	 *获取"客户等级"属性
	 */
	public String getOrdermcuslevel()
	{
		return this.ordermcuslevel;
	}	   

	/**
	 *设置"客户类型"属性
	 *@param ordermcustype 实体的Ordermcustype属性
	 */
	public void setOrdermcustype(String ordermcustype)
	{
		this.ordermcustype = ordermcustype;
	}
	
	/**
	 *获取"客户类型"属性
	 */
	public String getOrdermcustype()
	{
		return this.ordermcustype;
	}	   

	/**
	 *设置"打印次数"属性
	 *@param ordermprinttimes 实体的Ordermprinttimes属性
	 */
	public void setOrdermprinttimes(String ordermprinttimes)
	{
		this.ordermprinttimes = ordermprinttimes;
	}
	
	/**
	 *获取"打印次数"属性
	 */
	public String getOrdermprinttimes()
	{
		return this.ordermprinttimes;
	}	   

	/**
	 *设置"店铺"属性
	 *@param companyshop 实体的Companyshop属性
	 */
	public void setCompanyshop(String companyshop)
	{
		this.companyshop = companyshop;
	}
	
	/**
	 *获取"店铺"属性
	 */
	public String getCompanyshop()
	{
		return this.companyshop;
	}	   

	/**
	 *设置"手机"属性
	 *@param companyphone 实体的Companyphone属性
	 */
	public void setCompanyphone(String companyphone)
	{
		this.companyphone = companyphone;
	}
	
	/**
	 *获取"手机"属性
	 */
	public String getCompanyphone()
	{
		return this.companyphone;
	}	   

	/**
	 *设置"描述"属性
	 *@param companydetail 实体的Companydetail属性
	 */
	public void setCompanydetail(String companydetail)
	{
		this.companydetail = companydetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getCompanydetail()
	{
		return this.companydetail;
	}	   

	/**
	 *设置"openid"属性
	 *@param openid 实体的Openid属性
	 */
	public void setOpenid(String openid)
	{
		this.openid = openid;
	}
	
	/**
	 *获取"openid"属性
	 */
	public String getOpenid()
	{
		return this.openid;
	}	   

	/**
	 *设置"店铺"属性
	 *@param customershop 实体的Customershop属性
	 */
	public void setCustomershop(String customershop)
	{
		this.customershop = customershop;
	}
	
	/**
	 *获取"店铺"属性
	 */
	public String getCustomershop()
	{
		return this.customershop;
	}	   
	public Ordermview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ordermview(
		String ordermid
	 	,String ordermcustomer
	 	,String ordermcompany
	 	,String ordermcode
	 	,String ordermnum
	 	,Float ordermmoney
	 	,Float ordermrightmoney
	 	,String ordermway
	 	,String ordermstatue
	 	,String ordermdetail
	 	,String ordermtime
	 	,String ordermconnect
	 	,String ordermphone
	 	,String ordermaddress
	 	,String updtime
	 	,String updor
	 	,String ordermemp
	 	,String ordermcusshop
	 	,String ordermcuslevel
	 	,String ordermcustype
	 	,String ordermprinttimes
	 	,String companyshop
	 	,String companyphone
	 	,String companydetail
	 	,String openid
	 	,String customershop
		 ){
		super();
		this.ordermid = ordermid;
	 	this.ordermcustomer = ordermcustomer;
	 	this.ordermcompany = ordermcompany;
	 	this.ordermcode = ordermcode;
	 	this.ordermnum = ordermnum;
	 	this.ordermmoney = ordermmoney;
	 	this.ordermrightmoney = ordermrightmoney;
	 	this.ordermway = ordermway;
	 	this.ordermstatue = ordermstatue;
	 	this.ordermdetail = ordermdetail;
	 	this.ordermtime = ordermtime;
	 	this.ordermconnect = ordermconnect;
	 	this.ordermphone = ordermphone;
	 	this.ordermaddress = ordermaddress;
	 	this.updtime = updtime;
	 	this.updor = updor;
	 	this.ordermemp = ordermemp;
	 	this.ordermcusshop = ordermcusshop;
	 	this.ordermcuslevel = ordermcuslevel;
	 	this.ordermcustype = ordermcustype;
	 	this.ordermprinttimes = ordermprinttimes;
	 	this.companyshop = companyshop;
	 	this.companyphone = companyphone;
	 	this.companydetail = companydetail;
	 	this.openid = openid;
	 	this.customershop = customershop;
	}
}

