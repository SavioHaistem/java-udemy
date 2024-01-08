package FileManipulator;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String strPath = scan.nextLine();
        File path = new File(strPath);

        boolean sucess = new File(strPath + "/subdir").mkdir();

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders: ");
        for (File folder: folders) {
            System.out.println(folder);
        }
    }
}
