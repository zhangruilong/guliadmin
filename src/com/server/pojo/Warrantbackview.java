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
    * 创建人
    */
   private String warrantbackinswho;   
   /**
    * 创建时间
    */
   private String warrantbackinswhen;   
   /**
    * 修改人
    */
   private String warrantbackupdwho;   
   /**
    * 修改时间
    */
   private String warrantbackupdwhen;   
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
   private Integer goodsorder;   
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
	 	,String goodsweight
	 	,String goodsclassname
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

