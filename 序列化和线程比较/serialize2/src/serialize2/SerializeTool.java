package serialize2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTool {
	public static void serialize(Object obj,String fileName)throws Exception{
		File file=new File(fileName);    //�½�һ�������ļ������ڴ洢�����л��Ķ����ֽ���
		FileOutputStream output=new FileOutputStream(file);  //�ļ������
		ObjectOutputStream oos=new ObjectOutputStream(output);  //���������
		oos.writeObject(obj);  //������д������������
		oos.flush();     //�ύ����������
		oos.close();
		output.close();
	}
	
public static Object deSerialize(String fileName) throws Exception{
		File file=new File(fileName);
		FileInputStream input=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(input);
		Object obj=ois.readObject();   //�Ӷ����������� ��ȡ����
		ois.close();
		input.close();
		return obj;
	}

public static void printFileInfo(String fileName) {
		File file=new File(fileName);   //��ȡ�����ļ�
		System.out.println("-------------------------------");
		System.out.println("<FileName>:"+fileName);  //��ӡ�ļ���
		System.out.println("<FileName>:"+file.length()+"bytes");  //��ӡ�ļ���С
		System.out.println("-------------------------------");
	}
}
