package com.mahadevConst.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mahadevConst.model.MaterialRange;
import com.mahadevConst.service.MaterialRangeService;

@Controller
public class MaterialRangeController {

	@Autowired
	private MaterialRangeService materialRangeService;

	@RequestMapping(value = "/saveMaterialRange", method = RequestMethod.POST)
	public @ResponseBody String saveMaterialRange(@RequestBody String materialRangeData) {

		if (materialRangeData != null) {
			JSONObject jsonObj = new JSONObject(materialRangeData);
			String date = jsonObj.getString("createdDate");
			String materialName = jsonObj.getString("materialName");
			String materialDescription = jsonObj.getString("materialDescription");
			String rate = jsonObj.getString("rate");

			Integer materialRate = Integer.parseInt(rate);
			MaterialRange materialRange = new MaterialRange();

			if (date != null) {
				materialRange.setCreatedDate(date);
			}

			if (materialName != null) {
				materialRange.setMaterialName(materialName);
			}

			if (materialDescription != null) {
				materialRange.setMaterialDescription(materialDescription);
			}

			if (materialRate != null) {
				materialRange.setRate(materialRate);
			}

			materialRangeService.saveMaterialRange(materialRange);
		}

		return "materialRange";
	}
	
	@RequestMapping(value="getAllMaterialRange" , method= RequestMethod.POST)
	public String getAllMaterialRangeByMerchantId(@RequestParam("merchantId") Integer merchantId){
		
		
		return "materialRange";
	}

}
