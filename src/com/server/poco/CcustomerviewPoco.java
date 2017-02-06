package com.server.poco;

/**
 * ccustomerview 实体类的常量
 *@author ZhangRuiLong
 */
public class CcustomerviewPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "ccustomerview";
   /**
    * 实体表名
    */
   public static String TABLE = "Ccustomerview";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"ccustomerid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"经销商和客户ID",
	 	"经销商ID",
	 	"客户等级",
	 	"客户经理",
	 	"大客户",
	 	"修改时间",
	 	"修改人",
	 	"客户ID",
	 	"编码",
	 	"姓名",
	 	"手机",
	 	"密码",
	 	"店铺",
	 	"城市",
	 	"县",
	 	"街道地址",
	 	"类型",
	 	"等级",
	 	"openid",
	 	"描述",
	 	"状态",
	 	"创建时间",
	 	"修改时间",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"ccustomerid",
	 	"ccustomercompany",
	 	"ccustomerdetail",
	 	"createtime",
	 	"creator",
	 	"ccustomerupdtime",
	 	"ccustomerupdor",
	 	"customerid",
	 	"customercode",
	 	"customername",
	 	"customerphone",
	 	"customerpsw",
	 	"customershop",
	 	"customercity",
	 	"customerxian",
	 	"customeraddress",
	 	"customertype",
	 	"customerlevel",
	 	"openid",
	 	"customerdetail",
	 	"customerstatue",
	 	"cuscreatetime",
	 	"updtime",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " ccustomerid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"ccustomerid",
	 	"ccustomercompany",
	 	"ccustomerdetail",
	 	"createtime",
	 	"creator",
	 	"ccustomerupdtime",
	 	"ccustomerupdor",
	 	"customerid",
	 	"customercode",
	 	"customername",
	 	"customerphone",
	 	"customerpsw",
	 	"customershop",
	 	"customercity",
	 	"customerxian",
	 	"customeraddress",
	 	"customertype",
	 	"customerlevel",
	 	"openid",
	 	"customerdetail",
	 	"customerstatue",
	 	"cuscreatetime",
	 	"updtime",
   };
}

