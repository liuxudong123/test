package com.alipay.demo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.hadoop.yarn.api.protocolrecords.ReservationDeleteResponse;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayCommerceDataSendModel;
import com.alipay.api.domain.CardInfo;
import com.alipay.api.request.AlipayCommerceDataSendRequest;
import com.alipay.api.request.AlipayCommerceMedicalInstcardBindRequest;
import com.alipay.api.request.AlipayEbppPdeductBillPayStatusRequest;
import com.alipay.api.request.AlipayOpenAuthTokenAppQueryRequest;
import com.alipay.api.request.AlipayOpenAuthTokenAppRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayCommerceDataSendResponse;
import com.alipay.api.response.AlipayCommerceMedicalInstcardBindResponse;
import com.alipay.api.response.AlipayEbppPdeductBillPayStatusResponse;
import com.alipay.api.response.AlipayOpenAuthTokenAppQueryResponse;
import com.alipay.api.response.AlipayOpenAuthTokenAppResponse;
import com.alipay.constants.AlipayServiceEnvConstants;


public class alipayTest {
	private static int i = 0;
	private static BufferedWriter bwerror;
	private static BufferedReader br;
	private static BufferedWriter bwsucc;
	private static AlipayClient alipayClient = 
			new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
					"2015012800028441",AlipayServiceEnvConstants.PRIVATE_KEY,"json","GBK",AlipayServiceEnvConstants.PUBLIC_KEY,"RSA2");
	private static AlipayCommerceDataSendRequest request = new AlipayCommerceDataSendRequest();
	static{
		try {
			bwerror = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream("C:/Users/Administrator/Desktop/moberror.txt")));
			bwsucc = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream("C:/Users/Administrator/Desktop/bwsucc2.txt")));
			br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("C:/Users/Administrator/Desktop/bwsucc.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		alipayTest al = new alipayTest();
		ExecutorService executorService = Executors.newFixedThreadPool(200);
		String data = null;
		List<String> moblist = new ArrayList<String>();
		try {
			while((data = br.readLine())!=null)
			{
				moblist.add(data);
				if(moblist.size()==200){
					for(int i=0;i<moblist.size();i++)
					{
						executorService.execute(al.new sendthread(moblist.get(i)));
					}
					moblist.clear();
				}
			}
			System.out.println("====="+i);
			for(int i=0;i<moblist.size();i++){
				executorService.execute(al.new sendthread(moblist.get(i)));
			}
			executorService.shutdown();
			System.out.println(i);
			br.close();
			bwsucc.close();
			bwerror.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  class sendthread extends Thread
	{
		private String mob;
		public  sendthread(String mobile){
			this.mob = mobile;
		}
		public void run(){
			System.out.println(mob);
			i++;
			System.out.println(i);
//			alipay(mob);
		}
	}
	
	public void writesuccMobile(String mob){
		try {
			bwsucc.write(mob);
			bwsucc.newLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void writeerrorMobile(String mob){
		try {
			bwerror.write(mob);
			bwerror.newLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void alipay(String mobile){
		//https://openapi.alipay.com/gateway.do
				//2015012800028441
				//18608404898
				//13750820837
				//2016080500174784
				//https://openapi.alipaydev.com/gateway.do
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
				Date now = new Date();
				String date = sf.format(now);
				now.setDate(new Date().getDate()+1);
				String date1 = sf.format(now);
				String mobdis = mobile.substring(0, 3)+"******"+mobile.substring(9, 11);
				request.setBizContent("{"+
			       " \"scene_code\": \"operator_service\","+
			       " \"op_code\": \"operator_balance_remind\","+
			       " \"channel\": \"2015012800028441\","+
			       " \"version\": \"1.0\","+
			       " \"target_id\":\""+mobile+"\","+// lxd :2088902719479611  
			       //2088002112126085
			    
			       " \"target_id_type\": \"BINDING_MOBILE_NO\","+
			       " \"op_data\": {"+
			       " \"card\": ["+
			                "{"+
			                    "\"third_no\": \""+UUID.randomUUID()+"\","+
			                    "\"reason\": \"行业card投递测试\","+
			                    "\"gmt_occur\": \""+date+"\","+//原始事件发生时间，不可以比当前时间晚，时间格式：yyyy-MM-dd HH:mm:ss.S
			                    "\"expire_time\": \""+date1+"\","+//过期时间，不可以比gmt_occur早，时间格式：yyyy-MM-dd HH:mm:ss.S，超过该时间卡片将不可更新
			                    "\"type\": \"CREATE\","+//---新建，UPDATE---更新，CANCEL---撤销
			                    "\"send_type\": \"SINGLE\","+
			                    "\"card_template\": {"+
									"\"pubname\": \"湖南联通\","+
									"\"mobile\":\""+mobdis+"\","+//13750820837
									"\"money\": \"10元\","+
									//alipays:/platformapi/startapp?appId=20000047&followType=PUBLIC&actionType=gotoPublicDetail&sourceId=FromActivity&publicId=2015012800028441&forceFollow=1
									"\"urlcheck\": \"http://p.alipay.com/P/rUB2NQAQ\","+
									//sourceId 话费：shop_102036259_cost 流量：shop_102036259_flow1
									"\"urlcard\": \"https://render.alipay.com/p/f/fd-iwrhmfm2/index.html?mobile="+mobile+"&sourceId=shop_102036259_cost\","+
									"\"urlrecharge\": \"https://render.alipay.com/p/f/fd-iwrhmfm2/index.html?mobile="+mobile+"&sourceId=shop_102036259_cost\","+
									"\"createTime\": \""+date+"\""+//卡片创建时间，时间格式：yyyy-MM-dd HH:mm:ss.S
			                    "}"+
			                "}"+
			            "]"+
			        "}"+
			    "}"
			);
				try {
					
					System.out.println(request.getBizContent());
					AlipayCommerceDataSendResponse response = alipayClient.execute(request);
//					if(!response.isSuccess()){
//						i++;
//						writeerrorMobile(mobile);
//					}else{
//						writesuccMobile(mobile);
//					}	
					System.out.println(response.isSuccess());
					System.out.println(response.getCode());
					System.out.println(response.getSubCode());
					System.out.println(response.getSubMsg());
					System.out.println(response.getBody());
				} catch (AlipayApiException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
