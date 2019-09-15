package com.user;

public class UserManagerImplProxy implements UserManager{
	// Ŀ�����  
    private UserManager userManager;  
    // ͨ�����췽������Ŀ�����  
    public UserManagerImplProxy(UserManager userManager){  
        this.userManager=userManager;  
    }  
    public void addUser(String userId, String userName) {  
        try{  
                //��Ӵ�ӡ��־�Ĺ���  
                //��ʼ����û�  
                System.out.println("start-->addUser()");  
                UserManager.addUser(userId, userName); 
                //����û��ɹ�  
                System.out.println("success-->addUser()");  
            }catch(Exception e){  
                //����û�ʧ��  
                System.out.println("error-->addUser()");  
            }  
    }  
  
    @Override  
    public void delUser(String userId) {  
        userManager.delUser(userId);  
    }  
  
    @Override  
    public String findUser(String userId) {  
        userManager.findUser(userId);  
        return "����";  
    }  
  
    @Override  
    public void modifyUser(String userId, String userName) {  
        userManager.modifyUser(userId,userName);  
    }  
}
