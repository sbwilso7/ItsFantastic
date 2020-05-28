import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        if(args.length < 1){
            System.out.println("Insufficient arguments.  Let's make this fantastic already!");
            System.exit(1);
        }

        System.out.println("Let's make this fantastic!");

        String file_path = args[0];
        makeItFantastic(file_path);

    }

    private static void makeItFantastic(String file_path){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file_path));
            //long length = 78000000000L;
            long length = 1000;
            int statusCounter = 0;
            for(int i = 0; i < length; i++){
                String str = "LINE: " + i;
                writer.write(str);
                writer.newLine();

                statusCounter++;
                if(statusCounter==100000000){
                    System.out.print(".");
                    statusCounter=0;
                }
            }

            System.out.println("\n\nUse shuf, it's fantastic.  Does the job in less than a minute.");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}