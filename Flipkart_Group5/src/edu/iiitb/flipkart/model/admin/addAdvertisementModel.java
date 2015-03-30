package edu.iiitb.flipkart.model.admin;

import java.io.File;

public class addAdvertisementModel {
	private String advertisement_id;
	private String advertisement_name;
	private String advertisement_description;
	private String advertisement_image;
	private String product_name;
	private String product_id;
	private File image;
	private String imageFileName;
	private String imageContentType;
	private String imagePath;
	private String status;
	
	
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getImageContentType() {
		return imageContentType;
	}
	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAdvertisement_id() {
		return advertisement_id;
	}
	public void setAdvertisement_id(String advertisement_id) {
		this.advertisement_id = advertisement_id;
	}
	public String getAdvertisement_name() {
		return advertisement_name;
	}
	public void setAdvertisement_name(String advertisement_name) {
		this.advertisement_name = advertisement_name;
	}
	public String getAdvertisement_description() {
		return advertisement_description;
	}
	public void setAdvertisement_description(String advertisement_description) {
		this.advertisement_description = advertisement_description;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getAdvertisement_image() {
		return advertisement_image;
	}
	public void setAdvertisement_image(String advertisement_image) {
		this.advertisement_image = advertisement_image;
	}
	

}
