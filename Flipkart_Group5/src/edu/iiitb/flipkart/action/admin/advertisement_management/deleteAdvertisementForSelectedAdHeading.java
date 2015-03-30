package edu.iiitb.flipkart.action.admin.advertisement_management;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.flipkart.dao.admin.advertisement_management.deleteAdvertisementDao;
import edu.iiitb.flipkart.model.admin.deleteAdvertisementForSelectedAdHeadingMOdel;

public class deleteAdvertisementForSelectedAdHeading extends ActionSupport implements ModelDriven<deleteAdvertisementForSelectedAdHeadingMOdel> {

	
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private deleteAdvertisementForSelectedAdHeadingMOdel model=new deleteAdvertisementForSelectedAdHeadingMOdel();
	private deleteAdvertisementDao dao = new deleteAdvertisementDao();
	
	public String execute()
	{
		dao.deleteAdverisementForSelectedAdHeading(model);
		return "success";
	}

	@Override
	public deleteAdvertisementForSelectedAdHeadingMOdel getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	
	
	
	

}
