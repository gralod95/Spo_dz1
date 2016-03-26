package cpodz1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Cpodz1 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("noname.txt");
	if (!inputFile.exists()) {
	System.out.print("File error.\n");
        }
        Pattern patern = Pattern.compile("\\s[A-Z]{1}[a-z0-9]+[a-z]{1}\\s");
	int numberOfPairs = 0;
	String text = new Scanner(inputFile).useDelimiter("\\Z").next();
	Matcher mtchr = patern.matcher(text);
        while (mtchr.find()) {
			numberOfPairs++;
			System.out.print(mtchr.group() + " -> Valid\n");
		}
		
		System.out.print("Number of Valid Pairs: " + numberOfPairs + "\n");
    }
    
}
