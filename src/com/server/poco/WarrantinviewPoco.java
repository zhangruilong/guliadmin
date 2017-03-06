package com.server.poco;

/**
 * warrantinview 实体类的常量
 *@author ZhangRuiLong
 */
public class WarrantinviewPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "warrantinview";
   /**
    * 实体表名
    */
   public static String TABLE = "Warrantinview";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"idwarrantin"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"ID",
	 	"仓库ID",
	 	"供货单位ID",
	 	"商品",
	 	"进货价",
	 	"数量",
	 	"检验员",
	 	"状态",
	 	"备注",
	 	"创建时间",
	 	"创建人",
	 	"修改时间",
	 	"修改人",
	 	"进货金额",
	 	"商品ID",
	 	"经销商ID",
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
   		"idwarrantin",
	 	"warrantinstore",
	 	"warrantinfrom",
	 	"warrantingoods",
	 	"warrantinprice",
	 	"warrantinnum",
	 	"warrantinwho",
	 	"warrantinstatue",
	 	"warrantindetail",
	 	"warrantininswhen",
	 	"warrantininswho",
	 	"warrantinupdwhen",
	 	"warrantinupdwho",
	 	"warrantinmoney",
	 	"goodsid",
	 	"goodscompany",
	 	"goodscode",
	 	"goodsname",
	 	"goodsunits",
	 	"storehousename",
	 	"suppliername",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " idwarrantin desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"idwarrantin",
	 	"warrantinstore",
	 	"warrantinfrom",
	 	"warrantingoods",
	 	"warrantinprice",
	 	"warrantinnum",
	 	"warrantinwho",
	 	"warrantinstatue",
	 	"warrantindetail",
	 	"warrantininswhen",
	 	"warrantininswho",
	 	"warrantinupdwhen",
	 	"warrantinupdwho",
	 	"warrantinmoney",
	 	"goodsid",
	 	"goodscompany",
	 	"goodscode",
	 	"goodsname",
	 	"goodsunits",
	 	"storehousename",
	 	"suppliername",
   };
}

