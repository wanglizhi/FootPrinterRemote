package bean;

import java.io.Serializable;
import java.net.URL;
import java.util.Date;

public class BlogPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int blogID;
	int userID;
	int cityID;
	String userName;
	String cityName;
	String title;
	int applauseNum;
	
	//URL url;//blog文件夹的url，根据文件夹中的布局文件获得图片视频等资源的位置
	Date publishTime;
	URL userImage;
	public BlogPO(int blogID,int userID,int cityID, String userName, String cityName, String title, int applauseNum, URL url, Date publishTime, URL userImage) {
		super();
		this.blogID = blogID;
		this.userID=userID;
		this.cityID=cityID;
		this.userName = userName;
		this.cityName = cityName;
		this.title = title;
		this.applauseNum = applauseNum;
		//this.url = url;
		this.publishTime = publishTime;
		this.userImage = userImage;
	}
	//这个是blog用的
	public BlogPO(int blogID, String userName, String cityName, String title, int applauseNum, URL url, Date publishTime, URL userImage) {
		super();
		this.blogID = blogID;
		this.userName = userName;
		this.cityName = cityName;
		this.title = title;
		this.applauseNum = applauseNum;
		//this.url = url;
		this.publishTime = publishTime;
		this.userImage = userImage;
	}
	public BlogPO(int userID2, int cityID2, String title2,Date date) {
		userID=userID2;
		cityID=cityID2;
		title=title2;
		publishTime=date;
	}
	public BlogPO(int blogID2, int userID2, int cityID2, String title2) {
		blogID=blogID2;
		userID=userID2;
		cityID=cityID2;
		title=title2;
	}
	public int getBlogID() {
		return blogID;
	}
	public void setBlogID(int blogID) {
		this.blogID = blogID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getApplauseNum() {
		return applauseNum;
	}
	public void setApplauseNum(int applauseNum) {
		this.applauseNum = applauseNum;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public URL getUserImage() {
		return userImage;
	}
	public void setUserImage(URL userImage) {
		this.userImage = userImage;
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

	

}
