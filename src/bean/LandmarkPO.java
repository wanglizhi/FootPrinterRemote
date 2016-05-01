package bean;

import java.net.URL;

/**
 * ¾°µã×Ö¶Î
 * 
 * @author wanglizhi
 */
public class LandmarkPO extends PlacePO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tag;
	private String information;
	
	public LandmarkPO(int placeID, int cityID, String name, String introduction,
			URL image, String type, String price, int applauseNum,String tag) {
		super(placeID, cityID, name, introduction, image, type, price, applauseNum);
		// TODO Auto-generated constructor stub
		this.tag=tag;
	}
	public LandmarkPO(){
		super();
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}

}
