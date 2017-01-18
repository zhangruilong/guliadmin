package com.server.pojo;

import java.sql.Date;
/**
 * warrantoutview 实体类
 *@author ZhangRuiLong
 */
public class Warrantoutview
{
   /**
    * ID,主键
    */
   private String idwarrantout; 
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
    * 更新时间
    */
   private String warrantoutupdwhen;   
   /**
    * 更新人
    */
   private String warrantoutupdwho;   
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
    * 
    */
   private String gOODSWEIGHT;   
   /**
    * 名称
    */
   private String gOODSCLASSNAME;   
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
	 *设置"更新时间"属性
	 *@param warrantoutupdwhen 实体的Warrantoutupdwhen属性
	 */
	public void setWarrantoutupdwhen(String warrantoutupdwhen)
	{
		this.warrantoutupdwhen = warrantoutupdwhen;
	}
	
	/**
	 *获取"更新时间"属性
	 */
	public String getWarrantoutupdwhen()
	{
		return this.warrantoutupdwhen;
	}	   

	/**
	 *设置"更新人"属性
	 *@param warrantoutupdwho 实体的Warrantoutupdwho属性
	 */
	public void setWarrantoutupdwho(String warrantoutupdwho)
	{
		this.warrantoutupdwho = warrantoutupdwho;
	}
	
	/**
	 *获取"更新人"属性
	 */
	public String getWarrantoutupdwho()
	{
		return this.warrantoutupdwho;
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
	 *设置""属性
	 *@param gOODSWEIGHT 实体的GOODSWEIGHT属性
	 */
	public void setGOODSWEIGHT(String gOODSWEIGHT)
	{
		this.gOODSWEIGHT = gOODSWEIGHT;
	}
	
	/**
	 *获取""属性
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
	public Warrantoutview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warrantoutview(
		String idwarrantout
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
		this.idwarrantout = idwarrantout;
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

