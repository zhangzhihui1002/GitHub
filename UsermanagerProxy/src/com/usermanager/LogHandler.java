package com.usermanager;

import java.lang.reflect.Method;


public class LogHandler implements InvocationHandler{
	// Ŀ�����  
    private Object targetObject;  
    //�󶨹�ϵ��Ҳ���ǹ������ĸ��ӿڣ�������ʵ����󶨣�����Щ������������ʱ��ִ��invoke������              
    public  Object newProxyInstance(Object targetObject){  
        this.targetObject=targetObject;  
        //�÷�������Ϊָ����װ������һ��ӿڼ����ô��������ɶ�̬������ʵ��    
        //��һ������ָ�������������������������Ҫ����ָ��Ϊ��Ŀ�����ͬһ���������  
        //�ڶ�������Ҫʵ�ֺ�Ŀ�����һ���Ľӿڣ�����ֻ��Ҫ�õ�Ŀ������ʵ�ֽӿ�  
        //����������������Щ�����صķ����ڱ�����ʱ��Ҫִ���ĸ�InvocationHandler��invoke����  
        //���ݴ����Ŀ�귵��һ���������  
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),  
                targetObject.getClass().getInterfaces(),this);  
    }  

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("start-->>");  
        for(int i=0;i<args.length;i++){  
            System.out.println(args[i]);  
        }  
        Object ret=null;  
        try{  
            /*ԭ���󷽷�����ǰ������־��Ϣ*/  
            System.out.println("satrt-->>");  
              
            //����Ŀ�귽��  
            ret=method.invoke(targetObject, args);  
            /*ԭ���󷽷����ú�����־��Ϣ*/  
            System.out.println("success-->>");  
        }catch(Exception e){  
            e.printStackTrace();  
            System.out.println("error-->>");  
            throw e;  
        }  
        return ret;  
	}

}
