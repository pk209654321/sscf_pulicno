package com.sscf.publicno;

import com.alibaba.fastjson.JSON;
import com.sscf.publicno.dto.BdMasterStatisDto;

public class Test {
	public static void main(String[] args) {
		BdMasterStatisDto bd=new BdMasterStatisDto();
		bd.setStart_time("2018-09-10 10:00:00");
		bd.setEnd_time("2018-09-14 10:00:00");
		//bd.setPhone("110");
		bd.setSource_user(2);
		//bd.setNick_name("wyd");
		bd.setSort_type("DESC");
		bd.setSort_field("live_browse");
		String jsonString = JSON.toJSONString(bd);
		System.out.println(jsonString);
	}
}
