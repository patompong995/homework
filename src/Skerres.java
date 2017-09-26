//elab-source: Skerres.java
import java.util.Scanner;

public class Skerres {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("--------- Welcome to ske restaurant --------");
		System.out.println("1.)Pizza    250 baht");
		System.out.println("2.)Chickens 120 baht");
		System.out.println("3.)Coke     45 baht");
		System.out.println("4.)Total");
		System.out.println("5.)Exit");
		int price = 0;
		int pizza = 0;
		int chick = 0;
		int coke = 0;
		for (;;) {
			System.out.print("Enter your choice: ");
			String choice = scan.next();
			if (choice.equals("1")) {
				System.out.print("Enter your Quantity: ");
				int quapizza = scan.nextInt();
				price += 250 * quapizza;
				pizza += quapizza;
			} else {
				if (choice.equals("2")) {
					System.out.print("Enter your Quantity: ");
					int quachick = scan.nextInt();
					price += 120 * quachick;
					chick += quachick;
				} else {
					if (choice.equals("3")) {
						System.out.print("Enter your Quantity: ");
						int quacoke = scan.nextInt();
						price += 45 * quacoke;
						coke += quacoke;
					} else {
						if (choice.equals("4")) {
							System.out.println("+------ Menu ------+--Qty--+--Price--+");
							if (pizza > 0) {
								System.out.printf("|Pizza             |   %d  |  %d  |\n", pizza, pizza * 250);
							}
							if (chick > 0) {
								System.out.printf("|Chicken           |   %d  |  %d  |\n", chick, chick * 120);
							}
							if (coke > 0) {
								System.out.printf("|Pizza             |   %d  |  %d  |\n", coke, coke * 45);
							}
							System.out.println("+------------------+-------+---------+");
							System.out.printf("Total %d\n", price);
						} else {
							System.out.print("=== Thank you ===");
							break;
						}
					}
				}
			}
		}

	}
}
