package com.server.pojo;

import java.sql.Date;
/**
 * collectview 实体类
 *@author ZhangRuiLong
 */
public class Collectview
{
   /**
    * 收藏ID,主键
    */
   private String collectid; 
   /**
    * 客户ID
    */
   private String collectcustomer;   
   /**
    * 描述
    */
   private String collectdetail;   
   /**
    * 创建时间
    */
   private String collectcreatetime;   
   /**
    * 商品ID
    */
   private String gOODSID;   
   /**
    * 经销商ID
    */
   private String gOODSCOMPANY;   
   /**
    * 编码
    */
   private String gOODSCODE;   
   /**
    * 名称
    */
   private String gOODSNAME;   
   /**
    * 描述
    */
   private String gOODSDETAIL;   
   /**
    * 规格
    */
   private String gOODSUNITS;   
   /**
    * 小类ID
    */
   private String gOODSCLASS;   
   /**
    * 图片
    */
   private String gOODSIMAGE;   
   /**
    * 状态
    */
   private String gOODSSTATUE;   
   /**
    * 创建时间
    */
   private String cREATETIME;   
   /**
    * 修改时间
    */
   private String uPDTIME;   
   /**
    * 创建人
    */
   private String cREATOR;   
   /**
    * 修改人
    */
   private String uPDOR;   
   /**
    * 品牌
    */
   private String gOODSBRAND;   
   /**
    * 种类
    */
   private String gOODSTYPE;   
   /**
    * 顺序
    */
   private String gOODSORDER;   
   /**
    * 大小类ID
    */
   private String gOODSCLASSID;   
   /**
    * 编码
    */
   private String gOODSCLASSCODE;   
   /**
    * 名称
    */
   private String gOODSCLASSNAME;   
   /**
    * 父类
    */
   private String gOODSCLASSPARENT;   
   /**
    * 图标
    */
   private String gOODSCLASSDETAIL;   
   /**
    * 状态
    */
   private String gOODSCLASSSTATUE;   
   /**
    * 城市(用逗号分开)
    */
   private String gOODSCLASSCITY;   
   /**
    * 顺序
    */
   private String gOODSCLASSORDER;   
   /**
    * 经销商(用逗号分开)
    */
   private String gOODSCLASSCOMPANY;   
   /**
    * 店铺
    */
   private String companyshop;   
   /**
    * 城市和县ID
    */
   private String companycity;   
   /**
    * 街道地址
    */
   private String companyaddress;   
   /**
    * 描述
    */
   private String companydetail;   
   /**
    * 状态
    */
   private String companystatue;   
   /**
    * 价格体系ID
    */
   private String pricesid;   
   /**
    * 分类
    */
   private String pricesclass;   
   /**
    * 等级
    */
   private String priceslevel;   
   /**
    * 单品价
    */
   private Float pricesprice;   
   /**
    * 单品单位
    */
   private String pricesunit;   
   /**
    * 套装价
    */
   private Float pricesprice2;   
   /**
    * 套装单位
    */
   private String pricesunit2;   
    //属性方法	    
     /**
	 *设置主键"收藏ID"属性
	 *@param collectid 实体的Collectid属性
	 */
	public void setCollectid(String collectid)
	{
		this.collectid = collectid;
	}
	
	/**
	 *获取主键"收藏ID"属性
	 */
	public String getCollectid()
	{
		return this.collectid;
	}

	/**
	 *设置"客户ID"属性
	 *@param collectcustomer 实体的Collectcustomer属性
	 */
	public void setCollectcustomer(String collectcustomer)
	{
		this.collectcustomer = collectcustomer;
	}
	
	/**
	 *获取"客户ID"属性
	 */
	public String getCollectcustomer()
	{
		return this.collectcustomer;
	}	   

	/**
	 *设置"描述"属性
	 *@param collectdetail 实体的Collectdetail属性
	 */
	public void setCollectdetail(String collectdetail)
	{
		this.collectdetail = collectdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getCollectdetail()
	{
		return this.collectdetail;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param collectcreatetime 实体的Collectcreatetime属性
	 */
	public void setCollectcreatetime(String collectcreatetime)
	{
		this.collectcreatetime = collectcreatetime;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getCollectcreatetime()
	{
		return this.collectcreatetime;
	}	   

	/**
	 *设置"商品ID"属性
	 *@param gOODSID 实体的GOODSID属性
	 */
	public void setGOODSID(String gOODSID)
	{
		this.gOODSID = gOODSID;
	}
	
	/**
	 *获取"商品ID"属性
	 */
	public String getGOODSID()
	{
		return this.gOODSID;
	}	   

	/**
	 *设置"经销商ID"属性
	 *@param gOODSCOMPANY 实体的GOODSCOMPANY属性
	 */
	public void setGOODSCOMPANY(String gOODSCOMPANY)
	{
		this.gOODSCOMPANY = gOODSCOMPANY;
	}
	
	/**
	 *获取"经销商ID"属性
	 */
	public String getGOODSCOMPANY()
	{
		return this.gOODSCOMPANY;
	}	   

	/**
	 *设置"编码"属性
	 *@param gOODSCODE 实体的GOODSCODE属性
	 */
	public void setGOODSCODE(String gOODSCODE)
	{
		this.gOODSCODE = gOODSCODE;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getGOODSCODE()
	{
		return this.gOODSCODE;
	}	   

	/**
	 *设置"名称"属性
	 *@param gOODSNAME 实体的GOODSNAME属性
	 */
	public void setGOODSNAME(String gOODSNAME)
	{
		this.gOODSNAME = gOODSNAME;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getGOODSNAME()
	{
		return this.gOODSNAME;
	}	   

	/**
	 *设置"描述"属性
	 *@param gOODSDETAIL 实体的GOODSDETAIL属性
	 */
	public void setGOODSDETAIL(String gOODSDETAIL)
	{
		this.gOODSDETAIL = gOODSDETAIL;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getGOODSDETAIL()
	{
		return this.gOODSDETAIL;
	}	   

	/**
	 *设置"规格"属性
	 *@param gOODSUNITS 实体的GOODSUNITS属性
	 */
	public void setGOODSUNITS(String gOODSUNITS)
	{
		this.gOODSUNITS = gOODSUNITS;
	}
	
	/**
	 *获取"规格"属性
	 */
	public String getGOODSUNITS()
	{
		return this.gOODSUNITS;
	}	   

	/**
	 *设置"小类ID"属性
	 *@param gOODSCLASS 实体的GOODSCLASS属性
	 */
	public void setGOODSCLASS(String gOODSCLASS)
	{
		this.gOODSCLASS = gOODSCLASS;
	}
	
	/**
	 *获取"小类ID"属性
	 */
	public String getGOODSCLASS()
	{
		return this.gOODSCLASS;
	}	   

	/**
	 *设置"图片"属性
	 *@param gOODSIMAGE 实体的GOODSIMAGE属性
	 */
	public void setGOODSIMAGE(String gOODSIMAGE)
	{
		this.gOODSIMAGE = gOODSIMAGE;
	}
	
	/**
	 *获取"图片"属性
	 */
	public String getGOODSIMAGE()
	{
		return this.gOODSIMAGE;
	}	   

	/**
	 *设置"状态"属性
	 *@param gOODSSTATUE 实体的GOODSSTATUE属性
	 */
	public void setGOODSSTATUE(String gOODSSTATUE)
	{
		this.gOODSSTATUE = gOODSSTATUE;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getGOODSSTATUE()
	{
		return this.gOODSSTATUE;
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
	 *设置"创建人"属性
	 *@param cREATOR 实体的CREATOR属性
	 */
	public void setCREATOR(String cREATOR)
	{
		this.cREATOR = cREATOR;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getCREATOR()
	{
		return this.cREATOR;
	}	   

	/**
	 *设置"修改人"属性
	 *@param uPDOR 实体的UPDOR属性
	 */
	public void setUPDOR(String uPDOR)
	{
		this.uPDOR = uPDOR;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getUPDOR()
	{
		return this.uPDOR;
	}	   

	/**
	 *设置"品牌"属性
	 *@param gOODSBRAND 实体的GOODSBRAND属性
	 */
	public void setGOODSBRAND(String gOODSBRAND)
	{
		this.gOODSBRAND = gOODSBRAND;
	}
	
	/**
	 *获取"品牌"属性
	 */
	public String getGOODSBRAND()
	{
		return this.gOODSBRAND;
	}	   

	/**
	 *设置"种类"属性
	 *@param gOODSTYPE 实体的GOODSTYPE属性
	 */
	public void setGOODSTYPE(String gOODSTYPE)
	{
		this.gOODSTYPE = gOODSTYPE;
	}
	
	/**
	 *获取"种类"属性
	 */
	public String getGOODSTYPE()
	{
		return this.gOODSTYPE;
	}	   

	/**
	 *设置"顺序"属性
	 *@param gOODSORDER 实体的GOODSORDER属性
	 */
	public void setGOODSORDER(String gOODSORDER)
	{
		this.gOODSORDER = gOODSORDER;
	}
	
	/**
	 *获取"顺序"属性
	 */
	public String getGOODSORDER()
	{
		return this.gOODSORDER;
	}	   

	/**
	 *设置"大小类ID"属性
	 *@param gOODSCLASSID 实体的GOODSCLASSID属性
	 */
	public void setGOODSCLASSID(String gOODSCLASSID)
	{
		this.gOODSCLASSID = gOODSCLASSID;
	}
	
	/**
	 *获取"大小类ID"属性
	 */
	public String getGOODSCLASSID()
	{
		return this.gOODSCLASSID;
	}	   

	/**
	 *设置"编码"属性
	 *@param gOODSCLASSCODE 实体的GOODSCLASSCODE属性
	 */
	public void setGOODSCLASSCODE(String gOODSCLASSCODE)
	{
		this.gOODSCLASSCODE = gOODSCLASSCODE;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getGOODSCLASSCODE()
	{
		return this.gOODSCLASSCODE;
	}	   

	/**
	 *设置"名称"属性
	 *@param gOODSCLASSNAME 实体的GOODSCLASSNAME属性
	 */
	public void setGOODSCLASSNAME(String gOODSCLASSNAME)
	{
		this.gOODSCLASSNAME = gOODSCLASSNAME;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getGOODSCLASSNAME()
	{
		return this.gOODSCLASSNAME;
	}	   

	/**
	 *设置"父类"属性
	 *@param gOODSCLASSPARENT 实体的GOODSCLASSPARENT属性
	 */
	public void setGOODSCLASSPARENT(String gOODSCLASSPARENT)
	{
		this.gOODSCLASSPARENT = gOODSCLASSPARENT;
	}
	
	/**
	 *获取"父类"属性
	 */
	public String getGOODSCLASSPARENT()
	{
		return this.gOODSCLASSPARENT;
	}	   

	/**
	 *设置"图标"属性
	 *@param gOODSCLASSDETAIL 实体的GOODSCLASSDETAIL属性
	 */
	public void setGOODSCLASSDETAIL(String gOODSCLASSDETAIL)
	{
		this.gOODSCLASSDETAIL = gOODSCLASSDETAIL;
	}
	
	/**
	 *获取"图标"属性
	 */
	public String getGOODSCLASSDETAIL()
	{
		return this.gOODSCLASSDETAIL;
	}	   

	/**
	 *设置"状态"属性
	 *@param gOODSCLASSSTATUE 实体的GOODSCLASSSTATUE属性
	 */
	public void setGOODSCLASSSTATUE(String gOODSCLASSSTATUE)
	{
		this.gOODSCLASSSTATUE = gOODSCLASSSTATUE;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getGOODSCLASSSTATUE()
	{
		return this.gOODSCLASSSTATUE;
	}	   

	/**
	 *设置"城市(用逗号分开)"属性
	 *@param gOODSCLASSCITY 实体的GOODSCLASSCITY属性
	 */
	public void setGOODSCLASSCITY(String gOODSCLASSCITY)
	{
		this.gOODSCLASSCITY = gOODSCLASSCITY;
	}
	
	/**
	 *获取"城市(用逗号分开)"属性
	 */
	public String getGOODSCLASSCITY()
	{
		return this.gOODSCLASSCITY;
	}	   

	/**
	 *设置"顺序"属性
	 *@param gOODSCLASSORDER 实体的GOODSCLASSORDER属性
	 */
	public void setGOODSCLASSORDER(String gOODSCLASSORDER)
	{
		this.gOODSCLASSORDER = gOODSCLASSORDER;
	}
	
	/**
	 *获取"顺序"属性
	 */
	public String getGOODSCLASSORDER()
	{
		return this.gOODSCLASSORDER;
	}	   

	/**
	 *设置"经销商(用逗号分开)"属性
	 *@param gOODSCLASSCOMPANY 实体的GOODSCLASSCOMPANY属性
	 */
	public void setGOODSCLASSCOMPANY(String gOODSCLASSCOMPANY)
	{
		this.gOODSCLASSCOMPANY = gOODSCLASSCOMPANY;
	}
	
	/**
	 *获取"经销商(用逗号分开)"属性
	 */
	public String getGOODSCLASSCOMPANY()
	{
		return this.gOODSCLASSCOMPANY;
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
	 *设置"价格体系ID"属性
	 *@param pricesid 实体的Pricesid属性
	 */
	public void setPricesid(String pricesid)
	{
		this.pricesid = pricesid;
	}
	
	/**
	 *获取"价格体系ID"属性
	 */
	public String getPricesid()
	{
		return this.pricesid;
	}	   

	/**
	 *设置"分类"属性
	 *@param pricesclass 实体的Pricesclass属性
	 */
	public void setPricesclass(String pricesclass)
	{
		this.pricesclass = pricesclass;
	}
	
	/**
	 *获取"分类"属性
	 */
	public String getPricesclass()
	{
		return this.pricesclass;
	}	   

	/**
	 *设置"等级"属性
	 *@param priceslevel 实体的Priceslevel属性
	 */
	public void setPriceslevel(String priceslevel)
	{
		this.priceslevel = priceslevel;
	}
	
	/**
	 *获取"等级"属性
	 */
	public String getPriceslevel()
	{
		return this.priceslevel;
	}	   

	/**
	 *设置"单品价"属性
	 *@param pricesprice 实体的Pricesprice属性
	 */
	public void setPricesprice(Float pricesprice)
	{
		this.pricesprice = pricesprice;
	}
	
	/**
	 *获取"单品价"属性
	 */
	public Float getPricesprice()
	{
		return this.pricesprice;
	}	   

	/**
	 *设置"单品单位"属性
	 *@param pricesunit 实体的Pricesunit属性
	 */
	public void setPricesunit(String pricesunit)
	{
		this.pricesunit = pricesunit;
	}
	
	/**
	 *获取"单品单位"属性
	 */
	public String getPricesunit()
	{
		return this.pricesunit;
	}	   

	/**
	 *设置"套装价"属性
	 *@param pricesprice2 实体的Pricesprice2属性
	 */
	public void setPricesprice2(Float pricesprice2)
	{
		this.pricesprice2 = pricesprice2;
	}
	
	/**
	 *获取"套装价"属性
	 */
	public Float getPricesprice2()
	{
		return this.pricesprice2;
	}	   

	/**
	 *设置"套装单位"属性
	 *@param pricesunit2 实体的Pricesunit2属性
	 */
	public void setPricesunit2(String pricesunit2)
	{
		this.pricesunit2 = pricesunit2;
	}
	
	/**
	 *获取"套装单位"属性
	 */
	public String getPricesunit2()
	{
		return this.pricesunit2;
	}	   
	public Collectview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collectview(
		String collectid
	 	,String collectcustomer
	 	,String collectdetail
	 	,String collectcreatetime
	 	,String gOODSID
	 	,String gOODSCOMPANY
	 	,String gOODSCODE
	 	,String gOODSNAME
	 	,String gOODSDETAIL
	 	,String gOODSUNITS
	 	,String gOODSCLASS
	 	,String gOODSIMAGE
	 	,String gOODSSTATUE
	 	,String cREATETIME
	 	,String uPDTIME
	 	,String cREATOR
	 	,String uPDOR
	 	,String gOODSBRAND
	 	,String gOODSTYPE
	 	,String gOODSORDER
	 	,String gOODSCLASSID
	 	,String gOODSCLASSCODE
	 	,String gOODSCLASSNAME
	 	,String gOODSCLASSPARENT
	 	,String gOODSCLASSDETAIL
	 	,String gOODSCLASSSTATUE
	 	,String gOODSCLASSCITY
	 	,String gOODSCLASSORDER
	 	,String gOODSCLASSCOMPANY
	 	,String companyshop
	 	,String companycity
	 	,String companyaddress
	 	,String companydetail
	 	,String companystatue
	 	,String pricesid
	 	,String pricesclass
	 	,String priceslevel
	 	,Float pricesprice
	 	,String pricesunit
	 	,Float pricesprice2
	 	,String pricesunit2
		 ){
		super();
		this.collectid = collectid;
	 	this.collectcustomer = collectcustomer;
	 	this.collectdetail = collectdetail;
	 	this.collectcreatetime = collectcreatetime;
	 	this.gOODSID = gOODSID;
	 	this.gOODSCOMPANY = gOODSCOMPANY;
	 	this.gOODSCODE = gOODSCODE;
	 	this.gOODSNAME = gOODSNAME;
	 	this.gOODSDETAIL = gOODSDETAIL;
	 	this.gOODSUNITS = gOODSUNITS;
	 	this.gOODSCLASS = gOODSCLASS;
	 	this.gOODSIMAGE = gOODSIMAGE;
	 	this.gOODSSTATUE = gOODSSTATUE;
	 	this.cREATETIME = cREATETIME;
	 	this.uPDTIME = uPDTIME;
	 	this.cREATOR = cREATOR;
	 	this.uPDOR = uPDOR;
	 	this.gOODSBRAND = gOODSBRAND;
	 	this.gOODSTYPE = gOODSTYPE;
	 	this.gOODSORDER = gOODSORDER;
	 	this.gOODSCLASSID = gOODSCLASSID;
	 	this.gOODSCLASSCODE = gOODSCLASSCODE;
	 	this.gOODSCLASSNAME = gOODSCLASSNAME;
	 	this.gOODSCLASSPARENT = gOODSCLASSPARENT;
	 	this.gOODSCLASSDETAIL = gOODSCLASSDETAIL;
	 	this.gOODSCLASSSTATUE = gOODSCLASSSTATUE;
	 	this.gOODSCLASSCITY = gOODSCLASSCITY;
	 	this.gOODSCLASSORDER = gOODSCLASSORDER;
	 	this.gOODSCLASSCOMPANY = gOODSCLASSCOMPANY;
	 	this.companyshop = companyshop;
	 	this.companycity = companycity;
	 	this.companyaddress = companyaddress;
	 	this.companydetail = companydetail;
	 	this.companystatue = companystatue;
	 	this.pricesid = pricesid;
	 	this.pricesclass = pricesclass;
	 	this.priceslevel = priceslevel;
	 	this.pricesprice = pricesprice;
	 	this.pricesunit = pricesunit;
	 	this.pricesprice2 = pricesprice2;
	 	this.pricesunit2 = pricesunit2;
	}
}

