package com.alipay.demo;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayCommerceDataSendRequest;
import com.alipay.api.request.AlipayMobilePublicMessageMatcherSendRequest;
import com.alipay.api.request.AlipayOpenAuthTokenAppRequest;
import com.alipay.api.response.AlipayCommerceDataSendResponse;
import com.alipay.api.response.AlipayMobilePublicMessageMatcherSendResponse;
import com.alipay.api.response.AlipayOpenAuthTokenAppResponse;
import com.alipay.constants.AlipayServiceEnvConstants;

public class alipayTest2 {
	public static void main(String[] args) {
		AlipayClient alipayClient = 
				new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
						"2015012800028441",AlipayServiceEnvConstants.PRIVATE_KEY,"json","GBK",AlipayServiceEnvConstants.PUBLIC_KEY,"RSA2");
			AlipayMobilePublicMessageMatcherSendRequest request = new AlipayMobilePublicMessageMatcherSendRequest();
		
				
			request.setBizContent("{"+
			 "\"matcher\": {"+
			 "\"mobileNo\": \"18711625259\""+
				 "},"+
				 "\"template\":{"+
					"\"templateId\":\"066929c5206e4ea282e38750c1b4196a\","+
					"\"context\":{"+
					
						"\"keyword1\":{"+
						"\"color\":\"#000000\","+
						"\"value\":\"2014-09-24\""+
							"},"+
							"\"first\":{"+
				"\"color\":\"#000000\","+
				"\"value\":\"尊敬的刘旭东：\""+
				"},"+
				"\"remark\":{"+
				"\"color\":\"#85be53\","+
				"\"value\":\"您的话费余额已不足10元，为避免次月扣费因余额不足停机，请您提前续费。\""+
				"},"+
		"\"headColor\":\"#666666\""+
//				 "\"url\":\"http://m.baidu.com\""+
							"}}}");
		
//		 https://openauth.alipaydev.com/oauth2/appToAppAuth.htm?app_id=2016080500174784&redirect_uri=http://211.91.224.88/Gateway/Check
//		AlipayOpenAuthTokenAppRequest request = new AlipayOpenAuthTokenAppRequest();
//		request.setBizContent("{" +
//		"    \"grant_type\":\"authorization_code\"," +
//		"    \"code\":\"be3ee067ac50406f93cd159b8a7d4X19\"" +
//		"  }");
			try {
			System.out.println(request.getBizContent());
			AlipayMobilePublicMessageMatcherSendResponse response = alipayClient.execute(request);
			System.out.println(response.getCode()); // 获取接口结果码
			System.out.println(response.getSubCode()); // 当接口调用失败后，获取子错误码
			System.out.println(response.getMsg()); // 获取子错误描述
			System.out.println(response.getBody()); // 获取完整的返回报文
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
