package com.server.poco;

/**
 * 微信首页区表 实体类的常量
 *@author ZhangRuiLong
 */
public class IndexareaPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "微信首页区表";
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
   		"id",
	 	"编码",
	 	"名称",
	 	"描述",
	 	"状态",
	 	"供应商id",
	 	"顺序",
	 	"图片",
	 	"路径",
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

