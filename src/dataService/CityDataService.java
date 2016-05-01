package dataService;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bean.CityPO;
/**CityPO的数据接口
 * @author wanglizhi
 */
public interface CityDataService  extends Remote{

	public CityPO searchByID(int cityID)throws RemoteException;
	public ArrayList<CityPO> searchByName(String name)throws RemoteException;
	public boolean addApplause(int userID,int cityID)throws RemoteException;
	public boolean deleteApplause(int userID,int cityID)throws RemoteException;
	public boolean checkApplause(int userID,int cityID)throws RemoteException;
	
}
