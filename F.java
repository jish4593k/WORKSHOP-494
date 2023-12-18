import java.io.File;

public class OCRProcessor {

    public static void main(String[] args) {
        String sourceDirectory = " ";
        processPDFFiles(sourceDirectory);
    }

    private static void processPDFFiles(String directory) {
        File folder = new File(directory);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".pdf")) {
                    processSinglePDFFile(directory, file.getName());
                } else {
                    System.out.println("  " + file.getName());
                }
            }
        }
    }

    private static void processSinglePDFFile(String directory, String filename) {
        String inputPath = directory + File.separator + filename;
        String outputPath = "t" + File.separator + filename;

        System.out.println("O " + filename);
       
    }

  
