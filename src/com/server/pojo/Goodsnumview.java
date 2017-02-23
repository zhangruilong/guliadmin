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
    * 商品ID
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
   private String goodsid;   
   /**
    * 经销商ID
    */
   private String goodscompany;   
   /**
    * 商品编号
    */
   private String goodscode;   
   /**
    * 商品名称
    */
   private String goodsname;   
   /**
    * 描述
    */
   private String goodsdetail;   
   /**
    * 规格
    */
   private String goodsunits;   
   /**
    * 小类ID
    */
   private String goodsclass;   
   /**
    * 图片路径
    */
   private String goodsimage;   
   /**
    * 状态
    */
   private String goodsstatue;   
   /**
    * 创建时间
    */
   private String createtime;   
   /**
    * 修改时间
    */
   private String updtime;   
   /**
    * 创建人
    */
   private String creator;   
   /**
    * 修改人
    */
   private String updor;   
   /**
    * 品牌
    */
   private String goodsbrand;   
   /**
    * 种类
    */
   private String goodstype;   
   /**
    * 顺序
    */
   private Integer goodsorder;   
   /**
    * 大小类ID
    */
   private String goodsclassid;   
   /**
    * 名称
    */
   private String goodsclassname;   
   /**
    * 名称
    */
   private String storehousename;   
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
	 *设置"商品ID"属性
	 *@param goodsnumgoods 实体的Goodsnumgoods属性
	 */
	public void setGoodsnumgoods(String goodsnumgoods)
	{
		this.goodsnumgoods = goodsnumgoods;
	}
	
	/**
	 *获取"商品ID"属性
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
	 *设置"描述"属性
	 *@param goodsdetail 实体的Goodsdetail属性
	 */
	public void setGoodsdetail(String goodsdetail)
	{
		this.goodsdetail = goodsdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getGoodsdetail()
	{
		return this.goodsdetail;
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
	 *设置"小类ID"属性
	 *@param goodsclass 实体的Goodsclass属性
	 */
	public void setGoodsclass(String goodsclass)
	{
		this.goodsclass = goodsclass;
	}
	
	/**
	 *获取"小类ID"属性
	 */
	public String getGoodsclass()
	{
		return this.goodsclass;
	}	   

	/**
	 *设置"图片路径"属性
	 *@param goodsimage 实体的Goodsimage属性
	 */
	public void setGoodsimage(String goodsimage)
	{
		this.goodsimage = goodsimage;
	}
	
	/**
	 *获取"图片路径"属性
	 */
	public String getGoodsimage()
	{
		return this.goodsimage;
	}	   

	/**
	 *设置"状态"属性
	 *@param goodsstatue 实体的Goodsstatue属性
	 */
	public void setGoodsstatue(String goodsstatue)
	{
		this.goodsstatue = goodsstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getGoodsstatue()
	{
		return this.goodsstatue;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param createtime 实体的Createtime属性
	 */
	public void setCreatetime(String createtime)
	{
		this.createtime = createtime;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getCreatetime()
	{
		return this.createtime;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param updtime 实体的Updtime属性
	 */
	public void setUpdtime(String updtime)
	{
		this.updtime = updtime;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getUpdtime()
	{
		return this.updtime;
	}	   

	/**
	 *设置"创建人"属性
	 *@param creator 实体的Creator属性
	 */
	public void setCreator(String creator)
	{
		this.creator = creator;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getCreator()
	{
		return this.creator;
	}	   

	/**
	 *设置"修改人"属性
	 *@param updor 实体的Updor属性
	 */
	public void setUpdor(String updor)
	{
		this.updor = updor;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getUpdor()
	{
		return this.updor;
	}	   

	/**
	 *设置"品牌"属性
	 *@param goodsbrand 实体的Goodsbrand属性
	 */
	public void setGoodsbrand(String goodsbrand)
	{
		this.goodsbrand = goodsbrand;
	}
	
	/**
	 *获取"品牌"属性
	 */
	public String getGoodsbrand()
	{
		return this.goodsbrand;
	}	   

	/**
	 *设置"种类"属性
	 *@param goodstype 实体的Goodstype属性
	 */
	public void setGoodstype(String goodstype)
	{
		this.goodstype = goodstype;
	}
	
	/**
	 *获取"种类"属性
	 */
	public String getGoodstype()
	{
		return this.goodstype;
	}	   

	/**
	 *设置"顺序"属性
	 *@param goodsorder 实体的Goodsorder属性
	 */
	public void setGoodsorder(Integer goodsorder)
	{
		this.goodsorder = goodsorder;
	}
	
	/**
	 *获取"顺序"属性
	 */
	public Integer getGoodsorder()
	{
		return this.goodsorder;
	}	   

	/**
	 *设置"大小类ID"属性
	 *@param goodsclassid 实体的Goodsclassid属性
	 */
	public void setGoodsclassid(String goodsclassid)
	{
		this.goodsclassid = goodsclassid;
	}
	
	/**
	 *获取"大小类ID"属性
	 */
	public String getGoodsclassid()
	{
		return this.goodsclassid;
	}	   

	/**
	 *设置"名称"属性
	 *@param goodsclassname 实体的Goodsclassname属性
	 */
	public void setGoodsclassname(String goodsclassname)
	{
		this.goodsclassname = goodsclassname;
	}
	
	/**
	 *获取"名称"属性
	 */
	public String getGoodsclassname()
	{
		return this.goodsclassname;
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
	public Goodsnumview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goodsnumview(
		String idgoodsnum
	 	,String goodsnumgoods
	 	,String goodsnumnum
	 	,String goodsnumstore
	 	,String goodsid
	 	,String goodscompany
	 	,String goodscode
	 	,String goodsname
	 	,String goodsdetail
	 	,String goodsunits
	 	,String goodsclass
	 	,String goodsimage
	 	,String goodsstatue
	 	,String createtime
	 	,String updtime
	 	,String creator
	 	,String updor
	 	,String goodsbrand
	 	,String goodstype
	 	,Integer goodsorder
	 	,String goodsclassid
	 	,String goodsclassname
	 	,String storehousename
		 ){
		super();
		this.idgoodsnum = idgoodsnum;
	 	this.goodsnumgoods = goodsnumgoods;
	 	this.goodsnumnum = goodsnumnum;
	 	this.goodsnumstore = goodsnumstore;
	 	this.goodsid = goodsid;
	 	this.goodscompany = goodscompany;
	 	this.goodscode = goodscode;
	 	this.goodsname = goodsname;
	 	this.goodsdetail = goodsdetail;
	 	this.goodsunits = goodsunits;
	 	this.goodsclass = goodsclass;
	 	this.goodsimage = goodsimage;
	 	this.goodsstatue = goodsstatue;
	 	this.createtime = createtime;
	 	this.updtime = updtime;
	 	this.creator = creator;
	 	this.updor = updor;
	 	this.goodsbrand = goodsbrand;
	 	this.goodstype = goodstype;
	 	this.goodsorder = goodsorder;
	 	this.goodsclassid = goodsclassid;
	 	this.goodsclassname = goodsclassname;
	 	this.storehousename = storehousename;
	}
}

