//�����������������ģ���1000�㵽6000�������㵽3000��ʱ��ȴ���ʱ��̫���ˣ�Ϊ�˽�ʡʱ�䣬
//���ԣ����õ��ıȽϽ��ͼ����ʹ��100��1000������

package thread;

import java.util.Date;

public class Matrixdemo{

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int row=100 , column=100;//�к���            ,�˴������޸�
	
		for(;row<=1000&column<=1000;row+=100,column+=100) {
		
		long begin=new Date().getTime();
		//System.out.println("��ʼ����");
		int num;
		for(num=0;num<10;num++) {
			//long begin2=new Date().getTime();
			double[][] m1 = new double[row][column];
			//���õ�һ������
			for(int i = 0 ; i < row ; i++)
				for(int j = 0 ; j < column ; j++)
					m1[i][j] =(int)(Math.random()*100);
			GenericMatrix matrix1 = new GenericMatrix(m1);
			//���õڶ�������
			double[][] m2 = new double[row][column];
			for(int i = 0 ; i < row ; i++)
				for(int j = 0 ; j < column ; j++)
					m2[i][j] =(int)(Math.random()*100);
			GenericMatrix matrix2 = new GenericMatrix(m2);
			GenericMatrix matrix3 = matrix1.multiply(matrix2);
//			long end2=new Date().getTime();
//			System.out.print("����"+row+"*"+column+"�ľ�����������ѵ�ʱ���ǣ�");
//			System.out.println(end2-begin2);
			//matrix3.printResult();
		}
		long end=new Date().getTime();
		System.out.print("1���̼߳���ά����"+row+"�ľ��󻨷���ʱ���ǣ�");
		System.out.println(end-begin+"����");
	}
}
}
