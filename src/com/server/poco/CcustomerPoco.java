package com.server.poco;

/**
 * ccustomer 实体类的常量
 *@author ZhangRuiLong
 */
public class CcustomerPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "ccustomer";
   /**
    * 实体表名
    */
   public static String TABLE = "Ccustomer";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"ccustomerid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"经销商和客户ID",
	 	"经销商ID",
	 	"客户ID",
	 	"客户等级",
	 	"客户经理",
	 	"大客户",
	 	"修改时间",
	 	"修改人",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"ccustomerid",
	 	"ccustomercompany",
	 	"ccustomercustomer",
	 	"ccustomerdetail",
	 	"createtime",
	 	"creator",
	 	"ccustomerupdtime",
	 	"ccustomerupdor",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " ccustomerid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"ccustomerid",
	 	"ccustomercompany",
	 	"ccustomercustomer",
	 	"ccustomerdetail",
	 	"createtime",
	 	"creator",
	 	"ccustomerupdtime",
	 	"ccustomerupdor",
   };
}

