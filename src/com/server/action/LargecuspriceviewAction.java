package com.server.action;

import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.server.pojo.Largecuspriceview;
import com.server.poco.LargecuspriceviewPoco;
import com.system.tools.CommonConst;
import com.system.tools.base.BaseActionDao;
import com.system.tools.pojo.Fileinfo;
import com.system.tools.pojo.Queryinfo;
import com.system.tools.util.CommonUtil;
import com.system.tools.util.FileUtil;
import com.system.tools.pojo.Pageinfo;

/**
 * largecuspriceview 逻辑层
 *@author ZhangRuiLong
 */
public class LargecuspriceviewAction extends BaseActionDao {
	public String result = CommonConst.FAILURE;
	public ArrayList<Largecuspriceview> cuss = null;
	public Type TYPE = new TypeToken<ArrayList<Largecuspriceview>>() {}.getType();

	//新增
	public void insAll(HttpServletRequest request, HttpServletResponse response){
		String json = request.getParameter("json");
		System.out.println("json : " + json);
		json = json.replace("\"\"", "null");
		if(CommonUtil.isNotEmpty(json)) cuss = CommonConst.GSON.fromJson(json, TYPE);
		for(Largecuspriceview temp:cuss){
			if(CommonUtil.isNull(temp.getLargecuspriceid()))
				temp.setLargecuspriceid(CommonUtil.getNewId());
			result = insSingle(temp);
		}
		responsePW(response, result);
	}
	//删除
	public void delAll(HttpServletRequest request, HttpServletResponse response){
		String json = request.getParameter("json");
		System.out.println("json : " + json);
		if(CommonUtil.isNotEmpty(json)) cuss = CommonConst.GSON.fromJson(json, TYPE);
		for(Largecuspriceview temp:cuss){
			result = delSingle(temp,LargecuspriceviewPoco.KEYCOLUMN);
		}
		responsePW(response, result);
	}
	//修改
	public void updAll(HttpServletRequest request, HttpServletResponse response){
		String json = request.getParameter("json");
		System.out.println("json : " + json);
		if(CommonUtil.isNotEmpty(json)) cuss = CommonConst.GSON.fromJson(json, TYPE);
		for(Largecuspriceview temp:cuss){
			result = updSingle(temp,LargecuspriceviewPoco.KEYCOLUMN);
		}
		responsePW(response, result);
	}
	//导入
	public void impAll(HttpServletRequest request, HttpServletResponse response){
		Fileinfo fileinfo = FileUtil.upload(request,0,null,LargecuspriceviewPoco.NAME,"impAll");
		String json = FileUtil.impExcel(fileinfo.getPath(),LargecuspriceviewPoco.FIELDNAME); 
		if(CommonUtil.isNotEmpty(json)) cuss = CommonConst.GSON.fromJson(json, TYPE);
		for(Largecuspriceview temp:cuss){
			if(CommonUtil.isNull(temp.getLargecuspriceid()))
				temp.setLargecuspriceid(CommonUtil.getNewId());
			result = insSingle(temp);
		}
		responsePW(response, result);
	}
	//导出
	public void expAll(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Queryinfo queryinfo = getQueryinfo(request, Largecuspriceview.class, LargecuspriceviewPoco.QUERYFIELDNAME, LargecuspriceviewPoco.ORDER, TYPE);
		cuss = (ArrayList<Largecuspriceview>) selAll(queryinfo);
		FileUtil.expExcel(response,cuss,LargecuspriceviewPoco.CHINESENAME,LargecuspriceviewPoco.NAME);
	}
	//查询所有
	public void selAll(HttpServletRequest request, HttpServletResponse response){
		Queryinfo queryinfo = getQueryinfo(request, Largecuspriceview.class, LargecuspriceviewPoco.QUERYFIELDNAME, LargecuspriceviewPoco.ORDER, TYPE);
		Pageinfo pageinfo = new Pageinfo(0, selAll(queryinfo));
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
	//分页查询
	public void selQuery(HttpServletRequest request, HttpServletResponse response){
		Queryinfo queryinfo = getQueryinfo(request, Largecuspriceview.class, LargecuspriceviewPoco.QUERYFIELDNAME, LargecuspriceviewPoco.ORDER, TYPE);
		Pageinfo pageinfo = new Pageinfo(getTotal(queryinfo), selQuery(queryinfo));
		result = CommonConst.GSON.toJson(pageinfo);
		responsePW(response, result);
	}
}
