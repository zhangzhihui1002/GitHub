//10���߳�
package thread;

public class Matrixdemo implements Runnable{

	private static int num =10;
	private static int row=100,column=100; //�к���
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		long begin=System.nanoTime();
		//System.out.println("��ʼ����");
		
		for(;row<=1000&column<=1000;row+=100,column+=100) {
		
		for(int j=1;j<=10;j++)
		{
			final int s=j;
			Matrixdemo myRunnable = new Matrixdemo();
	        new Thread(myRunnable).start();
	  }
		long end=System.nanoTime();
		System.out.print("10���̼߳���γ����"+row+"�ľ��󻨷���ʱ���ǣ�");
		System.out.println((end-begin)/1000000.00+"����");
		}
   }

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		
		while (true)  {
			synchronized (Matrixdemo.class) {
				 if (num == 0) {
                     break;
                 }
				 else {
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
//						long end2=new Date().getTime();
//						System.out.print("����"+row+"*"+column+"�ľ�����������ѵ�ʱ���ǣ�");
//						System.out.println(end2-begin2);
						//row+=100;column+=100;
						num--;
				 }
		    }
	    }
    }
}
