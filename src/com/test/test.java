package com.test;

import java.util.Set;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class test {
	public static void main(String[] args) {
		String str = "[{"+
			"'companyCode': '365833602',"+
			"'job168PostName': '工艺工程师-装配线',"+
		"},{"+
			"'companyCode': '19175802',"+
			"'job168PostName': '测试（品质）工程师',"+
		"},{"+
			"'reason': '同步失败',"+
			"'status': 'erro',"+
		"}"+

	"] ";
		
		JSONArray jsonarray=JSONArray.fromObject(str);
		
		for(int i=0;i<jsonarray.size();i++){
			System.out.println(jsonarray.get(i));
			JSONObject jsonobj = JSONObject.fromObject(jsonarray.get(i));
			for(String jsonstr : (Set<String>)jsonobj.keySet()){
				System.out.println("key"+jsonstr+"\t value"+jsonobj.get(jsonstr));
			}
			
		}

	}
}
