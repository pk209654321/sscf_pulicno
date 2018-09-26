package com.sscf.publicno.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.education.common.entity.PageResult;
import com.sscf.publicno.controller.BdMasterStatisController;
import com.sscf.publicno.dao.BdMasterStatisDao;
import com.sscf.publicno.dto.BdMasterStatisDto;
import com.sscf.publicno.entity.BdMasterStatis;

@Component
public class BdMasterStatisService {
	private static final Logger logger = LoggerFactory.getLogger(BdMasterStatisService.class);
	@Autowired
	BdMasterStatisDao bdMasterStatisDao;
	
	public PageResult<BdMasterStatis> qryPageBdMasterStatis(BdMasterStatisDto dto) {
	    if (dto == null) {
	        dto = new BdMasterStatisDto();
	    }
	    int total = bdMasterStatisDao.selectBdMasterStatisCount(dto);
	    logger.debug("查询结果总数是:"+total);
	    PageResult<BdMasterStatis> page = new PageResult<>(dto, total);
	    if (page.isHasRows()) {
	        List<BdMasterStatis> list = bdMasterStatisDao.selectBdMasterStatisList(dto);
	        page.setRows(list);
	    }
	    return page;
	
	}
}
