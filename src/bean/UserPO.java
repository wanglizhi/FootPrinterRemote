package bean;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author SongShuo
 * 用户PO
 * 包含检验用户名和密码是否匹配的方法
 * 包含修改用户名和密码的方法
 *     
 *     @param int userID
	 * @param String userName
	 * @param String password
	 * @param URL head
	 * @param boolean sex
	 * @param String qq
	 * @param String tel
	 * @param String realname
	 * @param String address
	 * @param  ArrayList<String> tags
	 * @param Date registeredDate
 */
public class UserPO implements Serializable{
	int userID;
	String userName;
	String password;
	URL head;
	boolean sex; // man: false woman:true
	String qq;
	String tel;
	String realName;
	String address;
	String tags;
	Date registeredDate;
	
	public UserPO(int userID, String userName, String password, URL head, boolean sex, String qq, String tel,
			String realName, String address, String tags,Date registeredDate) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.head = head;
		this.sex = sex;
		this.qq = qq;
		this.tel = tel;
		this.realName = realName;
		this.address = address;
		this.tags = tags;
		this.registeredDate=registeredDate;
	}
	/**
	 * 
	 * @param userID
	 * @param userName
	 * @param password
	 * @param userInfor
	 */
	public UserPO(int userID, String userName, String password) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
	}
	
	 public boolean isMatch(String name, String pw){
		boolean isRight = false;
		if(name.equals(userName)&&pw.equals(password))
			isRight = true;
		return isRight;
	}
	 
	 public boolean modifyUserName(String newUserName){
		 
		 userName = newUserName;
		 return true;
	 }
	 
	 public boolean modifyPassword(String newPassword){
		 password = newPassword;
		 return true;
	 }

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public URL getHead() {
		return head;
	}

	public void setHead(URL head) {
		this.head = head;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	 
	
	
}
