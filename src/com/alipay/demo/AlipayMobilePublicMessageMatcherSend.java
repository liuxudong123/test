package com.alipay.demo;
import com.alipay.api.domain.Matcher;
import com.alipay.api.domain.Template;
import com.alipay.api.response.AlipayMobilePublicMessageMatcherSendResponse;

import net.sf.json.JSONObject;

public class AlipayMobilePublicMessageMatcherSend {
	
	public AlipayMobilePublicMessageMatcherSendResponse send(String templateId,
			String mobileNo,String context){
		AlipayMobilePublicMessageMatcherSendResponse response = null;
		Template template = new Template();
		template.setTemplateId(templateId);	
		Matcher matcher = new Matcher();
		matcher.setMobileNo(mobileNo);
		JSONObject jsonObject = JSONObject.fromObject(template);
		jsonObject.put("context", context);
		JSONObject jsonObject2 = JSONObject.fromObject(matcher);
		JSONObject jsonObject3 = new JSONObject();
		jsonObject3.put("matcher",jsonObject2);
		jsonObject3.put("template", jsonObject);
		return response;
	}
}
