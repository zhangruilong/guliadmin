package com.server.pojo;

import java.sql.Date;
/**
 * warrantcheckview 实体类
 *@author ZhangRuiLong
 */
public class Warrantcheckview
{
   /**
    * ,主键
    */
   private String idwarrantcheck; 
   /**
    * 仓库
    */
   private String warrantcheckstore;   
   /**
    * 商品
    */
   private String warrantcheckgoods;   
   /**
    * 应有数量
    */
   private String warrantchecknumorg;   
   /**
    * 现有数量
    */
   private String warrantchecknumnow;   
   /**
    * 状态
    */
   private String warrantcheckstatue;   
   /**
    * 描述
    */
   private String warrantcheckdetail;   
   /**
    * 创建人
    */
   private String warrantcheckinswho;   
   /**
    * 创建时间
    */
   private String warrantcheckinswhen;   
   /**
    * 修改人
    */
   private String warrantcheckupdwho;   
   /**
    * 修改时间
    */
   private String warrantcheckupdwhen;   
   /**
    * 商品ID
    */
   private String goodsid;   
   /**
    * 经销商ID
    */
   private String goodscompany;   
   /**
    * 编码
    */
   private String goodscode;   
   /**
    * 名称
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
    * 图片
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
   private String goodsorder;   
   /**
    * 重量
    */
   private String goodsweight;   
   /**
    * 名称
    */
   private String goodsclassname;   
    //属性方法	    
     /**
	 *设置主键""属性
	 *@param idwarrantcheck 实体的Idwarrantcheck属性
	 */
	public void setIdwarrantcheck(String idwarrantcheck)
	{
		this.idwarrantcheck = idwarrantcheck;
	}
	
	/**
	 *获取主键""属性
	 */
	public String getIdwarrantcheck()
	{
		return this.idwarrantcheck;
	}

	/**
	 *设置"仓库"属性
	 *@param warrantcheckstore 实体的Warrantcheckstore属性
	 */
	public void setWarrantcheckstore(String warrantcheckstore)
	{
		this.warrantcheckstore = warrantcheckstore;
	}
	
	/**
	 *获取"仓库"属性
	 */
	public String getWarrantcheckstore()
	{
		return this.warrantcheckstore;
	}	   

	/**
	 *设置"商品"属性
	 *@param warrantcheckgoods 实体的Warrantcheckgoods属性
	 */
	public void setWarrantcheckgoods(String warrantcheckgoods)
	{
		this.warrantcheckgoods = warrantcheckgoods;
	}
	
	/**
	 *获取"商品"属性
	 */
	public String getWarrantcheckgoods()
	{
		return this.warrantcheckgoods;
	}	   

	/**
	 *设置"应有数量"属性
	 *@param warrantchecknumorg 实体的Warrantchecknumorg属性
	 */
	public void setWarrantchecknumorg(String warrantchecknumorg)
	{
		this.warrantchecknumorg = warrantchecknumorg;
	}
	
	/**
	 *获取"应有数量"属性
	 */
	public String getWarrantchecknumorg()
	{
		return this.warrantchecknumorg;
	}	   

	/**
	 *设置"现有数量"属性
	 *@param warrantchecknumnow 实体的Warrantchecknumnow属性
	 */
	public void setWarrantchecknumnow(String warrantchecknumnow)
	{
		this.warrantchecknumnow = warrantchecknumnow;
	}
	
	/**
	 *获取"现有数量"属性
	 */
	public String getWarrantchecknumnow()
	{
		return this.warrantchecknumnow;
	}	   

	/**
	 *设置"状态"属性
	 *@param warrantcheckstatue 实体的Warrantcheckstatue属性
	 */
	public void setWarrantcheckstatue(String warrantcheckstatue)
	{
		this.warrantcheckstatue = warrantcheckstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getWarrantcheckstatue()
	{
		return this.warrantcheckstatue;
	}	   

	/**
	 *设置"描述"属性
	 *@param warrantcheckdetail 实体的Warrantcheckdetail属性
	 */
	public void setWarrantcheckdetail(String warrantcheckdetail)
	{
		this.warrantcheckdetail = warrantcheckdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getWarrantcheckdetail()
	{
		return this.warrantcheckdetail;
	}	   

	/**
	 *设置"创建人"属性
	 *@param warrantcheckinswho 实体的Warrantcheckinswho属性
	 */
	public void setWarrantcheckinswho(String warrantcheckinswho)
	{
		this.warrantcheckinswho = warrantcheckinswho;
	}
	
	/**
	 *获取"创建人"属性
	 */
	public String getWarrantcheckinswho()
	{
		return this.warrantcheckinswho;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param warrantcheckinswhen 实体的Warrantcheckinswhen属性
	 */
	public void setWarrantcheckinswhen(String warrantcheckinswhen)
	{
		this.warrantcheckinswhen = warrantcheckinswhen;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getWarrantcheckinswhen()
	{
		return this.warrantcheckinswhen;
	}	   

	/**
	 *设置"修改人"属性
	 *@param warrantcheckupdwho 实体的Warrantcheckupdwho属性
	 */
	public void setWarrantcheckupdwho(String warrantcheckupdwho)
	{
		this.warrantcheckupdwho = warrantcheckupdwho;
	}
	
	/**
	 *获取"修改人"属性
	 */
	public String getWarrantcheckupdwho()
	{
		return this.warrantcheckupdwho;
	}	   

	/**
	 *设置"修改时间"属性
	 *@param warrantcheckupdwhen 实体的Warrantcheckupdwhen属性
	 */
	public void setWarrantcheckupdwhen(String warrantcheckupdwhen)
	{
		this.warrantcheckupdwhen = warrantcheckupdwhen;
	}
	
	/**
	 *获取"修改时间"属性
	 */
	public String getWarrantcheckupdwhen()
	{
		return this.warrantcheckupdwhen;
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
	 *设置"编码"属性
	 *@param goodscode 实体的Goodscode属性
	 */
	public void setGoodscode(String goodscode)
	{
		this.goodscode = goodscode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getGoodscode()
	{
		return this.goodscode;
	}	   

	/**
	 *设置"名称"属性
	 *@param goodsname 实体的Goodsname属性
	 */
	public void setGoodsname(String goodsname)
	{
		this.goodsname = goodsname;
	}
	
	/**
	 *获取"名称"属性
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
	 *设置"图片"属性
	 *@param goodsimage 实体的Goodsimage属性
	 */
	public void setGoodsimage(String goodsimage)
	{
		this.goodsimage = goodsimage;
	}
	
	/**
	 *获取"图片"属性
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
	public void setGoodsorder(String goodsorder)
	{
		this.goodsorder = goodsorder;
	}
	
	/**
	 *获取"顺序"属性
	 */
	public String getGoodsorder()
	{
		return this.goodsorder;
	}	   

	/**
	 *设置"重量"属性
	 *@param goodsweight 实体的Goodsweight属性
	 */
	public void setGoodsweight(String goodsweight)
	{
		this.goodsweight = goodsweight;
	}
	
	/**
	 *获取"重量"属性
	 */
	public String getGoodsweight()
	{
		return this.goodsweight;
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
	public Warrantcheckview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warrantcheckview(
		String idwarrantcheck
	 	,String warrantcheckstore
	 	,String warrantcheckgoods
	 	,String warrantchecknumorg
	 	,String warrantchecknumnow
	 	,String warrantcheckstatue
	 	,String warrantcheckdetail
	 	,String warrantcheckinswho
	 	,String warrantcheckinswhen
	 	,String warrantcheckupdwho
	 	,String warrantcheckupdwhen
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
	 	,String goodsorder
	 	,String goodsweight
	 	,String goodsclassname
		 ){
		super();
		this.idwarrantcheck = idwarrantcheck;
	 	this.warrantcheckstore = warrantcheckstore;
	 	this.warrantcheckgoods = warrantcheckgoods;
	 	this.warrantchecknumorg = warrantchecknumorg;
	 	this.warrantchecknumnow = warrantchecknumnow;
	 	this.warrantcheckstatue = warrantcheckstatue;
	 	this.warrantcheckdetail = warrantcheckdetail;
	 	this.warrantcheckinswho = warrantcheckinswho;
	 	this.warrantcheckinswhen = warrantcheckinswhen;
	 	this.warrantcheckupdwho = warrantcheckupdwho;
	 	this.warrantcheckupdwhen = warrantcheckupdwhen;
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
	 	this.goodsweight = goodsweight;
	 	this.goodsclassname = goodsclassname;
	}
}

