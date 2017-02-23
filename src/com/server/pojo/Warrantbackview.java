package com.server.pojo;

import java.sql.Date;
/**
 * warrantbackview 实体类
 *@author ZhangRuiLong
 */
public class Warrantbackview
{
   /**
    * ID,主键
    */
   private String idwarrantback; 
   /**
    * 仓库
    */
   private String warrantbackstore;   
   /**
    * 商品
    */
   private String warrantbackgoods;   
   /**
    * 商品编号
    */
   private String goodscode;   
   /**
    * 商品名称
    */
   private String goodsname;   
   /**
    * 规格
    */
   private String goodsunits;   
   /**
    * 名称
    */
   private String storehousename;   
   /**
    * 数量
    */
   private String warrantbacknum;   
   /**
    * 退货人
    */
   private String warrantbackwho;   
   /**
    * 状态
    */
   private String warrantbackstatue;   
   /**
    * 描述
    */
   private String warrantbackdetail;   
   /**
    * 创建时间
    */
   private String warrantbackinswhen;   
   /**
    * 创建人
    */
   private String warrantbackinswho;   
   /**
    * 修改时间
    */
   private String warrantbackupdwhen;   
   /**
    * 修改人
    */
   private String warrantbackupdwho;   
   /**
    * 商品ID
    */
   private String goodsid;   
   /**
    * 经销商ID
    */
   private String goodscompany;   
    //属性方法	    
     /**
	 *设置主键"ID"属性
	 *@param idwarrantback 实体的Idwarrantback属性
	 */
	public void setIdwarrantback(String idwarrantback)
	{
		this.idwarrantback = idwarrantback;
	}
	
	/**
	 *获取主键"ID"属性
	 */
	public String getIdwarrantback()
	{
		return this.idwarrantback;
	}

	/**
	 *设置"仓库"属性
	 *@param warrantbackstore 实体的Warrantbackstore属性
	 */
	public void setWarrantbackstore(String warrantbackstore)
	{
		this.warrantbackstore = warrantbackstore;
	}
	
	/**
	 *获取"仓库"属性
	 */
	public String getWarrantbackstore()
	{
		return this.warrantbackstore;
	}	   

	/**
	 *设置"商品"属性
	 *@param warrantbackgoods 实体的Warrantbackgoods属性
	 */
	public void setWarrantbackgoods(String warrantbackgoods)
	{
		this.warrantbackgoods = warrantbackgoods;
	}
	
	/**
	 *获取"商品"属性
	 */
	public String getWarrantbackgoods()
	{
		return this.warrantbackgoods;
	}	   

	/**
	 *设置"数量"属性
	 *@param warrantbacknum 实体的Warrantbacknum属性
	 */
	public void setWarrantbacknum(String warrantbacknum)
	{
		this.warrantbacknum = warrantbacknum;
	}
	
	/**
	 *获取"数量"属性
	 */
	public String getWarrantbacknum()
	{
		return this.warrantbacknum;
	}	   

	/**
	 *设置"退货人"属性
	 *@param warrantbackwho 实体的Warrantbackwho属性
	 */
	public void setWarrantbackwho(String warrantbackwho)
	{
		this.warrantbackwho = warrantbackwho;
	}
	
	/**
	 *获取"退货人"属性
	 */
	public String getWarrantbackwho()
	{
		return this.warrantbackwho;
	}	   

	/**
	 *设置"状态"属性
	 *@param warrantbackstatue 实体的Warrantbackstatue属性
	 */
	public void setWarrantbackstatue(String warrantbackstatue)
	{
		this.warrantbackstatue = warrantbackstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getWarrantbackstatue()
	{
		return this.warrantbackstatue;
	}	   

	/**
	 *设置"描述"属性
	 *@param warrantbackdetail 实体的Warrantbackdetail属性
	 */
	public void setWarrantbackdetail(String warrantbackdetail)
	{
		this.warrantbackdetail = warrantbackdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getWarrantbackdetail()
	{
		return this.warrantbackdetail;
	}	   

	/**
	 *设置"创建人"属性
	 *@param warrantbackinswho 实体的Warrantbackinswho属性
	 */
	public void setWarrantbackinswho(String warrantbackinswho)
	{
		this.warrantbackinswho = warrantbackinswho;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getWarrantbackinswho()
	{
		return this.warrantbackinswho;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param warrantbackinswhen 实体的Warrantbackinswhen属性
	 */
	public void setWarrantbackinswhen(String warrantbackinswhen)
	{
		this.warrantbackinswhen = warrantbackinswhen;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getWarrantbackinswhen()
	{
		return this.warrantbackinswhen;
	}	   

	/**
	 *设置"修改人"属性
	 *@param warrantbackupdwho 实体的Warrantbackupdwho属性
	 */
	public void setWarrantbackupdwho(String warrantbackupdwho)
	{
		this.warrantbackupdwho = warrantbackupdwho;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getWarrantbackupdwho()
	{
		return this.warrantbackupdwho;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param warrantbackupdwhen 实体的Warrantbackupdwhen属性
	 */
	public void setWarrantbackupdwhen(String warrantbackupdwhen)
	{
		this.warrantbackupdwhen = warrantbackupdwhen;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getWarrantbackupdwhen()
	{
		return this.warrantbackupdwhen;
	}	   

	/**
	 *设置"商品ID"属性
	 *@param goodsid 实体的Goodsid属性
	 */
	public void setGoodsid(String goodsid)
	{
		this.goodsid = goodsid;
	}
	
	/**
	 *获取"商品ID"属性
	 */
	public String getGoodsid()
	{
		return this.goodsid;
	}	   

	/**
	 *设置"经销商ID"属性
	 *@param goodscompany 实体的Goodscompany属性
	 */
	public void setGoodscompany(String goodscompany)
	{
		this.goodscompany = goodscompany;
	}
	
	/**
	 *获取"经销商ID"属性
	 */
	public String getGoodscompany()
	{
		return this.goodscompany;
	}	   

	/**
	 *设置"商品编号"属性
	 *@param goodscode 实体的Goodscode属性
	 */
	public void setGoodscode(String goodscode)
	{
		this.goodscode = goodscode;
	}
	
	/**
	 *获取"商品编号"属性
	 */
	public String getGoodscode()
	{
		return this.goodscode;
	}	   

	/**
	 *设置"商品名称"属性
	 *@param goodsname 实体的Goodsname属性
	 */
	public void setGoodsname(String goodsname)
	{
		this.goodsname = goodsname;
	}
	
	/**
	 *获取"商品名称"属性
	 */
	public String getGoodsname()
	{
		return this.goodsname;
	}	   

	/**
	 *设置"规格"属性
	 *@param goodsunits 实体的Goodsunits属性
	 */
	public void setGoodsunits(String goodsunits)
	{
		this.goodsunits = goodsunits;
	}
	
	/**
	 *获取"规格"属性
	 */
	public String getGoodsunits()
	{
		return this.goodsunits;
	}	   

	/**
	 *设置"名称"属性
	 *@param storehousename 实体的Storehousename属性
	 */
	public void setStorehousename(String storehousename)
	{
		this.storehousename = storehousename;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getStorehousename()
	{
		return this.storehousename;
	}	   
	public Warrantbackview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warrantbackview(
		String idwarrantback
	 	,String warrantbackstore
	 	,String warrantbackgoods
	 	,String warrantbacknum
	 	,String warrantbackwho
	 	,String warrantbackstatue
	 	,String warrantbackdetail
	 	,String warrantbackinswho
	 	,String warrantbackinswhen
	 	,String warrantbackupdwho
	 	,String warrantbackupdwhen
	 	,String goodsid
	 	,String goodscompany
	 	,String goodscode
	 	,String goodsname
	 	,String goodsunits
	 	,String storehousename
		 ){
		super();
		this.idwarrantback = idwarrantback;
	 	this.warrantbackstore = warrantbackstore;
	 	this.warrantbackgoods = warrantbackgoods;
	 	this.warrantbacknum = warrantbacknum;
	 	this.warrantbackwho = warrantbackwho;
	 	this.warrantbackstatue = warrantbackstatue;
	 	this.warrantbackdetail = warrantbackdetail;
	 	this.warrantbackinswho = warrantbackinswho;
	 	this.warrantbackinswhen = warrantbackinswhen;
	 	this.warrantbackupdwho = warrantbackupdwho;
	 	this.warrantbackupdwhen = warrantbackupdwhen;
	 	this.goodsid = goodsid;
	 	this.goodscompany = goodscompany;
	 	this.goodscode = goodscode;
	 	this.goodsname = goodsname;
	 	this.goodsunits = goodsunits;
	 	this.storehousename = storehousename;
	}
}

