package edu.iiitb.flipkart.dao.admin.advertisement_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.iiitb.flipkart.dbUtil.ConnectionPool;
import edu.iiitb.flipkart.model.admin.deleteAdvertisementForSelectedAdHeadingMOdel;
import edu.iiitb.flipkart.model.admin.selectAdvertisementHeadingModel;

public class deleteAdvertisementDao {
	public List<String> SelectAdHeadingToDeleteAdvertisement(selectAdvertisementHeadingModel model) {

		List<String> adheadinglist=new ArrayList<String>();
		
		Connection con=ConnectionPool.getConnection();
	try {
		
		Statement stmt=con.createStatement();
		String queryTOGEtAdHeading="select * from advertisement";
		
		ResultSet coursenameResutSet=stmt.executeQuery(queryTOGEtAdHeading);
		while(coursenameResutSet.next())
		{
			adheadinglist.add(coursenameResutSet.getString("advertisement_name"));
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
		
		
		return adheadinglist;
		// TODO Auto-generated method stub
		
		
		
		
	}

	
	public String deleteAdverisementForSelectedAdHeading(deleteAdvertisementForSelectedAdHeadingMOdel model) {

		//List<String> productlist=new ArrayList<String>();
		
		Connection con=ConnectionPool.getConnection();
	try {
		
		Statement stmt=con.createStatement();
		
		String GetAdId="select advertisement_id from advertisement where advertisement_name='"+model.getAdvertisement_name()+"'";
		
		ResultSet deletead=stmt.executeQuery(GetAdId);
	if(deletead.next())
	{
		model.setAdvertisement_id(deletead.getString("advertisement_id"));
	}
		
	PreparedStatement prestmt=null;
	String query="delete from Flipkart.advertisement where advertisement_id='"+model.getAdvertisement_id()+"'";
	prestmt=con.prepareStatement(query);
	//prestmt.setString(1, model.getAdvertisement_id());
	
	prestmt.executeUpdate();
	
	return "success";
	//}

	
	
	
	} catch (Exception e) {
		e.printStackTrace();
		return "failure";
		// TODO: handle exception
	}
		
		
		// TODO Auto-generated method stub
		
		
		
		
	}

	
	


}
