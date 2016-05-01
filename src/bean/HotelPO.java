package bean;

import java.net.URL;

/**
 * ¾Æµê³Ö¾Ã»¯
 * 
 * @author wanglizhi
 */
public class HotelPO extends PlacePO {

	public HotelPO(int placeID, int cityID, String name, String introduction,
			URL image, String type, String price, int applauseNum) {
		super(placeID, cityID, name, introduction, image, type, price, applauseNum);
		// TODO Auto-generated constructor stub
	}

	public HotelPO(){
		super();
	}
	private static final long serialVersionUID = 1L;

}