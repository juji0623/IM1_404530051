/*
 * [A]98
 * [TA's Advise]
 * 1. �ʤ֤F�I�F��, �Ъ`�N, �g�o�ܦn!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		String input = "";
		GradeAnalyzer H = new GradeAnalyzer();
		while (true) {
			input = JOptionPane.showInputDialog(null, "Please input the students' scores", "Input Dialog",
					JOptionPane.QUESTION_MESSAGE);
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			try {
				H.addGrade(Double.parseDouble(input));
			} catch (Exception e) {
				System.out.println("Please insert valid score");
			}
		}
		// �ʤ֧P�_�ӼƬO�_<2 , -2.
		H.analyzeGrades();

		System.out.println(H);

	}

}
