package dynamicprogramming.wordbreak;

import java.util.*;

public class WordBreak {

	private static HashMap<String, String> table = new HashMap<String, String>();

	public static String wordBreak(String s, Set<String> dict) {
		if (dict.contains(s)) {
			return s;
		}
		if (table.containsKey(s)) {
			return table.get(s);
		}
		for (int i = 1; i < s.length(); i++) {
			String sub = s.substring(0, i);
			if (dict.contains(sub)) {
				String remaining = s.substring(i, s.length());
				String n = wordBreak(remaining, dict);
				if (n != null) {
					String built = sub + " " + n;
					table.put(s, built);
					return built;
				}
			}
		}
		table.put(s, null);
		return null;
	}

	public static void main(String[] args) {
		Set<String> dict = new HashSet<String>();
		dict.add("trying");
		dict.add("i");
		dict.add("am");
		dict.add("to");
		dict.add("be");
		dict.add("a");
		dict.add("fair");
		dict.add("try");

		String wordToBreak = "iamtrying";
		String next = "tryingg";
		String n = "tobeafairamtobeatrying";
		System.out.println(wordBreak(wordToBreak, dict));
		System.out.println(wordBreak(next, dict));
		System.out.println(wordBreak(n, dict));
	}
}