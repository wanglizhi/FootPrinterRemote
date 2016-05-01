package bean;

import java.net.URL;

/**
 * ¹ºÎïÉÌ³¡×Ö¶Î
 * 
 * @author wanglizhi
 */
public class MarketPO extends PlacePO {

	public MarketPO(int placeID, int cityID, String name, String introduction,
			URL image, String type, String price, int applauseNum) {
		super(placeID, cityID, name, introduction, image, type, price, applauseNum);
		// TODO Auto-generated constructor stub
	}
	public MarketPO(){
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
