package com.user;

public interface UserManager {
      int userId = 0;
      String userName ="";
	public static void addUser(String userId, String userName) {
		System.out.printf("�û���ӳɹ�");
	}
	void delUser(String userId);
	String findUser(String userId);
	void modifyUser(String userId, String userName);
	
      
}
