package com.server.poco;

/**
 * warrantout 实体类的常量
 *@author ZhangRuiLong
 */
public class WarrantoutPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "warrantout";
   /**
    * 实体表名
    */
   public static String TABLE = "Warrantout";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"idwarrantout"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"ID",
	 	"仓库",
	 	"商品",
	 	"数量",
	 	"状态",
	 	"描述",
	 	"领货人",
	 	"创建时间",
	 	"创建人",
	 	"更新时间",
	 	"更新人",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"idwarrantout",
	 	"warrantoutstore",
	 	"warrantoutgoods",
	 	"warrantoutnum",
	 	"warrantoutstatue",
	 	"warrantoutdetail",
	 	"warrantoutwho",
	 	"warrantoutinswhen",
	 	"warrantoutinswho",
	 	"warrantoutupdwhen",
	 	"warrantoutupdwho",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " idwarrantout desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"idwarrantout",
	 	"warrantoutstore",
	 	"warrantoutgoods",
	 	"warrantoutnum",
	 	"warrantoutstatue",
	 	"warrantoutdetail",
	 	"warrantoutwho",
	 	"warrantoutinswhen",
	 	"warrantoutinswho",
	 	"warrantoutupdwhen",
	 	"warrantoutupdwho",
   };
}

