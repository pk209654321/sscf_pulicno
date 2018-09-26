package com.sscf.publicno.dto;

import com.sscf.education.common.entity.PageInfo;

public class BdMasterStatisDto extends PageInfo{
	/*"phone": "value",
	"nick_name": "value",
	"wx_name": "value",
	"start_time": "value",
	"end_time": "value",
	"source_user": "value",
	"sort_type": "value",
	"sort_filed": "value"*/
	private String phone;
	private String nick_name;
	private String wx_name;
	private String start_time;
	private String end_time;
	private Integer source_user;
	private String sort_type;
	private String sort_filed;
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getWx_name() {
		return wx_name;
	}
	public void setWx_name(String wx_name) {
		this.wx_name = wx_name;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	
	public Integer getSource_user() {
		return source_user;
	}
	public void setSource_user(Integer source_user) {
		this.source_user = source_user;
	}
	public String getSort_type() {
		return sort_type;
	}
	public void setSort_type(String sort_type) {
		this.sort_type = sort_type;
	}
	public String getSort_filed() {
		return sort_filed;
	}
	public void setSort_filed(String sort_filed) {
		this.sort_filed = sort_filed;
	}
	
	
}
