package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
	
		System.out.println("");
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		int number=random.nextInt(10)+1;
		int count=1;
		boolean exitGame=true;
	
		
		while(exitGame){
			int max=100; 
			int min=1; //최솟값, 최대값
			
			while(true){
			System.out.println(min+"-"+max);
			System.out.print(count++);
			System.out.print(">> ");
			
			int input=scanner.nextInt();
			if(input==number){
				System.out.println("맞았습니다.");
				break;
			}
			if(input>number){
				max=input;
				System.out.println("더 낮게");
			}
			if(input<number){
				min=input;
				System.out.println("더 높게");
			}
			}
			
			System.out.println("다시 하시겠습니까?(y/n)");
			String answer=scanner.next();
			
			if(answer.equals("y")){
		
			
			}else{
				exitGame=false;
			}
		
		}
		scanner.close();
	}
}