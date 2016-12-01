package com.server.poco;

/**
 * largecusprice 实体类的常量
 *@author ZhangRuiLong
 */
public class LargecuspricePoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "largecusprice";
   /**
    * 实体表名
    */
   public static String TABLE = "Largecusprice";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"largecuspriceid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"供应商大客户商品价格id",
	 	"供应商id",
	 	"客户id",
	 	"商品id",
	 	"单品价",
	 	"供应商大客户商品价格描述",
	 	"创建时间",
	 	"修改时间",
	 	"套装价",
	 	"单品单位",
	 	"套装单位",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"largecuspriceid",
	 	"largecuspricecompany",
	 	"largecuspricecustomer",
	 	"largecuspricegoods",
	 	"largecuspriceprice",
	 	"largecuspricedetail",
	 	"largecuspricecreatetime",
	 	"largecuspricecreator",
	 	"largecuspriceprice2",
	 	"largecuspriceunit",
	 	"largecuspriceunit2",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " largecuspriceid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"largecuspriceid",
	 	"largecuspricecompany",
	 	"largecuspricecustomer",
	 	"largecuspricegoods",
	 	"largecuspriceprice",
	 	"largecuspricedetail",
	 	"largecuspricecreatetime",
	 	"largecuspricecreator",
	 	"largecuspriceprice2",
	 	"largecuspriceunit",
	 	"largecuspriceunit2",
   };
}

