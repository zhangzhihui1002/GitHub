package ConnectSQLServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlTesting {
	public static void main(String[] args) {
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=STUDENT1";
		String userName = "sa";
		String userPwd = "123456";
		String kongge=new String(" ");
		//Ϊ����Ľ��������ÿ���
		try {
			Class.forName(driverName);
			System.out.println("���������ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ʧ�ܣ�");
		}
		try {
			Connection dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
			System.out.println("�������ݿ�ɹ���");
			Statement stmt=dbConn.createStatement();
			//����SQL���,ʵ�ֶ����ݿ�Ĳ�������
			ResultSet rs=stmt.executeQuery("select * from ѧ��1");
			//���ز�ѯ�Ľ��
			while(rs.next())
			{
			System.out.print(rs.getString("ѧ��")+kongge);
			System.out.print(rs.getString("����")+kongge);
			System.out.print(rs.getString("���֤��")+kongge);
			System.out.print(rs.getString("�Ա�")+kongge);
			System.out.print(rs.getString("��ע")+kongge);
			System.out.println();
			}//��������������
			rs.close();
			stmt.close();
			dbConn.close();
			//�ر����,�����,���ݿ������.
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("SQL Server����ʧ�ܣ�");
		}
	}

}