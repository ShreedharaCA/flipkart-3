package edu.iiitb.flipkart.action.admin.advertisement_management;



import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.flipkart.dao.admin.advertisement_management.deleteAdvertisementDao;
import edu.iiitb.flipkart.model.admin.selectAdvertisementHeadingModel;

public class selectAdvertisementForDeletion extends ActionSupport implements ModelDriven<selectAdvertisementHeadingModel> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private deleteAdvertisementDao dao=new  deleteAdvertisementDao();
	private selectAdvertisementHeadingModel model=new selectAdvertisementHeadingModel();

	
	
	public String execute()
	{
		model.setAdheadinglist(dao.SelectAdHeadingToDeleteAdvertisement(model));
		
		return "success";
	}
	
	
	
	
	@Override
	public selectAdvertisementHeadingModel getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	
	

}
