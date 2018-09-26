package com.sscf.publicno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.education.common.entity.PageResult;
import com.sscf.publicno.dao.BdMasterStatisDao;
import com.sscf.publicno.dto.BdMasterStatisDto;
import com.sscf.publicno.entity.BdMasterStatis;

@Component
public class BdMasterStatisService {

	/*
	 * public PageResult<Collect> qryPageCollect(CollectDto dto) { if (dto == null)
	 * { dto = new CollectDto(); } int total = collectDao.getCollectCount(dto);
	 * PageResult<Collect> page = new PageResult<>(dto, total); if
	 * (page.isHasRows()) { List<Collect> list = collectDao.qryCollect(dto);
	 * page.setRows(list); } return page; }
	 */
	
	@Autowired
	BdMasterStatisDao bdMasterStatisDao;
	
	public PageResult<BdMasterStatis> qryPageBdMasterStatis(BdMasterStatisDto dto) {
	    if (dto == null) {
	        dto = new BdMasterStatisDto();
	    }
	    int total = bdMasterStatisDao.selectBdMasterStatisCount(dto);
	    PageResult<BdMasterStatis> page = new PageResult<>(dto, total);
	    if (page.isHasRows()) {
	        List<BdMasterStatis> list = bdMasterStatisDao.selectBdMasterStatisList(dto);
	        page.setRows(list);
	    }
	    return page;
	
	}
}
