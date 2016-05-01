package dataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bean.UserPO;
/**
 * 
 * @author SongShuo
 *
 */


public interface UserManageDataService extends Remote{
	
	boolean register(UserPO userInfor) throws RemoteException;
	UserPO login(UserPO userPO) throws RemoteException;
	boolean modifyUser(UserPO userPO) throws RemoteException;//�ӽ����ȡ�޸��˵��û���Ϣ
	ArrayList<UserPO> searchUser(String name) throws RemoteException; // �����û�
	boolean exit(int UserID)throws RemoteException;;
	
}
