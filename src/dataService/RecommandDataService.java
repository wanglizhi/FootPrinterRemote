package dataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bean.BlogPO;
import bean.LandmarkPO;
import bean.PlanPO;

/**
 * 
 * @author SongShuo
 *
 */
public interface RecommandDataService extends Remote{
	/**
	 * 
	 * @param userID �ͻ��˴����û���ID���������������ظ����û�ID�õ����Ƽ�
	 * @return
	 */
	public ArrayList<PlanPO> recommandPlan(int userID) throws RemoteException;
	public ArrayList<BlogPO> recommandBlog(int userID) throws RemoteException;
	public ArrayList<LandmarkPO> recommandLandmark(int userID) throws RemoteException;
}
