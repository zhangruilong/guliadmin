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
	 	"商品ID",
	 	"经销商ID",
	 	"商品编号",
	 	"商品名称",
	 	"描述",
	 	"规格",
	 	"小类ID",
	 	"图片路径",
	 	"状态",
	 	"创建时间",
	 	"修改时间",
	 	"创建人",
	 	"修改人",
	 	"品牌",
	 	"种类",
	 	"顺序",
	 	"重量",
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
	 	"goodsid",
	 	"goodscompany",
	 	"goodscode",
	 	"goodsname",
	 	"goodsdetail",
	 	"goodsunits",
	 	"goodsclass",
	 	"goodsimage",
	 	"goodsstatue",
	 	"createtime",
	 	"updtime",
	 	"creator",
	 	"updor",
	 	"goodsbrand",
	 	"goodstype",
	 	"goodsorder",
	 	"goodsweight",
	 	"goodsclassname",
	 	"storehousename",
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
	 	"goodsid",
	 	"goodscompany",
	 	"goodscode",
	 	"goodsname",
	 	"goodsdetail",
	 	"goodsunits",
	 	"goodsclass",
	 	"goodsimage",
	 	"goodsstatue",
	 	"createtime",
	 	"updtime",
	 	"creator",
	 	"updor",
	 	"goodsbrand",
	 	"goodstype",
	 	"goodsorder",
	 	"goodsweight",
	 	"goodsclassname",
	 	"storehousename",
   };
}

