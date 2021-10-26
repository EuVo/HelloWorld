package exercise.cycles;

import java.io.*;

public class WorkWithFiles {

    public static void main(String[] args) throws IOException {
        //readFile("F:\\fileIn.txt");
        writeFile("F:\\fileOut.txt");
    }

    public static void readFile(String filepath) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));

        String curLine;
        while ((curLine = bufferedReader.readLine()) != null){
            System.out.println(curLine);
        }
        bufferedReader.close();
    }

    public static void writeFile(String filepath){
        try {
            String content = "Content to write to file";
            File file = new File(filepath);

            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

        } catch(IOException ex) {
            System.out.println("Exception occurred:");
            ex.printStackTrace();
        }
    }
}
