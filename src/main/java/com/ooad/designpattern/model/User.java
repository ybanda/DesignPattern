/**
 * 
 */
package com.ooad.designpattern.model;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author Yashwanth
 *
 */
public class User {

	private String userName;
	private LocalDate joiningDate;
	private String address;
	private String userId;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the joiningDate
	 */
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	/**
	 * @param joiningDate the joiningDate to set
	 */
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public User(String userName,String address, String userId,LocalDate joiningDate) {
		this.userName=userName;
		this.address=address;
		this.userId=userId;
		this.joiningDate=joiningDate;
	}
}
