/**
 * 
 */
package com.ooad.designpattern.constructional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ooad.designpattern.model.User;

/**
 * @author Yashwanth
 *
 */
public class Singleton {

	private static Singleton instance=null;
	public static List<User> listOfUsers=null;
	public Singleton() {
				
	}
	
	private static List<User> returnListofUsers() {
		List<User> userList = new ArrayList<User>();
		userList.add(new User("Yashwanth","NC","BYKR12",LocalDate.of(2012,11,11)));
		userList.add(new User("Yashwanth","SC","BYKR13",LocalDate.of(2013,11,11)));
		userList.add(new User("Yashwanth","BC","BYKR14",LocalDate.of(2014,11,11)));
		userList.add(new User("Yashwanth","VC","BYKR15",LocalDate.of(2015,11,11)));
		return userList;
	}
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
			instance.listOfUsers= returnListofUsers();
		
		}
			return instance;	
	}
}
