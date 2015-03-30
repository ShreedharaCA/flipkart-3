package edu.iiitb.flipkart.dao.admin.advertisement_management;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import edu.iiitb.flipkart.dbUtil.ConnectionPool;
import edu.iiitb.flipkart.model.admin.GetalreadyadnamesModel;
import edu.iiitb.flipkart.model.admin.addAdvertisementModel;
import edu.iiitb.flipkart.model.admin.advertisementModel;
import edu.iiitb.flipkart.model.admin.selectAdvertisementHeadingModel;

public class selectProductForAddAdvertisementdao {

	public List<String> SelectProductToAddAdvertisement(advertisementModel model) {

		List<String> productlist=new ArrayList<String>();
		
		Connection con=ConnectionPool.getConnection();
	try {
		
		Statement stmt=con.createStatement();
		String queryToGetCoursename="select * from product";
		
		ResultSet coursenameResutSet=stmt.executeQuery(queryToGetCoursename);
		while(coursenameResutSet.next())
		{
			productlist.add(coursenameResutSet.getString("product_name"));
		}
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
		
		
		return productlist;
		// TODO Auto-generated method stub
		
		
		
		
	}

	public List<String> Selectadnames(GetalreadyadnamesModel model) {

		List<String> alreadyadlist=new ArrayList<String>();
		
		Connection con=ConnectionPool.getConnection();
	try {
		
		
		Statement Stmt=con.createStatement();
		String Getad="select * from advertisement";
		
		ResultSet result=Stmt.executeQuery(Getad);
		while(result.next())
		{
			alreadyadlist.add(result.getString("advertisement_name"));
		}
		System.out.println("in dao"+model.getAlreadyadlist());
		
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
		
		
		return alreadyadlist;
		// TODO Auto-generated method stub
		
		
		
		
	}

	
	
	
	
	public String addAdvertisementForSelectedProduct(addAdvertisementModel model) {
		String imageLocation=null;

		//List<String> productlist=new ArrayList<String>();
		
		Connection con=ConnectionPool.getConnection();
	try {
		
		Statement stmt=con.createStatement();
		String GetProductId="select product_id from product where product_name='"+model.getProduct_name()+"'";
		
		ResultSet coursenameResutSet=stmt.executeQuery(GetProductId);
	if(coursenameResutSet.next())
	{
		model.setProduct_id(coursenameResutSet.getString("product_id"));
	}
		
	
	String Query="insert into advertisement(advertisement_id,advertisement_name,advertisement_description,advertisement_image,product_id) values(?,?,?,?,?)";
	PreparedStatement addadvertisement=null;
	addadvertisement=con.prepareStatement(Query);
	addadvertisement.setString(1, model.getAdvertisement_id());
	addadvertisement.setString(2, model.getAdvertisement_name());
	addadvertisement.setString(3, model.getAdvertisement_description());
	//addadvertisement.setString(4, model.getAdvertisement_image());
	 File destFile = new File(model.getImagePath(),model.getImageFileName());
	 FileUtils.copyFile(model.getImage(), destFile);
	  FileInputStream inputStream = new FileInputStream(destFile);
	  

	  System.out.println(imageLocation);
	  addadvertisement.setBlob(4, inputStream);
	  
	  addadvertisement.setString(5, model.getProduct_id());
		

		
		if(addadvertisement.executeUpdate()>0)
		{
			return "success";
			
		}
		else
		{
			return "failure";
		}
	
	
	
	
	} catch (Exception e) {
		e.printStackTrace();
		return "failure";
		// TODO: handle exception
	}
		
		
		// TODO Auto-generated method stub
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	

}
