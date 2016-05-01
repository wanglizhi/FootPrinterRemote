package bean;

import java.io.Serializable;
import java.net.URL;

public abstract class PlacePO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PlacePO(){
		
	}
	public PlacePO(int placeID, int cityID, String name, String introduction,
			URL image, String type, String price, int applauseNum) {
		super();
		this.placeID = placeID;
		this.cityID = cityID;
		this.name = name;
		this.introduction = introduction;
		this.image = image;
		this.type = type;
		this.price = price;
		this.applauseNum = applauseNum;
	}
	private int placeID;
	private int cityID;
	private String name;
	private String introduction;//¼ò½é
	private URL image;
	private String type;
	private String price;
	private int applauseNum;
	public int getID() {
		return placeID;
	}
	public void setID(int placeID) {
		this.placeID = placeID;
	}
	public int getCityID() {
		return cityID;
	}
	public void setCityID(int cityID) {
		this.cityID = cityID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public URL getImage() {
		return image;
	}
	public void setImage(URL image) {
		this.image = image;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getApplauseNum() {
		return applauseNum;
	}
	public void setApplauseNum(int applauseNum) {
		this.applauseNum = applauseNum;
	}

	
	
}
