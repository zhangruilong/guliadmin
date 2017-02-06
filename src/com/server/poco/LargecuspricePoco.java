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
   		"ID",
	 	"供应商",
	 	"客户",
	 	"商品",
	 	"单品价",
	 	"描述",
	 	"创建时间",
	 	"创建人",
	 	"套装价",
	 	"单品价单位",
	 	"套装价单位",
	 	"修改人",
	 	"修改时间",
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
	 	"largecusupdtime",
	 	"largecusupdor",
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
	 	"largecusupdtime",
	 	"largecusupdor",
   };
}

