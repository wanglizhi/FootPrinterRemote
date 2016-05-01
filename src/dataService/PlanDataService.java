package dataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import bean.PlanItemPO;
import bean.PlanPO;

public interface PlanDataService extends Remote {

	int add(PlanPO planPO) throws RemoteException;

	boolean delete(int planID) throws RemoteException;

	boolean modify(PlanPO planPO) throws RemoteException;

	boolean addApplause(int userID, int planID) throws RemoteException;

	boolean deleteApplause(int userID, int planID) throws RemoteException;

	boolean checkApplause(int userID, int planID) throws RemoteException;

	boolean addPlanItem(PlanItemPO planItemPO) throws RemoteException;

	boolean deletePlanItem(int planItemID) throws RemoteException;

	boolean modifyPlanItem(PlanItemPO planItemPO) throws RemoteException;

	// 得到一个计划的所有po
	ArrayList<PlanItemPO> getPlanItems(int planID) throws RemoteException;

	// 得到一个计划从某一天的所有po
	ArrayList<PlanItemPO> getPlanItems(int planID, Date date)
			throws RemoteException;

	PlanPO searchByID(int planID) throws RemoteException;

	ArrayList<PlanPO> searchByCity(int cityID) throws RemoteException;

	ArrayList<PlanPO> searchByDate(Date startDate) throws RemoteException;

	ArrayList<PlanPO> search(String key) throws RemoteException;

	// 增加收藏
	public boolean addFavourite(int userID, int ItemID) throws RemoteException;

	// 检查收藏
	public boolean checkFavourite(int userID, int ItemID)
			throws RemoteException;
	
	ArrayList<PlanPO> searchByUser(int userID) throws RemoteException;

	// 删除收藏
	public boolean deleteFavourite(int userID, int ItemID)
			throws RemoteException;

	// 得到当前用户收藏的当前城市的ID
	public ArrayList<PlanItemPO> getAllFavourite(int userID, int cityID)
			throws RemoteException;

}
