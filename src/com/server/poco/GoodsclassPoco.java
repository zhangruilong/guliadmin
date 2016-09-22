package com.server.poco;

/**
 * 大小类 实体类的常量
 *@author ZhangRuiLong
 */
public class GoodsclassPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "大小类";
   /**
    * 实体表名
    */
   public static String TABLE = "Goodsclass";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"goodsclassid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"大小类ID",
	 	"编码",
	 	"名称",
	 	"父类",
	 	"图标",
	 	"状态",
	 	"城市(用逗号分开)",
	 	"顺序",
	 	"经销商(用逗号分开)",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"goodsclassid",
	 	"goodsclasscode",
	 	"goodsclassname",
	 	"goodsclassparent",
	 	"goodsclassdetail",
	 	"goodsclassstatue",
	 	"goodsclasscity",
	 	"goodsclassorder",
	 	"goodsclasscompany",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " goodsclassid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"goodsclassid",
	 	"goodsclasscode",
	 	"goodsclassname",
	 	"goodsclassparent",
	 	"goodsclassdetail",
	 	"goodsclassstatue",
	 	"goodsclasscity",
	 	"goodsclassorder",
	 	"goodsclasscompany",
   };
}

