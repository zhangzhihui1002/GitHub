package com.usermanager;

public class UserManagerImpl implements UserManager{
	 public void addUser(String userId, String userName) {  
	        System.out.println("UserManagerImpl.addUser");  
	    }  
	  
	    @Override  
	    public void delUser(String userId) {  
	        System.out.println("UserManagerImpl.delUser");  
	    }  
	  
	    @Override  
	    public String findUser(String userId) {  
	        System.out.println("UserManagerImpl.findUser");  
	        return "����";  
	    }  
	  
	    @Override  
	    public void modifyUser(String userId, String userName) {  
	        System.out.println("UserManagerImpl.modifyUser");  
	  
	    }  
}
