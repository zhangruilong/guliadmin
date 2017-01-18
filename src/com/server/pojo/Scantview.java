package com.server.pojo;

import java.sql.Date;
/**
 * scantview 实体类
 *@author ZhangRuiLong
 */
public class Scantview
{
   /**
    * 标品ID,主键
    */
   private String sCANTID; 
   /**
    * 编码
    */
   private String sCANTCODE;   
   /**
    * 名称
    */
   private String sCANTNAME;   
   /**
    * 描述
    */
   private String sCANTDETAIL;   
   /**
    * 规格
    */
   private String sCANTUNITS;   
   /**
    * 小类ID
    */
   private String sCANTCLASS;   
   /**
    * 图片
    */
   private String sCANTIMAGE;   
   /**
    * 品牌
    */
   private String sCANTBRAND;   
   /**
    * 种类
    */
   private String sCANTTYPE;   
   /**
    * 状态
    */
   private String sCANTSTATUE;   
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
    //属性方法	    
     /**
	 *设置主键"标品ID"属性
	 *@param sCANTID 实体的SCANTID属性
	 */
	public void setSCANTID(String sCANTID)
	{
		this.sCANTID = sCANTID;
	}
	
	/**
	 *获取主键"标品ID"属性
	 */
	public String getSCANTID()
	{
		return this.sCANTID;
	}

	/**
	 *设置"编码"属性
	 *@param sCANTCODE 实体的SCANTCODE属性
	 */
	public void setSCANTCODE(String sCANTCODE)
	{
		this.sCANTCODE = sCANTCODE;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getSCANTCODE()
	{
		return this.sCANTCODE;
	}	   

	/**
	 *设置"名称"属性
	 *@param sCANTNAME 实体的SCANTNAME属性
	 */
	public void setSCANTNAME(String sCANTNAME)
	{
		this.sCANTNAME = sCANTNAME;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getSCANTNAME()
	{
		return this.sCANTNAME;
	}	   

	/**
	 *设置"描述"属性
	 *@param sCANTDETAIL 实体的SCANTDETAIL属性
	 */
	public void setSCANTDETAIL(String sCANTDETAIL)
	{
		this.sCANTDETAIL = sCANTDETAIL;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getSCANTDETAIL()
	{
		return this.sCANTDETAIL;
	}	   

	/**
	 *设置"规格"属性
	 *@param sCANTUNITS 实体的SCANTUNITS属性
	 */
	public void setSCANTUNITS(String sCANTUNITS)
	{
		this.sCANTUNITS = sCANTUNITS;
	}
	
	/**
	 *获取"规格"属性
	 */
	public String getSCANTUNITS()
	{
		return this.sCANTUNITS;
	}	   

	/**
	 *设置"小类ID"属性
	 *@param sCANTCLASS 实体的SCANTCLASS属性
	 */
	public void setSCANTCLASS(String sCANTCLASS)
	{
		this.sCANTCLASS = sCANTCLASS;
	}
	
	/**
	 *获取"小类ID"属性
	 */
	public String getSCANTCLASS()
	{
		return this.sCANTCLASS;
	}	   

	/**
	 *设置"图片"属性
	 *@param sCANTIMAGE 实体的SCANTIMAGE属性
	 */
	public void setSCANTIMAGE(String sCANTIMAGE)
	{
		this.sCANTIMAGE = sCANTIMAGE;
	}
	
	/**
	 *获取"图片"属性
	 */
	public String getSCANTIMAGE()
	{
		return this.sCANTIMAGE;
	}	   

	/**
	 *设置"品牌"属性
	 *@param sCANTBRAND 实体的SCANTBRAND属性
	 */
	public void setSCANTBRAND(String sCANTBRAND)
	{
		this.sCANTBRAND = sCANTBRAND;
	}
	
	/**
	 *获取"品牌"属性
	 */
	public String getSCANTBRAND()
	{
		return this.sCANTBRAND;
	}	   

	/**
	 *设置"种类"属性
	 *@param sCANTTYPE 实体的SCANTTYPE属性
	 */
	public void setSCANTTYPE(String sCANTTYPE)
	{
		this.sCANTTYPE = sCANTTYPE;
	}
	
	/**
	 *获取"种类"属性
	 */
	public String getSCANTTYPE()
	{
		return this.sCANTTYPE;
	}	   

	/**
	 *设置"状态"属性
	 *@param sCANTSTATUE 实体的SCANTSTATUE属性
	 */
	public void setSCANTSTATUE(String sCANTSTATUE)
	{
		this.sCANTSTATUE = sCANTSTATUE;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getSCANTSTATUE()
	{
		return this.sCANTSTATUE;
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
	public Scantview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Scantview(
		String sCANTID
	 	,String sCANTCODE
	 	,String sCANTNAME
	 	,String sCANTDETAIL
	 	,String sCANTUNITS
	 	,String sCANTCLASS
	 	,String sCANTIMAGE
	 	,String sCANTBRAND
	 	,String sCANTTYPE
	 	,String sCANTSTATUE
	 	,String gOODSCLASSID
	 	,String gOODSCLASSCODE
	 	,String gOODSCLASSNAME
	 	,String gOODSCLASSPARENT
	 	,String gOODSCLASSDETAIL
	 	,String gOODSCLASSSTATUE
	 	,String gOODSCLASSCITY
	 	,String gOODSCLASSORDER
	 	,String gOODSCLASSCOMPANY
		 ){
		super();
		this.sCANTID = sCANTID;
	 	this.sCANTCODE = sCANTCODE;
	 	this.sCANTNAME = sCANTNAME;
	 	this.sCANTDETAIL = sCANTDETAIL;
	 	this.sCANTUNITS = sCANTUNITS;
	 	this.sCANTCLASS = sCANTCLASS;
	 	this.sCANTIMAGE = sCANTIMAGE;
	 	this.sCANTBRAND = sCANTBRAND;
	 	this.sCANTTYPE = sCANTTYPE;
	 	this.sCANTSTATUE = sCANTSTATUE;
	 	this.gOODSCLASSID = gOODSCLASSID;
	 	this.gOODSCLASSCODE = gOODSCLASSCODE;
	 	this.gOODSCLASSNAME = gOODSCLASSNAME;
	 	this.gOODSCLASSPARENT = gOODSCLASSPARENT;
	 	this.gOODSCLASSDETAIL = gOODSCLASSDETAIL;
	 	this.gOODSCLASSSTATUE = gOODSCLASSSTATUE;
	 	this.gOODSCLASSCITY = gOODSCLASSCITY;
	 	this.gOODSCLASSORDER = gOODSCLASSORDER;
	 	this.gOODSCLASSCOMPANY = gOODSCLASSCOMPANY;
	}
}

