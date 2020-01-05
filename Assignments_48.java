package Assignments;

public class Assignments_48 {

	public static void main(String[] args) {
		int vowelscount = 0, constantcount = 0, digitcount = 0 , spacecount=0;
		String s = "i love my india aw3som3";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vowelscount++;
			} else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
				constantcount++;
			} else if ((s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
				digitcount++;

			}else if(s.charAt(i)==' ') {
				spacecount++;
				
			}
		}

		System.out.println("vowels count is- " + vowelscount + " constant count is- " + constantcount + "digit count "
				+ digitcount + "Spacecount "+spacecount);

	}

}
