package com.sscf.publicno.dao;

import java.util.List;

import com.sscf.publicno.dto.BdMasterStatisDto;
import com.sscf.publicno.entity.BdMasterStatis;

public interface BdMasterStatisDao {
	public int selectBdMasterStatisCount(BdMasterStatisDto dto);
	public List<BdMasterStatis> selectBdMasterStatisList(BdMasterStatisDto dto);
}
