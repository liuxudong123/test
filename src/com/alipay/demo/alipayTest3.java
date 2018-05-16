package com.alipay.demo;


import com.alipay.api.AlipayClient;
import com.alipay.api.domain.Context;
import com.alipay.api.domain.Keyword;
import com.alipay.api.domain.Matcher;
import com.alipay.api.domain.Template;
import com.alipay.api.request.AlipayMobilePublicMessageMatcherSendRequest;

import net.sf.json.JSONObject;

public class alipayTest3 {
	public static void main(String[] args) {
			AlipayClient alipayClient = AlipayClientFactory.getAlipayClient();
			AlipayMobilePublicMessageMatcherSendRequest request = new AlipayMobilePublicMessageMatcherSendRequest();
			Template template = new Template();
			template.setTemplateId("111456765432");	
			Keyword keyword = new Keyword();
			keyword.setColor("#666");
			keyword.setValue("ssss");
			Context context = new Context();
			context.setKeyword1(keyword);
			template.setContext(context);
			Matcher matcher = new Matcher();
			matcher.setMobileNo("18711625259");
			JSONObject jsonObject = JSONObject.fromObject(template);
			JSONObject jsonObject2 = JSONObject.fromObject(matcher);
			JSONObject jsonObject3 = new JSONObject();
			jsonObject3.put("matcher",jsonObject2);
			jsonObject3.put("template", jsonObject);
			
			System.out.println(jsonObject.toString());
			System.out.println(jsonObject3.toString());
			
//			try {
//				AlipayMobilePublicMessageMatcherSendResponse response = alipayClient.execute(request);
//			
//				System.out.println(response.isSuccess());
//				System.out.println(response.getCode());
//				System.out.println(response.getSubCode());
//				System.out.println(response.getSubMsg());
//			} catch (AlipayApiException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}
}
