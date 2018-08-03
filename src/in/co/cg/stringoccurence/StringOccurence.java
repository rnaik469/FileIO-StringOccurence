package in.co.cg.stringoccurence;

import java.util.*;
import java.io.*;

//class to implement grep in java
public class StringOccurence {
	public static void main(String args[]) {
		Scanner get = new Scanner(System.in);
		String path, searchWord;
		int lineNo = 0, check = 1;
		System.out.println("Enter file path");
		path = get.next();// File path

		System.out.println("Enter word to search");
		searchWord = get.next();
		File file = new File(path);

		try {
			get = new Scanner(file);
			while (get.hasNext()) {
				lineNo++;// Line number check
				String line = get.nextLine();
				if (line.contains(searchWord)) {// check for String
					check = 0;
					System.out.println("line:" + line + "\nline number" + lineNo);
				}

			}
			if (check == 1) {
				System.out.println("word not found");
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		get.close();
	}
}
