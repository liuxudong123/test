package com.alipay.demo;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.constants.AlipayServiceEnvConstants;

public class AlipayClientFactory {
	private static AlipayClient alipayClient = null;
	
	public static AlipayClient getAlipayClient(){
		if(alipayClient == null){
			synchronized (AlipayClientFactory.class)
			{
				if (alipayClient == null)
					getInstance();
			}
		}
		return alipayClient;
	}
	
	
	private static void getInstance(){
		 alipayClient = 
				new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
						"2015012800028441",AlipayServiceEnvConstants.PRIVATE_KEY,"json","GBK",AlipayServiceEnvConstants.PUBLIC_KEY,"RSA2");
	}
}
