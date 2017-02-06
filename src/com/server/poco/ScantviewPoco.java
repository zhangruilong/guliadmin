package com.server.poco;

/**
 * scantview 实体类的常量
 *@author ZhangRuiLong
 */
public class ScantviewPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "scantview";
   /**
    * 实体表名
    */
   public static String TABLE = "Scantview";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"scantid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"标品ID",
	 	"编码",
	 	"名称",
	 	"描述",
	 	"规格",
	 	"小类ID",
	 	"图片",
	 	"品牌",
	 	"种类",
	 	"状态",
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
   		"scantid",
	 	"scantcode",
	 	"scantname",
	 	"scantdetail",
	 	"scantunits",
	 	"scantclass",
	 	"scantimage",
	 	"scantbrand",
	 	"scanttype",
	 	"scantstatue",
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
   public static final String ORDER = " scantid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"scantid",
	 	"scantcode",
	 	"scantname",
	 	"scantdetail",
	 	"scantunits",
	 	"scantclass",
	 	"scantimage",
	 	"scantbrand",
	 	"scanttype",
	 	"scantstatue",
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

