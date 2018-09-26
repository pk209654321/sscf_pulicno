package com.sscf.publicno.controller;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.sscf.education.common.entity.PageResult;
import com.sscf.education.common.entity.Result;
import com.sscf.education.common.util.ResultUtil;
import com.sscf.publicno.dto.BdMasterStatisDto;
import com.sscf.publicno.entity.BdMasterStatis;
import com.sscf.publicno.service.BdMasterStatisService;
import com.sscf.publicno.util.TimeUtil;

@RestController
@RequestMapping("/publicno")
public class BdMasterStatisController {
private static final Logger logger = LoggerFactory.getLogger(BdMasterStatisController.class);
	
	@Autowired
	BdMasterStatisService bdMasterStatisService;
	
	@RequestMapping(value = "/selectBdMasterStatis")
	@ResponseBody
	public Result selectAiShareResult(@RequestBody BdMasterStatisDto dto ) {
		String start_time = dto.getStart_time();
		String end_time = dto.getEnd_time();
		if(StringUtils.isNotEmpty(start_time)&&StringUtils.isNotEmpty(end_time)) {
			
		}else {
			return ResultUtil.error(-1, "传参错误", "时间条件");
		}
		//TimeUtil.for
		logger.debug("接受到的参数dto:"+JSON.toJSONString(dto));
		PageResult<BdMasterStatis> selectPageAiShareResult = bdMasterStatisService.qryPageBdMasterStatis(dto);
		logger.debug("查询结果:"+JSON.toJSONString(selectPageAiShareResult));
		return ResultUtil.success(selectPageAiShareResult);
	}
}
