import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class App {

	static class FA {
		String startState;
		ArrayList<String> finalStates;
		HashMap<String, HashMap<String, String>> transitions;
	}

	private static FA[] fas = new FA[10];

	public static FA Q1() {
		FA fa = new FA();
		fa.startState = "q1";
		fa.finalStates = new ArrayList<>(Arrays.asList("q1", "q2"));
		HashMap<String, HashMap<String, String>> transitions = new HashMap<>();
		HashMap<String, String> q1 = new HashMap<>();
		q1.put("b", "q2");
		q1.put("a", "q1");
		transitions.put("q1", q1);
		HashMap<String, String> q2 = new HashMap<>();
		q2.put("b", "q2");
		q2.put("a", "q3");
		transitions.put("q2", q2);
		HashMap<String, String> q3 = new HashMap<>();
		q3.put("b", "q3");
		q3.put("a", "q3");
		transitions.put("q3", q3);

		fa.transitions = transitions;
		return fa;
	}

	public static FA Q2() {
		FA fa = new FA();
		fa.startState = "A";
		fa.finalStates = new ArrayList<>(Arrays.asList("B", "E"));
		HashMap<String, HashMap<String, String>> transitions = new HashMap<>();
		HashMap<String, String> A = new HashMap<>();
		A.put("0", "D");
		A.put("1", "B");
		transitions.put("A", A);
		HashMap<String, String> B = new HashMap<>();
		B.put("0", "C");
		B.put("1", "C");
		transitions.put("B", B);
		HashMap<String, String> C = new HashMap<>();
		C.put("0", "C");
		C.put("1", "C");
		transitions.put("C", C);
		HashMap<String, String> D = new HashMap<>();
		D.put("0", "F");
		D.put("1", "C");
		transitions.put("D", D);
		HashMap<String, String> F = new HashMap<>();
		F.put("0", "D");
		F.put("1", "E");
		transitions.put("F", F);
		HashMap<String, String> E = new HashMap<>();
		E.put("0", "C");
		E.put("1", "C");
		transitions.put("E", E);

		fa.transitions = transitions;
		return fa;
	}

	public static FA Q3() {
		FA fa = new FA();
		fa.startState = "q1";
		fa.finalStates = new ArrayList<>(Arrays.asList( "q2", "q4"));
		HashMap<String, HashMap<String, String>> transitions = new HashMap<>();
		HashMap<String, String> q1 = new HashMap<>();
		q1.put("y", "q1");
		q1.put("x", "q2");
		transitions.put("q1", q1);
		HashMap<String, String> q2 = new HashMap<>();
		q2.put("y", "q2");
		q2.put("x", "q3");
		transitions.put("q2", q2);
		HashMap<String, String> q3 = new HashMap<>();
		q3.put("y", "q3");
		q3.put("x", "q4");
		transitions.put("q3", q3);
		HashMap<String, String> q4 = new HashMap<>();
		q4.put("y", "q4");
		q4.put("x", "q3");
		transitions.put("q4", q4);

		fa.transitions = transitions;
		return fa;
	}

	public static FA Q4() {
		FA fa = new FA();
		fa.startState = "A";
		fa.finalStates = new ArrayList<>(Arrays.asList("C", "F"));
		HashMap<String, HashMap<String, String>> transitions = new HashMap<>();
		HashMap<String, String> A = new HashMap<>();
		A.put("a", "B");
		A.put("b", "D");
		transitions.put("A", A);
		HashMap<String, String> B = new HashMap<>();
		B.put("a", "C");
		B.put("b", "B");
		transitions.put("B", B);
		HashMap<String, String> C = new HashMap<>();
		C.put("a", "C");
		C.put("b", "B");
		transitions.put("C", C);
		HashMap<String, String> D = new HashMap<>();
		D.put("a", "D");
		D.put("b", "F");
		transitions.put("D", D);
		HashMap<String, String> F = new HashMap<>();
		F.put("b", "F");
		F.put("a", "D");
		transitions.put("F", F);

		fa.transitions = transitions;
		return fa;
	}

	public static FA Q5() {
		FA fa = new FA();
		fa.startState = "q1";
		fa.finalStates = new ArrayList<>(Arrays.asList("q1"));
		HashMap<String, HashMap<String, String>> transitions = new HashMap<>();
		HashMap<String, String> q1 = new HashMap<>();
		q1.put("0", "q1");
		q1.put("1", "q2");
		transitions.put("q1", q1);
		HashMap<String, String> q2 = new HashMap<>();
		q2.put("0", "q3");
		q2.put("1", "q2");
		transitions.put("q2", q2);
		HashMap<String, String> q3 = new HashMap<>();
		q3.put("0", "q1");
		q3.put("1", "q2");
		transitions.put("q3", q3);

		fa.transitions = transitions;
		return fa;
	}

	public static FA Q6() {
		FA fa = new FA();
		fa.startState = "q1";
		fa.finalStates = new ArrayList<>(Arrays.asList("q1", "q2"));
		HashMap<String, HashMap<String, String>> transitions = new HashMap<>();
		HashMap<String, String> q1 = new HashMap<>();
		q1.put("1", "q2");
		q1.put("0", "q1");
		transitions.put("q1", q1);
		HashMap<String, String> q2 = new HashMap<>();
		q2.put("1", "q3");
		q2.put("0", "q1");
		transitions.put("q2", q2);
		HashMap<String, String> q3 = new HashMap<>();
		q3.put("1", "q4");
		q3.put("0", "q1");
		transitions.put("q3", q3);
		HashMap<String, String> q4 = new HashMap<>();
		q4.put("1", "q4");
		q4.put("0", "q1");
		transitions.put("q4", q4);

		fa.transitions = transitions;
		return fa;
	}

	public static FA Q7() {
		FA fa = new FA();
		fa.startState = "q1";
		fa.finalStates = new ArrayList<>(Arrays.asList("q1", "q2", "q4", "q5", "q7"));
		HashMap<String, HashMap<String, String>> transitions = new HashMap<>();
		HashMap<String, String> q1 = new HashMap<>();
		q1.put("1", "q2");
		q1.put("0", "q5");
		transitions.put("q1", q1);
		HashMap<String, String> q2 = new HashMap<>();
		q2.put("1", "q2");
		q2.put("0", "q3");
		transitions.put("q2", q2);
		HashMap<String, String> q3 = new HashMap<>();
		q3.put("1", "q4");
		q3.put("0", "q3");
		transitions.put("q3", q3);
		HashMap<String, String> q4 = new HashMap<>();
		q4.put("1", "q4");
		q4.put("0", "q3");
		transitions.put("q4", q4);
		HashMap<String, String> q5 = new HashMap<>();
		q5.put("1", "q6");
		q5.put("0", "q5");
		transitions.put("q5", q5);
		HashMap<String, String> q6 = new HashMap<>();
		q6.put("1", "q6");
		q6.put("0", "q7");
		transitions.put("q6", q6);
		HashMap<String, String> q7 = new HashMap<>();
		q7.put("1", "q6");
		q7.put("0", "q7");
		transitions.put("q7", q7);

		fa.transitions = transitions;
		return fa;
	}

	public static FA Q8() {
		FA fa = new FA();
		fa.startState = "a";
		fa.finalStates = new ArrayList<String>(Arrays.asList("g"));
		HashMap<String, HashMap<String, String>> transitions = new HashMap<>();
		HashMap<String, String> a = new HashMap<>();
		a.put("0", "h");
		a.put("1", "d");
		transitions.put("a", a);
		HashMap<String, String> d = new HashMap<>();
		d.put("0", "e");
		d.put("1", "d");
		transitions.put("d", d);
		HashMap<String, String> e = new HashMap<>();
		e.put("0", "a");
		e.put("1", "g");
		transitions.put("e", e);
		HashMap<String, String> g = new HashMap<>();
		g.put("0", "g");
		g.put("1", "g");
		transitions.put("g", g);
		HashMap<String, String> h = new HashMap<>();
		h.put("0", "h");
		h.put("1", "i");
		transitions.put("h", h);
		HashMap<String, String> i = new HashMap<>();
		i.put("0", "g");
		i.put("1", "a");
		transitions.put("i", i);

		fa.transitions = transitions;
		return fa;
	}

	public static FA Q9() {
		FA fa = new FA();
		fa.startState = "q1";
		fa.finalStates = new ArrayList<String>(Arrays.asList("q1", "q2", "q3"));
		HashMap<String, HashMap<String, String>> transitions = new HashMap<>();
		HashMap<String, String> q1 = new HashMap<>();
		q1.put("1", "q2");
		q1.put("0", "q3");
		transitions.put("q1", q1);
		HashMap<String, String> q2 = new HashMap<>();
		q2.put("1", "q4");
		q2.put("0", "q3");
		transitions.put("q2", q2);
		HashMap<String, String> q3 = new HashMap<>();
		q3.put("1", "q2");
		q3.put("0", "q4");
		transitions.put("q3", q3);
		HashMap<String, String> q4 = new HashMap<>();
		q4.put("1", "q4");
		q4.put("0", "q4");
		transitions.put("q4", q4);

		fa.transitions = transitions;
		return fa;
	}

	public static FA Q10() {
		FA fa = new FA();
		fa.startState = "A";
		fa.finalStates = new ArrayList<String>(Arrays.asList("A", "C"));
		HashMap<String, HashMap<String, String>> transitions = new HashMap<>();
		HashMap<String, String> A = new HashMap<>();
		A.put("0", "B");
		A.put("1", "A");
		transitions.put("A", A);
		HashMap<String, String> B = new HashMap<>();
		B.put("0", "D");
		B.put("1", "C");
		transitions.put("B", B);
		HashMap<String, String> C = new HashMap<>();
		C.put("0", "B");
		C.put("1", "C");
		transitions.put("C", C);
		HashMap<String, String> D = new HashMap<>();
		D.put("0", "D");
		D.put("1", "D");
		transitions.put("D", D);

		fa.transitions = transitions;
		return fa;
	}

	public static String solveDFA(FA fa, String line) {

		String state = fa.startState;
		for (int i = 0; i < line.length(); i++) {
			state = fa.transitions.get(state).get(String.valueOf(line.charAt(i)));
		}

		return fa.finalStates.contains(state) ? "True" : "False";
	}

	public static void main(String[] args) {

		try {
			fas[0] = Q1();
			fas[1] = Q2();
			fas[2] = Q3();
			fas[3] = Q4();
			fas[4] = Q5();
			fas[5] = Q6();
			fas[6] = Q7();
			fas[7] = Q8();
			fas[8] = Q9();
			fas[9] = Q10();
			File inputFile = new File("input.txt");
			Scanner myReader = new Scanner(inputFile);
			FileWriter outputFile = new FileWriter("output.txt");

			while (myReader.hasNextLine()) {

				String problemNumber;

				while ((problemNumber = myReader.nextLine()).length() == 0)
					;
				outputFile.write(problemNumber + "\n");
				int problemNumberInt = Integer.valueOf(problemNumber);
				String line;

				while (myReader.hasNextLine() && !((line = myReader.nextLine()).toLowerCase().contains("end"))) {
					line = solveDFA(fas[problemNumberInt - 1], line);
					outputFile.write(line + "\n");
				}

				outputFile.write("x\n\n");

			}

			outputFile.close();
			myReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("file not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}