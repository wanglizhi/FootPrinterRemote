package dataService;

import java.rmi.Remote;
import java.rmi.RemoteException;

import bean.FilePO;

public interface UploadDataService extends Remote {

	public void upload(FilePO filePO) throws RemoteException;
	
	public void mkdir(int blogID) throws RemoteException;
	
}
