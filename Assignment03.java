package com.arua.assignment;

import java.util.Scanner;

/*输出：请输入想要购买的图书类别（1.历史 2.计算机 3.文学）
输入：1
输出：可选的历史书有：
1.历史书1 2.历史书2 3.历史书3
输出：请输入想要购买的历史书编号：
输入：1
输出：历史书1的价格为58，剩余6本
【（如果剩余为0本）
输出：图书库存不足
输出：是否继续其他图书购买（1.继续购买 2结束购买）
如果输入2，输出本次购买的本数和总价格
】
【
（如果剩余大于0本）
输出：请输入想要购买的本数：
输入：2
输出：价格为116，剩余4本
输出：是否继续其他图书购买（1.继续购买 2结束购买）
如果输入2，输出本次购买的本数和总价格
】
*/
public class Assignment03 {
	public static void main(String [] arg){
		Scanner sc =new Scanner(System.in);
		//================定义书的相关信息============
		//定义书籍类型
		int type = 0;
		//定义书籍号码
		int num =0;
		//定义书籍价格
		int price =0;
		//定义书籍数量
		int total =0;
		//定义总价
		int sum = 0;
		//定义书架
		int[][] books = new int[3][3];//书籍及格矩阵
		int[][] bookc = new int[3][3];//书籍数量矩阵
		//定义书籍编码
		String[] codes ={"历史","计算机","文学"};
		//定义一个判断书籍是否册数为零的boolean
		boolean kong =true;
		//===============录入图书信息==============
		
			for(int i=0;i<books.length;i++){
			for(int j=0;j<books[i].length;j++){//不知道会不会空指针
				System.out.println("输入"+(i+1)+"类"+(j+1)+"号图书价格");
				books[i][j] =sc.nextInt();
			}
		}
		for(int i=0;i<bookc.length;i++){
			for(int j=0;j<bookc[i].length;j++){//不知道会不会空指针
				System.out.println("输入"+(i+1)+"类"+(j+1)+"号图书册数");
				bookc[i][j] =sc.nextInt();
			}
		}
		//==================挑选书籍===============
		/*do{*/
		for(;;){System.out.println("请输入想要购买的图书类别（1.历史 2.计算机 3.文学）");
		int type1 = sc.nextInt();
		type = type1-1;//类别跳一格
		//输出：可选的历史书有：
		//1.历史书1 2.历史书2 3.历史书3
		System.out.println("可选的"+codes[type]+"书有：");
		//遍历历史数目录
		for(int i=0;i<books.length;i++){
			for(int j=0;j<books[i].length;j++){
				System.out.print((j+1)+"."+codes[type]+(j+1));
			}
		}
		//输出：请输入想要购买的历史书编号：输入：1
		System.out.print("请输入想要购买的"+codes[type]+"的编号:");
		int num1 = sc.nextInt();
		num = num1-1;
		//输出：历史书1的价格为58，剩余6本
		System.out.print(codes[type]+num+"的价格为"+books[type][num]+"剩余"+bookc[type][num]+"本");
        //判断库存
		if(bookc[type][num]>0){
			System.out.println("请输入购买本数");
			int count = sc.nextInt();//购买本数
			bookc[type][num] = bookc[type][num]-count;//修改库存
			System.out.println("价格"+books[type][num]*bookc[type][num]+"剩余"+bookc[type][num]);
			
			
		}else if(bookc[type][num]==0){
			
		}
			
		
		int add =0;
add =books[type][num]*bookc[type][num];
sum+=add;
		/*			【（如果剩余为0本）
		输出：图书库存不足
		输出：是否继续其他图书购买（1.继续购买 2结束购买）
		如果输入2，输出本次购买的本数和总价格
		】
		【
		（如果剩余大于0本）
		输出：请输入想要购买的本数：
		输入：2
		输出：价格为116，剩余4本
		输出：是否继续其他图书购买（1.继续购买 2结束购买）
		如果输入2，输出本次购买的本数和总价格
		】	*/
/*		System.out.println("是否继续其他图书购买(1.继续购买  2.结束购买)");
		if (sc.nextInt() != 1) {
			choose = 0;
		}
	} while (choose == 1);
	System.out.println("您的消费金额为：" + sum + "元");
}}*/
	/*	if(bookc[type][num]==0){
			kong = false;
			System.out.println("图书库存不足");
			System.out.println("是否继续其他图书购买（1.继续购买 2结束购买）");
			int go = sc.nextInt();
			if(go==1){break;

		}else{
			//
		}
		}*/

		
		
	}

}
}
