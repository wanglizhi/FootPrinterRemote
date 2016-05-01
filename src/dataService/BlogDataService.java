package dataService;

import bean.BlogPO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

public interface BlogDataService extends Remote {
	//这里的po只有title，userID和cityName
	//服务器请将cityName转为ID，自己生成PublishDate和Applause_num
	int add(BlogPO blogPO) throws RemoteException;

	boolean delete(int blogID) throws RemoteException;

	//这里的po只有blogID，title，userID和cityName
	boolean modify(BlogPO blogPO)throws RemoteException ;

	boolean addApplause(int userID, int blogID) throws RemoteException;

	boolean deleteApplause(int userID, int blogID) throws RemoteException;

	boolean checkApplause(int userID, int blogID) throws RemoteException;

	BlogPO searchByID(int blogID)throws RemoteException ;

	ArrayList<BlogPO> searchByCityID(int cityID) throws RemoteException;

	ArrayList<BlogPO> searchByUserID(int userID) throws RemoteException;
	
	ArrayList<BlogPO> search(String key) throws RemoteException;

}
