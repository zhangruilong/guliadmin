package com.server.pojo;

import java.sql.Date;
/**
 * collectview 实体类
 *@author ZhangRuiLong
 */
public class Collectview
{
   /**
    * 收藏ID,主键
    */
   private String collectid; 
   /**
    * 客户ID
    */
   private String collectcustomer;   
   /**
    * 描述
    */
   private String collectdetail;   
   /**
    * 创建时间
    */
   private String collectcreatetime;   
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
    * 大小类ID
    */
   private String goodsclassid;   
   /**
    * 编码
    */
   private String goodsclasscode;   
   /**
    * 名称
    */
   private String goodsclassname;   
   /**
    * 父类
    */
   private String goodsclassparent;   
   /**
    * 图标
    */
   private String goodsclassdetail;   
   /**
    * 状态
    */
   private String goodsclassstatue;   
   /**
    * 城市(用逗号分开)
    */
   private String goodsclasscity;   
   /**
    * 顺序
    */
   private String goodsclassorder;   
   /**
    * 经销商(用逗号分开)
    */
   private String goodsclasscompany;   
   /**
    * 店铺
    */
   private String companyshop;   
   /**
    * 城市和县ID
    */
   private String companycity;   
   /**
    * 街道地址
    */
   private String companyaddress;   
   /**
    * 描述
    */
   private String companydetail;   
   /**
    * 状态
    */
   private String companystatue;   
   /**
    * 价格体系ID
    */
   private String pricesid;   
   /**
    * 分类
    */
   private String pricesclass;   
   /**
    * 等级
    */
   private Integer priceslevel;   
   /**
    * 单品价
    */
   private Float pricesprice;   
   /**
    * 单品单位
    */
   private String pricesunit;   
   /**
    * 套装价
    */
   private Float pricesprice2;   
   /**
    * 套装单位
    */
   private String pricesunit2;   
    //属性方法	    
     /**
	 *设置主键"收藏ID"属性
	 *@param collectid 实体的Collectid属性
	 */
	public void setCollectid(String collectid)
	{
		this.collectid = collectid;
	}
	
	/**
	 *获取主键"收藏ID"属性
	 */
	public String getCollectid()
	{
		return this.collectid;
	}

	/**
	 *设置"客户ID"属性
	 *@param collectcustomer 实体的Collectcustomer属性
	 */
	public void setCollectcustomer(String collectcustomer)
	{
		this.collectcustomer = collectcustomer;
	}
	
	/**
	 *获取"客户ID"属性
	 */
	public String getCollectcustomer()
	{
		return this.collectcustomer;
	}	   

	/**
	 *设置"描述"属性
	 *@param collectdetail 实体的Collectdetail属性
	 */
	public void setCollectdetail(String collectdetail)
	{
		this.collectdetail = collectdetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getCollectdetail()
	{
		return this.collectdetail;
	}	   

	/**
	 *设置"创建时间"属性
	 *@param collectcreatetime 实体的Collectcreatetime属性
	 */
	public void setCollectcreatetime(String collectcreatetime)
	{
		this.collectcreatetime = collectcreatetime;
	}
	
	/**
	 *获取"创建时间"属性
	 */
	public String getCollectcreatetime()
	{
		return this.collectcreatetime;
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
	 *设置"编码"属性
	 *@param goodsclasscode 实体的Goodsclasscode属性
	 */
	public void setGoodsclasscode(String goodsclasscode)
	{
		this.goodsclasscode = goodsclasscode;
	}
	
	/**
	 *获取"编码"属性
	 */
	public String getGoodsclasscode()
	{
		return this.goodsclasscode;
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
	 *设置"父类"属性
	 *@param goodsclassparent 实体的Goodsclassparent属性
	 */
	public void setGoodsclassparent(String goodsclassparent)
	{
		this.goodsclassparent = goodsclassparent;
	}
	
	/**
	 *获取"父类"属性
	 */
	public String getGoodsclassparent()
	{
		return this.goodsclassparent;
	}	   

	/**
	 *设置"图标"属性
	 *@param goodsclassdetail 实体的Goodsclassdetail属性
	 */
	public void setGoodsclassdetail(String goodsclassdetail)
	{
		this.goodsclassdetail = goodsclassdetail;
	}
	
	/**
	 *获取"图标"属性
	 */
	public String getGoodsclassdetail()
	{
		return this.goodsclassdetail;
	}	   

	/**
	 *设置"状态"属性
	 *@param goodsclassstatue 实体的Goodsclassstatue属性
	 */
	public void setGoodsclassstatue(String goodsclassstatue)
	{
		this.goodsclassstatue = goodsclassstatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getGoodsclassstatue()
	{
		return this.goodsclassstatue;
	}	   

	/**
	 *设置"城市(用逗号分开)"属性
	 *@param goodsclasscity 实体的Goodsclasscity属性
	 */
	public void setGoodsclasscity(String goodsclasscity)
	{
		this.goodsclasscity = goodsclasscity;
	}
	
	/**
	 *获取"城市(用逗号分开)"属性
	 */
	public String getGoodsclasscity()
	{
		return this.goodsclasscity;
	}	   

	/**
	 *设置"顺序"属性
	 *@param goodsclassorder 实体的Goodsclassorder属性
	 */
	public void setGoodsclassorder(String goodsclassorder)
	{
		this.goodsclassorder = goodsclassorder;
	}
	
	/**
	 *获取"顺序"属性
	 */
	public String getGoodsclassorder()
	{
		return this.goodsclassorder;
	}	   

	/**
	 *设置"经销商(用逗号分开)"属性
	 *@param goodsclasscompany 实体的Goodsclasscompany属性
	 */
	public void setGoodsclasscompany(String goodsclasscompany)
	{
		this.goodsclasscompany = goodsclasscompany;
	}
	
	/**
	 *获取"经销商(用逗号分开)"属性
	 */
	public String getGoodsclasscompany()
	{
		return this.goodsclasscompany;
	}	   

	/**
	 *设置"店铺"属性
	 *@param companyshop 实体的Companyshop属性
	 */
	public void setCompanyshop(String companyshop)
	{
		this.companyshop = companyshop;
	}
	
	/**
	 *获取"店铺"属性
	 */
	public String getCompanyshop()
	{
		return this.companyshop;
	}	   

	/**
	 *设置"城市和县ID"属性
	 *@param companycity 实体的Companycity属性
	 */
	public void setCompanycity(String companycity)
	{
		this.companycity = companycity;
	}
	
	/**
	 *获取"城市和县ID"属性
	 */
	public String getCompanycity()
	{
		return this.companycity;
	}	   

	/**
	 *设置"街道地址"属性
	 *@param companyaddress 实体的Companyaddress属性
	 */
	public void setCompanyaddress(String companyaddress)
	{
		this.companyaddress = companyaddress;
	}
	
	/**
	 *获取"街道地址"属性
	 */
	public String getCompanyaddress()
	{
		return this.companyaddress;
	}	   

	/**
	 *设置"描述"属性
	 *@param companydetail 实体的Companydetail属性
	 */
	public void setCompanydetail(String companydetail)
	{
		this.companydetail = companydetail;
	}
	
	/**
	 *获取"描述"属性
	 */
	public String getCompanydetail()
	{
		return this.companydetail;
	}	   

	/**
	 *设置"状态"属性
	 *@param companystatue 实体的Companystatue属性
	 */
	public void setCompanystatue(String companystatue)
	{
		this.companystatue = companystatue;
	}
	
	/**
	 *获取"状态"属性
	 */
	public String getCompanystatue()
	{
		return this.companystatue;
	}	   

	/**
	 *设置"价格体系ID"属性
	 *@param pricesid 实体的Pricesid属性
	 */
	public void setPricesid(String pricesid)
	{
		this.pricesid = pricesid;
	}
	
	/**
	 *获取"价格体系ID"属性
	 */
	public String getPricesid()
	{
		return this.pricesid;
	}	   

	/**
	 *设置"分类"属性
	 *@param pricesclass 实体的Pricesclass属性
	 */
	public void setPricesclass(String pricesclass)
	{
		this.pricesclass = pricesclass;
	}
	
	/**
	 *获取"分类"属性
	 */
	public String getPricesclass()
	{
		return this.pricesclass;
	}	   

	/**
	 *设置"等级"属性
	 *@param priceslevel 实体的Priceslevel属性
	 */
	public void setPriceslevel(Integer priceslevel)
	{
		this.priceslevel = priceslevel;
	}
	
	/**
	 *获取"等级"属性
	 */
	public Integer getPriceslevel()
	{
		return this.priceslevel;
	}	   

	/**
	 *设置"单品价"属性
	 *@param pricesprice 实体的Pricesprice属性
	 */
	public void setPricesprice(Float pricesprice)
	{
		this.pricesprice = pricesprice;
	}
	
	/**
	 *获取"单品价"属性
	 */
	public Float getPricesprice()
	{
		return this.pricesprice;
	}	   

	/**
	 *设置"单品单位"属性
	 *@param pricesunit 实体的Pricesunit属性
	 */
	public void setPricesunit(String pricesunit)
	{
		this.pricesunit = pricesunit;
	}
	
	/**
	 *获取"单品单位"属性
	 */
	public String getPricesunit()
	{
		return this.pricesunit;
	}	   

	/**
	 *设置"套装价"属性
	 *@param pricesprice2 实体的Pricesprice2属性
	 */
	public void setPricesprice2(Float pricesprice2)
	{
		this.pricesprice2 = pricesprice2;
	}
	
	/**
	 *获取"套装价"属性
	 */
	public Float getPricesprice2()
	{
		return this.pricesprice2;
	}	   

	/**
	 *设置"套装单位"属性
	 *@param pricesunit2 实体的Pricesunit2属性
	 */
	public void setPricesunit2(String pricesunit2)
	{
		this.pricesunit2 = pricesunit2;
	}
	
	/**
	 *获取"套装单位"属性
	 */
	public String getPricesunit2()
	{
		return this.pricesunit2;
	}	   
	public Collectview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collectview(
		String collectid
	 	,String collectcustomer
	 	,String collectdetail
	 	,String collectcreatetime
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
	 	,String goodsclasscode
	 	,String goodsclassname
	 	,String goodsclassparent
	 	,String goodsclassdetail
	 	,String goodsclassstatue
	 	,String goodsclasscity
	 	,String goodsclassorder
	 	,String goodsclasscompany
	 	,String companyshop
	 	,String companycity
	 	,String companyaddress
	 	,String companydetail
	 	,String companystatue
	 	,String pricesid
	 	,String pricesclass
	 	,Integer priceslevel
	 	,Float pricesprice
	 	,String pricesunit
	 	,Float pricesprice2
	 	,String pricesunit2
		 ){
		super();
		this.collectid = collectid;
	 	this.collectcustomer = collectcustomer;
	 	this.collectdetail = collectdetail;
	 	this.collectcreatetime = collectcreatetime;
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
	 	this.goodsclasscode = goodsclasscode;
	 	this.goodsclassname = goodsclassname;
	 	this.goodsclassparent = goodsclassparent;
	 	this.goodsclassdetail = goodsclassdetail;
	 	this.goodsclassstatue = goodsclassstatue;
	 	this.goodsclasscity = goodsclasscity;
	 	this.goodsclassorder = goodsclassorder;
	 	this.goodsclasscompany = goodsclasscompany;
	 	this.companyshop = companyshop;
	 	this.companycity = companycity;
	 	this.companyaddress = companyaddress;
	 	this.companydetail = companydetail;
	 	this.companystatue = companystatue;
	 	this.pricesid = pricesid;
	 	this.pricesclass = pricesclass;
	 	this.priceslevel = priceslevel;
	 	this.pricesprice = pricesprice;
	 	this.pricesunit = pricesunit;
	 	this.pricesprice2 = pricesprice2;
	 	this.pricesunit2 = pricesunit2;
	}
}

