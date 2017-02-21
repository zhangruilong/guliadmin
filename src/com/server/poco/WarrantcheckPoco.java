package com.server.poco;

/**
 * warrantcheck 实体类的常量
 *@author ZhangRuiLong
 */
public class WarrantcheckPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "warrantcheck";
   /**
    * 实体表名
    */
   public static String TABLE = "Warrantcheck";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"idwarrantcheck"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"主键",
	 	"仓库",
	 	"商品",
	 	"应有数量",
	 	"现有数量",
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
   		"idwarrantcheck",
	 	"warrantcheckstore",
	 	"warrantcheckgoods",
	 	"warrantchecknumorg",
	 	"warrantchecknumnow",
	 	"warrantcheckstatue",
	 	"warrantcheckdetail",
	 	"warrantcheckinswho",
	 	"warrantcheckinswhen",
	 	"warrantcheckupdwho",
	 	"warrantcheckupdwhen",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " idwarrantcheck desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"idwarrantcheck",
	 	"warrantcheckstore",
	 	"warrantcheckgoods",
	 	"warrantchecknumorg",
	 	"warrantchecknumnow",
	 	"warrantcheckstatue",
	 	"warrantcheckdetail",
	 	"warrantcheckinswho",
	 	"warrantcheckinswhen",
	 	"warrantcheckupdwho",
	 	"warrantcheckupdwhen",
   };
}

