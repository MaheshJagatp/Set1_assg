package Assignments;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Assignments_49 {

	public static void main(String[] args) {

		String s = "i like my country";

		Pattern pattern = Pattern.compile(" ");

		String[] temp = pattern.split(s);
		// System.out.println(Arrays.toString(temp));
		String result = "";

		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = " " + temp[i] + result;
		}
		System.out.println(result);
	}

}
