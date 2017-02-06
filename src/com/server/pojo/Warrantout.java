package com.server.pojo;

import java.sql.Date;
/**
 * warrantout 实体类
 *@author ZhangRuiLong
 */
public class Warrantout
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
    * 修改时间
    */
   private String warrantoutupdwhen;   
   /**
    * 修改人
    */
   private String warrantoutupdwho;   
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
	 *设置"修改时间"属性
	 *@param warrantoutupdwhen 实体的Warrantoutupdwhen属性
	 */
	public void setWarrantoutupdwhen(String warrantoutupdwhen)
	{
		this.warrantoutupdwhen = warrantoutupdwhen;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getWarrantoutupdwhen()
	{
		return this.warrantoutupdwhen;
	}	   

	/**
	 *设置"修改人"属性
	 *@param warrantoutupdwho 实体的Warrantoutupdwho属性
	 */
	public void setWarrantoutupdwho(String warrantoutupdwho)
	{
		this.warrantoutupdwho = warrantoutupdwho;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getWarrantoutupdwho()
	{
		return this.warrantoutupdwho;
	}	   
	public Warrantout() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warrantout(
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
	}
}

