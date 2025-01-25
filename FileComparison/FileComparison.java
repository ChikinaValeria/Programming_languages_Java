import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileComparison {
    public static void main(String[] args) {
        //path to files
        String file1Path = "file1.txt";
        String file2Path = "file2.txt";


        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
        BufferedReader reader2 = new BufferedReader(new FileReader(file2Path))) {

        String line1 = null;
        String line2 = null;
        int lineNumber = 1;
        boolean filesAreEqual = true;
        
        while ((line1 = reader1.readLine()) != null | (line2 = reader2.readLine()) != null) {
            if (line1 == null || line2 == null || !line1.equals(line2)) {
                System.out.println("Difference at line " + lineNumber + ":");
                System.out.println("File1: " + (line1 != null ? line1 : "EOF"));
                System.out.println("File2: " + (line2 != null ? line2 : "EOF"));
                filesAreEqual = false;
            }
            lineNumber++;
        }


        if (filesAreEqual) {
            System.out.println("Two files are identical.");
        }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        
    }
}

