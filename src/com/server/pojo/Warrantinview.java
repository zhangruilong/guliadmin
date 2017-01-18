package com.server.pojo;

import java.sql.Date;
/**
 * warrantinview 实体类
 *@author ZhangRuiLong
 */
public class Warrantinview
{
   /**
    * ID,主键
    */
   private String idwarrantin; 
   /**
    * 仓库
    */
   private String warrantinstore;   
   /**
    * 供货单位
    */
   private String warrantinfrom;   
   /**
    * 商品
    */
   private String warrantingoods;   
   /**
    * 进货价
    */
   private String warrantinprice;   
   /**
    * 数量
    */
   private String warrantinnum;   
   /**
    * 检验员
    */
   private String warrantinwho;   
   /**
    * 状态
    */
   private String warrantinstatue;   
   /**
    * 备注
    */
   private String warrantindetail;   
   /**
    * 创建时间
    */
   private String warrantininswhen;   
   /**
    * 创建人
    */
   private String warrantininswho;   
   /**
    * 修改时间
    */
   private String warrantinupdwhen;   
   /**
    * 修改人
    */
   private String warrantinupdwho;   
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
    * 重量
    */
   private String gOODSWEIGHT;   
   /**
    * 名称
    */
   private String gOODSCLASSNAME;   
    //属性方法	    
     /**
	 *设置主键"ID"属性
	 *@param idwarrantin 实体的Idwarrantin属性
	 */
	public void setIdwarrantin(String idwarrantin)
	{
		this.idwarrantin = idwarrantin;
	}
	
	/**
	 *获取主键"ID"属性
	 */
	public String getIdwarrantin()
	{
		return this.idwarrantin;
	}

	/**
	 *设置"仓库"属性
	 *@param warrantinstore 实体的Warrantinstore属性
	 */
	public void setWarrantinstore(String warrantinstore)
	{
		this.warrantinstore = warrantinstore;
	}
	
	/**
	 *获取"仓库"属性
	 */
	public String getWarrantinstore()
	{
		return this.warrantinstore;
	}	   

	/**
	 *设置"供货单位"属性
	 *@param warrantinfrom 实体的Warrantinfrom属性
	 */
	public void setWarrantinfrom(String warrantinfrom)
	{
		this.warrantinfrom = warrantinfrom;
	}
	
	/**
	 *获取"供货单位"属性
	 */
	public String getWarrantinfrom()
	{
		return this.warrantinfrom;
	}	   

	/**
	 *设置"商品"属性
	 *@param warrantingoods 实体的Warrantingoods属性
	 */
	public void setWarrantingoods(String warrantingoods)
	{
		this.warrantingoods = warrantingoods;
	}
	
	/**
	 *获取"商品"属性
	 */
	public String getWarrantingoods()
	{
		return this.warrantingoods;
	}	   

	/**
	 *设置"进货价"属性
	 *@param warrantinprice 实体的Warrantinprice属性
	 */
	public void setWarrantinprice(String warrantinprice)
	{
		this.warrantinprice = warrantinprice;
	}
	
	/**
	 *获取"进货价"属性
	 */
	public String getWarrantinprice()
	{
		return this.warrantinprice;
	}	   

	/**
	 *设置"数量"属性
	 *@param warrantinnum 实体的Warrantinnum属性
	 */
	public void setWarrantinnum(String warrantinnum)
	{
		this.warrantinnum = warrantinnum;
	}
	
	/**
	 *获取"数量"属性
	 */
	public String getWarrantinnum()
	{
		return this.warrantinnum;
	}	   

	/**
	 *设置"检验员"属性
	 *@param warrantinwho 实体的Warrantinwho属性
	 */
	public void setWarrantinwho(String warrantinwho)
	{
		this.warrantinwho = warrantinwho;
	}
	
	/**
	 *获取"检验员"属性
	 */
	public String getWarrantinwho()
	{
		return this.warrantinwho;
	}	   

	/**
	 *设置"状态"属性
	 *@param warrantinstatue 实体的Warrantinstatue属性
	 */
	public void setWarrantinstatue(String warrantinstatue)
	{
		this.warrantinstatue = warrantinstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getWarrantinstatue()
	{
		return this.warrantinstatue;
	}	   

	/**
	 *设置"备注"属性
	 *@param warrantindetail 实体的Warrantindetail属性
	 */
	public void setWarrantindetail(String warrantindetail)
	{
		this.warrantindetail = warrantindetail;
	}
	
	/**
	 *获取"备注"属性
	 */
	public String getWarrantindetail()
	{
		return this.warrantindetail;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param warrantininswhen 实体的Warrantininswhen属性
	 */
	public void setWarrantininswhen(String warrantininswhen)
	{
		this.warrantininswhen = warrantininswhen;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getWarrantininswhen()
	{
		return this.warrantininswhen;
	}	   

	/**
	 *设置"创建人"属性
	 *@param warrantininswho 实体的Warrantininswho属性
	 */
	public void setWarrantininswho(String warrantininswho)
	{
		this.warrantininswho = warrantininswho;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getWarrantininswho()
	{
		return this.warrantininswho;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param warrantinupdwhen 实体的Warrantinupdwhen属性
	 */
	public void setWarrantinupdwhen(String warrantinupdwhen)
	{
		this.warrantinupdwhen = warrantinupdwhen;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getWarrantinupdwhen()
	{
		return this.warrantinupdwhen;
	}	   

	/**
	 *设置"修改人"属性
	 *@param warrantinupdwho 实体的Warrantinupdwho属性
	 */
	public void setWarrantinupdwho(String warrantinupdwho)
	{
		this.warrantinupdwho = warrantinupdwho;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getWarrantinupdwho()
	{
		return this.warrantinupdwho;
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
	 *设置"重量"属性
	 *@param gOODSWEIGHT 实体的GOODSWEIGHT属性
	 */
	public void setGOODSWEIGHT(String gOODSWEIGHT)
	{
		this.gOODSWEIGHT = gOODSWEIGHT;
	}
	
	/**
	 *获取"重量"属性
	 */
	public String getGOODSWEIGHT()
	{
		return this.gOODSWEIGHT;
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
	public Warrantinview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warrantinview(
		String idwarrantin
	 	,String warrantinstore
	 	,String warrantinfrom
	 	,String warrantingoods
	 	,String warrantinprice
	 	,String warrantinnum
	 	,String warrantinwho
	 	,String warrantinstatue
	 	,String warrantindetail
	 	,String warrantininswhen
	 	,String warrantininswho
	 	,String warrantinupdwhen
	 	,String warrantinupdwho
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
	 	,String gOODSWEIGHT
	 	,String gOODSCLASSNAME
		 ){
		super();
		this.idwarrantin = idwarrantin;
	 	this.warrantinstore = warrantinstore;
	 	this.warrantinfrom = warrantinfrom;
	 	this.warrantingoods = warrantingoods;
	 	this.warrantinprice = warrantinprice;
	 	this.warrantinnum = warrantinnum;
	 	this.warrantinwho = warrantinwho;
	 	this.warrantinstatue = warrantinstatue;
	 	this.warrantindetail = warrantindetail;
	 	this.warrantininswhen = warrantininswhen;
	 	this.warrantininswho = warrantininswho;
	 	this.warrantinupdwhen = warrantinupdwhen;
	 	this.warrantinupdwho = warrantinupdwho;
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
	 	this.gOODSWEIGHT = gOODSWEIGHT;
	 	this.gOODSCLASSNAME = gOODSCLASSNAME;
	}
}

