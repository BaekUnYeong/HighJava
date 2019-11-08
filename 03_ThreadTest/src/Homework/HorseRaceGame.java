package Homework;

import java.sql.Array;
import java.util.ArrayList;

public class HorseRaceGame {

	static int strRank = 0;

	public static void main(String[] args) {
		ArrayList<String> horse = new ArrayList<>();
				horse.add("1번 적토마");
				horse.add("2번 적토마");
				horse.add("3번 적토마");
				horse.add("4번 적토마");
				horse.add("5번 적토마");
				horse.add("6번 적토마");
				horse.add("7번 적토마");
				horse.add("8번 적토마");
				horse.add("9번 적토마");
				horse.add("10번 적토마");

		// racing[0].setRunning(1);
		// racing[1].setRunning(2);
		// racing[2].setRunning(3);
		// racing[3].setRunning(4);

		Thread race = new Thread();
		
		for (int i = 0; i < horse.size(); i++) {
			race.start();
		}

			try {
				race.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		System.out.println("경기 끝 !");
		System.out.println("-----------------------------------------------------------------------------------\r"
				+ "\t\t\t\t    경기 결과\r"
				+ "-----------------------------------------------------------------------------------");
		System.out.println("순위 : " + strRank);

	}

}

class HorseRace extends Thread {
	private String horse;
	private int running;

	public HorseRace(String name) {
		super();
		this.horse = name;

	}

	public int getRunning() {
		return running;
	}

	public void setRunning(int running) {
		this.running = running;
	}

	@Override
	public void run() {

		String running = " ";
		
		boolean ing = true;

		while (ing) {

			for (int i = 0; i < this.running; i++) {
				running += "-";
			}
			running += ">";

			for (int i = this.running + 1; i <= 50; i++) {
				running += "-";
			}

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (int i = 0; i < this.running; i++) {
				System.out.println(horse + running);
			}
		}
		System.out.println(horse + "골인 ~~!!");
	}
}