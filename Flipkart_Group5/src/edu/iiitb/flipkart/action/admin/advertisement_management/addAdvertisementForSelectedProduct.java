package edu.iiitb.flipkart.action.admin.advertisement_management;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import edu.iiitb.flipkart.dao.admin.advertisement_management.selectProductForAddAdvertisementdao;
import edu.iiitb.flipkart.model.admin.GetalreadyadnamesModel;
import edu.iiitb.flipkart.model.admin.addAdvertisementModel;
import edu.iiitb.flipkart.model.admin.selectAdvertisementHeadingModel;


public class addAdvertisementForSelectedProduct extends ActionSupport implements ServletRequestAware, ModelDriven<addAdvertisementModel>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HttpServletRequest servletRequest;
	private addAdvertisementModel model=new addAdvertisementModel();
	
	private selectProductForAddAdvertisementdao dao=new selectProductForAddAdvertisementdao();
	
	public String execute()
	{
		String destpath = servletRequest.getSession().getServletContext().getRealPath("/");
		model.setImagePath(destpath);
		
		dao.addAdvertisementForSelectedProduct(model);
		
		return "success";
		
	}
	
	@Override
	public addAdvertisementModel getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	
		
}
