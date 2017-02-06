package com.server.poco;

/**
 * largecuspriceview 实体类的常量
 *@author ZhangRuiLong
 */
public class LargecuspriceviewPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "largecuspriceview";
   /**
    * 实体表名
    */
   public static String TABLE = "Largecuspriceview";
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
	 	"单品价",
	 	"单品价单位",
	 	"描述",
	 	"创建时间",
	 	"创建人",
	 	"修改人",
	 	"修改时间",
	 	"客户",
	 	"商品ID",
	 	"经销商ID",
	 	"编码",
	 	"名称",
	 	"规格",
	 	"名称",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"largecuspriceid",
	 	"largecuspricecompany",
	 	"largecuspriceprice",
	 	"largecuspriceunit",
	 	"largecuspricedetail",
	 	"largecuspricecreatetime",
	 	"largecuspricecreator",
	 	"largecusupdtime",
	 	"largecusupdor",
	 	"largecuspricecustomer",
	 	"goodsid",
	 	"goodscompany",
	 	"goodscode",
	 	"goodsname",
	 	"goodsunits",
	 	"goodsclassname",
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
	 	"largecuspriceprice",
	 	"largecuspriceunit",
	 	"largecuspricedetail",
	 	"largecuspricecreatetime",
	 	"largecuspricecreator",
	 	"largecusupdtime",
	 	"largecusupdor",
	 	"largecuspricecustomer",
	 	"goodsid",
	 	"goodscompany",
	 	"goodscode",
	 	"goodsname",
	 	"goodsunits",
	 	"goodsclassname",
   };
}

