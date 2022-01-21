package ua.lviv.lgs;


import java.util.Scanner;

public class StringBufferUtils {
	public static void main(String[] args) {
		//task 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String s = sc.next();
		if ((s.length() == 5)&&(s.equalsIgnoreCase(s))) {
				System.out.println("This word is polindrom"); 
		} else {
			System.out.println("You shoud to enter word with 5 letters");
		
		}
		//task 2
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter text:");
		String s2 = sc2.nextLine();
		System.out.println(replaceVowels(s2));
	}
	static String replaceVowels(String text) {
		char s2Ar[] = text.toCharArray();
		char vowel[] = {'e','u','i','o','a','E','U','I','O','A' };
		for (int i = 0; i < s2Ar.length; i++) {
			for (int j = 0; j < vowel.length; j++) {
				if (s2Ar[i] == vowel[j]) {
					s2Ar[i] = '-';
				}
			}
		}

		String s3 = new String(s2Ar);
		return s3;
	}
	

}

