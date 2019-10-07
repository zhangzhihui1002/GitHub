package com.getweb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GetHtmlTitle {
    
    public GetHtmlTitle(String htmlUrl){
        System.out.println("/n------------��ʼ��ȡ��ҳ(" + htmlUrl + ")-----------");
        String htmlSource = "";
        htmlSource = getHtmlSource(htmlUrl);//��ȡhtmlUrl��ַ��ҳ��Դ��
        System.out.println("------------��ȡ��ҳ(" + htmlUrl + ")����-----------/n");
        System.out.println("------------����(" + htmlUrl + ")�������-----------/n");
        String title = getTitle(htmlSource);
        System.out.println("��վ���⣺ " + title);
        String str = title;
        FileOutputStream fileOutputStream = null;
        File file = new File("F:\\zuoye.txt");
        try {
        	 if(!file.exists()){
                 file.createNewFile();
             }
             fileOutputStream = new FileOutputStream(file);
             fileOutputStream.write(str.getBytes("gbk"));
             fileOutputStream.flush();
             fileOutputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    
    /**
     * ������ַ������ҳ��Դ��
     * @param htmlUrl
     * @return
     */
    public String getHtmlSource(String htmlUrl){
        URL url;    
        StringBuffer sb = new StringBuffer();
        try{
            url = new URL(htmlUrl);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));//��ȡ��ҳȫ������
            String temp;
            while ((temp = in.readLine()) != null)
            {            
                sb.append(temp);
            }
            in.close();
        }catch (MalformedURLException e) {
            System.out.println("�������URL��ʽ�����⣡����ϸ����");
        }catch (IOException e) {
            e.printStackTrace();
        }    
        return sb.toString();
    }
    
    /**
     * ��htmlԴ��(�ַ���)��ȥ������
     * @param htmlSource
     * @return
     */
    public String getTitle(String htmlSource){
        List<String> list = new ArrayList<String>();
        String title = "";
        
        //Pattern pa = Pattern.compile("<title>.*?</title>", Pattern.CANON_EQ);Ҳ����
        Pattern pa = Pattern.compile("<h1 class=\"title\">.*?</h1>");//Դ���б���������ʽ
        Matcher ma = pa.matcher(htmlSource);
        while (ma.find())//Ѱ�ҷ���el���ִ�
        {
            list.add(ma.group());//������el���ִ����뵽list��
        }
        for (int i = 0; i < list.size(); i++)
        {
            title = title + list.get(i);
        }
        return outTag(title);
    }
    
    /**
     * ȥ��htmlԴ���еı�ǩ
     * @param s
     * @return
     */
    public String outTag(String s)
    {
        return s.replaceAll("<.*?>", "");
    }
    
  
    
   
}