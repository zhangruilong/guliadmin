package com.server.poco;

/**
 * goodsnum 实体类的常量
 *@author ZhangRuiLong
 */
public class GoodsnumPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "goodsnum";
   /**
    * 实体表名
    */
   public static String TABLE = "Goodsnum";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"idgoodsnum"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"ID",
	 	"商品",
	 	"数量",
	 	"仓库",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"idgoodsnum",
	 	"goodsnumgoods",
	 	"goodsnumnum",
	 	"goodsnumstore",
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
   };
}

