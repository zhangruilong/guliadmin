package com.server.pojo;

import java.sql.Date;
/**
 * goodsnumview 实体类
 *@author ZhangRuiLong
 */
public class Goodsnumview
{
   /**
    * ID,主键
    */
   private String idgoodsnum; 
   /**
    * 商品
    */
   private String goodsnumgoods;   
   /**
    * 数量
    */
   private String goodsnumnum;   
   /**
    * 仓库
    */
   private String goodsnumstore;   
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
    //属性方法	    
     /**
	 *设置主键"ID"属性
	 *@param idgoodsnum 实体的Idgoodsnum属性
	 */
	public void setIdgoodsnum(String idgoodsnum)
	{
		this.idgoodsnum = idgoodsnum;
	}
	
	/**
	 *获取主键"ID"属性
	 */
	public String getIdgoodsnum()
	{
		return this.idgoodsnum;
	}

	/**
	 *设置"商品"属性
	 *@param goodsnumgoods 实体的Goodsnumgoods属性
	 */
	public void setGoodsnumgoods(String goodsnumgoods)
	{
		this.goodsnumgoods = goodsnumgoods;
	}
	
	/**
	 *获取"商品"属性
	 */
	public String getGoodsnumgoods()
	{
		return this.goodsnumgoods;
	}	   

	/**
	 *设置"数量"属性
	 *@param goodsnumnum 实体的Goodsnumnum属性
	 */
	public void setGoodsnumnum(String goodsnumnum)
	{
		this.goodsnumnum = goodsnumnum;
	}
	
	/**
	 *获取"数量"属性
	 */
	public String getGoodsnumnum()
	{
		return this.goodsnumnum;
	}	   

	/**
	 *设置"仓库"属性
	 *@param goodsnumstore 实体的Goodsnumstore属性
	 */
	public void setGoodsnumstore(String goodsnumstore)
	{
		this.goodsnumstore = goodsnumstore;
	}
	
	/**
	 *获取"仓库"属性
	 */
	public String getGoodsnumstore()
	{
		return this.goodsnumstore;
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
	public Goodsnumview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goodsnumview(
		String idgoodsnum
	 	,String goodsnumgoods
	 	,String goodsnumnum
	 	,String goodsnumstore
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
		 ){
		super();
		this.idgoodsnum = idgoodsnum;
	 	this.goodsnumgoods = goodsnumgoods;
	 	this.goodsnumnum = goodsnumnum;
	 	this.goodsnumstore = goodsnumstore;
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
	}
}

