
/**資管一 林育陞 404530051*/
import java.util.ArrayList;

public class GradeAnalyzer {
	int input = 0, Ap = 0, A = 0, Am = 0, Bp = 0, B = 0, Bm = 0, Cp = 0, C = 0, Cm = 0, D = 0, F = 0;
	double tolnum = 0, avg = 0, sd = 0, sdtemp = 0;
	ArrayList<Double> grade = new ArrayList<Double>();
	static boolean isValidGrade;

	static boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0)
			isValidGrade = true;
		else
			isValidGrade = false;
		return isValidGrade;
	}

	void addGrade(double aGrade) {
		if (isValidGrade = true) {
			grade.add(aGrade);

			if (aGrade > 110 || aGrade < 0) {
				grade.remove(aGrade);
			}
			input = grade.size();

			if (98 <= aGrade && aGrade <= 110) {
				Ap++;
			}
			if (92 <= aGrade && aGrade < 98) {
				A++;
			}
			if (90 <= aGrade && aGrade < 92) {
				Am++;
			}
			if (88 <= aGrade && aGrade < 90) {
				Bp++;
			}
			if (82 <= aGrade && aGrade < 88) {
				B++;
			}
			if (80 <= aGrade && aGrade < 82) {
				Bm++;
			}
			if (78 <= aGrade && aGrade < 80) {
				Cp++;
			}
			if (72 <= aGrade && aGrade < 78) {
				C++;
			}
			if (70 <= aGrade && aGrade < 72) {
				Cm++;
			}
			if (60 <= aGrade && aGrade < 70) {
				D++;
			}
			if (aGrade < 60 && aGrade >= 0) {
				F++;

			}
		}
	}

	void analyzeGrades() {
		for (int i = 0; i < grade.size(); i++) {
			tolnum += grade.get(i);
		}
		avg = tolnum / grade.size();
		for (int j = 0; j < grade.size(); j++) {
			sdtemp += Math.pow(grade.get(j) - avg, 2);
		}
		sd = Math.round(Math.sqrt(sdtemp / grade.size()));
	}

	public String toString() {

		return "You entered " + input + " vaild grades from 0 to 110.Invalid grades are ignored!\nThe average = " + avg
				+ " with a standard deviation = " + sd + "\nThe grade distribution is:\n\nA+=" + A + "\nA=" + A
				+ "\nA-=" + Am + "\nB+=" + Bp + "\nB=" + B + "\nB-=" + Bm + "\nC+=" + Cp + "\nC=" + C + "\nD=" + D
				+ "\nF=" + F;
	}
}
