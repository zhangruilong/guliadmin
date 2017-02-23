package com.server.poco;

/**
 * warrantbackview 实体类的常量
 *@author ZhangRuiLong
 */
public class WarrantbackviewPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "warrantbackview";
   /**
    * 实体表名
    */
   public static String TABLE = "Warrantbackview";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"idwarrantback"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"ID",
	 	"仓库",
	 	"商品",
	 	"数量",
	 	"退货人",
	 	"状态",
	 	"描述",
	 	"创建人",
	 	"创建时间",
	 	"修改人",
	 	"修改时间",
	 	"商品ID",
	 	"商品编号",
	 	"商品名称",
	 	"规格",
	 	"名称",
	 	"名称",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"idwarrantback",
	 	"warrantbackstore",
	 	"warrantbackgoods",
	 	"warrantbacknum",
	 	"warrantbackwho",
	 	"warrantbackstatue",
	 	"warrantbackdetail",
	 	"warrantbackinswho",
	 	"warrantbackinswhen",
	 	"warrantbackupdwho",
	 	"warrantbackupdwhen",
	 	"goodsid",
	 	"goodscode",
	 	"goodsname",
	 	"goodsunits",
	 	"goodsclassname",
	 	"storehousename",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " idwarrantback desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"idwarrantback",
	 	"warrantbackstore",
	 	"warrantbackgoods",
	 	"warrantbacknum",
	 	"warrantbackwho",
	 	"warrantbackstatue",
	 	"warrantbackdetail",
	 	"warrantbackinswho",
	 	"warrantbackinswhen",
	 	"warrantbackupdwho",
	 	"warrantbackupdwhen",
	 	"goodsid",
	 	"goodscode",
	 	"goodsname",
	 	"goodsunits",
	 	"goodsclassname",
	 	"storehousename",
   };
}

