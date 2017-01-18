package com.server.poco;

/**
 * warrantoutview 实体类的常量
 *@author ZhangRuiLong
 */
public class WarrantoutviewPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "warrantoutview";
   /**
    * 实体表名
    */
   public static String TABLE = "Warrantoutview";
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
	 	"商品ID",
	 	"经销商ID",
	 	"编码",
	 	"名称",
	 	"描述",
	 	"规格",
	 	"小类ID",
	 	"图片",
	 	"状态",
	 	"创建时间",
	 	"修改时间",
	 	"创建人",
	 	"修改人",
	 	"品牌",
	 	"种类",
	 	"顺序",
	 	"",
	 	"名称",
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
	 	"gOODSID",
	 	"gOODSCOMPANY",
	 	"gOODSCODE",
	 	"gOODSNAME",
	 	"gOODSDETAIL",
	 	"gOODSUNITS",
	 	"gOODSCLASS",
	 	"gOODSIMAGE",
	 	"gOODSSTATUE",
	 	"cREATETIME",
	 	"uPDTIME",
	 	"cREATOR",
	 	"uPDOR",
	 	"gOODSBRAND",
	 	"gOODSTYPE",
	 	"gOODSORDER",
	 	"gOODSWEIGHT",
	 	"gOODSCLASSNAME",
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
	 	"gOODSID",
	 	"gOODSCOMPANY",
	 	"gOODSCODE",
	 	"gOODSNAME",
	 	"gOODSDETAIL",
	 	"gOODSUNITS",
	 	"gOODSCLASS",
	 	"gOODSIMAGE",
	 	"gOODSSTATUE",
	 	"cREATETIME",
	 	"uPDTIME",
	 	"cREATOR",
	 	"uPDOR",
	 	"gOODSBRAND",
	 	"gOODSTYPE",
	 	"gOODSORDER",
	 	"gOODSWEIGHT",
	 	"gOODSCLASSNAME",
   };
}
