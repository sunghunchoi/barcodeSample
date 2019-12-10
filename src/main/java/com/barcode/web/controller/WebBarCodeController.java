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
		BarCodeEntity site3 = new BarCodeEntity();
		BarCodeEntity site4 = new BarCodeEntity();
		BarCodeEntity site5 = new BarCodeEntity();
		BarCodeEntity site6 = new BarCodeEntity();
		BarCodeEntity site7 = new BarCodeEntity();
		BarCodeEntity site8 = new BarCodeEntity();
		BarCodeEntity site9 = new BarCodeEntity();
		BarCodeEntity site10 = new BarCodeEntity();

		site1.barCodeName = "googleA";
		site1.qrCodeName = "googleB";
		site1.code = "www.google.com";

		site2.barCodeName = "naverA";
		site2.qrCodeName = "naverB";
		site2.code = "www.naver.com";

		site3.barCodeName = "daumA";
		site3.qrCodeName = "daumB";
		site3.code = "www.daum.net";

		site4.barCodeName = "yahoojpA";
		site4.qrCodeName = "yahoojpB";
		site4.code = "www.yahoo.co.jp";

		site5.barCodeName = "progA";
		site5.qrCodeName = "progB";
		site5.code = "www.prog-8.com";

		site6.barCodeName = "schooA";
		site6.qrCodeName = "schooB";
		site6.code = "www.schoo.jp";

		site7.barCodeName = "trailheadA";
		site7.qrCodeName = "trailheadB";
		site7.code = "www.trailhead.salesforce.com/ja";

		site8.barCodeName = "redmineA";
		site8.qrCodeName = "redmineB";
		site8.code = "www.redmine.jp";

		site9.barCodeName = "googleC";
		site9.qrCodeName = "googleD";
		site9.code = "www.google.com";

		site10.barCodeName = "naverC";
		site10.qrCodeName = "naverD";
		site10.code = "www.naver.com";

		sites.add(site1);
		sites.add(site2);
		sites.add(site3);
		sites.add(site4);
		sites.add(site5);
		sites.add(site6);
		sites.add(site7);
		sites.add(site8);
		sites.add(site9);
		sites.add(site10);

		try {
			model.addAttribute("sites", sites);
	    }catch (Exception e) {

		}

	    return "barCode";
	}

}

