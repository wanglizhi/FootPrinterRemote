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

	// �õ�һ���ƻ�������po
	ArrayList<PlanItemPO> getPlanItems(int planID) throws RemoteException;

	// �õ�һ���ƻ���ĳһ�������po
	ArrayList<PlanItemPO> getPlanItems(int planID, Date date)
			throws RemoteException;

	PlanPO searchByID(int planID) throws RemoteException;

	ArrayList<PlanPO> searchByCity(int cityID) throws RemoteException;

	ArrayList<PlanPO> searchByDate(Date startDate) throws RemoteException;

	ArrayList<PlanPO> search(String key) throws RemoteException;

	// �����ղ�
	public boolean addFavourite(int userID, int ItemID) throws RemoteException;

	// ����ղ�
	public boolean checkFavourite(int userID, int ItemID)
			throws RemoteException;
	
	ArrayList<PlanPO> searchByUser(int userID) throws RemoteException;

	// ɾ���ղ�
	public boolean deleteFavourite(int userID, int ItemID)
			throws RemoteException;

	// �õ���ǰ�û��ղصĵ�ǰ���е�ID
	public ArrayList<PlanItemPO> getAllFavourite(int userID, int cityID)
			throws RemoteException;

}
