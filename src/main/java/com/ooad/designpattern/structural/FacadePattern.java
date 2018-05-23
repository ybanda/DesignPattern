/**
 * 
 */
package com.ooad.designpattern.structural;

import java.util.Date;
import java.util.List;

import com.ooad.designpattern.constructional.Singleton;
import com.ooad.designpattern.model.AgeofUser;
import com.ooad.designpattern.model.User;
import com.ooad.designpattern.model.UserDetails;

/**
 * @author Yashwanth
 *
 */
public class FacadePattern {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		List<User> users =singleton.listOfUsers;
		System.out.println("User Details :: Size :: "+users.size());
		
	}
	/**
	 * 
	 * @param from
	 * @param to
	 */
	public void getUserDetails(Date from , Date to) {
		AgeofUser ageofuser=null;
		UserDetails userDetails = null;
		try{
			ageofuser = new AgeofUser();
			userDetails = new UserDetails();
			userDetails.getUsersHistory(from, to);
			ageofuser.getUserAge(from, to);
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
	}

}
