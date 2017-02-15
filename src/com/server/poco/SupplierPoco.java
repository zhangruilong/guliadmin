package com.server.poco;

/**
 * supplier 实体类的常量
 *@author ZhangRuiLong
 */
public class SupplierPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "supplier";
   /**
    * 实体表名
    */
   public static String TABLE = "Supplier";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"supplierid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"供货商ID",
	 	"编码",
	 	"名称",
	 	"联系人",
	 	"联系电话",
	 	"地址",
	 	"描述",
	 	"状态",
	 	"经销商ID",
	 	"修改时间",
	 	"修改人",
	 	"创建时间",
	 	"创建人",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"supplierid",
	 	"suppliercode",
	 	"suppliername",
	 	"suppliercontact",
	 	"supplierphone",
	 	"supplieraddress",
	 	"supplierdetail",
	 	"supplierstatue",
	 	"suppliercompany",
	 	"supplierupdtime",
	 	"supplierupdor",
	 	"suppliercretime",
	 	"suppliercreor",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " supplierid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"supplierid",
	 	"suppliercode",
	 	"suppliername",
	 	"suppliercontact",
	 	"supplierphone",
	 	"supplieraddress",
	 	"supplierdetail",
	 	"supplierstatue",
	 	"suppliercompany",
	 	"supplierupdtime",
	 	"supplierupdor",
	 	"suppliercretime",
	 	"suppliercreor",
   };
}

