package com.mad.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmpDAO {
	
	public int getCount() throws ClassNotFoundException, SQLException
	{
		Class.forName("otracle.djdnk.oejo");
		Connection con=DriverManager.getConnection("dhswjhdwh", "dhjwh", "ndkdnk");
		return 0;
	}

}
