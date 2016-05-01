package bean;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;

/**
 * 城市数据的传输
 * 
 * @author wanglizhi
 * 
 */
public class CityPO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cityID;
	private String name;
	private String introduction;
	private int imageNum;
	private ArrayList<URL> images;
	private int applauseNum;
	private String information;

	public CityPO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityPO(int cityID, String name, String introduction, int imageNum,
			ArrayList<URL> images, int applauseNum, String information) {
		super();
		this.cityID = cityID;
		this.name = name;
		this.introduction = introduction;
		this.imageNum = imageNum;
		this.images = images;
		this.applauseNum = applauseNum;
		this.information = information;
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

	public int getImageNum() {
		return imageNum;
	}

	public void setImageNum(int imageNum) {
		this.imageNum = imageNum;
	}

	public ArrayList<URL> getImages() {
		return images;
	}

	public void setImages(ArrayList<URL> images) {
		this.images = images;
	}

	public int getApplauseNum() {
		return applauseNum;
	}

	public void setApplauseNum(int applauseNum) {
		this.applauseNum = applauseNum;
	}

	public String getInformation() {
		return information;
	}

	public void setInfomation(String information) {
		this.information = information;
	}

}
