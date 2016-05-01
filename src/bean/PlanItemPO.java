package bean;

import java.util.Date;
import java.io.Serializable;
import java.net.URL;

public class PlanItemPO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int planID;
	int planItemID;
	int lanmarkID;
	int landmarkType;
	String landmarkName;
	URL picUrl;
	Date date;
	int indexX;
	int indexY;
	boolean isUsed;
	int startTime;
	int endTime;
	// 备注
	String comment;

	public PlanItemPO(int planID, String landmarkName, Date date, int indexX,
			int indexY, boolean isUsed, int startTime, int endTime,
			String comment) {

		super();
		this.planID = planID;
		this.landmarkName = landmarkName;
		this.date = date;
		this.indexX = indexX;
		this.indexY = indexY;
		this.isUsed = isUsed;
		this.startTime = startTime;
		this.endTime = endTime;
		this.comment = comment;

	}
	
	//新建计划时调用
	public PlanItemPO(int planID, int lanmarkID, int landmarkType,
			String landmarkName, Date date, int indexX, int indexY,
			boolean isUsed, int startTime, int endTime, String comment) {
		super();
		this.planID = planID;
		this.lanmarkID = lanmarkID;
		this.landmarkType = landmarkType;
		this.landmarkName = landmarkName;
		this.date = date;
		this.indexX = indexX;
		this.indexY = indexY;
		this.isUsed = isUsed;
		this.startTime = startTime;
		this.endTime = endTime;
		this.comment = comment;
	}
	
	//修改计划时使用
	public PlanItemPO(int planID, int planItemID, int lanmarkID,
			int landmarkType, String landmarkName, Date date, int indexX,
			int indexY, boolean isUsed, int startTime, int endTime,
			String comment) {
		super();
		this.planID = planID;
		this.planItemID = planItemID;
		this.lanmarkID = lanmarkID;
		this.landmarkType = landmarkType;
		this.landmarkName = landmarkName;
		this.date = date;
		this.indexX = indexX;
		this.indexY = indexY;
		this.isUsed = isUsed;
		this.startTime = startTime;
		this.endTime = endTime;
		this.comment = comment;
	}

	public PlanItemPO(int planID, int planItemID, int lanmarkID,
			int landmarkType, String landmarkName, URL picUrl, Date date,
			int indexX, int indexY, boolean isUsed, int startTime, int endTime,
			String comment) {
		super();
		this.planID = planID;
		this.planItemID = planItemID;
		this.lanmarkID = lanmarkID;
		this.landmarkType = landmarkType;
		this.landmarkName = landmarkName;
		this.picUrl = picUrl;
		this.date = date;
		this.indexX = indexX;
		this.indexY = indexY;
		this.isUsed = isUsed;
		this.startTime = startTime;
		this.endTime = endTime;
		this.comment = comment;
	}

	public int getPlanID() {
		return planID;
	}

	public void setPlanID(int planID) {
		this.planID = planID;
	}

	public int getPlanItemID() {
		return planItemID;
	}

	public void setPlanItemID(int planItemID) {
		this.planItemID = planItemID;
	}

	public int getLanmarkID() {
		return lanmarkID;
	}

	public void setLanmarkID(int lanmarkID) {
		this.lanmarkID = lanmarkID;
	}

	public int getLandmarkType() {
		return landmarkType;
	}

	public void setLandmarkType(int type) {
		this.landmarkType = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getIndexX() {
		return indexX;
	}

	public void setIndexX(int indexX) {
		this.indexX = indexX;
	}

	public int getIndexY() {
		return indexY;
	}

	public void setIndexY(int indexY) {
		this.indexY = indexY;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLandmarkName() {
		return landmarkName;
	}

	public void setLandmarkName(String landmarkName) {
		this.landmarkName = landmarkName;
	}

	public URL getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(URL picUrl) {
		this.picUrl = picUrl;
	}

}
