/*
 * # ���ϱ� ����
 * 1. 1���� 10 ������ ������ ���� �ߺ� ���� game �迭�� 6�� �����Ѵ�.
 * 2. 0���� 5������ ���� �� 3���� �ߺ� ���� ������ �� ���� ���� ����Ѵ�. 
 * 3. ����ڴ� �ߺ����� 3���� �ε����� ��� �� ���� ���ߴ� �����̴�.
 */
package day_43;

import java.util.Scanner;
import java.util.Random;

class Ex15
{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	
	int total = 0;
}

public class ClassEx15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		Ex15 e = new Ex15();
		
		for(int i=0;i<e.game.length;i++)
		{
			int num = ran.nextInt(10)+1;
			
			int check=1;
			for(int j=0;j<i;j++)
			{
				if(e.game[j]==num)
				{
					check--;
				}
			}
			
			if(check==1)
			{
				e.game[i]=num;
			}
			else
			{
				i--;
			}
		}
		
		System.out.println("[���ϱ� ����]");
		System.out.println("���� ī��>>>");
		
		for(int i=0;i<e.game.length;i++)
		{
			System.out.print(e.game[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<e.idx.length; i++) 
		{
			int num = ran.nextInt(e.game.length);
			
			int check = 1;
			for(int j=0; j<i; j++) 
			{
				if(e.idx[j] == num)
				{
					check = -1;
				}
			}
			
			if(check == 1)
			{
				e.idx[i] = num;
				e.total += e.game[num];
			}else
			{
				i -= 1;
			}
		}
		
		System.out.print("ġƮŰ    >>> ");
		for(int i=0; i<e.idx.length; i++) 
		{
			System.out.print(e.idx[i] + " ");
		}
		System.out.println();
		
		System.out.println("�� = " + e.total);
		
		while(true) 
		{
			
			int total = 0;
			for(int i=0; i<e.myIdx.length; i++) {
				System.out.print((i+1) + ".�ε��� �Է� : ");
				int idx = sc.nextInt();
				
				int check = 1;
				for(int j=0; j<i; j++) 
				{
					if(e.myIdx[j] == idx)
					{
						check = -1;
					}
				}
				
				if(check == 1) 
				{
					e.myIdx[i] = idx;
					total += e.game[idx];
				}
				else 
				{
					i -= 1;
				}
			}
			
			if(e.total == total) 
			{
				System.out.println("����!");
				break;
			}
			else 
			{
				System.out.println("��!");
			}
			
		}

	}
}
