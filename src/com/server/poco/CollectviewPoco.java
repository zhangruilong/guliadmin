package com.server.poco;

/**
 * collectview 实体类的常量
 *@author ZhangRuiLong
 */
public class CollectviewPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "collectview";
   /**
    * 实体表名
    */
   public static String TABLE = "Collectview";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"collectid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"收藏ID",
	 	"客户ID",
	 	"描述",
	 	"创建时间",
	 	"商品ID",
	 	"经销商ID",
	 	"编码",
	 	"名称",
	 	"描述",
	 	"规格",
	 	"小类ID",
	 	"图片",
	 	"状态",
	 	"创建时间",
	 	"修改时间",
	 	"创建人",
	 	"修改人",
	 	"品牌",
	 	"种类",
	 	"顺序",
	 	"大小类ID",
	 	"编码",
	 	"名称",
	 	"父类",
	 	"图标",
	 	"状态",
	 	"城市(用逗号分开)",
	 	"顺序",
	 	"经销商(用逗号分开)",
	 	"店铺",
	 	"城市和县ID",
	 	"街道地址",
	 	"描述",
	 	"状态",
	 	"价格体系ID",
	 	"分类",
	 	"等级",
	 	"单品价",
	 	"单品单位",
	 	"套装价",
	 	"套装单位",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"collectid",
	 	"collectcustomer",
	 	"collectdetail",
	 	"collectcreatetime",
	 	"goodsid",
	 	"goodscompany",
	 	"goodscode",
	 	"goodsname",
	 	"goodsdetail",
	 	"goodsunits",
	 	"goodsclass",
	 	"goodsimage",
	 	"goodsstatue",
	 	"createtime",
	 	"updtime",
	 	"creator",
	 	"updor",
	 	"goodsbrand",
	 	"goodstype",
	 	"goodsorder",
	 	"goodsclassid",
	 	"goodsclasscode",
	 	"goodsclassname",
	 	"goodsclassparent",
	 	"goodsclassdetail",
	 	"goodsclassstatue",
	 	"goodsclasscity",
	 	"goodsclassorder",
	 	"goodsclasscompany",
	 	"companyshop",
	 	"companycity",
	 	"companyaddress",
	 	"companydetail",
	 	"companystatue",
	 	"pricesid",
	 	"pricesclass",
	 	"priceslevel",
	 	"pricesprice",
	 	"pricesunit",
	 	"pricesprice2",
	 	"pricesunit2",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " collectid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"collectid",
	 	"collectcustomer",
	 	"collectdetail",
	 	"collectcreatetime",
	 	"goodsid",
	 	"goodscompany",
	 	"goodscode",
	 	"goodsname",
	 	"goodsdetail",
	 	"goodsunits",
	 	"goodsclass",
	 	"goodsimage",
	 	"goodsstatue",
	 	"createtime",
	 	"updtime",
	 	"creator",
	 	"updor",
	 	"goodsbrand",
	 	"goodstype",
	 	"goodsorder",
	 	"goodsclassid",
	 	"goodsclasscode",
	 	"goodsclassname",
	 	"goodsclassparent",
	 	"goodsclassdetail",
	 	"goodsclassstatue",
	 	"goodsclasscity",
	 	"goodsclassorder",
	 	"goodsclasscompany",
	 	"companyshop",
	 	"companycity",
	 	"companyaddress",
	 	"companydetail",
	 	"companystatue",
	 	"pricesid",
	 	"pricesclass",
	 	"priceslevel",
	 	"pricesprice",
	 	"pricesunit",
	 	"pricesprice2",
	 	"pricesunit2",
   };
}

