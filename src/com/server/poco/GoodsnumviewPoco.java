package com.server.poco;

/**
 * goodsnumview 实体类的常量
 *@author ZhangRuiLong
 */
public class GoodsnumviewPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "goodsnumview";
   /**
    * 实体表名
    */
   public static String TABLE = "Goodsnumview";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"idgoodsnum"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"ID",
	 	"商品ID",
	 	"数量",
	 	"仓库",
	 	"商品ID",
	 	"经销商ID",
	 	"创建时间",
	 	"商品编号",
	 	"商品名称",
	 	"规格",
	 	"名称",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"idgoodsnum",
	 	"goodsnumgoods",
	 	"goodsnumnum",
	 	"goodsnumstore",
	 	"goodsid",
	 	"goodscompany",
	 	"createtime",
	 	"goodscode",
	 	"goodsname",
	 	"goodsunits",
	 	"storehousename",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " idgoodsnum desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"idgoodsnum",
	 	"goodsnumgoods",
	 	"goodsnumnum",
	 	"goodsnumstore",
	 	"goodsid",
	 	"goodscompany",
	 	"createtime",
	 	"goodscode",
	 	"goodsname",
	 	"goodsunits",
	 	"storehousename",
   };
}

