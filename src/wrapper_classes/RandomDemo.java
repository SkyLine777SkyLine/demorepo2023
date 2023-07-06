package wrapper_classes;

import java.util.Random;
import java.util.UUID;

public class RandomDemo {

	public static void main(String[] args) {
	
		Random random = new Random();
		boolean[] arr = new boolean[10];
		for(int i=0; i <10; i++) {
			arr[i] = random.nextBoolean();
		System.out.println(random.nextBoolean());
		}
		for(int i=0; i <10; i++) {
			System.out.println(random.nextDouble() * 100);
//			for(int i=0; i <10; i++) {
//				System.out.println(random.nextDouble());// display between 0 and 1; if (random.nextDouble() * 100)- display between 0 and 100;
		}
		for(int i=0; i <10; i++) {
			System.out.println(random.nextInt(10));//random for all range int, but if put 10, it gives random from 0 to 10
		}
			for(int i=0; i <10; i++) {
				System.out.println(random.nextInt(100) - 50);//between -50 to 50. if 0-50=-50
			}
				for(int i=0; i <10; i++) {
					System.out.println(random.nextDouble() * 100 - 50);//between -50 to 50 doubles 
			}
			for(int i=0; i<10; i++){
				String username = "user";
				String password = "pass";
				username = username + random.nextInt(1000000);
				System.out.println(username);
				password = password + random.nextInt(1000);
				System.out.println(password);
			}
				System.out.println(UUID.randomUUID());//never repeat the same string
				
}
}