package problem04;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Random ran = new Random();
		int snum=0, onum=0;
		
		for(int i=0;i<20;i++) {
			if(ran.nextInt(2)==1) {
				if(snum==10)
					continue;
				snum++;
				System.out.println("#");
			}
			else {
				if(onum==10)
					continue;
				onum++;
				System.out.println("O");
			}
		}
		
		
			
	}

}
