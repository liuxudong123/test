package com.alipay.demo;

import java.util.Date;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicMessageSingleSendRequest;
import com.alipay.api.response.AlipayMobilePublicMessageSingleSendResponse;

public class alipayTest4 {
	 
	public static void main(String[] args) {
		System.out.println(new Date().toLocaleString());
	}
	public AlipayMobilePublicMessageSingleSendResponse messageSingleSend(String appAuthToken, String bizContent)
			throws AlipayApiException {
			    AlipayMobilePublicMessageSingleSendRequest request = new AlipayMobilePublicMessageSingleSendRequest();
			    request.putOtherTextParam("app_auth_token", appAuthToken);
			    request.setBizContent(bizContent);
			    return AlipayClientFactory.getAlipayClient().execute(request);
			}
}
