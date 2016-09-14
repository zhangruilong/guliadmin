package com.server.action;

import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.server.pojo.Timegoodsview;
import com.server.poco.TimegoodsviewPoco;
import com.system.tools.CommonConst;
import com.system.tools.base.BaseActionDao;
import com.system.tools.pojo.Fileinfo;
import com.system.tools.pojo.Queryinfo;
import com.system.tools.util.CommonUtil;
import com.system.tools.util.FileUtil;
import com.system.tools.pojo.Pageinfo;

/**
 * 秒杀商品 逻辑层
 *@author ZhangRuiLong
 */
public class TimegoodsviewAction extends BaseActionDao {
	public String result = CommonConst.FAILURE;
	public ArrayList<Timegoodsview> cuss = null;
	public Type TYPE = new TypeToken<ArrayList<Timegoodsview>>() {}.getType();

	//导出
	public void expAll(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Queryinfo queryinfo = getQueryinfo(request, Timegoodsview.class, TimegoodsviewPoco.QUERYFIELDNAME, TimegoodsviewPoco.ORDER, TYPE);
		cuss = (ArrayList<Timegoodsview>) selAll(queryinfo);
		FileUtil.expExcel(response,cuss,TimegoodsviewPoco.CHINESENAME,TimegoodsviewPoco.NAME);
	}
	//查询所有
	public void selAll(HttpServletRequest request, HttpServletResponse response){
		Queryinfo queryinfo = getQueryinfo(request, Timegoodsview.class, TimegoodsviewPoco.QUERYFIELDNAME, TimegoodsviewPoco.ORDER, TYPE);
		Pageinfo pageinfo = new Pageinfo(0, selAll(queryinfo));
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
	//分页查询
	public void selQuery(HttpServletRequest request, HttpServletResponse response){
		Queryinfo queryinfo = getQueryinfo(request, Timegoodsview.class, TimegoodsviewPoco.QUERYFIELDNAME, TimegoodsviewPoco.ORDER, TYPE);
		Pageinfo pageinfo = new Pageinfo(getTotal(queryinfo), selQuery(queryinfo));
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
}
