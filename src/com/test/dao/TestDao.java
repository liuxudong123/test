package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.bean.TestBean;

public class TestDao {

	public List<TestBean> findalltest()
	{
		String driverurl = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driverurl);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<TestBean> listtest = new ArrayList<TestBean>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:oracle10", "lxd", "lxd");
			String sql ="select *from test";
			
			Statement st = conn.createStatement();
			ResultSet rs = null;
			rs = st.executeQuery(sql);
			while(rs.next())
			{
				TestBean test = new TestBean(rs.getInt("empno"),
						rs.getString("ename"),
						rs.getString("job"),
						rs.getInt("mgr"), 
						rs.getDate("hiredate"),
						rs.getDouble("sal"),
						rs.getDouble("comm"), rs.getInt("deptno"));
				listtest.add(test);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listtest;
	}
}
