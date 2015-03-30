package edu.iiitb.flipkart.action.admin.advertisement_management;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.flipkart.dao.admin.advertisement_management.selectProductForAddAdvertisementdao;
import edu.iiitb.flipkart.model.admin.GetalreadyadnamesModel;
import edu.iiitb.flipkart.model.admin.advertisementModel;

public class Getalreadyadnames extends ActionSupport implements ModelDriven<GetalreadyadnamesModel>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private advertisementModel model=new advertisementModel();
	private selectProductForAddAdvertisementdao dao=new selectProductForAddAdvertisementdao();
	private GetalreadyadnamesModel modell=new GetalreadyadnamesModel();
	
	
	public String execute()
	{
		//model.setProductlist(dao.SelectProductToAddAdvertisement(model));
		modell.setAlreadyadlist(dao.Selectadnames(modell));
		
		return "success";
		
	}
	
	@Override
	public GetalreadyadnamesModel getModel() {
		// TODO Auto-generated method stub
		return modell;
	}

	
		
}
