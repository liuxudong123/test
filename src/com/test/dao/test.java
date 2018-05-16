package com.test.dao;

import java.util.ArrayList;
import java.util.List;

import com.test.bean.TestBean;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDao testdao = new TestDao();
		List<TestBean> listtest = new ArrayList<TestBean>();
		listtest = testdao.findalltest();
		for(int i=0;i<listtest.size();i++)
		{
			TestBean test = listtest.get(i);
			System.out.println("员工编号"+test.getEmpno()+
					"员工姓名"+test.getEname());
			
		}
	}

}
