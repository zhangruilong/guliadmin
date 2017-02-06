package com.server.poco;

/**
 * indexarea 实体类的常量
 *@author ZhangRuiLong
 */
public class IndexareaPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "indexarea";
   /**
    * 实体表名
    */
   public static String TABLE = "Indexarea";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"indexareaid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"",
	 	"",
	 	"",
	 	"",
	 	"",
	 	"",
	 	"",
	 	"",
	 	"",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"indexareaid",
	 	"indexareacode",
	 	"indexareaname",
	 	"indexareadetail",
	 	"indexareastatue",
	 	"indexareacompany",
	 	"indexareaorder",
	 	"indexareaimage",
	 	"indexareaurl",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " indexareaid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"indexareaid",
	 	"indexareacode",
	 	"indexareaname",
	 	"indexareadetail",
	 	"indexareastatue",
	 	"indexareacompany",
	 	"indexareaorder",
	 	"indexareaimage",
	 	"indexareaurl",
   };
}

