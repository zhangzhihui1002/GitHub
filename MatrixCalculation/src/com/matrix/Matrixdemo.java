package com.matrix;

import java.util.Scanner;

public class Matrixdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row , column;//�к���
		String select , judge;//�������ͣ��Ƿ��������
		
		//��һ������
		System.out.println("�����һ�������������������");
		row = sc.nextInt();
		column = sc.nextInt();
		double[][] m = new double[row][column];
		System.out.println("���õ�һ������");
		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < column ; j++)
				m[i][j] = sc.nextDouble();
		GenericMatrix matrix1 = new GenericMatrix(m);
		//�ڶ�������
		System.out.println("����ڶ��������������������");
		row = sc.nextInt();
		column = sc.nextInt();
		m = new double[row][column];
		System.out.println("���õڶ�������");
		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < column ; j++)
				m[i][j] = sc.nextDouble();
		GenericMatrix matrix2 = new GenericMatrix(m);
		//ѡ��Ҫ���е�����
		while(true){
			System.out.println("ѡ��Ҫ���е�����(+/*)��");
			select = sc.next();
			if(select.equals("+")){
				if(matrix1.row != matrix2.row || matrix1.column != matrix2.column){
					System.out.println("����!�����Ͼ������㷨��!");
				}
				else{
					GenericMatrix matrix3 = matrix1.add(matrix2);
					System.out.println("������� =");
					matrix3.printResult();
				}
			}
			if(select.equals("*")){
				if(matrix1.column != matrix2.row){
					System.out.println("����!�����Ͼ������㷨��!");
				}
				else
				{
					GenericMatrix matrix3 = matrix1.multiply(matrix2);
					System.out.println("������� =");
					matrix3.printResult();
				}
			}
			if(!(select.equals("*")||select.equals("+"))){
				
				System.out.print("��������ٽ�����");
				continue;
			}
			
			System.out.println("ѡ����������?(Y/N)");
			judge = sc.next();
			if(judge.equals("Y")|judge.equals("y"))
				continue;
			else
				break;
		}
		sc.close();
 

	}
}
