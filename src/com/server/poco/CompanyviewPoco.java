package com.server.poco;

/**
 * companyview 实体类的常量
 *@author ZhangRuiLong
 */
public class CompanyviewPoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "companyview";
   /**
    * 实体表名
    */
   public static String TABLE = "Companyview";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"companyid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"经销商ID",
	 	"编码",
	 	"姓名",
	 	"手机",
	 	"店铺",
	 	"城市和县ID",
	 	"街道地址",
	 	"描述",
	 	"状态",
	 	"账号",
	 	"密码",
	 	"创建时间",
	 	"修改时间",
	 	"城市ID",
	 	"编码",
	 	"名称",
	 	"父类",
	 	"描述",
	 	"状态",
	 	"名称",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"companyid",
	 	"companycode",
	 	"username",
	 	"companyphone",
	 	"companyshop",
	 	"companycity",
	 	"companyaddress",
	 	"companydetail",
	 	"companystatue",
	 	"loginname",
	 	"password",
	 	"createtime",
	 	"updtime",
	 	"cityid",
	 	"citycode",
	 	"cityname",
	 	"cityparent",
	 	"citydetail",
	 	"citystatue",
	 	"cityparentname",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " companyid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"companyid",
	 	"companycode",
	 	"username",
	 	"companyphone",
	 	"companyshop",
	 	"companycity",
	 	"companyaddress",
	 	"companydetail",
	 	"companystatue",
	 	"loginname",
	 	"password",
	 	"createtime",
	 	"updtime",
	 	"cityid",
	 	"citycode",
	 	"cityname",
	 	"cityparent",
	 	"citydetail",
	 	"citystatue",
	 	"cityparentname",
   };
}

