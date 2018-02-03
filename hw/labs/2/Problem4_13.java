import java.util.Scanner;

public class Problem4_13 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter one letter: ");
		String letter = input.nextLine().toLowerCase();
		
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		String e = "e";
		String f = "f";
		String g = "g";
		String h = "h";
		String i = "i";
		String j = "j";
		String k = "k";
		String l = "l";
		String m = "m";
		String n = "n";
		String o = "o";
		String p = "p";
		String q = "q";
		String r = "r";
		String s = "s";
		String t = "t";
		String u = "u";
		String v = "v";
		String w = "w";
		String x = "x";
		String y = "y";
		String z = "z";
		
		if (letter.equals(a) | letter.equals(e) | letter.equals(i) | letter.equals(o) | letter.equals(u) ) {
			System.out.println(letter + " is a vowel");
		
		}
		else if (letter.equals(b) | letter.equals(c) | letter.equals(d) | letter.equals(f) |
				letter.equals(g) | letter.equals(h) | letter.equals(j) | letter.equals(k) |
				letter.equals(l) | letter.equals(m) | letter.equals(n) | letter.equals(p) |
				letter.equals(q) | letter.equals(r) | letter.equals(s) | letter.equals(t) |
				letter.equals(v) | letter.equals(w) | letter.equals(x) | letter.equals(y) | 
				letter.equals(z) ) {
			System.out.println(letter + " is a consonant");
		}
		else {
			System.out.println(letter + " is invalid input");
		}
	}
}
