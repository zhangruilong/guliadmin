package com.server.poco;

/**
 * warrantback 实体类的常量
 *@author ZhangRuiLong
 */
public class WarrantbackPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "warrantback";
   /**
    * 实体表名
    */
   public static String TABLE = "Warrantback";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"idwarrantback"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"ID",
	 	"仓库",
	 	"商品",
	 	"数量",
	 	"退货人",
	 	"状态",
	 	"描述",
	 	"创建人",
	 	"创建时间",
	 	"修改人",
	 	"修改时间",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"idwarrantback",
	 	"warrantbackstore",
	 	"warrantbackgoods",
	 	"warrantbacknum",
	 	"warrantbackwho",
	 	"warrantbackstatue",
	 	"warrantbackdetail",
	 	"warrantbackinswho",
	 	"warrantbackinswhen",
	 	"warrantbackupdwho",
	 	"warrantbackupdwhen",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " idwarrantback desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"idwarrantback",
	 	"warrantbackstore",
	 	"warrantbackgoods",
	 	"warrantbacknum",
	 	"warrantbackwho",
	 	"warrantbackstatue",
	 	"warrantbackdetail",
	 	"warrantbackinswho",
	 	"warrantbackinswhen",
	 	"warrantbackupdwho",
	 	"warrantbackupdwhen",
   };
}

