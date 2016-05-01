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
	 * @param userID 客户端传入用户的ID参数，服务器返回根据用户ID得到的推荐
	 * @return
	 */
	public ArrayList<PlanPO> recommandPlan(int userID) throws RemoteException;
	public ArrayList<BlogPO> recommandBlog(int userID) throws RemoteException;
	public ArrayList<LandmarkPO> recommandLandmark(int userID) throws RemoteException;
}
