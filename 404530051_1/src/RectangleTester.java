
/*
 * [A]98
 * [TA's advise]
 * 1.�b�D�{���̭��ͦ�����, ���M�i�H�ϵ{�����T����L�~, �����ŦX�Ѯv�@�~�n�D���g�@Rectangle���O�h�i��OOP, �o������2��.
 * 2.�U���@�~�Ш̷ӧ@�~�n�D���榡�i���X.
 * 3.�ϥ�while-loop���ϥΪ̥i�H��J�h��Rectangle�O�@�ӫܦ��зN���o�Q, ����ĳ�A�i�H�Ҽ{�[�Jtry-catch���ҥ~�B�z(�p�G���ѨϥΪ̿�J���O�r��Ӥ��O�ƭȩO?).
 * 4.while-loop�٦��@�Ӧn�B�ͬOdo-while, �i�H�Ҽ{�ϥγo�Ӥ覡�h���A���{���X�󬰺�²(do-while�|���i��@��������A�h�����󪺧P�O).
 * 5.�U����Ѥ@�q�{���X���t�θ��X�ξ�X�ĤT�B�|�I����ĳ, ���ѵ��A�@���Ѧ�.
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

		System.out.println("��J���e(�H�ťն��j�})");
		double H, W;
		H = scanner.nextDouble();
		W = scanner.nextDouble();
		System.out.println("Area=" + H * W);
		System.out.println("Perimemter=" + (H + W) * 2);
		System.out.println("�~��? 1.YES 2.NO");

		// �U���O�ڼg��.
		/*int i;
		try {
			do {
				i = scanner.nextInt();
				if (i == 2) {
					System.out.println("End of output!");
					System.exit(0);
				} else if (i == 1) {
					System.out.println("��J���e(�H�ťն��j�})");
					H = scanner.nextDouble();
					W = scanner.nextDouble();
					System.out.println("Area=" + H * W);
					System.out.println("Perimemter=" + (H + W) * 2);
					System.out.println("�~��? 1.YES 2.NO");
					i = scanner.nextInt();
				} else {
					System.out.println("�п�J�t�ΩҴ��Ѥ��^��!(1.YES 2.NO)");
				}
			} while (true);
		} catch (Exception e) {
			System.out.println("��J���~, �Э��s����{��!");
		}*/
		
		int i;
		i = scanner.nextInt();
		while (i == 1) {
			if (i == 1) {
				System.out.println("��J���e(�H�ťն��j�})");

				H = scanner.nextDouble();
				W = scanner.nextDouble();
				System.out.println("Area=" + H * W);
				System.out.println("Perimemter=" + (H + W) * 2);
				System.out.println("�~��? 1.YES 2.NO");
				i = scanner.nextInt();
			}
		}

		if (i == 2) {

			System.out.println("");
		}

		System.out.println("End of output!");

	}

}
