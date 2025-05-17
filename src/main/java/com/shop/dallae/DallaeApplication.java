package com.shop.dallae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class DallaeApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(DallaeApplication.class, args);

//		String url = "jdbc:mysql://localhost:3306/dallae?serverTimezone=UTC";
//		String userName = "root";
//		String password = "0000";
//
//		Connection con = DriverManager.getConnection(url, userName, password);
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("select * from dallae_cmm_cd");
//
//		rs.next();
//		String cmmCd = rs.getString("cmmCd");
//		System.out.println(cmmCd);
//
//		rs.close();
//		st.close();
//		con.close();
	}

}
