package com.mahadevConst.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahadevConst.model.MaterialRange;
import com.mahadevConst.repository.MaterialRangeRepository;
import com.mahadevConst.service.MaterialRangeService;

@Service
public class MaterialRangeServiceImpl implements MaterialRangeService{

	@Autowired
	private MaterialRangeRepository materialRangeRepository;
	
	
	public void saveMaterialRange(MaterialRange materialRange) {
		materialRangeRepository.save(materialRange);
	}

	
	
}
