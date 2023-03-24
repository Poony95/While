package whiletest;

import java.util.Scanner;
public class WhileStarTest01 {
	
	public static void main(String[] args) 	{
		
		Scanner sc = new Scanner(System.in);
		String name;
		int month,day;
		String result = "";
		
		System.out.println("이름을 입력==>");
		name = sc.next();
		
		while(true){
			System.out.println("몇월에 태어났나요?");
			month = sc.nextInt();
			if( month >= 1 && month <= 12) break;
		}
		
		int lastDay = 31;
		if(month == 2) lastDay = 28;
		else if(month == 4 || month == 6 || month == 9 || month == 11){
			lastDay = 30;
		}
		
		while(true){
			System.out.println("몇일에 태어났나요?");
			day = sc.nextInt();
			if(day >= 1 && day <= lastDay) break;
			}	
		
		switch(month){
			case 1:if(day <= 19) result="염소자리"; else result = "물병자리";	break;
			case 2:if(day <= 18) result="물병자리"; else result = "물고기자리";break;
			case 3:if(day <= 20) result="물고기자리"; else result = "양자리";	break;
			case 4:if(day <= 19) result="양자리"; else result = "황소자리";break;
			case 5:if(day <= 20) result="황소자리"; else result = "쌍둥이자리";break;
			case 6:if(day <= 21) result="쌍둥이자리"; else result = "게자리";	break;
			case 7:if(day <= 22) result="게자리"; else result = "사자자리";	break;
			case 8:if(day <= 22) result="사자자리"; else result = "처녀자리";	break;
			case 9:if(day <= 23) result="처녀자리"; else result = "천칭자리";	break;
			case 10:if(day <= 22) result="천칭자리"; else result = "전갈자리";break;
			case 11:if(day <= 22) result="전갈자리"; else result = "사수자리";break;
			case 12:if(day <= 24) result="사수자리"; else result = "염소자리";break;
		}
		System.out.println(name+"님의 별자리는 " + result + "입니다.");


	}
}

