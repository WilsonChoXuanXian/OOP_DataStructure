package Lecture_OOPDS;

public class Comparison {
	public static void main (String[] args){
		// primitive
		int a = 20;
		int b = 20;
		if (a < b)
			System.out.println("a < b");
		else if (a == b)
			System.out.println("a = b");
		else
			System.out.println("a > b");

		// reference
		String s1 = "bb";
		String s2 = "bb";
		if (s1.compareTo(s2) < 0)
			System.out.println("s1 < s2");
		else if (s1.compareTo(s2) == 0)
			System.out.println("s1 = s2");
		else
			System.out.println("s1 < s2");
	}
}