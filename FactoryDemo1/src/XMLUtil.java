import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.*;

import org.w3c.dom.*;

public class XMLUtil {
	public static Object getBean(){
	try{
	//����DOM�ĵ�����
	DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=dFactory.newDocumentBuilder();
	Document doc;
	doc=builder.parse(new File("config.xml"));
	
	//��ȡ������u�����ı��ڵ�
	NodeList n1=doc.getElementsByTagName("className");
	org.w3c.dom.Node classNode=n1.item(0).getFirstChild();
	String cName=classNode.getNodeValue();
	
	//ͨ����������ʵ�����󲢽��䷵��
	Class c=Class.forName(cName);
	Object obj=c.newInstance();
	return obj;
	}catch (Exception e) {
		e.printStackTrace();
		return null;
	}

	
	
	}
	private static DocumentBuilderFactory DocumentBuilderFactory(){
		return null;
	}
}
