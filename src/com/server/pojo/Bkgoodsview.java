package com.server.pojo;

import java.sql.Date;
/**
 * bkgoodsview 实体类
 *@author ZhangRuiLong
 */
public class Bkgoodsview
{
   /**
    * 促销品ID,主键
    */
   private String bKGOODSID; 
   /**
    * 经销商ID
    */
   private String bKGOODSCOMPANY;   
   /**
    * 编码
    */
   private String bKGOODSCODE;   
   /**
    * 名称
    */
   private String bKGOODSNAME;   
   /**
    * 描述
    */
   private String bKGOODSDETAIL;   
   /**
    * 规格
    */
   private String bKGOODSUNITS;   
   /**
    * 单位
    */
   private String bKGOODSUNIT;   
   /**
    * 原价
    */
   private Float bKGOODSPRICE;   
   /**
    * 现价
    */
   private Float bKGOODSORGPRICE;   
   /**
    * 限量
    */
   private String bKGOODSNUM;   
   /**
    * 小类名称
    */
   private String bKGOODSCLASS;   
   /**
    * 图片
    */
   private String bKGOODSIMAGE;   
   /**
    * 状态
    */
   private String bKGOODSSTATUE;   
   /**
    * 创建时间
    */
   private String bKCREATETIME;   
   /**
    * 创建人
    */
   private String bKCREATOR;   
   /**
    * 顺序
    */
   private String bKGOODSSEQ;   
   /**
    * 客户范围
    */
   private String bKGOODSSCOPE;   
   /**
    * 品牌
    */
   private String bKGOODSBRAND;   
   /**
    * 全部限量
    */
   private String bKGOODSALLNUM;   
   /**
    * 剩余数量
    */
   private String bKGOODSSURPLUS;   
   /**
    * 重量
    */
   private String bKGOODSWEIGHT;   
   /**
    * 类型(秒杀,买赠等)
    */
   private String bKGOODSTYPE;   
   /**
    * 修改时间
    */
   private String bKGOODSUPDTIME;   
   /**
    * 修改人
    */
   private String bKGOODSUPDOR;   
   /**
    * 编码
    */
   private String companycode;   
   /**
    * 姓名
    */
   private String username;   
   /**
    * 手机
    */
   private String companyphone;   
   /**
    * 店铺
    */
   private String companyshop;   
   /**
    * 街道地址
    */
   private String companyaddress;   
   /**
    * 城市和县ID
    */
   private String companycity;   
   /**
    * 描述
    */
   private String companydetail;   
   /**
    * 账号
    */
   private String loginname;   
   /**
    * 状态
    */
   private String companystatue;   
   /**
    * 编码
    */
   private String citycode;   
   /**
    * 名称
    */
   private String cityname;   
   /**
    * 父类
    */
   private String cityparent;   
   /**
    * 描述
    */
   private String citydetail;   
   /**
    * 状态
    */
   private String citystatue;   
    //属性方法	    
     /**
	 *设置主键"促销品ID"属性
	 *@param bKGOODSID 实体的BKGOODSID属性
	 */
	public void setBKGOODSID(String bKGOODSID)
	{
		this.bKGOODSID = bKGOODSID;
	}
	
	/**
	 *获取主键"促销品ID"属性
	 */
	public String getBKGOODSID()
	{
		return this.bKGOODSID;
	}

	/**
	 *设置"经销商ID"属性
	 *@param bKGOODSCOMPANY 实体的BKGOODSCOMPANY属性
	 */
	public void setBKGOODSCOMPANY(String bKGOODSCOMPANY)
	{
		this.bKGOODSCOMPANY = bKGOODSCOMPANY;
	}
	
	/**
	 *获取"经销商ID"属性
	 */
	public String getBKGOODSCOMPANY()
	{
		return this.bKGOODSCOMPANY;
	}	   

	/**
	 *设置"编码"属性
	 *@param bKGOODSCODE 实体的BKGOODSCODE属性
	 */
	public void setBKGOODSCODE(String bKGOODSCODE)
	{
		this.bKGOODSCODE = bKGOODSCODE;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getBKGOODSCODE()
	{
		return this.bKGOODSCODE;
	}	   

	/**
	 *设置"名称"属性
	 *@param bKGOODSNAME 实体的BKGOODSNAME属性
	 */
	public void setBKGOODSNAME(String bKGOODSNAME)
	{
		this.bKGOODSNAME = bKGOODSNAME;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getBKGOODSNAME()
	{
		return this.bKGOODSNAME;
	}	   

	/**
	 *设置"描述"属性
	 *@param bKGOODSDETAIL 实体的BKGOODSDETAIL属性
	 */
	public void setBKGOODSDETAIL(String bKGOODSDETAIL)
	{
		this.bKGOODSDETAIL = bKGOODSDETAIL;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getBKGOODSDETAIL()
	{
		return this.bKGOODSDETAIL;
	}	   

	/**
	 *设置"规格"属性
	 *@param bKGOODSUNITS 实体的BKGOODSUNITS属性
	 */
	public void setBKGOODSUNITS(String bKGOODSUNITS)
	{
		this.bKGOODSUNITS = bKGOODSUNITS;
	}
	
	/**
	 *获取"规格"属性
	 */
	public String getBKGOODSUNITS()
	{
		return this.bKGOODSUNITS;
	}	   

	/**
	 *设置"单位"属性
	 *@param bKGOODSUNIT 实体的BKGOODSUNIT属性
	 */
	public void setBKGOODSUNIT(String bKGOODSUNIT)
	{
		this.bKGOODSUNIT = bKGOODSUNIT;
	}
	
	/**
	 *获取"单位"属性
	 */
	public String getBKGOODSUNIT()
	{
		return this.bKGOODSUNIT;
	}	   

	/**
	 *设置"原价"属性
	 *@param bKGOODSPRICE 实体的BKGOODSPRICE属性
	 */
	public void setBKGOODSPRICE(Float bKGOODSPRICE)
	{
		this.bKGOODSPRICE = bKGOODSPRICE;
	}
	
	/**
	 *获取"原价"属性
	 */
	public Float getBKGOODSPRICE()
	{
		return this.bKGOODSPRICE;
	}	   

	/**
	 *设置"现价"属性
	 *@param bKGOODSORGPRICE 实体的BKGOODSORGPRICE属性
	 */
	public void setBKGOODSORGPRICE(Float bKGOODSORGPRICE)
	{
		this.bKGOODSORGPRICE = bKGOODSORGPRICE;
	}
	
	/**
	 *获取"现价"属性
	 */
	public Float getBKGOODSORGPRICE()
	{
		return this.bKGOODSORGPRICE;
	}	   

	/**
	 *设置"限量"属性
	 *@param bKGOODSNUM 实体的BKGOODSNUM属性
	 */
	public void setBKGOODSNUM(String bKGOODSNUM)
	{
		this.bKGOODSNUM = bKGOODSNUM;
	}
	
	/**
	 *获取"限量"属性
	 */
	public String getBKGOODSNUM()
	{
		return this.bKGOODSNUM;
	}	   

	/**
	 *设置"小类名称"属性
	 *@param bKGOODSCLASS 实体的BKGOODSCLASS属性
	 */
	public void setBKGOODSCLASS(String bKGOODSCLASS)
	{
		this.bKGOODSCLASS = bKGOODSCLASS;
	}
	
	/**
	 *获取"小类名称"属性
	 */
	public String getBKGOODSCLASS()
	{
		return this.bKGOODSCLASS;
	}	   

	/**
	 *设置"图片"属性
	 *@param bKGOODSIMAGE 实体的BKGOODSIMAGE属性
	 */
	public void setBKGOODSIMAGE(String bKGOODSIMAGE)
	{
		this.bKGOODSIMAGE = bKGOODSIMAGE;
	}
	
	/**
	 *获取"图片"属性
	 */
	public String getBKGOODSIMAGE()
	{
		return this.bKGOODSIMAGE;
	}	   

	/**
	 *设置"状态"属性
	 *@param bKGOODSSTATUE 实体的BKGOODSSTATUE属性
	 */
	public void setBKGOODSSTATUE(String bKGOODSSTATUE)
	{
		this.bKGOODSSTATUE = bKGOODSSTATUE;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getBKGOODSSTATUE()
	{
		return this.bKGOODSSTATUE;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param bKCREATETIME 实体的BKCREATETIME属性
	 */
	public void setBKCREATETIME(String bKCREATETIME)
	{
		this.bKCREATETIME = bKCREATETIME;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getBKCREATETIME()
	{
		return this.bKCREATETIME;
	}	   

	/**
	 *设置"创建人"属性
	 *@param bKCREATOR 实体的BKCREATOR属性
	 */
	public void setBKCREATOR(String bKCREATOR)
	{
		this.bKCREATOR = bKCREATOR;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getBKCREATOR()
	{
		return this.bKCREATOR;
	}	   

	/**
	 *设置"顺序"属性
	 *@param bKGOODSSEQ 实体的BKGOODSSEQ属性
	 */
	public void setBKGOODSSEQ(String bKGOODSSEQ)
	{
		this.bKGOODSSEQ = bKGOODSSEQ;
	}
	
	/**
	 *获取"顺序"属性
	 */
	public String getBKGOODSSEQ()
	{
		return this.bKGOODSSEQ;
	}	   

	/**
	 *设置"客户范围"属性
	 *@param bKGOODSSCOPE 实体的BKGOODSSCOPE属性
	 */
	public void setBKGOODSSCOPE(String bKGOODSSCOPE)
	{
		this.bKGOODSSCOPE = bKGOODSSCOPE;
	}
	
	/**
	 *获取"客户范围"属性
	 */
	public String getBKGOODSSCOPE()
	{
		return this.bKGOODSSCOPE;
	}	   

	/**
	 *设置"品牌"属性
	 *@param bKGOODSBRAND 实体的BKGOODSBRAND属性
	 */
	public void setBKGOODSBRAND(String bKGOODSBRAND)
	{
		this.bKGOODSBRAND = bKGOODSBRAND;
	}
	
	/**
	 *获取"品牌"属性
	 */
	public String getBKGOODSBRAND()
	{
		return this.bKGOODSBRAND;
	}	   

	/**
	 *设置"全部限量"属性
	 *@param bKGOODSALLNUM 实体的BKGOODSALLNUM属性
	 */
	public void setBKGOODSALLNUM(String bKGOODSALLNUM)
	{
		this.bKGOODSALLNUM = bKGOODSALLNUM;
	}
	
	/**
	 *获取"全部限量"属性
	 */
	public String getBKGOODSALLNUM()
	{
		return this.bKGOODSALLNUM;
	}	   

	/**
	 *设置"剩余数量"属性
	 *@param bKGOODSSURPLUS 实体的BKGOODSSURPLUS属性
	 */
	public void setBKGOODSSURPLUS(String bKGOODSSURPLUS)
	{
		this.bKGOODSSURPLUS = bKGOODSSURPLUS;
	}
	
	/**
	 *获取"剩余数量"属性
	 */
	public String getBKGOODSSURPLUS()
	{
		return this.bKGOODSSURPLUS;
	}	   

	/**
	 *设置"重量"属性
	 *@param bKGOODSWEIGHT 实体的BKGOODSWEIGHT属性
	 */
	public void setBKGOODSWEIGHT(String bKGOODSWEIGHT)
	{
		this.bKGOODSWEIGHT = bKGOODSWEIGHT;
	}
	
	/**
	 *获取"重量"属性
	 */
	public String getBKGOODSWEIGHT()
	{
		return this.bKGOODSWEIGHT;
	}	   

	/**
	 *设置"类型(秒杀,买赠等)"属性
	 *@param bKGOODSTYPE 实体的BKGOODSTYPE属性
	 */
	public void setBKGOODSTYPE(String bKGOODSTYPE)
	{
		this.bKGOODSTYPE = bKGOODSTYPE;
	}
	
	/**
	 *获取"类型(秒杀,买赠等)"属性
	 */
	public String getBKGOODSTYPE()
	{
		return this.bKGOODSTYPE;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param bKGOODSUPDTIME 实体的BKGOODSUPDTIME属性
	 */
	public void setBKGOODSUPDTIME(String bKGOODSUPDTIME)
	{
		this.bKGOODSUPDTIME = bKGOODSUPDTIME;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getBKGOODSUPDTIME()
	{
		return this.bKGOODSUPDTIME;
	}	   

	/**
	 *设置"修改人"属性
	 *@param bKGOODSUPDOR 实体的BKGOODSUPDOR属性
	 */
	public void setBKGOODSUPDOR(String bKGOODSUPDOR)
	{
		this.bKGOODSUPDOR = bKGOODSUPDOR;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getBKGOODSUPDOR()
	{
		return this.bKGOODSUPDOR;
	}	   

	/**
	 *设置"编码"属性
	 *@param companycode 实体的Companycode属性
	 */
	public void setCompanycode(String companycode)
	{
		this.companycode = companycode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getCompanycode()
	{
		return this.companycode;
	}	   

	/**
	 *设置"姓名"属性
	 *@param username 实体的Username属性
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	/**
	 *获取"姓名"属性
	 */
	public String getUsername()
	{
		return this.username;
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
	 *设置"街道地址"属性
	 *@param companyaddress 实体的Companyaddress属性
	 */
	public void setCompanyaddress(String companyaddress)
	{
		this.companyaddress = companyaddress;
	}
	
	/**
	 *获取"街道地址"属性
	 */
	public String getCompanyaddress()
	{
		return this.companyaddress;
	}	   

	/**
	 *设置"城市和县ID"属性
	 *@param companycity 实体的Companycity属性
	 */
	public void setCompanycity(String companycity)
	{
		this.companycity = companycity;
	}
	
	/**
	 *获取"城市和县ID"属性
	 */
	public String getCompanycity()
	{
		return this.companycity;
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
	 *设置"账号"属性
	 *@param loginname 实体的Loginname属性
	 */
	public void setLoginname(String loginname)
	{
		this.loginname = loginname;
	}
	
	/**
	 *获取"账号"属性
	 */
	public String getLoginname()
	{
		return this.loginname;
	}	   

	/**
	 *设置"状态"属性
	 *@param companystatue 实体的Companystatue属性
	 */
	public void setCompanystatue(String companystatue)
	{
		this.companystatue = companystatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getCompanystatue()
	{
		return this.companystatue;
	}	   

	/**
	 *设置"编码"属性
	 *@param citycode 实体的Citycode属性
	 */
	public void setCitycode(String citycode)
	{
		this.citycode = citycode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getCitycode()
	{
		return this.citycode;
	}	   

	/**
	 *设置"名称"属性
	 *@param cityname 实体的Cityname属性
	 */
	public void setCityname(String cityname)
	{
		this.cityname = cityname;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getCityname()
	{
		return this.cityname;
	}	   

	/**
	 *设置"父类"属性
	 *@param cityparent 实体的Cityparent属性
	 */
	public void setCityparent(String cityparent)
	{
		this.cityparent = cityparent;
	}
	
	/**
	 *获取"父类"属性
	 */
	public String getCityparent()
	{
		return this.cityparent;
	}	   

	/**
	 *设置"描述"属性
	 *@param citydetail 实体的Citydetail属性
	 */
	public void setCitydetail(String citydetail)
	{
		this.citydetail = citydetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getCitydetail()
	{
		return this.citydetail;
	}	   

	/**
	 *设置"状态"属性
	 *@param citystatue 实体的Citystatue属性
	 */
	public void setCitystatue(String citystatue)
	{
		this.citystatue = citystatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getCitystatue()
	{
		return this.citystatue;
	}	   
	public Bkgoodsview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bkgoodsview(
		String bKGOODSID
	 	,String bKGOODSCOMPANY
	 	,String bKGOODSCODE
	 	,String bKGOODSNAME
	 	,String bKGOODSDETAIL
	 	,String bKGOODSUNITS
	 	,String bKGOODSUNIT
	 	,Float bKGOODSPRICE
	 	,Float bKGOODSORGPRICE
	 	,String bKGOODSNUM
	 	,String bKGOODSCLASS
	 	,String bKGOODSIMAGE
	 	,String bKGOODSSTATUE
	 	,String bKCREATETIME
	 	,String bKCREATOR
	 	,String bKGOODSSEQ
	 	,String bKGOODSSCOPE
	 	,String bKGOODSBRAND
	 	,String bKGOODSALLNUM
	 	,String bKGOODSSURPLUS
	 	,String bKGOODSWEIGHT
	 	,String bKGOODSTYPE
	 	,String bKGOODSUPDTIME
	 	,String bKGOODSUPDOR
	 	,String companycode
	 	,String username
	 	,String companyphone
	 	,String companyshop
	 	,String companyaddress
	 	,String companycity
	 	,String companydetail
	 	,String loginname
	 	,String companystatue
	 	,String citycode
	 	,String cityname
	 	,String cityparent
	 	,String citydetail
	 	,String citystatue
		 ){
		super();
		this.bKGOODSID = bKGOODSID;
	 	this.bKGOODSCOMPANY = bKGOODSCOMPANY;
	 	this.bKGOODSCODE = bKGOODSCODE;
	 	this.bKGOODSNAME = bKGOODSNAME;
	 	this.bKGOODSDETAIL = bKGOODSDETAIL;
	 	this.bKGOODSUNITS = bKGOODSUNITS;
	 	this.bKGOODSUNIT = bKGOODSUNIT;
	 	this.bKGOODSPRICE = bKGOODSPRICE;
	 	this.bKGOODSORGPRICE = bKGOODSORGPRICE;
	 	this.bKGOODSNUM = bKGOODSNUM;
	 	this.bKGOODSCLASS = bKGOODSCLASS;
	 	this.bKGOODSIMAGE = bKGOODSIMAGE;
	 	this.bKGOODSSTATUE = bKGOODSSTATUE;
	 	this.bKCREATETIME = bKCREATETIME;
	 	this.bKCREATOR = bKCREATOR;
	 	this.bKGOODSSEQ = bKGOODSSEQ;
	 	this.bKGOODSSCOPE = bKGOODSSCOPE;
	 	this.bKGOODSBRAND = bKGOODSBRAND;
	 	this.bKGOODSALLNUM = bKGOODSALLNUM;
	 	this.bKGOODSSURPLUS = bKGOODSSURPLUS;
	 	this.bKGOODSWEIGHT = bKGOODSWEIGHT;
	 	this.bKGOODSTYPE = bKGOODSTYPE;
	 	this.bKGOODSUPDTIME = bKGOODSUPDTIME;
	 	this.bKGOODSUPDOR = bKGOODSUPDOR;
	 	this.companycode = companycode;
	 	this.username = username;
	 	this.companyphone = companyphone;
	 	this.companyshop = companyshop;
	 	this.companyaddress = companyaddress;
	 	this.companycity = companycity;
	 	this.companydetail = companydetail;
	 	this.loginname = loginname;
	 	this.companystatue = companystatue;
	 	this.citycode = citycode;
	 	this.cityname = cityname;
	 	this.cityparent = cityparent;
	 	this.citydetail = citydetail;
	 	this.citystatue = citystatue;
	}
}

