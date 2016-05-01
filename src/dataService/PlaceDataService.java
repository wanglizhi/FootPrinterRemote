package dataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import bean.PlacePO;
/**
 * ͳһ���ݽӿ�
 * @author wanglizhi
 *
 */
public interface PlaceDataService extends Remote{
	public PlacePO searchByID(int placeID)throws RemoteException;
	//����������ʽ���ҡ�����
	public ArrayList<PlacePO> searchByCityID(int cityID)throws RemoteException;
	public boolean addApplause(int userID,int placeID)throws RemoteException;
	public boolean deleteApplause(int userID,int placeID)throws RemoteException;
	public boolean checkApplause(int userID,int placeID)throws RemoteException;
	
	public ArrayList<PlacePO> searchByTag(ArrayList<String> tags)throws RemoteException;
	public ArrayList<PlacePO> search(String key)throws RemoteException;
}
