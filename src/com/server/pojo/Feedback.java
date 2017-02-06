package com.server.pojo;

import java.sql.Date;
/**
 * feedback 实体类
 *@author ZhangRuiLong
 */
public class Feedback
{
   /**
    * ,主键
    */
   private String feedbackid; 
   /**
    * 
    */
   private String feedbackdetail;   
   /**
    * 
    */
   private String feedbackcustomer;   
   /**
    * 
    */
   private String feedbacktime;   
   /**
    * 
    */
   private String feedbackstate;   
    //属性方法	    
     /**
	 *设置主键""属性
	 *@param feedbackid 实体的Feedbackid属性
	 */
	public void setFeedbackid(String feedbackid)
	{
		this.feedbackid = feedbackid;
	}
	
	/**
	 *获取主键""属性
	 */
	public String getFeedbackid()
	{
		return this.feedbackid;
	}

	/**
	 *设置""属性
	 *@param feedbackdetail 实体的Feedbackdetail属性
	 */
	public void setFeedbackdetail(String feedbackdetail)
	{
		this.feedbackdetail = feedbackdetail;
	}
	
	/**
	 *获取""属性
	 */
	public String getFeedbackdetail()
	{
		return this.feedbackdetail;
	}	   

	/**
	 *设置""属性
	 *@param feedbackcustomer 实体的Feedbackcustomer属性
	 */
	public void setFeedbackcustomer(String feedbackcustomer)
	{
		this.feedbackcustomer = feedbackcustomer;
	}
	
	/**
	 *获取""属性
	 */
	public String getFeedbackcustomer()
	{
		return this.feedbackcustomer;
	}	   

	/**
	 *设置""属性
	 *@param feedbacktime 实体的Feedbacktime属性
	 */
	public void setFeedbacktime(String feedbacktime)
	{
		this.feedbacktime = feedbacktime;
	}
	
	/**
	 *获取""属性
	 */
	public String getFeedbacktime()
	{
		return this.feedbacktime;
	}	   

	/**
	 *设置""属性
	 *@param feedbackstate 实体的Feedbackstate属性
	 */
	public void setFeedbackstate(String feedbackstate)
	{
		this.feedbackstate = feedbackstate;
	}
	
	/**
	 *获取""属性
	 */
	public String getFeedbackstate()
	{
		return this.feedbackstate;
	}	   
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(
		String feedbackid
	 	,String feedbackdetail
	 	,String feedbackcustomer
	 	,String feedbacktime
	 	,String feedbackstate
		 ){
		super();
		this.feedbackid = feedbackid;
	 	this.feedbackdetail = feedbackdetail;
	 	this.feedbackcustomer = feedbackcustomer;
	 	this.feedbacktime = feedbacktime;
	 	this.feedbackstate = feedbackstate;
	}
}

