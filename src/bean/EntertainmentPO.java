package bean;
import java.net.URL;

/**
 * �������ݳ־û�
 * 
 * @author wanglizhi
 */
public class EntertainmentPO extends PlacePO {

	private static final long serialVersionUID = 1L;
	public EntertainmentPO(int placeID, int cityID, String name,
			String introduction, URL image, String type, String price,
			int applauseNum) {
		super(placeID, cityID, name, introduction, image, type, price, applauseNum);
		// TODO Auto-generated constructor stub
	}
	public EntertainmentPO(){
		super();
	}
}
