package com.server.pojo;

import java.sql.Date;
/**
 * warrantin 实体类
 *@author ZhangRuiLong
 */
public class Warrantin
{
   /**
    * ID,主键
    */
   private String idwarrantin; 
   /**
    * 仓库ID
    */
   private String warrantinstore;   
   /**
    * 供货单位ID
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
    * 进货金额
    */
   private String warrantinmoney;   
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
	 *设置"仓库ID"属性
	 *@param warrantinstore 实体的Warrantinstore属性
	 */
	public void setWarrantinstore(String warrantinstore)
	{
		this.warrantinstore = warrantinstore;
	}
	
	/**
	 *获取"仓库ID"属性
	 */
	public String getWarrantinstore()
	{
		return this.warrantinstore;
	}	   

	/**
	 *设置"供货单位ID"属性
	 *@param warrantinfrom 实体的Warrantinfrom属性
	 */
	public void setWarrantinfrom(String warrantinfrom)
	{
		this.warrantinfrom = warrantinfrom;
	}
	
	/**
	 *获取"供货单位ID"属性
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
	 *设置"进货金额"属性
	 *@param warrantinmoney 实体的Warrantinmoney属性
	 */
	public void setWarrantinmoney(String warrantinmoney)
	{
		this.warrantinmoney = warrantinmoney;
	}
	
	/**
	 *获取"进货金额"属性
	 */
	public String getWarrantinmoney()
	{
		return this.warrantinmoney;
	}	   
	public Warrantin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warrantin(
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
	 	,String warrantinmoney
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
	 	this.warrantinmoney = warrantinmoney;
	}
}

