package com.mahadevConst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahadevConst.model.MaterialRange;

@Repository
public interface MaterialRangeRepository extends JpaRepository<MaterialRange, Integer>{
	
	

}
