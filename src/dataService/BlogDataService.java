package dataService;

import bean.BlogPO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

public interface BlogDataService extends Remote {
	//�����poֻ��title��userID��cityName
	//�������뽫cityNameתΪID���Լ�����PublishDate��Applause_num
	int add(BlogPO blogPO) throws RemoteException;

	boolean delete(int blogID) throws RemoteException;

	//�����poֻ��blogID��title��userID��cityName
	boolean modify(BlogPO blogPO)throws RemoteException ;

	boolean addApplause(int userID, int blogID) throws RemoteException;

	boolean deleteApplause(int userID, int blogID) throws RemoteException;

	boolean checkApplause(int userID, int blogID) throws RemoteException;

	BlogPO searchByID(int blogID)throws RemoteException ;

	ArrayList<BlogPO> searchByCityID(int cityID) throws RemoteException;

	ArrayList<BlogPO> searchByUserID(int userID) throws RemoteException;
	
	ArrayList<BlogPO> search(String key) throws RemoteException;

}
