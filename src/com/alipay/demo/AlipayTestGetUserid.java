package com.alipay.demo;

import java.util.List;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayCommerceDataSendRequest;
import com.alipay.api.request.AlipayMobilePublicFollowListRequest;
import com.alipay.api.response.AlipayMobilePublicFollowListResponse;
import com.alipay.constants.AlipayServiceEnvConstants;

public class AlipayTestGetUserid {
	
	public static void main(String[] args) {
		AlipayClient alipayClient = 
				new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
						"2015012800028441",AlipayServiceEnvConstants.PRIVATE_KEY,"json","GBK",AlipayServiceEnvConstants.PUBLIC_KEY,"RSA2");
		AlipayMobilePublicFollowListRequest request = new AlipayMobilePublicFollowListRequest();
		request.setBizContent("{\"nextUserId\":\"2088902719479611\"}");
		try {
			AlipayMobilePublicFollowListResponse response = alipayClient.execute(request);
			System.out.println(response.getCode());
			System.out.println(response.getMsg());
//			List<String> useridlist = response.getData().getUserIdList();
//			for(String userid : useridlist){
//				System.out.println(userid);
//			}
			System.out.println(response.getNextAlipayUserId());
			
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
