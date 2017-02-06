package com.server.poco;

/**
 * feedback 实体类的常量
 *@author ZhangRuiLong
 */
public class FeedbackPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "feedback";
   /**
    * 实体表名
    */
   public static String TABLE = "Feedback";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"feedbackid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
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
   		"feedbackid",
	 	"feedbackdetail",
	 	"feedbackcustomer",
	 	"feedbacktime",
	 	"feedbackstate",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " feedbackid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"feedbackid",
	 	"feedbackdetail",
	 	"feedbackcustomer",
	 	"feedbacktime",
	 	"feedbackstate",
   };
}

