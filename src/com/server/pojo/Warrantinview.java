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

