package com.server.poco;

/**
 * storehouse 实体类的常量
 *@author ZhangRuiLong
 */
public class StorehousePoco
{
   /**
    * 实体中文名
    */
   public static String NAME = "storehouse";
   /**
    * 实体表名
    */
   public static String TABLE = "Storehouse";
   /**
    * 实体主键
    */
   public static String[] KEYCOLUMN = {"storehouseid"};
   /**
    * 实体中文字段
    */
   public static String[] CHINESENAME = {
   		"仓库ID",
	 	"编码",
	 	"名称",
	 	"描述",
	 	"状态",
	 	"经销商ID",
	 	"修改时间",
	 	"修改人",
	 	"创建时间",
	 	"创建人",
	 	"仓库地址",
	};
	/**
	 * 实体英文字段
	 */
   public static final String[] FIELDNAME = {
   		"storehouseid",
	 	"storehousecode",
	 	"storehousename",
	 	"storehousedetail",
	 	"storehousestatue",
	 	"storehousecompany",
	 	"storehouseupdtime",
	 	"storehouseupdor",
	 	"storehousecretime",
	 	"storehousecreor",
	 	"storehouseaddress",
   };
   /**
    * 实体排序
    */
   public static final String ORDER = " storehouseid desc ";
   /**
	 * 要模糊查询字段
	 */
   public static final String[] QUERYFIELDNAME = {
   		"storehouseid",
	 	"storehousecode",
	 	"storehousename",
	 	"storehousedetail",
	 	"storehousestatue",
	 	"storehousecompany",
	 	"storehouseupdtime",
	 	"storehouseupdor",
	 	"storehousecretime",
	 	"storehousecreor",
	 	"storehouseaddress",
   };
}

