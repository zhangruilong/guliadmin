package com.server.pojo;

import java.sql.Date;
/**
 * goodsnum 实体类
 *@author ZhangRuiLong
 */
public class Goodsnum
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
	public Goodsnum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goodsnum(
		String idgoodsnum
	 	,String goodsnumgoods
	 	,String goodsnumnum
	 	,String goodsnumstore
		 ){
		super();
		this.idgoodsnum = idgoodsnum;
	 	this.goodsnumgoods = goodsnumgoods;
	 	this.goodsnumnum = goodsnumnum;
	 	this.goodsnumstore = goodsnumstore;
	}
}

