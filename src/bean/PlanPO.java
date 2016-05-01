package bean;

import java.util.Date;
import java.io.Serializable;
import java.net.URL;

public class PlanPO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int planID;
	int userID;
	int cityID;
	int applauseNum;
	Date startDate;
	Date endDate;
	String title;
	URL planImage;
	String userName;
	String cityName;
	
	public PlanPO(int userID, int cityID, int applauseNum, Date startDate, Date endDate, String title){
		super();
		this.userID=userID;
		this.cityID=cityID;
		this.applauseNum=applauseNum;
		this.startDate=startDate;
		this.endDate=endDate;
		this.title=title;
	}
	public PlanPO(int planID, int userID, int cityID, int applauseNum, Date startDate, Date endDate, String title){
		super();
		this.planID=planID;
		this.userID=userID;
		this.cityID=cityID;
		this.applauseNum=applauseNum;
		this.startDate=startDate;
		this.endDate=endDate;
		this.title=title;
	}
	public PlanPO(int planID, int userID, int cityID, int applauseNum,
			Date startDate, Date endDate, String title, URL planImage) {
		super();
		this.planID = planID;
		this.userID = userID;
		this.cityID = cityID;
		this.applauseNum = applauseNum;
		this.startDate = startDate;
		this.endDate = endDate;
		this.title = title;
		this.planImage = planImage;
	}

	public PlanPO(int planID, int userID, int cityID, int applauseNum,
			Date startDate, Date endDate, String title, URL planImage,
			String cityName,String userName) {
		super();
		this.planID = planID;
		this.userID = userID;
		this.cityID = cityID;
		this.applauseNum = applauseNum;
		this.startDate = startDate;
		this.endDate = endDate;
		this.title = title;
		this.planImage = planImage;
		this.cityName = cityName;
		this.userName=userName;
	}

	public int getPlanID() {
		return planID;
	}

	public void setPlanID(int planID) {
		this.planID = planID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public int getApplauseNum() {
		return applauseNum;
	}

	public void setApplauseNum(int applauseNum) {
		this.applauseNum = applauseNum;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public URL getPlanImage() {
		return planImage;
	}

	public void setPlanImage(URL planImage) {
		this.planImage = planImage;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	


	
	
}
