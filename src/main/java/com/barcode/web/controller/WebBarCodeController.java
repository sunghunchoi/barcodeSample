package com.barcode.web.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.barcode.web.domain.BarCodeEntity;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebBarCodeController {

	@RequestMapping("/barCode")
	public String barCodePage(Model model) {

		List<BarCodeEntity> sites = new ArrayList<BarCodeEntity>();

		BarCodeEntity site1 = new BarCodeEntity();
		BarCodeEntity site2 = new BarCodeEntity();

		site1.name = "googleA";
		site1.code = "www.google.com";

		site2.name = "naverA";
		site2.code = "www.naver.com";

		sites.add(site1);
		sites.add(site2);

		try {
			model.addAttribute("sites", sites);
	    }catch (Exception e) {

		}

	    return "barCode";
	}

}

