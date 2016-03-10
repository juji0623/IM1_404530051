
/*
 * [A]98
 * [TA's advise]
 * 1.在主程式裡面生成物件, 雖然可以使程式正確執行無誤, 但不符合老師作業要求撰寫一Rectangle類別去進行OOP, 這部分扣2分.
 * 2.下次作業請依照作業要求的格式進行輸出.
 * 3.使用while-loop讓使用者可以輸入多個Rectangle是一個很有創意的發想, 但建議你可以考慮加入try-catch的例外處理(如果今天使用者輸入的是字串而不是數值呢?).
 * 4.while-loop還有一個好朋友是do-while, 可以考慮使用這個方式去讓你的程式碼更為精簡(do-while會先進行一次的執行再去做條件的判別).
 * 5.下方註解一段程式碼為系統跳出及整合第三、四點的建議, 提供給你作為參考.
 * */

import java.util.Scanner;

public class RectangleTester {
	double height, width, x, y;

	RectangleTester() {
	}

	RectangleTester(double _height, double _width, double _x, double _y) {
		this.height = _height;
		this.width = _width;
		this.x = _x;
		this.y = _y;
	}

	double getHeight() {
		return this.height;
	}

	double getWidth() {
		return this.width;
	}

	double getX() {
		return this.x;
	}

	double getY() {
		return this.y;
	}

	public String toString() {
		return "[X=" + this.x + ",Y=" + this.y + ",Heiht=" + this.height + ",Width=" + this.width + "]" + "\n Area="
				+ this.width * this.height + "\n Perimemter=" + (this.width + this.height) * 2;
	}

	public static void main(String[] args) {
		RectangleTester rectangle1 = new RectangleTester(18, 57, 15, 25);
		RectangleTester rectangle2 = new RectangleTester(47, 60, 12, 0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Rectangle#1" + rectangle1);
		System.out.println("Rectangle#2" + rectangle2);

		System.out.println("輸入長寬(以空白間隔開)");
		double H, W;
		H = scanner.nextDouble();
		W = scanner.nextDouble();
		System.out.println("Area=" + H * W);
		System.out.println("Perimemter=" + (H + W) * 2);
		System.out.println("繼續? 1.YES 2.NO");

		// 下面是我寫的.
		/*int i;
		try {
			do {
				i = scanner.nextInt();
				if (i == 2) {
					System.out.println("End of output!");
					System.exit(0);
				} else if (i == 1) {
					System.out.println("輸入長寬(以空白間隔開)");
					H = scanner.nextDouble();
					W = scanner.nextDouble();
					System.out.println("Area=" + H * W);
					System.out.println("Perimemter=" + (H + W) * 2);
					System.out.println("繼續? 1.YES 2.NO");
					i = scanner.nextInt();
				} else {
					System.out.println("請輸入系統所提供之回應!(1.YES 2.NO)");
				}
			} while (true);
		} catch (Exception e) {
			System.out.println("輸入錯誤, 請重新執行程式!");
		}*/
		
		int i;
		i = scanner.nextInt();
		while (i == 1) {
			if (i == 1) {
				System.out.println("輸入長寬(以空白間隔開)");

				H = scanner.nextDouble();
				W = scanner.nextDouble();
				System.out.println("Area=" + H * W);
				System.out.println("Perimemter=" + (H + W) * 2);
				System.out.println("繼續? 1.YES 2.NO");
				i = scanner.nextInt();
			}
		}

		if (i == 2) {

			System.out.println("");
		}

		System.out.println("End of output!");

	}

}
