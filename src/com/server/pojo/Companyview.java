package com.server.pojo;

import java.sql.Date;
/**
 * companyview 实体类
 *@author ZhangRuiLong
 */
public class Companyview
{
   /**
    * 经销商ID,主键
    */
   private String cOMPANYID; 
   /**
    * 编码
    */
   private String cOMPANYCODE;   
   /**
    * 姓名
    */
   private String uSERNAME;   
   /**
    * 手机
    */
   private String cOMPANYPHONE;   
   /**
    * 店铺
    */
   private String cOMPANYSHOP;   
   /**
    * 城市和县ID
    */
   private String cOMPANYCITY;   
   /**
    * 街道地址
    */
   private String cOMPANYADDRESS;   
   /**
    * 描述
    */
   private String cOMPANYDETAIL;   
   /**
    * 状态
    */
   private String cOMPANYSTATUE;   
   /**
    * 账号
    */
   private String lOGINNAME;   
   /**
    * 密码
    */
   private String pASSWORD;   
   /**
    * 创建时间
    */
   private String cREATETIME;   
   /**
    * 修改时间
    */
   private String uPDTIME;   
   /**
    * 城市ID
    */
   private String cITYID;   
   /**
    * 编码
    */
   private String cITYCODE;   
   /**
    * 名称
    */
   private String cITYNAME;   
   /**
    * 父类
    */
   private String cITYPARENT;   
   /**
    * 描述
    */
   private String cITYDETAIL;   
   /**
    * 状态
    */
   private String cITYSTATUE;   
   /**
    * 名称
    */
   private String cityparentname;   
    //属性方法	    
     /**
	 *设置主键"经销商ID"属性
	 *@param cOMPANYID 实体的COMPANYID属性
	 */
	public void setCOMPANYID(String cOMPANYID)
	{
		this.cOMPANYID = cOMPANYID;
	}
	
	/**
	 *获取主键"经销商ID"属性
	 */
	public String getCOMPANYID()
	{
		return this.cOMPANYID;
	}

	/**
	 *设置"编码"属性
	 *@param cOMPANYCODE 实体的COMPANYCODE属性
	 */
	public void setCOMPANYCODE(String cOMPANYCODE)
	{
		this.cOMPANYCODE = cOMPANYCODE;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getCOMPANYCODE()
	{
		return this.cOMPANYCODE;
	}	   

	/**
	 *设置"姓名"属性
	 *@param uSERNAME 实体的USERNAME属性
	 */
	public void setUSERNAME(String uSERNAME)
	{
		this.uSERNAME = uSERNAME;
	}
	
	/**
	 *获取"姓名"属性
	 */
	public String getUSERNAME()
	{
		return this.uSERNAME;
	}	   

	/**
	 *设置"手机"属性
	 *@param cOMPANYPHONE 实体的COMPANYPHONE属性
	 */
	public void setCOMPANYPHONE(String cOMPANYPHONE)
	{
		this.cOMPANYPHONE = cOMPANYPHONE;
	}
	
	/**
	 *获取"手机"属性
	 */
	public String getCOMPANYPHONE()
	{
		return this.cOMPANYPHONE;
	}	   

	/**
	 *设置"店铺"属性
	 *@param cOMPANYSHOP 实体的COMPANYSHOP属性
	 */
	public void setCOMPANYSHOP(String cOMPANYSHOP)
	{
		this.cOMPANYSHOP = cOMPANYSHOP;
	}
	
	/**
	 *获取"店铺"属性
	 */
	public String getCOMPANYSHOP()
	{
		return this.cOMPANYSHOP;
	}	   

	/**
	 *设置"城市和县ID"属性
	 *@param cOMPANYCITY 实体的COMPANYCITY属性
	 */
	public void setCOMPANYCITY(String cOMPANYCITY)
	{
		this.cOMPANYCITY = cOMPANYCITY;
	}
	
	/**
	 *获取"城市和县ID"属性
	 */
	public String getCOMPANYCITY()
	{
		return this.cOMPANYCITY;
	}	   

	/**
	 *设置"街道地址"属性
	 *@param cOMPANYADDRESS 实体的COMPANYADDRESS属性
	 */
	public void setCOMPANYADDRESS(String cOMPANYADDRESS)
	{
		this.cOMPANYADDRESS = cOMPANYADDRESS;
	}
	
	/**
	 *获取"街道地址"属性
	 */
	public String getCOMPANYADDRESS()
	{
		return this.cOMPANYADDRESS;
	}	   

	/**
	 *设置"描述"属性
	 *@param cOMPANYDETAIL 实体的COMPANYDETAIL属性
	 */
	public void setCOMPANYDETAIL(String cOMPANYDETAIL)
	{
		this.cOMPANYDETAIL = cOMPANYDETAIL;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getCOMPANYDETAIL()
	{
		return this.cOMPANYDETAIL;
	}	   

	/**
	 *设置"状态"属性
	 *@param cOMPANYSTATUE 实体的COMPANYSTATUE属性
	 */
	public void setCOMPANYSTATUE(String cOMPANYSTATUE)
	{
		this.cOMPANYSTATUE = cOMPANYSTATUE;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getCOMPANYSTATUE()
	{
		return this.cOMPANYSTATUE;
	}	   

	/**
	 *设置"账号"属性
	 *@param lOGINNAME 实体的LOGINNAME属性
	 */
	public void setLOGINNAME(String lOGINNAME)
	{
		this.lOGINNAME = lOGINNAME;
	}
	
	/**
	 *获取"账号"属性
	 */
	public String getLOGINNAME()
	{
		return this.lOGINNAME;
	}	   

	/**
	 *设置"密码"属性
	 *@param pASSWORD 实体的PASSWORD属性
	 */
	public void setPASSWORD(String pASSWORD)
	{
		this.pASSWORD = pASSWORD;
	}
	
	/**
	 *获取"密码"属性
	 */
	public String getPASSWORD()
	{
		return this.pASSWORD;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param cREATETIME 实体的CREATETIME属性
	 */
	public void setCREATETIME(String cREATETIME)
	{
		this.cREATETIME = cREATETIME;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getCREATETIME()
	{
		return this.cREATETIME;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param uPDTIME 实体的UPDTIME属性
	 */
	public void setUPDTIME(String uPDTIME)
	{
		this.uPDTIME = uPDTIME;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getUPDTIME()
	{
		return this.uPDTIME;
	}	   

	/**
	 *设置"城市ID"属性
	 *@param cITYID 实体的CITYID属性
	 */
	public void setCITYID(String cITYID)
	{
		this.cITYID = cITYID;
	}
	
	/**
	 *获取"城市ID"属性
	 */
	public String getCITYID()
	{
		return this.cITYID;
	}	   

	/**
	 *设置"编码"属性
	 *@param cITYCODE 实体的CITYCODE属性
	 */
	public void setCITYCODE(String cITYCODE)
	{
		this.cITYCODE = cITYCODE;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getCITYCODE()
	{
		return this.cITYCODE;
	}	   

	/**
	 *设置"名称"属性
	 *@param cITYNAME 实体的CITYNAME属性
	 */
	public void setCITYNAME(String cITYNAME)
	{
		this.cITYNAME = cITYNAME;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getCITYNAME()
	{
		return this.cITYNAME;
	}	   

	/**
	 *设置"父类"属性
	 *@param cITYPARENT 实体的CITYPARENT属性
	 */
	public void setCITYPARENT(String cITYPARENT)
	{
		this.cITYPARENT = cITYPARENT;
	}
	
	/**
	 *获取"父类"属性
	 */
	public String getCITYPARENT()
	{
		return this.cITYPARENT;
	}	   

	/**
	 *设置"描述"属性
	 *@param cITYDETAIL 实体的CITYDETAIL属性
	 */
	public void setCITYDETAIL(String cITYDETAIL)
	{
		this.cITYDETAIL = cITYDETAIL;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getCITYDETAIL()
	{
		return this.cITYDETAIL;
	}	   

	/**
	 *设置"状态"属性
	 *@param cITYSTATUE 实体的CITYSTATUE属性
	 */
	public void setCITYSTATUE(String cITYSTATUE)
	{
		this.cITYSTATUE = cITYSTATUE;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getCITYSTATUE()
	{
		return this.cITYSTATUE;
	}	   

	/**
	 *设置"名称"属性
	 *@param cityparentname 实体的Cityparentname属性
	 */
	public void setCityparentname(String cityparentname)
	{
		this.cityparentname = cityparentname;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getCityparentname()
	{
		return this.cityparentname;
	}	   
	public Companyview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Companyview(
		String cOMPANYID
	 	,String cOMPANYCODE
	 	,String uSERNAME
	 	,String cOMPANYPHONE
	 	,String cOMPANYSHOP
	 	,String cOMPANYCITY
	 	,String cOMPANYADDRESS
	 	,String cOMPANYDETAIL
	 	,String cOMPANYSTATUE
	 	,String lOGINNAME
	 	,String pASSWORD
	 	,String cREATETIME
	 	,String uPDTIME
	 	,String cITYID
	 	,String cITYCODE
	 	,String cITYNAME
	 	,String cITYPARENT
	 	,String cITYDETAIL
	 	,String cITYSTATUE
	 	,String cityparentname
		 ){
		super();
		this.cOMPANYID = cOMPANYID;
	 	this.cOMPANYCODE = cOMPANYCODE;
	 	this.uSERNAME = uSERNAME;
	 	this.cOMPANYPHONE = cOMPANYPHONE;
	 	this.cOMPANYSHOP = cOMPANYSHOP;
	 	this.cOMPANYCITY = cOMPANYCITY;
	 	this.cOMPANYADDRESS = cOMPANYADDRESS;
	 	this.cOMPANYDETAIL = cOMPANYDETAIL;
	 	this.cOMPANYSTATUE = cOMPANYSTATUE;
	 	this.lOGINNAME = lOGINNAME;
	 	this.pASSWORD = pASSWORD;
	 	this.cREATETIME = cREATETIME;
	 	this.uPDTIME = uPDTIME;
	 	this.cITYID = cITYID;
	 	this.cITYCODE = cITYCODE;
	 	this.cITYNAME = cITYNAME;
	 	this.cITYPARENT = cITYPARENT;
	 	this.cITYDETAIL = cITYDETAIL;
	 	this.cITYSTATUE = cITYSTATUE;
	 	this.cityparentname = cityparentname;
	}
}

