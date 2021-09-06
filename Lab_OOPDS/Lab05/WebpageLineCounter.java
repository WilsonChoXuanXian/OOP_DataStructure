package Lab_OOPDS.Lab05;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class WebpageLineCounter {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        Scanner input = new Scanner(System.in);
        String URLString = input.next();
        try{    
            int count = countWebpageLine (URLString);
            System.out.println("The webpage has " + count + " lines of codes.");
        }
        catch (MalformedInputException ex) {
            System.out.println("Error: The URL does not exist or does not accept connection.");
        }
        catch (IOException ex) {
            System.out.println("Error: URL must have a protocol such as https://.");
        }
}

    public static int countWebpageLine (String URLString) throws MalformedInputException, IOException {
        URL url = new URL (URLString);
        int count = 0;
        Scanner input = new Scanner(url.openStream());  
        while (input.hasNext()) {
            String line = input.nextLine();
            count++;
        }
        return count;
    }
}