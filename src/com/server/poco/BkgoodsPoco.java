package com.server.poco;

/**
 * bkgoods 实体类的常量
 *@author ZhangRuiLong
 */
public class BkgoodsPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "bkgoods";
   /**
    * 实体表名
    */
   public static String TABLE = "Bkgoods";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"bkgoodsid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"促销品ID",
	 	"经销商ID",
	 	"编码",
	 	"名称",
	 	"描述",
	 	"规格",
	 	"单位",
	 	"原价",
	 	"现价",
	 	"限量",
	 	"小类名称",
	 	"图片",
	 	"状态",
	 	"创建时间",
	 	"创建人",
	 	"顺序",
	 	"客户范围",
	 	"品牌",
	 	"全部限量",
	 	"剩余数量",
	 	"重量",
	 	"类型(秒杀,买赠等)",
	 	"修改时间",
	 	"修改人",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"bkgoodsid",
	 	"bkgoodscompany",
	 	"bkgoodscode",
	 	"bkgoodsname",
	 	"bkgoodsdetail",
	 	"bkgoodsunits",
	 	"bkgoodsunit",
	 	"bkgoodsprice",
	 	"bkgoodsorgprice",
	 	"bkgoodsnum",
	 	"bkgoodsclass",
	 	"bkgoodsimage",
	 	"bkgoodsstatue",
	 	"bkcreatetime",
	 	"bkcreator",
	 	"bkgoodsseq",
	 	"bkgoodsscope",
	 	"bkgoodsbrand",
	 	"bkgoodsallnum",
	 	"bkgoodssurplus",
	 	"bkgoodsweight",
	 	"bkgoodstype",
	 	"bkgoodsupdtime",
	 	"bkgoodsupdor",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " bkgoodsid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"bkgoodsid",
	 	"bkgoodscompany",
	 	"bkgoodscode",
	 	"bkgoodsname",
	 	"bkgoodsdetail",
	 	"bkgoodsunits",
	 	"bkgoodsunit",
	 	"bkgoodsprice",
	 	"bkgoodsorgprice",
	 	"bkgoodsnum",
	 	"bkgoodsclass",
	 	"bkgoodsimage",
	 	"bkgoodsstatue",
	 	"bkcreatetime",
	 	"bkcreator",
	 	"bkgoodsseq",
	 	"bkgoodsscope",
	 	"bkgoodsbrand",
	 	"bkgoodsallnum",
	 	"bkgoodssurplus",
	 	"bkgoodsweight",
	 	"bkgoodstype",
	 	"bkgoodsupdtime",
	 	"bkgoodsupdor",
   };
}

