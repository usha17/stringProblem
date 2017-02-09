package test.exercise;

public class StringProblem {


	public static String removeCharacter1(String s, char c) {
		if (s == null) {
			return null;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != c) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString().trim();
	}

	// Find a method in the String class that can solve this in one line
	public static String removeCharacter2(String s, char c) {
		if (s == null) {
			return null;
		}
		return s.replace(c, ' ').replaceAll(" ", "");
	}

}
